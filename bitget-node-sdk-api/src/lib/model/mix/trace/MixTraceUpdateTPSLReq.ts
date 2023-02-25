export class MixTraceUpdateTPSLReq{
    /**
     * Currency pair
     */
    private _symbol!:string;

    private _trackingNo!:string;

    private _stopProfitPrice!:string;

    private _stopLossPrice!:string;

    private _clientOid!: string;

    get symbol(): string {
        return this._symbol;
    }
    set symbol(value: string) {
        this._symbol = value;
    }

    set trackingNo(value: string) {
        this._trackingNo = value;
    }

    get trackingNo(): string {
        return this._trackingNo;
    }

    get stopProfitPrice(): string {
        return this._stopProfitPrice;
    }

    set stopProfitPrice(value: string) {
        this._stopProfitPrice = value;
    }

    get stopLossPrice(): string {
        return this._stopLossPrice;
    }

    set stopLossPrice(value:string){
        this._stopLossPrice = value;
    }

    get clientOid():string{
        return this._clientOid;
    }

    set clientOid(value:string){
        this._clientOid = value;
    }
}