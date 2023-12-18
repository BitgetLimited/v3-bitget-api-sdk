<?php


namespace bitget\internal;


use bitget\Config;

class BitgetApiClient extends Config
{
    const POST = "POST";
    const GET = "GET";

    public function doGet($url, $body)
    {
        $url = $url . self::buildGetParams($body);
//        print_r($url . " ======= url ======\n");
        $requestUrl = self::restApiUrl . $url;
        $headerArray = $this->getHead(self::GET, $url, null);
        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, $requestUrl);
        curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, FALSE);
        curl_setopt($ch, CURLOPT_SSL_VERIFYHOST, FALSE);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
        curl_setopt($ch, CURLOPT_HTTPHEADER, $headerArray);
        curl_setopt($ch, CURLOPT_TIMEOUT, 10);

        $output = curl_exec($ch);
        curl_close($ch);
        return $output;
    }

    function doPost($url, $data)
    {
        $data = json_encode($data);
        $requestUrl = self::restApiUrl . $url;
        $headerArray = $this->getHead(self::POST, $url, $data);
        $curl = curl_init();
        curl_setopt($curl, CURLOPT_URL, $requestUrl);
        curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, FALSE);
        curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, FALSE);
        curl_setopt($curl, CURLOPT_POST, 1);
        curl_setopt($curl, CURLOPT_POSTFIELDS, $data);
        curl_setopt($curl, CURLOPT_HTTPHEADER, $headerArray);
        curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
        curl_setopt($curl, CURLOPT_TIMEOUT, 10);
        $output = curl_exec($curl);
        curl_close($curl);
        return $output;
    }

    function getHead($method, $requestPath, $body)
    {
        $timestamp = Utils::getTimestamp();
        $sign = Utils::getSign($timestamp, $method, $requestPath, $body, self::apiSecret);
        if (self::signType == self::RSA) {
            $sign = Utils::getSignByRSA($timestamp, $method, $requestPath, $body, self::apiSecret);
        }

        $headerArray = array();
        $headerArray[0] = "Content-type:application/json;";
        $headerArray[1] = "ACCESS-KEY:" . self::apiKey;
        $headerArray[2] = "ACCESS-SIGN:" . $sign;
        $headerArray[3] = "ACCESS-TIMESTAMP:" . (string)$timestamp;
        $headerArray[4] = "ACCESS-PASSPHRASE:" . self::passphrase;
        return $headerArray;
    }

    function buildGetParams($para)
    {
        $arg = "";

        if ($para == null || $para == "") {
            return $arg;
        }


//        $x = 0;
//        foreach ($para as $key => $value) {
//            if ($value == "" || $value == null) {
//                continue;
//            }
//
//            $param = $key . "=" . $value;
//            if ($x == 0) {
//                $arg = "?" . $arg . $param;
//            } else {
//                $arg = $arg . "&" . $param;
//            }
//            $x = $x + 1;
//        }

        $arg = self::sort_data($para);
        if ($arg == null || $arg == "") {
            return "";
        }
        return "?".$arg;
    }

    function sort_data($data){
        ksort($data);
        $result = [];
        foreach ($data as $key => $val) {
            array_push($result, $key."=".urlencode($val));
        }
        return join("&", $result);
    }

}