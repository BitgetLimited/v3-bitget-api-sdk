package com.bitget.openapi;

import com.bitget.openapi.api.spot.SpotWalletApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.spot.*;
import com.bitget.openapi.service.spot.impl.*;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot api facade
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

        /**
         * order service
         */
        public SpotWalletService wallet() {
            return new SpotWalletServiceImpl(apiClient);
        }


    }
}
