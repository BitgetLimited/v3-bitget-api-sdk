<?php


namespace bitget\model\spot\plan;


class SpotModifyPlanReq
{
    var string $orderId;

    var string $size;

    var string $executePrice;

    var string $triggerPrice;

    var string $orderType;

    public function getOrderId(): string
    {
        return $this->orderId;
    }

    public function setOrderId(string $orderId): void
    {
        $this->orderId = $orderId;
    }

    public function getSize(): string
    {
        return $this->size;
    }

    public function setSize(string $size): void
    {
        $this->size = $size;
    }

    public function getExecutePrice(): string
    {
        return $this->executePrice;
    }

    public function setExecutePrice(string $executePrice): void
    {
        $this->executePrice = $executePrice;
    }

    public function getTriggerPrice(): string
    {
        return $this->triggerPrice;
    }

    public function setTriggerPrice(string $triggerPrice): void
    {
        $this->triggerPrice = $triggerPrice;
    }

    public function getOrderType(): string
    {
        return $this->orderType;
    }

    public function setOrderType(string $orderType): void
    {
        $this->orderType = $orderType;
    }

}