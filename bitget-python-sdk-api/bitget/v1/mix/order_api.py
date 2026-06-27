#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def placeOrder(self, params):
        return self._request_with_params(POST, '/api/mix/v1/order/placeOrder', params)

    def batchPlaceOrder(self, params):
        return self._request_with_params(POST, '/api/mix/v1/order/batch-orders', params)

    def cancelOrder(self, params):
        return self._request_with_params(POST, '/api/mix/v1/order/cancel-order', params)

    def batchCancelOrders(self, params):
        return self._request_with_params(POST, '/api/mix/v1/order/cancel-batch-orders', params)

    def ordersHistory(self, params):
        return self._request_with_params(GET, '/api/mix/v1/order/history', params)

    def ordersPending(self, params):
        return self._request_with_params(GET, '/api/mix/v1/order/current', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/mix/v1/order/fills', params)

    def placePlanOrder(self, params):
        return self._request_with_params(POST, '/api/mix/v1/plan/placePlan', params)

    def cancelPlan(self, params):
        return self._request_with_params(POST, '/api/mix/v1/plan/cancelPlan', params)

    def currentPlan(self, params):
        return self._request_with_params(GET, '/api/mix/v1/plan/currentPlan', params)

    def historyPlan(self, params):
        return self._request_with_params(GET, '/api/mix/v1/plan/historyPlan', params)

    def traderCloseOrder(self, params):
        return self._request_with_params(POST, '/api/mix/v1/trace/closeTrackOrder', params)

    def traderOrderCurrentTrack(self, params):
        return self._request_with_params(GET, '/api/mix/v1/trace/currentTrack', params)

    def traderOrderHistoryTrack(self, params):
        return self._request_with_params(GET, '/api/mix/v1/trace/historyTrack', params)

    def followerCloseByTrackingNo(self, params):
        return self._request_with_params(POST, '/api/mix/v1/trace/followerCloseByTrackingNo', params)

    def followerQueryCurrentOrders(self, params):
        return self._request_with_params(GET, '/api/mix/v1/trace/followerOrder', params)

    def followerQueryHistoryOrders(self, params):
        return self._request_with_params(GET, '/api/mix/v1/trace/followerHistoryOrders', params)
