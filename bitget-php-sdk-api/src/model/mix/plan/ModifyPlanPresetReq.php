<?php


namespace bitget\model\mix\plan;


class ModifyPlanPresetReq
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
     * If the profit stop price is blank, cancel the profit stop
     */
    var string $presetTakeProfitPrice;
    /**
     * If the stop loss price is blank, cancel the stop loss
     */
    var string $presetStopLossPrice;
    /**
     * order id
     */
    var string $orderId;

    /**
     * plan type
     */
    var string $planType;

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
    public function getPresetTakeProfitPrice(): string
    {
        return $this->presetTakeProfitPrice;
    }

    /**
     * @param string $presetTakeProfitPrice
     */
    public function setPresetTakeProfitPrice(string $presetTakeProfitPrice): void
    {
        $this->presetTakeProfitPrice = $presetTakeProfitPrice;
    }

    /**
     * @return string
     */
    public function getPresetStopLossPrice(): string
    {
        return $this->presetStopLossPrice;
    }

    /**
     * @param string $presetStopLossPrice
     */
    public function setPresetStopLossPrice(string $presetStopLossPrice): void
    {
        $this->presetStopLossPrice = $presetStopLossPrice;
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
}