<?php


namespace bitget\model\mix\plan;


class ModifyTPSLPlanReq
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

    var string $triggerPrice;

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


}