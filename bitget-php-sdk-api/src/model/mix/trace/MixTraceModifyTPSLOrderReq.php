<?php


namespace bitget\model\mix\trace;


class MixTraceModifyTPSLOrderReq
{
    /**
     * Currency pair
     */
    var string $symbol;
    /**
     * The tracking order number comes from the trackingNo of the current interface with the order
     */
    var string $trackingNo;

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
    public function getTrackingNo(): string
    {
        return $this->trackingNo;
    }

    /**
     * @param string $trackingNo
     */
    public function setTrackingNo(string $trackingNo): void
    {
        $this->trackingNo = $trackingNo;
    }


}