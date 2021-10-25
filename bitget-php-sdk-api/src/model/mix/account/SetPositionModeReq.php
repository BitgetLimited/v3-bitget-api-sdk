<?php


namespace bitget\model\mix\account;


class SetPositionModeReq
{
    var string $symbol;

    var string $marginCoin;

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