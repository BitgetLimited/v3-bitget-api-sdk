<?php


namespace bitget\model\mix\plan;


class ModifyPlanReq
{
    /**
     * 合约交易对
     */
    var string $symbol;
    /**
     * 保证金币种
     */
    var string $marginCoin;

    var string $orderId;

    var string $executePrice;

    var string $triggerPrice;

    var string $triggerType;

    var string $orderType;

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
    public function getExecutePrice(): string
    {
        return $this->executePrice;
    }

    /**
     * @param string $executePrice
     */
    public function setExecutePrice(string $executePrice): void
    {
        $this->executePrice = $executePrice;
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
    public function getTriggerType(): string
    {
        return $this->triggerType;
    }

    /**
     * @param string $triggerType
     */
    public function setTriggerType(string $triggerType): void
    {
        $this->triggerType = $triggerType;
    }

    /**
     * @return string
     */
    public function getOrderType(): string
    {
        return $this->orderType;
    }

    /**
     * @param string $orderType
     */
    public function setOrderType(string $orderType): void
    {
        $this->orderType = $orderType;
    }


}