<?php


namespace bitget\model\mix\account;


class SetPositionModeReq
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
     * Position mode
     * 1 One way position
     * 2 Two way position
     */
    var string $holdMode;

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
    public function getHoldMode()
    {
        return $this->holdMode;
    }

    /**
     * @param mixed $holdMode
     */
    public function setHoldMode($holdMode): void
    {
        $this->holdMode = $holdMode;
    }


}