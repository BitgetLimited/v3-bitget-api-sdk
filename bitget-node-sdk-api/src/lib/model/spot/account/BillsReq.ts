export class BillsReq{
    /**
     * 币种ID
     */
    private _coinId!:string;

    /**
     * 分组类型
     */
    private _groupType!:string;

    /**
     * 业务类型
     */
    private _bizType!:string;

    /**
     * 传入billId ,查之前的数据
     */
    private _after!:string;

    /**
     * 传入billId,查之后的数据
     */
    private _before!:string;

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