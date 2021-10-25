export class SetPositionModeReq{
    private _symbol!:string;
    private _marginCoin!:string;
    private _holdMode!:string;


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

    get holdMode(): string {
        return this._holdMode;
    }

    set holdMode(value: string) {
        this._holdMode = value;
    }
}