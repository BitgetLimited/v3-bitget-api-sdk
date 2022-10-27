export class PlacePlanReq{

    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Amount of currency placed
     */
    private _size!:string;
    /**
     * Entrusted price
     */
    private _executePrice!:string;
    /**
     * Trigger Price
     */
    private _triggerPrice!:string;
    /**
     * Entrusting direction
     */
    private _side!:string;
    /**
     * Transaction Type
     */
    private _orderType!:string;
    /**
     * Trigger Type Transaction Price Trigger Flag Price Trigger
     */
    private _triggerType!:string;
    /**
     * Client ID
     */
    private _clientOid!:string;
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

    get size(): string {
        return this._size;
    }

    set size(value: string) {
        this._size = value;
    }

    get executePrice(): string {
        return this._executePrice;
    }

    set executePrice(value: string) {
        this._executePrice = value;
    }

    get triggerPrice(): string {
        return this._triggerPrice;
    }

    set triggerPrice(value: string) {
        this._triggerPrice = value;
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

    get triggerType(): string {
        return this._triggerType;
    }

    set triggerType(value: string) {
        this._triggerType = value;
    }

    get clientOid(): string {
        return this._clientOid;
    }

    set clientOid(value: string) {
        this._clientOid = value;
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