export class SpotHistoryReq {
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * The orderId is passed in. The data before the orderId desc
     */
    private _after!:string;
    /**
     * Pass in the data after the orderId asc
     */
    private _before!:string;
    /**
     * Number of returned results Default 100, maximum 500
     */
    private _limit!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get after(): string {
        return this._after;
    }

    set after(value: string) {
        this._after = value;
    }

    get before(): string {
        return this._before;
    }

    set before(value: string) {
        this._before = value;
    }

    get limit(): string {
        return this._limit;
    }

    set limit(value: string) {
        this._limit = value;
    }
}