package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.*;
import com.bitget.openapi.service.impl.*;

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
        /**
         * trace service
         */
        TraceService  trace(){
            return  new TraceServiceImpl(apiClient);
        }

        /**
         * traceProfit service
         * @return
         */
        TraceProfitService traceProfit() {
            return new TraceProfitServiceImpl(apiClient);
        }
    }

}
