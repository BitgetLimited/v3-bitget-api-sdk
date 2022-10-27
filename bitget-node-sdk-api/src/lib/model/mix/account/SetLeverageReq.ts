export class SetLeverageReq {
    /**
     * Currency pair
     */
    private _symbol!: string;
    /**
     * Deposit currency
     */
    private _marginCoin!: string;
    /**
     * Leverage ratio
     */
    private _leverage!: string;
    /**
     * The whole warehouse lever can not transfer this parameter
     * Position direction: long multi position short short position,
     * MixHoldSideEnum
     */
    private _holdSide!: string;

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

    get leverage(): string {
        return this._leverage;
    }

    set leverage(value: string) {
        this._leverage = value;
    }

    get holdSide(): string {
        return this._holdSide;
    }

    set holdSide(value: string) {
        this._holdSide = value;
    }
}