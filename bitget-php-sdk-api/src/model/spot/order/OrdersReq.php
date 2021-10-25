<?php


namespace bitget\model\spot\order;


class OrdersReq
{
    /**
     * 币对
     */
    var string $symbol;
    /**
     * 订单方向
     */
    var string $side;

    /**
     * 订单类型
     */
    var string $orderType;

    /**
     * 订单控制类型
     */
    var string $force;

    /**
     * 委托价格，仅适用于限价单
     */
    var string $price;

    /**
     * 数量
     */
    var string $quantity;

    /**
     * 客户端订单ID
     */
    var string $clientOrderId;

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
    public function getForce(): string
    {
        return $this->force;
    }

    /**
     * @param string $force
     */
    public function setForce(string $force): void
    {
        $this->force = $force;
    }

    /**
     * @return string
     */
    public function getPrice(): string
    {
        return $this->price;
    }

    /**
     * @param string $price
     */
    public function setPrice(string $price): void
    {
        $this->price = $price;
    }

    /**
     * @return string
     */
    public function getQuantity(): string
    {
        return $this->quantity;
    }

    /**
     * @param string $quantity
     */
    public function setQuantity(string $quantity): void
    {
        $this->quantity = $quantity;
    }

    /**
     * @return string
     */
    public function getClientOrderId(): string
    {
        return $this->clientOrderId;
    }

    /**
     * @param string $clientOrderId
     */
    public function setClientOrderId(string $clientOrderId): void
    {
        $this->clientOrderId = $clientOrderId;
    }


}