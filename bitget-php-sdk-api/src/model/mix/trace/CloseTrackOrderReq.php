<?php


namespace bitget\model\mix\trace;


class CloseTrackOrderReq
{
    var string $symbol;

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