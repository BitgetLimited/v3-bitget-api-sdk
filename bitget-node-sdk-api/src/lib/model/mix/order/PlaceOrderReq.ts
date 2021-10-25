export class PlaceOrderReq{
    private _symbol!:string;
    private _marginCoin!:string;
    private _clientOid!:string;
    private _size!:string;
    private _side!:string;
    private _orderType!:string;
    private _price!:string;
    private _timeInForceValue!:string;
    private _presetTakeProfitPrice!:string;
    private _presetStopLossPrice!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get marginCoin(): string {
        return this._marginCoin;
    }

    set marginCoin(value: string) {
        this._marginCoin = value;
    }

    get clientOid(): string {
        return this._clientOid;
    }

    set clientOid(value: string) {
        this._clientOid = value;
    }

    get size(): string {
        return this._size;
    }

    set size(value: string) {
        this._size = value;
    }

    get side(): string {
        return this._side;
    }

    set side(value: string) {
        this._side = value;
    }

    get orderType(): string {
        return this._orderType;
    }

    set orderType(value: string) {
        this._orderType = value;
    }

    get price(): string {
        return this._price;
    }

    set price(value: string) {
        this._price = value;
    }

    get timeInForceValue(): string {
        return this._timeInForceValue;
    }

    set timeInForceValue(value: string) {
        this._timeInForceValue = value;
    }

    get presetTakeProfitPrice(): string {
        return this._presetTakeProfitPrice;
    }

    set presetTakeProfitPrice(value: string) {
        this._presetTakeProfitPrice = value;
    }

    get presetStopLossPrice(): string {
        return this._presetStopLossPrice;
    }

    set presetStopLossPrice(value: string) {
        this._presetStopLossPrice = value;
    }
}