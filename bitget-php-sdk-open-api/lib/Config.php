<?php

namespace Bitget;

class Config
{

    public static function getDefaultConfig(): Configuration
    {
        $config = \Bitget\Configuration::getDefaultConfiguration()->setHost('http://upex-nio-openapi.test5.bitget.tools');
        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'bg_43215ed00b4ca9114e7ea20a25864990');
        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', '123qweasd');
        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', '2f0d6c9afd0a21a63d12116be301b25559edf7e6e571fe2458902acbbc47c1e0');

//        $config = \Bitget\Configuration::getDefaultConfiguration()->setHost('http://localhost:8010');
//        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'bg_76ecba57e8ae307f38e0e74bb9f1c0bd');
//        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'wfytest5');
//        $config = \Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', '637289e0823327c55e19da5cc84c790b58407e985ca3f7106e8e3f459a776dd7');
        return $config;
    }
}