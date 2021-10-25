export class SetMarginReq {
    private _symbol!: string;
    private _marginCoin!: string;
    private _holdSide!: string;
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