<?php

namespace Bitget;

use GuzzleHttp\Psr7\Uri;
use Psr\Http\Message\StreamInterface;
use Psr\Http\Message\UriInterface;
use GuzzleHttp\Psr7\Request;

class Utils
{
    /**
     * @param string $method HTTP method
     * @param string|UriInterface $uri URI
     * @param array<string, string|string[]> $headers Request headers
     * @param string|resource|StreamInterface|null $body Request body
     * @param string $version Protocol version
     *
     * @return \GuzzleHttp\Psr7\Request
     */
    public static function getAutoSignWarpHttpRequest(string $method,
                                                  $uri,
                                                  array  $headers = [],
                                                  $body = '')
    {
        if (!($uri instanceof UriInterface)) {
            $uri = new Uri($uri);
        }
        $timestamp = Utils::getTimestamp();
        $urlString = $uri->getPath().($uri->getQuery() ? "?{$uri->getQuery()}" : '');

        if (isset($headers['SECRET-KEY'])) {
            $sign = Utils::getSign($timestamp, $method, $urlString, $body, $headers['SECRET-KEY']);
        } else {
            $sign = 'not need sign';
        }

        $headers['ACCESS-SIGN'] = $sign;
        $headers['ACCESS-TIMESTAMP'] = (string)$timestamp;
        $headers['SECRET-KEY'] = '';

        return new Request(
            $method,
            $uri,
            $headers,
            $body
        );
    }

    public static function getSign($timestamp, $method, $requestPath, $body, $apiSecret): string
    {
        if ($body != null) {

            $message = (string)$timestamp . strtoupper($method) . $requestPath . (string)$body;
        } else {
            $message = (string)$timestamp . strtoupper($method) . $requestPath;
        }

        return base64_encode(hash_hmac('sha256', $message, $apiSecret, true));
    }

    public static function getTimestamp(): int
    {
        return time() * 1000;
    }
}