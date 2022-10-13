export class CloseTrackOrderReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * The tracking order number comes from the trackingNo of the current interface with the order
     */
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