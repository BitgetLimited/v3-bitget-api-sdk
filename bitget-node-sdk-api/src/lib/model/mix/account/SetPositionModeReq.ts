export class SetPositionModeReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Position mode
     * 1 One way position
     * 2 Two way position
     */
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