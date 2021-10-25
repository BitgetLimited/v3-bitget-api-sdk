<?php


namespace bitget\model\mix\account;


class SetLeverageReq
{
    var string $symbol;
    var string $marginCoin;
    var string $leverage;
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