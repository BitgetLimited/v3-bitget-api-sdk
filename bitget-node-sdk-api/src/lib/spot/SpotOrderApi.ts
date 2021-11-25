import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';
import {SpotOrdersReq} from '../model/spot/order/SpotOrdersReq';
import {SpotBatchOrdersReq} from '../model/spot/order/SpotBatchOrdersReq';
import {SpotCancelOrderReq} from '../model/spot/order/SpotCancelOrderReq';
import {SpotCancelBatchOrderReq} from '../model/spot/order/SpotCancelBatchOrderReq';
import {SpotOrderInfoReq} from '../model/spot/order/SpotOrderInfoReq';
import {SpotOpenOrdersReq} from '../model/spot/order/SpotOpenOrdersReq';
import {SpotHistoryReq} from '../model/spot/order/SpotHistoryReq';
import {SpotFillsReq} from '../model/spot/order/SpotFillsReq';

export class SpotOrderApi extends BaseApi{

    orders(ordersReq:SpotOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/orders';
        const headers = this.signer('POST', url, ordersReq)
        return this.axiosInstance.post(url, ordersReq, {headers})
    }

    batchOrders(batchOrdersReq:SpotBatchOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/batch-orders';
        const headers = this.signer('POST', url, batchOrdersReq)
        return this.axiosInstance.post(url, batchOrdersReq, {headers})
    }

    cancelOrder(cancelOrderReq:SpotCancelOrderReq) {
        const url = SPOT_URL.SPOT_ORDER + '/cancel-order';
        const headers = this.signer('POST', url, cancelOrderReq)
        return this.axiosInstance.post(url, cancelOrderReq, {headers})
    }

    cancelBatchOrder(cancelBatchOrderReq:SpotCancelBatchOrderReq) {
        const url = SPOT_URL.SPOT_ORDER + '/cancel-batch-orders';
        const headers = this.signer('POST', url, cancelBatchOrderReq)
        return this.axiosInstance.post(url, cancelBatchOrderReq, {headers})
    }

    orderInfo(orderInfoReq:SpotOrderInfoReq) {
        const url = SPOT_URL.SPOT_ORDER + '/orderInfo';
        const headers = this.signer('POST', url, orderInfoReq)
        return this.axiosInstance.post(url, orderInfoReq, {headers})
    }

    openOrders(openOrdersReq:SpotOpenOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/open-orders';
        const headers = this.signer('POST', url, openOrdersReq)
        return this.axiosInstance.post(url, openOrdersReq, {headers})
    }
    history(historyReq:SpotHistoryReq) {
        const url = SPOT_URL.SPOT_ORDER + '/history';
        const headers = this.signer('POST', url, historyReq)
        return this.axiosInstance.post(url, historyReq, {headers})
    }

    fills(fillsReq:SpotFillsReq) {
        const url = SPOT_URL.SPOT_ORDER + '/fills';
        const headers = this.signer('POST', url, fillsReq)
        return this.axiosInstance.post(url, fillsReq, {headers})
    }
}