export class SpotFillsReq {
    private _symbol!:string;

    private _orderId!:string;

    private _after!:string;

    private _before!:string;

    private _limit!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
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