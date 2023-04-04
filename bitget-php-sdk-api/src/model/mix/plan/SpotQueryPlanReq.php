<?php


namespace bitget\model\spot\plan;


class SpotQueryPlanReq
{
    var string $symbol;

    var string $startTime;

    var string $endTime;

    var string $pageSize;

    var string $lastEndId;

    var string $isPre;

    public function getSymbol(): string
    {
        return $this->symbol;
    }

    public function setSymbol(string $symbol): void
    {
        $this->symbol = $symbol;
    }

    public function getStartTime(): string
    {
        return $this->startTime;
    }

    public function setStartTime(string $startTime): void
    {
        $this->startTime = $startTime;
    }

    public function getEndTime(): string
    {
        return $this->endTime;
    }

    public function setEndTime(string $endTime): void
    {
        $this->endTime = $endTime;
    }

    public function getPageSize(): string
    {
        return $this->pageSize;
    }

    public function setPageSize(string $pageSize): void
    {
        $this->pageSize = $pageSize;
    }

    public function getLastEndId(): string
    {
        return $this->lastEndId;
    }

    public function setLastEndId(string $lastEndId): void
    {
        $this->lastEndId = $lastEndId;
    }

    public function getIsPre(): string
    {
        return $this->isPre;
    }

    public function setIsPre(string $isPre): void
    {
        $this->isPre = $isPre;
    }

}