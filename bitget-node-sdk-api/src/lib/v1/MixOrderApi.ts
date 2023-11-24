import {BaseApi} from '../BaseApi';

export class MixOrderApi extends BaseApi {

    placeOrder(qsOrBody: object) {
        const url = '/api/mix/v1/order/placeOrder';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchPlaceOrder(qsOrBody: object) {
        const url = '/api/mix/v1/order/batch-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelOrder(qsOrBody: object) {
        const url = '/api/mix/v1/order/cancel-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchCancelOrders(qsOrBody: object) {
        const url = '/api/mix/v1/order/cancel-batch-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    ordersPending(qsOrBody: object) {
        const url = '/api/mix/v1/order/current';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ordersHistory(qsOrBody: object) {
        const url = '/api/mix/v1/order/history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(qsOrBody: object) {
        const url = '/api/mix/v1/order/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    placePlanOrder(qsOrBody: object) {
        const url = '/api/mix/v1/plan/placePlan';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelPlanOrder(qsOrBody: object) {
        const url = '/api/mix/v1/plan/cancelPlan';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    ordersPlanPending(qsOrBody: object) {
        const url = '/api/mix/v1/plan/currentPlan';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ordersPlanHistory(qsOrBody: object) {
        const url = '/api/mix/v1/plan/historyPlan';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    traderCloseOrder(qsOrBody: object) {
        const url = '/api/mix/v1/trace/closeTrackOrder';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    traderCurrentOrders(qsOrBody: object) {
        const url = '/api/mix/v1/trace/currentTrack';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    traderHistoryTrack(qsOrBody: object) {
        const url = '/api/mix/v1/trace/historyTrack';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    followerCloseByTrackingNo(qsOrBody: object) {
        const url = '/api/mix/v1/trace/followerCloseByTrackingNo';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    followerQueryCurrentOrders(qsOrBody: object) {
        const url = '/api/mix/v1/trace/followerOrder';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    followerQueryHistoryOrders(qsOrBody: object) {
        const url = '/api/mix/v1/trace/followerHistoryOrders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}