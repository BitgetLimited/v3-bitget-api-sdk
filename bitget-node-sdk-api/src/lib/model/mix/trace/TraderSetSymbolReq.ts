export class TraderSetSymbolReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * The tracking order number comes from the trackingNo of the current interface with the order
     */
    private _operation!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get operation(): string {
        return this._operation;
    }

    set operation(value: string) {
        this._operation = value;
    }
}