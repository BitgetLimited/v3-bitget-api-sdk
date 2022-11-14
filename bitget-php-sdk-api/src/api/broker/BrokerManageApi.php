<?php

namespace bitget\api\broker;

use bitget\model\broker\BrokerCreateSubApiReq;
use bitget\model\broker\BrokerModifySubApiReq;



class BrokerManageApi
{
    const BASE_URL = "/api/broker/v1/manage";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }



    /**
     * broker create sub apikey
     * @param $brokerCreateSubReq
     * @return string
     */
    public function createSubApi(BrokerCreateSubApiReq $brokerCreateSubApiReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-api-create", $brokerCreateSubApiReq);
    }

    /**
     * Get sub apikey list
     * @return string
     */
    public function getSubApiKeyList(string $subUid): string
    {
        $params = array("subUid" => $subUid);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/sub-api-list", $params);
    }

    /**
     * broker modify sub apikey
     * @param $brokerModifySubApiReq
     * @return string
     */
    public function modifySubApi(BrokerModifySubApiReq $brokerModifySubApiReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/sub-api-create", $brokerModifySubApiReq);
    }



}