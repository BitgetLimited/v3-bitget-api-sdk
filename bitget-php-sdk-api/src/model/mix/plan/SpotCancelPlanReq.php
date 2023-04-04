<?php


namespace bitget\model\spot\plan;


class SpotCancelPlanReq
{
    var string $orderId;

    public function getOrderId(): string
    {
        return $this->orderId;
    }

    public function setOrderId(string $orderId): void
    {
        $this->orderId = $orderId;
    }

}