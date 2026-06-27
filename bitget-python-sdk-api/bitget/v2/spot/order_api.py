#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def placeOrder(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/place-order', params)

    def batchOrders(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/batch-orders', params)

    def cancelOrder(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/cancel-order', params)

    def batchCancelOrder(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/batch-cancel-order', params)

    def historyOrders(self, params):
        return self._request_with_params(GET, '/api/v2/spot/trade/unfilled-orders', params)

    def historyOrders(self, params):
        return self._request_with_params(GET, '/api/v2/spot/trade/history-orders', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/v2/spot/trade/fills', params)

    def placePlanOrder(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/place-plan-order', params)

    def modifyPlanOrder(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/modify-plan-order', params)

    def cancelPlanOrder(self, params):
        return self._request_with_params(POST, '/api/v2/spot/trade/cancel-plan-order', params)

    def currentPlanOrder(self, params):
        return self._request_with_params(GET, '/api/v2/spot/trade/current-plan-order', params)

    def historyPlanOrder(self, params):
        return self._request_with_params(GET, '/api/v2/spot/trade/history-plan-order', params)

    def traderOrderCloseTracking(self, params):
        return self._request_with_params(POST, '/api/v2/copy/spot-trader/order-close-tracking', params)

    def traderOrderCurrentTrack(self, params):
        return self._request_with_params(GET, '/api/v2/copy/spot-trader/order-current-track', params)

    def traderOrderHistoryTrack(self, params):
        return self._request_with_params(GET, '/api/v2/copy/spot-trader/order-history-track', params)
