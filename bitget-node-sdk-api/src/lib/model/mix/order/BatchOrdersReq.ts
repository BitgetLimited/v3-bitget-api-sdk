import {PlaceOrderBaseParam} from './PlaceOrderBaseParam';

export class BatchOrdersReq {
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Order data list
     */
    private _orderDataList!:PlaceOrderBaseParam[]

    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get marginCoin(): string {
        return this._marginCoin;
    }

    set marginCoin(value: string) {
        this._marginCoin = value;
    }

    get orderDataList(): PlaceOrderBaseParam[] {
        return this._orderDataList;
    }

    set orderDataList(value: PlaceOrderBaseParam[]) {
        this._orderDataList = value;
    }
}