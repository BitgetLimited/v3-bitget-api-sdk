export class CloseTrackOrderReq{
    private _symbol!:string;

    private _trackingNo!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get trackingNo(): string {
        return this._trackingNo;
    }

    set trackingNo(value: string) {
        this._trackingNo = value;
    }
}