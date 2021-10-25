import {BaseApi} from '../BaseApi';
import {PlaceOrderReq} from '../model/mix/order/PlaceOrderReq';
import {MIX_URL} from '../config';
import {BatchOrdersReq} from '../model/mix/order/BatchOrdersReq';
import {CancelOrderReq} from '../model/mix/order/CancelOrderReq';
import {CancelBatchOrderReq} from '../model/mix/order/CancelBatchOrderReq';

export class MixOrderApi extends BaseApi {

    placeOrder(placeOrderReq: PlaceOrderReq) {
        const url = MIX_URL.MIX_ORDER + '/placeOrder';
        const headers = this.signer('POST', url, placeOrderReq)
        return this.axiosInstance.post(url, placeOrderReq, {headers})
    }

    batchOrders(batchOrdersReq: BatchOrdersReq) {
        const url = MIX_URL.MIX_ORDER + '/batch-orders';
        const headers = this.signer('POST', url, batchOrdersReq)
        return this.axiosInstance.post(url, batchOrdersReq, {headers})
    }

    cancelOrder(cancelOrderReq: CancelOrderReq) {
        const url = MIX_URL.MIX_ORDER + '/cancel-order';
        const headers = this.signer('POST', url, cancelOrderReq)
        return this.axiosInstance.post(url, cancelOrderReq, {headers})
    }

    cancelBatchOrder(cancelBatchOrderReq: CancelBatchOrderReq) {
        const url = MIX_URL.MIX_ORDER + '/cancel-batch-orders';
        const headers = this.signer('POST', url, cancelBatchOrderReq)
        return this.axiosInstance.post(url, cancelBatchOrderReq, {headers})
    }

    history(symbol: string, startTime: string, endTime: string, pageSize: number, lastEndId: string, isPre: boolean) {
        const url = MIX_URL.MIX_ORDER + '/history';
        const qsOrBody = {symbol, startTime, endTime, pageSize, lastEndId, isPre};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    current(symbol: string) {
        const url = MIX_URL.MIX_ORDER + '/current';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    detail(symbol: string,orderId:string) {
        const url = MIX_URL.MIX_ORDER + '/detail';
        const qsOrBody = {symbol,orderId};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(symbol: string,orderId:string) {
        const url = MIX_URL.MIX_ORDER + '/fills';
        const qsOrBody = {symbol,orderId};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}