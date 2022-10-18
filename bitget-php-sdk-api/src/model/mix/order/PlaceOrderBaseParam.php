<?php


namespace bitget\model\mix\order;


class PlaceOrderBaseParam
{
    /**
     * Client ID
     */
    var string $clientOid;
    /**
     * Amount of currency placed
     */
    var string $size;
    /**
     * 1: Kaiduo 2: Kaikong 3: Pingduo 4: Pingkong
     */
    var string $side;
    /**
     * Order Type
     */
    var string $orderType;
    /**
     * Entrusted price
     */
    var string $price;

    var string $timeInForceValue;

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


}