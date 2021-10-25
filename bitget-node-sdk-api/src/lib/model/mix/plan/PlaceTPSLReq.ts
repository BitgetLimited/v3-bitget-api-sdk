export class PlaceTPSLReq{
    /**
     * 合约交易对
     */
    private _symbol!:string;
    /**
     * 保证金币种
     */
    private _marginCoin!:string;

    private _planType!:string;

    private _triggerPrice!:string;

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