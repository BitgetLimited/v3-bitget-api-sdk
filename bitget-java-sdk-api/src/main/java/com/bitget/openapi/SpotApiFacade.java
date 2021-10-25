package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.spot.SpotAccountService;
import com.bitget.openapi.service.spot.SpotMarketService;
import com.bitget.openapi.service.spot.SpotOrderService;
import com.bitget.openapi.service.spot.SpotPublicService;
import com.bitget.openapi.service.spot.impl.SpotAccountServiceImpl;
import com.bitget.openapi.service.spot.impl.SpotMarketServiceImpl;
import com.bitget.openapi.service.spot.impl.SpotOrderServiceImpl;
import com.bitget.openapi.service.spot.impl.SpotPublicServiceImpl;

/**
 * @Author: bitget
 * @Date: 2021-05-31 15:20
 * @DES: spot
 */
public class SpotApiFacade {

    private final ApiClient apiClient;

    public SpotApiFacade(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * REST API Endpoint
     *
     * @return SpotEndpoint
     */
    public SpotApiFacade.SpotEndpoint bitget() {
        return new SpotApiFacade.SpotEndpoint(apiClient);
    }

    public static class SpotEndpoint {
        private final ApiClient apiClient;

        SpotEndpoint(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        /**
         * account service
         */
        public SpotAccountService account() {
            return new SpotAccountServiceImpl(apiClient);
        }

        /**
         * common service
         */
        public SpotPublicService common() {
            return new SpotPublicServiceImpl(apiClient);
        }

        /**
         * market service
         */
        public SpotMarketService market() {
            return new SpotMarketServiceImpl(apiClient);
        }

        /**
         * order service
         */
        public SpotOrderService order() {
            return new SpotOrderServiceImpl(apiClient);
        }


    }
}
