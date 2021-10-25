export class CancelOrderReq {
    private _orderId!: string;
    private _symbol!: string;
    private _marginCoin!: string;


    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
    }

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
}