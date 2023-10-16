import {BaseApi} from '../BaseApi';

export class SpotOrderApi extends BaseApi {

    orders(qsOrBody: object) {
        const url = '/api/spot/v1/trade/orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    batchOrders(qsOrBody: object) {
        const url = '/api/spot/v1/trade/batch-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelOrder(qsOrBody: object) {
        const url = '/api/spot/v1/trade/cancel-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelBatchOrder(qsOrBody: object) {
        const url = '/api/spot/v1/trade/cancel-batch-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    openOrders(qsOrBody: object) {
        const url = '/api/spot/v1/trade/open-orders';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    history(qsOrBody: object) {
        const url = '/api/spot/v1/trade/history';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    fills(qsOrBody: object) {
        const url = '/api/spot/v1/trade/fills';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    placePlanOrder(qsOrBody: object) {
        const url = '/api/spot/v1/plan/placePlan';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    cancelPlanOrder(qsOrBody: object) {
        const url = '/api/spot/v1/plan/cancelPlan';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    currentPlanOrder(qsOrBody: object) {
        const url = '/api/spot/v1/plan/currentPlan';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    historyPlanOrder(qsOrBody: object) {
        const url = '/api/spot/v1/plan/historyPlan';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    traderOrderCloseTracking(qsOrBody: object) {
        const url = '/api/spot/v1/trace/order/closeTrackingOrder';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    traderOrderCurrentTrack(qsOrBody: object) {
        const url = '/api/spot/v1/trace/order/orderCurrentList';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    traderOrderHistoryTrack(qsOrBody: object) {
        const url = '/api/spot/v1/trace/order/orderHistoryList';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }
}