<?php

namespace bitget\api\broker;

use bitget\model\broker\BrokerCreateSubReq;
use bitget\model\broker\BrokerModifySubReq;
use bitget\model\broker\BrokerModifyEmailReq;
use bitget\model\broker\BrokerSubDepositAddressReq;
use bitget\model\broker\BrokerSubWithdrawReq;
use bitget\model\broker\BrokerSubTransferReq;


class BrokerAccountApi
{
    const BASE_URL = "/api/broker/v1/account";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }


    /**
     * Get broker account  information
     * @return string
     */
    public function account(): string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/info");
    }


    /**
     * broker create sub
     * @param $brokerCreateSubReq
     * @return string
     */
    public function createSub(BrokerCreateSubReq $brokerCreateSubReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-create", $brokerCreateSubReq);
    }


    /**
     * Get sub list
     * @param  $symbol
     * @param $marginCoin
     * @return string
     */
    public function getSubList(string $pageSize, string $lastEndId, string $status): string
    {
        $params = array("pageSize" => $pageSize, "lastEndId" => $lastEndId, "status"=>$status);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/sub-list", $params);
    }

    /**
     * broker modify sub
     * @param $brokerModifySubReq
     * @return string
     */
    public function subModify(BrokerModifySubReq $brokerModifySubReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-modify", $brokerModifySubReq);
    }

    /**
     * broker modify sub
     * @param $brokerModifyEmailReq
     * @return string
     */
    public function subModifyEmail(BrokerModifyEmailReq $brokerModifyEmailReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-modify-email", $brokerModifyEmailReq);
    }

    /**
     * Get sub email
     * @return string
     */
    public function getSubEmail(string $subUid): string
    {
        $params = array("subUid" => $subUid);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/sub-email", $params);
    }


    /**
     * Get sub spot assets list
     * @return string
     */
    public function getSubSpotAssets(string $subUid): string
    {
        $params = array("subUid" => $subUid);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/sub-spot-assets", $params);
    }

    /**
     * Get sub future assets list
     * @return string
     */
    public function getSubFutureAssets(string $subUid): string
    {
        $params = array("subUid" => $subUid);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/sub-future-assets", $params);
    }


    /**
     * broker get sub deposit address
     * @param $brokerModifyEmailReq
     * @return string
     */
    public function subDepositAddress(BrokerSubDepositAddressReq $brokerSubDepositAddressReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-address", $brokerSubDepositAddressReq);
    }

    /**
     * broker sub withdraw
     * @param $brokerModifyEmailReq
     * @return string
     */
    public function subWithdraw(BrokerSubWithdrawReq $brokerSubWithdrawReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-withdrawal", $brokerSubWithdrawReq);
    }

    /**
     * broker auto transfer
     * @param $brokerModifyEmailReq
     * @return string
     */
    public function subAutoTransfer(BrokerSubTransferReq $brokerSubTransferReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-auto-transfer", $brokerSubTransferReq);
    }

}