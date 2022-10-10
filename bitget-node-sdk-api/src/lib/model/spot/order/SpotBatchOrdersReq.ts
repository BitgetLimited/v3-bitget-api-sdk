import {SpotOrdersReq} from './SpotOrdersReq';

export class SpotBatchOrdersReq {
    private _symbol!:string;
    private _orderList!:SpotOrdersReq[];


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get orderList(): SpotOrdersReq[] {
        return this._orderList;
    }

    set orderList(value: SpotOrdersReq[]) {
        this._orderList = value;
    }
}