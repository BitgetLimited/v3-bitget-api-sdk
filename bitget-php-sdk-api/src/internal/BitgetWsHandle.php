<?php


namespace bitget\internal;


use bitget\Config;
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

                    if($jsonObject->data ?? false){
                        $listener = $this->getListener($jsonObject);

                        if($listener != null){
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
        print_r($this->allSuribe . "\n");
        $this->sendMessage(new WsBaseReq(self::WS_OP_SUBSCRIBE, $req));
    }

    public function getListener($jsonObject): ?Listener
    {
        try{
            if($jsonObject->arg ?? false){
                $argJson = $jsonObject->arg;

                $req = new SubscribeReq($argJson->instType,$argJson->channel,$argJson->instId);

                foreach ($this->scribeMap as $key=>$value){
                    if($req->toString() == $key){
                        return $value;
                    }
                }

            }

        }catch (\Exception $e){

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
            $this->client->send("ping");
        });
    }


}