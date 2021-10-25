export class ModifyPlanPresetReq{
    /**
     * 合约交易对
     */
    private _symbol!:string;
    /**
     * 保证金币种
     */
    private _marginCoin!:string;

    private _presetTakeProfitPrice!:string;

    private _presetStopLossPrice!:string;

    private _orderId!:string;

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

    get presetTakeProfitPrice(): string {
        return this._presetTakeProfitPrice;
    }

    set presetTakeProfitPrice(value: string) {
        this._presetTakeProfitPrice = value;
    }

    get presetStopLossPrice(): string {
        return this._presetStopLossPrice;
    }

    set presetStopLossPrice(value: string) {
        this._presetStopLossPrice = value;
    }

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
    }

    get planType(): string {
        return this._planType;
    }

    set planType(value: string) {
        this._planType = value;
    }
}