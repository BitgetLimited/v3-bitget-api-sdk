<?php


namespace bitget\model\spot\wallet;


class WithdrawalReq
{
    /**
     * coin
     */
    var string $coin;

    /**
     * address
     */
    var string $address;

    /**
     * chain
     */
    var string $chain;

    /**
     * tag
     */
    var string $tag;

    /**
     * amount
     */
    var string $amount;

    /**
     * remark
     */
    var string $remark;

    /**
     * clientOid
     */
    var string $clientOid;

    /**
     * @return string
     */
    public function getCoin(): string
    {
        return $this->coin;
    }

    /**
     * @param string $coin
     */
    public function setCoin(string $coin): void
    {
        $this->coin = $coin;
    }

    /**
     * @return string
     */
    public function getAddress(): string
    {
        return $this->address;
    }

    /**
     * @param string $address
     */
    public function setAddress(string $address): void
    {
        $this->address = $address;
    }

    /**
     * @return string
     */
    public function getChain(): string
    {
        return $this->chain;
    }

    /**
     * @param string
     */
    public function setChain(string $chain): void
    {
        $this->chain = $chain;
    }

    /**
     * @return string
     */
    public function getTag(): string
    {
        return $this->tag;
    }

    /**
     * @param string
     */
    public function setTag(string $tag): void
    {
        $this->tag = $tag;
    }

    /**
     * @return string
     */
    public function getAmount(): string
    {
        return $this->amount;
    }

    /**
     * @param string
     */
    public function setAmount(string $amount): void
    {
        $this->amount = $amount;
    }

    /**
     * @return string
     */
    public function getRemark(): string
    {
        return $this->remark;
    }

    /**
     * @param string
     */
    public function setRemark(string $remark): void
    {
        $this->remark = $remark;
    }
    /**
     * @return string
     */
    public function getClientOid(): string
    {
        return $this->clientOid;
    }

    /**
     * @param string
     */
    public function setClientOid(string $clientOid): void
    {
        $this->clientOid = $clientOid;
    }



}