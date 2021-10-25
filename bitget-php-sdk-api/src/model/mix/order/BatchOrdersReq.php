<?php


namespace bitget\model\mix\order;


class BatchOrdersReq
{

    var string $symbol;

    var string $marginCoin;

    var array $orderDataList;

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
    public function getOrderDataList(): array
    {
        return $this->orderDataList;
    }

    /**
     * @param array $orderDataList
     */
    public function setOrderDataList(array $orderDataList): void
    {
        $this->orderDataList = $orderDataList;
    }


}