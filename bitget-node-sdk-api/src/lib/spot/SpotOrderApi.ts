import {BaseApi} from '../BaseApi';
import {BillsReq} from '../model/spot/account/BillsReq';
import {SPOT_URL} from '../config';
import {OrdersReq} from '../model/spot/order/OrdersReq';
import {BatchOrdersReq} from '../model/spot/order/BatchOrdersReq';
import {CancelOrderReq} from '../model/spot/order/CancelOrderReq';
import {CancelBatchOrderReq} from '../model/spot/order/CancelBatchOrderReq';
import {OrderInfoReq} from '../model/spot/order/OrderInfoReq';
import {OpenOrdersReq} from '../model/spot/order/OpenOrdersReq';
import {HistoryReq} from '../model/spot/order/HistoryReq';
import {FillsReq} from '../model/spot/order/FillsReq';

export class SpotOrderApi extends BaseApi{

    orders(ordersReq:OrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/orders';
        const headers = this.signer('POST', url, ordersReq)
        return this.axiosInstance.post(url, ordersReq, {headers})
    }

    batchOrders(batchOrdersReq:BatchOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/batch-orders';
        const headers = this.signer('POST', url, batchOrdersReq)
        return this.axiosInstance.post(url, batchOrdersReq, {headers})
    }

    cancelOrder(cancelOrderReq:CancelOrderReq) {
        const url = SPOT_URL.SPOT_ORDER + '/cancel-order';
        const headers = this.signer('POST', url, cancelOrderReq)
        return this.axiosInstance.post(url, cancelOrderReq, {headers})
    }

    cancelBatchOrder(cancelBatchOrderReq:CancelBatchOrderReq) {
        const url = SPOT_URL.SPOT_ORDER + '/cancel-batch-orders';
        const headers = this.signer('POST', url, cancelBatchOrderReq)
        return this.axiosInstance.post(url, cancelBatchOrderReq, {headers})
    }

    orderInfo(orderInfoReq:OrderInfoReq) {
        const url = SPOT_URL.SPOT_ORDER + '/orderInfo';
        const headers = this.signer('POST', url, orderInfoReq)
        return this.axiosInstance.post(url, orderInfoReq, {headers})
    }

    openOrders(openOrdersReq:OpenOrdersReq) {
        const url = SPOT_URL.SPOT_ORDER + '/open-orders';
        const headers = this.signer('POST', url, openOrdersReq)
        return this.axiosInstance.post(url, openOrdersReq, {headers})
    }
    history(historyReq:HistoryReq) {
        const url = SPOT_URL.SPOT_ORDER + '/history';
        const headers = this.signer('POST', url, historyReq)
        return this.axiosInstance.post(url, historyReq, {headers})
    }

    fills(fillsReq:FillsReq) {
        const url = SPOT_URL.SPOT_ORDER + '/fills';
        const headers = this.signer('POST', url, fillsReq)
        return this.axiosInstance.post(url, fillsReq, {headers})
    }
}