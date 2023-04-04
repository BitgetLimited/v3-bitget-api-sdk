export class SpotQueryPlanReq{

    private _symbol!:string;

    private _startTime!:string;

    private _endTime!:string;

    private _pageSize!:string;

    private _lastEndId!:string;

    private _isPre!:string;

    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get startTime(): string {
        return this._startTime;
    }

    set startTime(value: string) {
        this._startTime = value;
    }

    get endTime(): string {
        return this._endTime;
    }

    set endTime(value: string) {
        this._endTime = value;
    }

    get pageSize(): string {
        return this._pageSize;
    }

    set pageSize(value: string) {
        this._pageSize = value;
    }

    get lastEndId(): string {
        return this._lastEndId;
    }

    set lastEndId(value: string) {
        this._lastEndId = value;
    }

    get isPre(): string {
        return this._isPre;
    }

    set isPre(value: string) {
        this._isPre = value;
    }
}