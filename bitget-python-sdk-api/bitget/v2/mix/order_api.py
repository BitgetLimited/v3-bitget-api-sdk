#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def placeOrder(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/place-order', params)

    def clickBackhand(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/click-backhand', params)

    def batchPlaceOrder(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/batch-place-order', params)

    def cancelOrder(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/cancel-order', params)

    def batchCancelOrders(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/batch-cancel-orders', params)

    def closePositions(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/close-positions', params)

    def ordersHistory(self, params):
        return self._request_with_params(GET, '/api/v2/mix/order/orders-history', params)

    def ordersPending(self, params):
        return self._request_with_params(GET, '/api/v2/mix/order/orders-pending', params)

    def detail(self, params):
        return self._request_with_params(GET, '/api/v2/mix/order/detail', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/v2/mix/order/fills', params)

    def placePlanOrder(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/place-plan-order', params)

    def cancelPlanOrder(self, params):
        return self._request_with_params(POST, '/api/v2/mix/order/cancel-plan-order', params)

    def ordersPlanPending(self, params):
        return self._request_with_params(GET, '/api/v2/mix/order/orders-plan-pending', params)

    def ordersPlanHistory(self, params):
        return self._request_with_params(GET, '/api/v2/mix/order/orders-plan-history', params)

    def traderOrderClosePositions(self, params):
        return self._request_with_params(POST, '/api/v2/copy/mix-trader/order-close-positions', params)

    def traderOrderCurrentTrack(self, params):
        return self._request_with_params(GET, '/api/v2/copy/mix-trader/order-current-track', params)

    def traderOrderHistoryTrack(self, params):
        return self._request_with_params(GET, '/api/v2/copy/mix-trader/order-history-track', params)

    def followerClosePositions(self, params):
        return self._request_with_params(POST, '/api/v2/copy/mix-follower/close-positions', params)

    def followerQueryCurrentOrders(self, params):
        return self._request_with_params(GET, '/api/v2/copy/mix-follower/query-current-orders', params)

    def followerQueryHistoryOrders(self, params):
        return self._request_with_params(GET, '/api/v2/copy/mix-follower/query-history-orders', params)
