import {SpotOrdersReq} from './SpotOrdersReq';

export class SpotBatchOrdersReq {
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * order list
     */
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