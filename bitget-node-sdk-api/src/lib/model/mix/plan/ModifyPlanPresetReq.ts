export class ModifyPlanPresetReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * If the profit stop price is blank, cancel the profit stop
     */
    private _presetTakeProfitPrice!:string;
    /**
     * If the stop loss price is blank, cancel the stop loss
     */
    private _presetStopLossPrice!:string;
    /**
     * order id
     */
    private _orderId!:string;
    /**
     * plan type
     */
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