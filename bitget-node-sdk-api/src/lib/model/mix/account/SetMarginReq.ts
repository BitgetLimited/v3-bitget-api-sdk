export class SetMarginReq {
    /**
     * Currency pair
     */
    private _symbol!: string;
    /**
     * Deposit currency
     */
    private _marginCoin!: string;
    /**
     * Position direction (all positions are not transferred)
     */
    private _holdSide!: string;
    /**
     * Amount greater than 0 increases less than 0 decreases
     */
    private _amount!: string;

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

    get holdSide(): string {
        return this._holdSide;
    }

    set holdSide(value: string) {
        this._holdSide = value;
    }

    get amount(): string {
        return this._amount;
    }

    set amount(value: string) {
        this._amount = value;
    }
}