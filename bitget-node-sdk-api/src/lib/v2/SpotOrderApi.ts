import {BaseApi} from '../BaseApi';

export class SpotOrderApi extends BaseApi {

    placeOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/place-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchOrders(qsOrBody: object) {
        const url = '/api/v2/spot/trade/batch-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/cancel-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchCancelOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/batch-cancel-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    orderInfo(qsOrBody: object) {
        const url = '/api/v2/spot/trade/orderInfo';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    unfilledOrders(qsOrBody: object) {
        const url = '/api/v2/spot/trade/unfilled-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    historyOrders(qsOrBody: object) {
        const url = '/api/v2/spot/trade/history-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(qsOrBody: object) {
        const url = '/api/v2/spot/trade/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    placePlanOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/place-plan-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelPlanOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/cancel-plan-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    currentPlanOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/current-plan-order';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    historyPlanOrder(qsOrBody: object) {
        const url = '/api/v2/spot/trade/history-plan-order';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    traderOrderCloseTracking(qsOrBody: object) {
        const url = '/api/v2/copy/spot-trader/order-close-tracking';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    traderOrderCurrentTrack(qsOrBody: object) {
        const url = '/api/v2/copy/spot-trader/order-current-track';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    traderOrderHistoryTrack(qsOrBody: object) {
        const url = '/api/v2/copy/spot-trader/order-history-track';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}