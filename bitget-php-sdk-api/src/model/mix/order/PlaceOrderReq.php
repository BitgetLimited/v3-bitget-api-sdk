<?php


namespace bitget\model\mix\order;


class PlaceOrderReq
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
     * Client ID
     */
    var string $clientOid;
    /**
     * Amount of currency placed
     */
    var string $size;
    /**
     * Open more, open more, empty more, empty more
     */
    var string $side;
    /**
     * Order Type Market Price Limit
     */
    var string $orderType;
    /**
     * Entrusted price
     */
    var string $price;

    /**
     * Order validity
     */
    var string $timeInForceValue;
    /**
     * Default stop profit price
     */
    var string $presetTakeProfitPrice;
    /**
     * Preset stop loss price
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