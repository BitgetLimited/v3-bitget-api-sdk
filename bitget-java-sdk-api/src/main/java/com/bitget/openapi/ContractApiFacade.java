package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.AccountService;
import com.bitget.openapi.service.MarketService;
import com.bitget.openapi.service.OrderService;
import com.bitget.openapi.service.PositionService;
import com.bitget.openapi.service.impl.AccountServiceImpl;
import com.bitget.openapi.service.impl.MarketServiceImpl;
import com.bitget.openapi.service.impl.OrderServiceImpl;
import com.bitget.openapi.service.impl.PositionServiceImpl;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class ContractApiFacade {
    private final ApiClient apiClient;

    public ContractApiFacade(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * REST API Endpoint
     *
     * @return ContractEndpoint
     */
    ContractEndpoint bitget() {
        return new ContractEndpoint(apiClient);
    }

    public static class ContractEndpoint {
        private final ApiClient apiClient;

        ContractEndpoint(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        /**
         * order service
         */
        OrderService order() {
            return new OrderServiceImpl(apiClient);
        }

        /**
         * position service
         */
        PositionService position() {
            return new PositionServiceImpl(apiClient);
        }

        /**
         * market service
         *
         * @return
         */
        MarketService market() {
            return new MarketServiceImpl(apiClient);
        }

        /**
         * account service
         *
         * @return
         */
        AccountService account() {
            return new AccountServiceImpl(apiClient);
        }
    }

}
