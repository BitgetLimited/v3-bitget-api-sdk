<?php


namespace bitget\model\mix\plan;


class PlacePlanReq
{
    /**
     * 合约交易对
     */
    var string $symbol;
    /**
     * 保证金币种
     */
    var string $marginCoin;
    /**
     * 下单数量
     */
    var string $size;
    /**
     * 委托价格
     */
    var string $executePrice;
    /**
     * 触发价格
     */
    var string $triggerPrice;
    /**
     * 委托方向
     */
    var string $side;
    /**
     * 交易类型
     */
    var string $orderType;
    /**
     * 触发类型 成交价触发 标记价触发
     */
    var string $triggerType;

    var string $clientOid;
    /**
     * 预设止盈价
     */
    var string $presetTakeProfitPrice;
    /**
     * 预设止损价
     */
    var string $presetStopLossPrice;

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
    public function getSize(): string
    {
        return $this->size;
    }

    /**
     * @param string $size
     */
    public function setSize(string $size): void
    {
        $this->size = $size;
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
    public function getSide(): string
    {
        return $this->side;
    }

    /**
     * @param string $side
     */
    public function setSide(string $side): void
    {
        $this->side = $side;
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
    public function getClientOid(): string
    {
        return $this->clientOid;
    }

    /**
     * @param string $clientOid
     */
    public function setClientOid(string $clientOid): void
    {
        $this->clientOid = $clientOid;
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


}