<?php


namespace bitget\model\spot\account;


class BillsReq
{
    /**
     * Currency ID
     */
    var string $coinId;

    /**
     * Group Type
     */
    var string $groupType;

    /**
     * Business Type
     */
    var string $bizType;

    /**
     * Pass in billId to query previous data
     */
    var string $after;

    /**
     * Pass in billId to check the subsequent data
     */
    var string $before;

    /**
     * Default 100, maximum 500
     */
    var string $limit;

    /**
     * @return string
     */
    public function getCoinId(): string
    {
        return $this->coinId;
    }

    /**
     * @param string $coinId
     */
    public function setCoinId(string $coinId): void
    {
        $this->coinId = $coinId;
    }

    /**
     * @return string
     */
    public function getGroupType(): string
    {
        return $this->groupType;
    }

    /**
     * @param string $groupType
     */
    public function setGroupType(string $groupType): void
    {
        $this->groupType = $groupType;
    }

    /**
     * @return string
     */
    public function getBizType(): string
    {
        return $this->bizType;
    }

    /**
     * @param string $bizType
     */
    public function setBizType(string $bizType): void
    {
        $this->bizType = $bizType;
    }

    /**
     * @return string
     */
    public function getAfter(): string
    {
        return $this->after;
    }

    /**
     * @param string $after
     */
    public function setAfter(string $after): void
    {
        $this->after = $after;
    }

    /**
     * @return string
     */
    public function getBefore(): string
    {
        return $this->before;
    }

    /**
     * @param string $before
     */
    public function setBefore(string $before): void
    {
        $this->before = $before;
    }

    /**
     * @return string
     */
    public function getLimit(): string
    {
        return $this->limit;
    }

    /**
     * @param string $limit
     */
    public function setLimit(string $limit): void
    {
        $this->limit = $limit;
    }


}