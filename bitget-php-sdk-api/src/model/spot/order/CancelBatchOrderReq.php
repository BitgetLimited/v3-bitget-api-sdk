<?php


namespace bitget\model\spot\order;


class CancelBatchOrderReq
{
    /**
     * Currency pair
     */
    var string $symbol;

    /**
     *  Order ids
     */
    var array $orderIds;

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
     * @return array
     */
    public function getOrderIds(): array
    {
        return $this->orderIds;
    }

    /**
     * @param array $orderIds
     */
    public function setOrderIds(array $orderIds): void
    {
        $this->orderIds = $orderIds;
    }


}