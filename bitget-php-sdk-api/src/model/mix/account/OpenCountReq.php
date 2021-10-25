<?php


namespace bitget\model\mix\account;


class OpenCountReq
{
    var string $symbol;
    var string $marginCoin;
    var string $openPrice;
    var string $openAmount;
    var string $leverage;

    /**
     * @return mixed
     */
    public function getSymbol()
    {
        return $this->symbol;
    }

    /**
     * @param mixed $symbol
     */
    public function setSymbol($symbol): void
    {
        $this->symbol = $symbol;
    }

    /**
     * @return mixed
     */
    public function getMarginCoin()
    {
        return $this->marginCoin;
    }

    /**
     * @param mixed $marginCoin
     */
    public function setMarginCoin($marginCoin): void
    {
        $this->marginCoin = $marginCoin;
    }

    /**
     * @return mixed
     */
    public function getOpenPrice()
    {
        return $this->openPrice;
    }

    /**
     * @param mixed $openPrice
     */
    public function setOpenPrice($openPrice): void
    {
        $this->openPrice = $openPrice;
    }

    /**
     * @return mixed
     */
    public function getOpenAmount()
    {
        return $this->openAmount;
    }

    /**
     * @param mixed $openAmount
     */
    public function setOpenAmount($openAmount): void
    {
        $this->openAmount = $openAmount;
    }

    /**
     * @return mixed
     */
    public function getLeverage()
    {
        return $this->leverage;
    }

    /**
     * @param mixed $leverage
     */
    public function setLeverage($leverage): void
    {
        $this->leverage = $leverage;
    }



}