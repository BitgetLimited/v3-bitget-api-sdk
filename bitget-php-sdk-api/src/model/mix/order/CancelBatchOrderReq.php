<?php


namespace bitget\model\mix\order;


class CancelBatchOrderReq
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
     * Order Id list
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