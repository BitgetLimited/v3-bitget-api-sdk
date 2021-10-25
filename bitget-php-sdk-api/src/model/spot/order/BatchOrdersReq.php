<?php


namespace bitget\model\spot\order;


class BatchOrdersReq
{
    /**
     * 币对
     */
    var string $symbol;
    var array $orderList;

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
    public function getOrderList(): array
    {
        return $this->orderList;
    }

    /**
     * @param array $orderList
     */
    public function setOrderList(array $orderList): void
    {
        $this->orderList = $orderList;
    }


}