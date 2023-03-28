<?php


namespace bitget\model\mix\trace;


class MixTraceSetCopyTradeSymbolReq
{
    /**
     * Currency pair
     */
    var string $symbol;
    /**
     * The tracking order number comes from the trackingNo of the current interface with the order
     */
    var string $operation;

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
    public function getOperation(): string
    {
        return $this->operation;
    }

    /**
     * @param string $operation
     */
    public function setOperation(string $operation): void
    {
        $this->operation = $operation;
    }


}