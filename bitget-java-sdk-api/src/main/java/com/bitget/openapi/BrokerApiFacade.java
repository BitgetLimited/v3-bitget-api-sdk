package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.broker.BrokerAccountService;
import com.bitget.openapi.service.broker.BrokerManageService;
import com.bitget.openapi.service.broker.impl.BrokerAccountServiceImpl;
import com.bitget.openapi.service.broker.impl.BrokerManageServiceImpl;
import com.bitget.openapi.service.spot.SpotAccountService;
import com.bitget.openapi.service.spot.impl.SpotAccountServiceImpl;

public class BrokerApiFacade {


    private final ApiClient apiClient;

    public BrokerApiFacade(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * REST API Endpoint
     *
     * @return SpotEndpoint
     */
    public BrokerApiFacade.BrokerEndpoint bitget() {
        return new BrokerApiFacade.BrokerEndpoint(apiClient);
    }


    public static class BrokerEndpoint {
        private final ApiClient apiClient;

        BrokerEndpoint(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        /**
         * sub account service
         */
        public BrokerAccountService account() {
            return new BrokerAccountServiceImpl(apiClient);
        }

        /**
         * sub api manage service
         */
        public BrokerManageService manage() {
            return new BrokerManageServiceImpl(apiClient);
        }
    }
}
