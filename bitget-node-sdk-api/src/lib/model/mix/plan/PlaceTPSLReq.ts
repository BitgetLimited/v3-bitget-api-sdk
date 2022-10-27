export class PlaceTPSLReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Plan type
     */
    private _planType!:string;
    /**
     * Trigger price
     */
    private _triggerPrice!:string;
    /**
     * Is this position long or short
     */
    private _holdSide!:string;


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

    get planType(): string {
        return this._planType;
    }

    set planType(value: string) {
        this._planType = value;
    }

    get triggerPrice(): string {
        return this._triggerPrice;
    }

    set triggerPrice(value: string) {
        this._triggerPrice = value;
    }

    get holdSide(): string {
        return this._holdSide;
    }

    set holdSide(value: string) {
        this._holdSide = value;
    }
}