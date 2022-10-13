export class SpotOpenOrdersReq {
    /**
     * Currency pair
     */
    private _symbol!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }
}