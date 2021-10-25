<?php


namespace bitget\model\mix\plan;


class CancelPlanReq
{
    var string $orderId;

    var string $symbol;

    var string $planType;

    var string $marginCoin;

    /**
     * @return string
     */
    public function getOrderId(): string
    {
        return $this->orderId;
    }

    /**
     * @param string $orderId
     */
    public function setOrderId(string $orderId): void
    {
        $this->orderId = $orderId;
    }

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



}