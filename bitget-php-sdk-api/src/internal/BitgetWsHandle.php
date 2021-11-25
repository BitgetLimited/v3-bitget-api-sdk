<?php


namespace bitget\internal;


use bitget\Config;
use bitget\model\ws\BookInfo;
use bitget\model\ws\SubscribeReq;
use bitget\model\ws\WsBaseReq;
use bitget\model\ws\WsLoginReq;
use WebSocket\BadOpcodeException;
use WebSocket\Client;
use Workerman\Connection\AsyncTcpConnection;
use Workerman\Lib\Timer;
use Workerman\Worker;

class BitgetWsHandle extends Config implements BitgetWsClient
{
    const WS_OP_LOGIN = "login";
    const WS_OP_SUBSCRIBE = "subscribe";
    const WS_OP_UNSUBSCRIBE = "unsubscribe";


    public Client $client;

    private BitgetClientBuilder $bitgetClientBuilder;

    private Listener $listener;

    private bool $connectStatus;

    private bool $loginStatus;

    private Utils $utils;

    private array $allSuribe;

    private array $scribeMap;

    private array $allBook;

    /**
     * BitegetWsClient constructor.
     * @param BitgetClientBuilder $bitgetClientBuilder
     */
    public function __construct(BitgetClientBuilder $bitgetClientBuilder)
    {
        $this->initClient($bitgetClientBuilder);


    }

    public function initClient(BitgetClientBuilder $bitgetClientBuilder): void
    {
        $this->bitgetClientBuilder = $bitgetClientBuilder;
        $this->connectStatus = false;
        $this->loginStatus = false;
        $this->utils = new Utils();
        $this->allBook = array();
        $this->scribeMap = array();
        $this->allSuribe = array();
        $this->client = new Client(self::websocketUrl);

        $this->sendTextMessage("ping");

        if ($this->bitgetClientBuilder->isLogin) {
            $this->login();
        }
        $this->initTimer();
//        $this->initWorker();

    }

    public function startWorker()
    {
        $worker = new Worker();
        $worker->onWorkerStart = function () {
            while (true) {
                try {
//                    $con = new AsyncTcpConnection(self::websocketUrl);
                    $this->connectStatus = true;
                    $message = $this->client->receive();

                    if ($message == "pong") {
                        print_r($message . "\n");
                        Utils::printLog("Keep connected:" . $message, "INFO");
                        continue;
                    }

                    $jsonObject = json_decode($message);

                    if ($jsonObject->code ?? false && $jsonObject->code != "0") {
                        if ($this->bitgetClientBuilder->errorListener != null) {
                            $this->bitgetClientBuilder->errorListener->recevie($message);
                        }
                        continue;
                    }

                    if ($jsonObject->event ?? false && $jsonObject->event == "login") {
                        Utils::printLog("login msg:" . $message, "INFO");
                        $this->loginStatus = true;
                        continue;
                    }

                    if ($jsonObject->data ?? false) {

                        $checkSumFlag = $this->checkSum($jsonObject);
                        if(!$checkSumFlag){
                            continue;
                        }

                        $listener = $this->getListener($jsonObject);

                        if ($listener != null) {
                            $listener->recevie($message);
                            continue;
                        }

                        $this->bitgetClientBuilder->listener->recevie($message);
                        continue;
                    }

                    Utils::printLog("receive op msg:" . $message, "INFO");
                } catch (\Exception $e) {
                }
            }
        };
        Worker::runAll();
    }

    public static function builder(): BitgetClientBuilder
    {
        return new BitgetClientBuilder();
    }

    public function sendMessage(WsBaseReq $baseReq): void
    {
        $data = json_encode($baseReq);
        Utils::printLog("send message".$data,"info");
        $this->sendTextMessage($data);
    }

    public function sendTextMessage(string $message): void
    {

        try {
            $this->client->send($message);
        } catch (BadOpcodeException $e) {
            $this->reconnect();
        }
    }

    public function reconnect()
    {
        $this->initClient($this->bitgetClientBuilder);
        $this->subscribeDef($this->allSuribe);
    }


    public function unsubscribe(array $req): void
    {

        foreach ($req as $value) {
            unset($this->allSuribe[$value->toString()]);
        }

        $this->sendMessage(new WsBaseReq(self::WS_OP_UNSUBSCRIBE, $req));
    }

    public function subscribe(array $req, Listener $listener): void
    {
        foreach ($req as $value) {
            $this->scribeMap[$value->toString()] = $listener;
        }
        $this->subscribeDef($req);
    }

    public function subscribeDef(array $req): void
    {
        foreach ($req as $value) {
            $this->allSuribe[$value->toString()] = "1";
        }
        $this->sendMessage(new WsBaseReq(self::WS_OP_SUBSCRIBE, $req));
    }

    public function checkSum($jsonObject): bool
    {
        if (!$jsonObject->arg ?? false || !$jsonObject->action ?? false) {
            return true;

        }

        $argJson = $jsonObject->arg;

        $req = new SubscribeReq($argJson->instType, $argJson->channel, $argJson->instId);

        if ($req->channel != "books") {
            return true;
        }

        $data = $jsonObject->data;
        $bookInfo = new BookInfo($data[0]->asks, $data[0]->bids, $data[0]->checksum, $data[0]->ts);

        if($jsonObject->action == "snapshot"){
            $this->allBook[$req->toString()] = $bookInfo;
            return true;
        }

        if($jsonObject->action == "update"){
            $allBookInfo = $this->allBook[$req->toString()];

            return $allBookInfo->merge($bookInfo)->checkSum($bookInfo->checksum,25);
        }

        return true;
    }

    public function getListener($jsonObject): ?Listener
    {
        try {

            if ($jsonObject->arg ?? false) {
                $argJson = $jsonObject->arg;

                $req = new SubscribeReq($argJson->instType, $argJson->channel, $argJson->instId);

                foreach ($this->scribeMap as $key => $value) {
                    if ($req->toString() == $key) {
                        return $value;
                    }
                }

            }

        } catch (\Exception $e) {

        }
        return null;
    }


    public function login(): void
    {
        $timeStamp = Utils::getTimestamp() / 1000;
        $sign = Utils::getSign($timeStamp, "GET", "/user/verify", "", self::apiSecret);

        $wsLoginReq = new WsLoginReq(self::apiKey, self::passphrase, $timeStamp, $sign);

        $args = array($wsLoginReq);

        $wsBaseReq = new WsBaseReq(self::WS_OP_LOGIN, $args);

        $this->sendMessage($wsBaseReq);

    }


    private function initTimer()
    {
        Timer::add(5, function () {
            $this->sendTextMessage("ping");
        });
    }


}