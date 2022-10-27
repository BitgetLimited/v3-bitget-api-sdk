export class SpotBillsReq {
    /**
     * Currency ID
     */
    private _coinId!:string;

    /**
     * Group Type
     */
    private _groupType!:string;

    /**
     * Business Type
     */
    private _bizType!:string;

    /**
     * Pass in billId to query previous data
     */
    private _after!:string;

    /**
     * Pass in billId to check the subsequent data
     */
    private _before!:string;
    /**
     * Default 100, maximum 500
     */
    private _limit!:string;

    get coinId(): string {
        return this._coinId;
    }

    set coinId(value: string) {
        this._coinId = value;
    }

    get groupType(): string {
        return this._groupType;
    }

    set groupType(value: string) {
        this._groupType = value;
    }

    get bizType(): string {
        return this._bizType;
    }

    set bizType(value: string) {
        this._bizType = value;
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