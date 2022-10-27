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
    /**
     * place an order
     * @param ordersReq
     */
    orders(ordersReq:SpotOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/orders';
        const headers = this.signer('POST', url, ordersReq)
        return this.axiosInstance.post(url, ordersReq, {headers})
    }
    /**
     * Place orders in batches
     * @param batchOrdersReq
     */
    batchOrders(batchOrdersReq:SpotBatchOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/batch-orders';
        const headers = this.signer('POST', url, batchOrdersReq)
        return this.axiosInstance.post(url, batchOrdersReq, {headers})
    }
    /**
     * cancel the order
     * @param cancelOrderReq
     */
    cancelOrder(cancelOrderReq:SpotCancelOrderReq) {
        const url = SPOT_URL.SPOT_ORDER + '/cancel-order';
        const headers = this.signer('POST', url, cancelOrderReq)
        return this.axiosInstance.post(url, cancelOrderReq, {headers})
    }
    /**
     * Batch cancellation
     * @param cancelBatchOrderReq
     */
    cancelBatchOrder(cancelBatchOrderReq:SpotCancelBatchOrderReq) {
        const url = SPOT_URL.SPOT_ORDER + '/cancel-batch-orders';
        const headers = this.signer('POST', url, cancelBatchOrderReq)
        return this.axiosInstance.post(url, cancelBatchOrderReq, {headers})
    }
    /**
     * Get order details
     * @param orderInfoReq
     */
    orderInfo(orderInfoReq:SpotOrderInfoReq) {
        const url = SPOT_URL.SPOT_ORDER + '/orderInfo';
        const headers = this.signer('POST', url, orderInfoReq)
        return this.axiosInstance.post(url, orderInfoReq, {headers})
    }
    /**
     * Obtain orders that have not been closed or partially closed but not cancelled
     * @param openOrdersReq
     */
    openOrders(openOrdersReq:SpotOpenOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/open-orders';
        const headers = this.signer('POST', url, openOrdersReq)
        return this.axiosInstance.post(url, openOrdersReq, {headers})
    }
    /**
     * Get historical delegation list
     * @param historyReq
     */
    history(historyReq:SpotHistoryReq) {
        const url = SPOT_URL.SPOT_ORDER + '/history';
        const headers = this.signer('POST', url, historyReq)
        return this.axiosInstance.post(url, historyReq, {headers})
    }

    /**
     * Obtain transaction details
     * @param fillsReq
     */
    fills(fillsReq:SpotFillsReq) {
        const url = SPOT_URL.SPOT_ORDER + '/fills';
        const headers = this.signer('POST', url, fillsReq)
        return this.axiosInstance.post(url, fillsReq, {headers})
    }
}