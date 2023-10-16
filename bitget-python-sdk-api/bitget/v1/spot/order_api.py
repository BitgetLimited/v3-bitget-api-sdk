#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def placeOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/trade/orders', params)

    def batchOrders(self, params):
        return self._request_with_params(POST, '/api/spot/v1/trade/batch-orders', params)

    def cancelOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/trade/cancel-order', params)

    def batchCancelOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/trade/cancel-batch-orders', params)

    def openOrders(self, params):
        return self._request_with_params(GET, '/api/spot/v1/trade/open-orders', params)

    def historyOrders(self, params):
        return self._request_with_params(GET, '/api/spot/v1/trade/history', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/spot/v1/trade/fills', params)

    def placePlanOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/plan/placePlan', params)

    def cancelPlanOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/plan/cancelPlan', params)

    def currentPlanOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/plan/currentPlan', params)

    def historyPlanOrder(self, params):
        return self._request_with_params(POST, '/api/spot/v1/plan/historyPlan', params)

    def traderOrderCloseTracking(self, params):
        return self._request_with_params(POST, '/api/spot/v1/trace/order/closeTrackingOrder', params)

    def traderOrderCurrentTrack(self, params):
        return self._request_with_params(POST, '/api/spot/v1/trace/order/orderCurrentList', params)

    def traderOrderHistoryTrack(self, params):
        return self._request_with_params(GET, '/api/spot/v1/trace/order/orderHistoryList', params)
