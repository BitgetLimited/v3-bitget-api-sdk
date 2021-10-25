export class ModifyTPSLPlanReq{
    /**
     * 合约交易对
     */
    private _symbol!:string;
    /**
     * 保证金币种
     */
    private _marginCoin!:string;

    private _orderId!:string;

    private _triggerPrice!:string;

    private _planType!:string;


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

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
    }

    get triggerPrice(): string {
        return this._triggerPrice;
    }

    set triggerPrice(value: string) {
        this._triggerPrice = value;
    }

    get planType(): string {
        return this._planType;
    }

    set planType(value: string) {
        this._planType = value;
    }
}