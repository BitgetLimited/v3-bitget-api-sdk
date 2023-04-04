<?php


namespace bitget\model\spot\plan;


class SpotPlanReq
{
    var string $symbol;

    var string $size;

    var string $executePrice;

    var string $triggerPrice;

    var string $side;

    var string $orderType;

    var string $triggerType;

    var string $timeInForceValue;

    var string $clientOid;

    var string $channelApiCode;

    public function getSymbol(): string
    {
        return $this->symbol;
    }

    public function setSymbol(string $symbol): void
    {
        $this->symbol = $symbol;
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

    public function getSide(): string
    {
        return $this->side;
    }

    public function setSide(string $side): void
    {
        $this->side = $side;
    }

    public function getOrderType(): string
    {
        return $this->orderType;
    }

    public function setOrderType(string $orderType): void
    {
        $this->orderType = $orderType;
    }

    public function getTriggerType(): string
    {
        return $this->triggerType;
    }

    public function setTriggerType(string $triggerType): void
    {
        $this->triggerType = $triggerType;
    }

    public function getTimeInForceValue(): string
    {
        return $this->timeInForceValue;
    }

    public function setTimeInForceValue(string $timeInForceValue): void
    {
        $this->timeInForceValue = $timeInForceValue;
    }

    public function getClientOid(): string
    {
        return $this->clientOid;
    }

    public function setClientOid(string $clientOid): void
    {
        $this->clientOid = $clientOid;
    }

    public function getChannelApiCode(): string
    {
        return $this->channelApiCode;
    }

    public function setChannelApiCode(string $channelApiCode): void
    {
        $this->channelApiCode = $channelApiCode;
    }

}