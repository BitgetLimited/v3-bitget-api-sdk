<?php


namespace bitget\model\spot\order;


class OpenOrdersReq
{
    /**
     * Currency pair
     */
    var string $symbol;

    /**
     * @return string
     */
    public function getSymbol(): string
    {
        return $this->symbol;
    }

    /**
     * @param string $symbol
     */
    public function setSymbol(string $symbol): void
    {
        $this->symbol = $symbol;
    }


}