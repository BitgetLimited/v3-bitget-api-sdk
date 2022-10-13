export class PlaceOrderReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Client ID
     */
    private _clientOid!:string;
    /**
     * Amount of currency placed
     */
    private _size!:string;
    /**
     * Open more, open more, empty more, empty more
     */
    private _side!:string;
    /**
     * Order Type Market Price Limit
     */
    private _orderType!:string;
    /**
     * Entrusted price
     */
    private _price!:string;
    /**
     * Order validity
     */
    private _timeInForceValue!:string;
    /**
     * Default stop profit price
     */
    private _presetTakeProfitPrice!:string;
    /**
     * Preset stop loss price
     */
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