<?php


namespace bitget\model\mix\plan;


class PlaceTPSLReq
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
     * Plan type
     */
    var string $planType;
    /**
     * Trigger price
     */
    var string $triggerPrice;
    /**
     * Is this position long or short
     */
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