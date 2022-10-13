export class CancelBatchOrderReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Order Id list
     */
    private _orderIds!:string[];


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

    get orderIds(): string[] {
        return this._orderIds;
    }

    set orderIds(value: string[]) {
        this._orderIds = value;
    }
}