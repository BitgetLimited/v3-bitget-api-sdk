export class PlacePlanReq{
    /**
     * 合约交易对
     */
    private _symbol!:string;
    /**
     * 保证金币种
     */
    private _marginCoin!:string;
    /**
     * 下单数量
     */
    private _size!:string;
    /**
     * 委托价格
     */
    private _executePrice!:string;
    /**
     * 触发价格
     */
    private _triggerPrice!:string;
    /**
     * 委托方向
     */
    private _side!:string;
    /**
     * 交易类型
     */
    private _orderType!:string;
    /**
     * 触发类型 成交价触发 标记价触发
     */
    private _triggerType!:string;

    private _clientOid!:string;
    /**
     * 预设止盈价
     */
    private _presetTakeProfitPrice!:string;
    /**
     * 预设止损价
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