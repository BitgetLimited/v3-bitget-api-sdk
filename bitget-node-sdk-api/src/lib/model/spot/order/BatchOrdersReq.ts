import {OrdersReq} from './OrdersReq';

export class BatchOrdersReq {
    private _symbol!:string;
    private _orderList!:OrdersReq[];


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get orderList(): OrdersReq[] {
        return this._orderList;
    }

    set orderList(value: OrdersReq[]) {
        this._orderList = value;
    }
}