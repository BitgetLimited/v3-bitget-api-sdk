<?php


namespace bitget\model\spot\account;


class BillsReq
{
    /**
     * 币种ID
     */
    var string $coinId;

    /**
     * 分组类型
     */
    var string $groupType;

    /**
     * 业务类型
     */
    var string $bizType;

    /**
     * 传入billId ,查之前的数据
     */
    var string $after;

    /**
     * 传入billId,查之后的数据
     */
    var string $before;

    /**
     * 默认100，最大500
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