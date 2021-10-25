export class SetLeverageReq {

    private _symbol!: string;
    private _marginCoin!: string;
    private _leverage!: string;
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