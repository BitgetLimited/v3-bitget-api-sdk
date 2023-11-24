import {BaseApi} from '../BaseApi';

export class MixOrderApi extends BaseApi {

    placeOrder(qsOrBody: object) {
        const url = '/api/v2/mix/order/place-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchPlaceOrder(qsOrBody: object) {
        const url = '/api/v2/mix/order/batch-place-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelOrder(qsOrBody: object) {
        const url = '/api/v2/mix/order/cancel-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchCancelOrders(qsOrBody: object) {
        const url = '/api/v2/mix/order/batch-cancel-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    ordersPending(qsOrBody: object) {
        const url = '/api/v2/mix/order/orders-pending';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ordersHistory(qsOrBody: object) {
        const url = '/api/v2/mix/order/orders-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(qsOrBody: object) {
        const url = '/api/v2/mix/order/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    placePlanOrder(qsOrBody: object) {
        const url = '/api/v2/mix/order/place-plan-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelPlanOrder(qsOrBody: object) {
        const url = '/api/v2/mix/order/cancel-plan-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    ordersPlanPending(qsOrBody: object) {
        const url = '/api/v2/mix/order/orders-plan-pending';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ordersPlanHistory(qsOrBody: object) {
        const url = '/api/v2/mix/order/orders-plan-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    traderOrderClosePositions(qsOrBody: object) {
        const url = '/api/v2/copy/mix-trader/order-close-positions';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    traderOrderCurrentTrack(qsOrBody: object) {
        const url = '/api/v2/copy/mix-trader/order-current-track';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    traderOrderHistoryTrack(qsOrBody: object) {
        const url = '/api/v2/copy/mix-trader/order-history-track';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    followerClosePositions(qsOrBody: object) {
        const url = '/api/v2/copy/mix-follower/close-positions';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    followerQueryCurrentOrders(qsOrBody: object) {
        const url = '/api/v2/copy/mix-follower/query-current-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    followerQueryHistoryOrders(qsOrBody: object) {
        const url = '/api/v2/copy/mix-follower/query-history-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}