export class PlaceTrailStopReq {
    /**
     * 合约交易对
     */
    private _symbol!: string;
    /**
     * 保证金币种
     */
    private _marginCoin!: string;

    private _side!: string;

    private _size!: string;

    private _presetTakeProfitPrice!: string;

    private _presetStopLossPrice!: string;

    private _triggerPrice!: string;

    private _triggerType!: string;

    private _rangeRate!: string;

    private _reduceOnly!: boolean;


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

    get size(): string {
        return this._size;
    }

    set size(value: string) {
        this._size = value;
    }


    get triggerPrice(): string {
        return this._triggerPrice;
    }

    set triggerPrice(value: string) {
        this._triggerPrice = value;
    }

    get side(): string {
        return this._side;
    }

    set side(value: string) {
        this._side = value;
    }

    get triggerType(): string {
        return this._triggerType;
    }

    set triggerType(value: string) {
        this._triggerType = value;
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

    get rangeRate(): string {
        return this._rangeRate;
    }

    set rangeRate(value: string) {
        this._rangeRate = value;
    }

    get reduceOnly(): boolean {
        return this._reduceOnly;
    }

    set reduceOnly(value: boolean) {
        this._reduceOnly = value;
    }

}