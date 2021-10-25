<?php


namespace bitget\model\mix\order;


class PlaceOrderReq
{
    /**
     * 合约
     */
    var string $symbol;

    /**
     * 保证金币种
     */
    var string $marginCoin;

    /**
     * 客户端标识
     */
    var string $clientOid;
    /**
     * 下单币量
     */
    var string $size;
    /**
     * 开多 开空 平多 平空
     */
    var string $side;
    /**
     * 订单类型 市价 限价
     */
    var string $orderType;
    /**
     * 委托价格
     */
    var string $price;

    /**
     * 订单有效期
     */
    var string $timeInForceValue;
    /**
     * 预设止盈价
     */
    var string $presetTakeProfitPrice;
    /**
     * 预设止损价
     */
    var string $presetStopLossPrice;

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
    public function getClientOid()
    {
        return $this->clientOid;
    }

    /**
     * @param mixed $clientOid
     */
    public function setClientOid($clientOid): void
    {
        $this->clientOid = $clientOid;
    }

    /**
     * @return mixed
     */
    public function getSize()
    {
        return $this->size;
    }

    /**
     * @param mixed $size
     */
    public function setSize($size): void
    {
        $this->size = $size;
    }

    /**
     * @return mixed
     */
    public function getSide()
    {
        return $this->side;
    }

    /**
     * @param mixed $side
     */
    public function setSide($side): void
    {
        $this->side = $side;
    }

    /**
     * @return mixed
     */
    public function getOrderType()
    {
        return $this->orderType;
    }

    /**
     * @param mixed $orderType
     */
    public function setOrderType($orderType): void
    {
        $this->orderType = $orderType;
    }

    /**
     * @return mixed
     */
    public function getPrice()
    {
        return $this->price;
    }

    /**
     * @param mixed $price
     */
    public function setPrice($price): void
    {
        $this->price = $price;
    }

    /**
     * @return mixed
     */
    public function getTimeInForceValue()
    {
        return $this->timeInForceValue;
    }

    /**
     * @param mixed $timeInForceValue
     */
    public function setTimeInForceValue($timeInForceValue): void
    {
        $this->timeInForceValue = $timeInForceValue;
    }

    /**
     * @return mixed
     */
    public function getPresetTakeProfitPrice()
    {
        return $this->presetTakeProfitPrice;
    }

    /**
     * @param mixed $presetTakeProfitPrice
     */
    public function setPresetTakeProfitPrice($presetTakeProfitPrice): void
    {
        $this->presetTakeProfitPrice = $presetTakeProfitPrice;
    }

    /**
     * @return mixed
     */
    public function getPresetStopLossPrice()
    {
        return $this->presetStopLossPrice;
    }

    /**
     * @param mixed $presetStopLossPrice
     */
    public function setPresetStopLossPrice($presetStopLossPrice): void
    {
        $this->presetStopLossPrice = $presetStopLossPrice;
    }

}