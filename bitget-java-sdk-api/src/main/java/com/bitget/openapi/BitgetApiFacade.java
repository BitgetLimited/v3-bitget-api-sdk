package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.BitgetService;
import com.bitget.openapi.service.v1.mix.MixAccountService;
import com.bitget.openapi.service.v1.mix.MixMarketService;
import com.bitget.openapi.service.v1.mix.MixOrderService;
import com.bitget.openapi.service.v1.spot.SpotAccountService;
import com.bitget.openapi.service.v1.spot.SpotMarketService;
import com.bitget.openapi.service.v1.spot.SpotOrderService;
import com.bitget.openapi.service.v1.spot.SpotWalletService;

public class BitgetApiFacade {

    private final ApiClient apiClient;

    public BitgetApiFacade(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * REST API Endpoint
     */
    public BitgetApiFacade.BgEndpoint v1() {
        return new BitgetApiFacade.BgEndpoint(apiClient);
    }

    public BitgetApiFacade.BgEndpointV2 v2() {
        return new BitgetApiFacade.BgEndpointV2(apiClient);
    }

    public static class BgEndpoint {
        private final ApiClient apiClient;

        BgEndpoint(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        public <T> T createRetrofit(Class<T> clazz) {
            return apiClient.create(clazz);
        }

        /**
         * bitget service
         */
        public BitgetService request() {
            return new BitgetService(apiClient);
        }

        /**
         * market service
         */
        public MixMarketService mixMarket() {
            return new MixMarketService(apiClient);
        }

        /**
         * account service
         */
        public MixAccountService mixAccount() {
            return new MixAccountService(apiClient);
        }

        /**
         * order service
         */
        public MixOrderService mixOrder() {
            return new MixOrderService(apiClient);
        }

        /**
         * account service
         */
        public SpotAccountService spotAccount() {
            return new SpotAccountService(apiClient);
        }

        /**
         * market service
         */
        public SpotMarketService spotMarket() {
            return new SpotMarketService(apiClient);
        }

        /**
         * order service
         */
        public SpotOrderService spotOrder() {
            return new SpotOrderService(apiClient);
        }

        /**
         * wallet service
         */
        public SpotWalletService spotWallet() {
            return new SpotWalletService(apiClient);
        }
    }

    public static class BgEndpointV2 {
        private final ApiClient apiClient;

        BgEndpointV2(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        public <T> T createRetrofit(Class<T> clazz) {
            return apiClient.create(clazz);
        }

        /**
         * bitget service
         */
        public BitgetService request() {
            return new BitgetService(apiClient);
        }

        /**
         * market service
         */
        public MixMarketService mixMarket() {
            return new MixMarketService(apiClient);
        }

        /**
         * account service
         */
        public MixAccountService mixAccount() {
            return new MixAccountService(apiClient);
        }

        /**
         * order service
         */
        public MixOrderService mixOrder() {
            return new MixOrderService(apiClient);
        }

        /**
         * account service
         */
        public SpotAccountService spotAccount() {
            return new SpotAccountService(apiClient);
        }

        /**
         * market service
         */
        public SpotMarketService spotMarket() {
            return new SpotMarketService(apiClient);
        }

        /**
         * order service
         */
        public SpotOrderService spotOrder() {
            return new SpotOrderService(apiClient);
        }

        /**
         * wallet service
         */
        public SpotWalletService spotWallet() {
            return new SpotWalletService(apiClient);
        }
    }
}
