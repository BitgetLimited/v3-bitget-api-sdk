<?php

namespace Bitget;

class Config
{

    public static function getDefaultConfig(): Configuration
    {
        $config = \Bitget\Configuration::getDefaultConfiguration()->setHost('https://api.bitget.com');
        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'your value');
        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'your value');
        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'your value');
        return $config;
    }
}