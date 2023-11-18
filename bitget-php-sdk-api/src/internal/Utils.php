<?php


namespace bitget\internal;


class Utils
{
    public static function getSign($timestamp, $method, $requestPath, $body, $apiSecret): string
    {
        if ($body != null) {
            $message = (string)$timestamp . strtoupper($method) . $requestPath . (string)$body;
        } else {
            $message = (string)$timestamp . strtoupper($method) . $requestPath;
        }

        return base64_encode(hash_hmac('sha256', $message, $apiSecret, true));
    }

    public static function getSignByRSA($timestamp, $method, $requestPath, $body, $apiSecret):string
    {
        $rsaUtil = new RsaUtil(null, $apiSecret);
        if ($body != null) {
            $message = (string)$timestamp . strtoupper($method) . $requestPath . (string)$body;
        } else {
            $message = (string)$timestamp . strtoupper($method) . $requestPath;
        }

//        print_r("fuck rsa\n");
        print_r($rsaUtil->sign($message) . "\n");
        return $rsaUtil->sign($message);
    }

    // 获取IOS格式时间戳
    public static function getTimestamp(): int
    {
        return time() * 1000;
    }

    public static function printLog(string $msg, string $type): void
    {
        $time = date("Y-m-d H:i:s");
        print_r("[" . $time . "] [" . $type . "] " . $msg . "\n");
    }

}