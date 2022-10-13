export class OpenCountReq {
    /**
     * Currency pair
     */
    public _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * open price
     */
    private _openPrice!:string;
    /**
     * open amount
     */
    private _openAmount!:string;
    /**
     * Default leverage 20
     */
    private _leverage!:string;


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

    get openPrice(): string {
        return this._openPrice;
    }

    set openPrice(value: string) {
        this._openPrice = value;
    }

    get openAmount(): string {
        return this._openAmount;
    }

    set openAmount(value: string) {
        this._openAmount = value;
    }

    get leverage(): string {
        return this._leverage;
    }

    set leverage(value: string) {
        this._leverage = value;
    }
}