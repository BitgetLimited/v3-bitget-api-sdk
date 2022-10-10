export class SpotOpenOrdersReq {
    private _symbol!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }
}