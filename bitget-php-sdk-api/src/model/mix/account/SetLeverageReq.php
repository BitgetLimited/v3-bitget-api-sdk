<?php


namespace bitget\model\mix\account;


class SetLeverageReq
{
    /**
     * Currency pair
     */
    var string $symbol;
    /**
     * Deposit currency
     */
    var string $marginCoin;
    /**
     * Leverage ratio
     */
    var string $leverage;
    /**
     * The whole warehouse lever can not transfer this parameter
     * Position direction: long multi position short short position,
     * MixHoldSideEnum
     */
    var string $holdSide;

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

    /**
     * @return mixed
     */
    public function getHoldSide()
    {
        return $this->holdSide;
    }

    /**
     * @param mixed $holdSide
     */
    public function setHoldSide($holdSide): void
    {
        $this->holdSide = $holdSide;
    }


}