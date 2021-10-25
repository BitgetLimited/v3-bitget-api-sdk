<?php


namespace bitget\model\mix\plan;


class PlaceTPSLReq
{
    /**
     * 合约交易对
     */
    var string $symbol;
    /**
     * 保证金币种
     */
    var string $marginCoin;

    var string $planType;

    var string $triggerPrice;

    var string $holdSide;

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

    /**
     * @return string
     */
    public function getMarginCoin(): string
    {
        return $this->marginCoin;
    }

    /**
     * @param string $marginCoin
     */
    public function setMarginCoin(string $marginCoin): void
    {
        $this->marginCoin = $marginCoin;
    }

    /**
     * @return string
     */
    public function getPlanType(): string
    {
        return $this->planType;
    }

    /**
     * @param string $planType
     */
    public function setPlanType(string $planType): void
    {
        $this->planType = $planType;
    }

    /**
     * @return string
     */
    public function getTriggerPrice(): string
    {
        return $this->triggerPrice;
    }

    /**
     * @param string $triggerPrice
     */
    public function setTriggerPrice(string $triggerPrice): void
    {
        $this->triggerPrice = $triggerPrice;
    }

    /**
     * @return string
     */
    public function getHoldSide(): string
    {
        return $this->holdSide;
    }

    /**
     * @param string $holdSide
     */
    public function setHoldSide(string $holdSide): void
    {
        $this->holdSide = $holdSide;
    }


}