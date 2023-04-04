export class SpotPlanReq{
    /**
     * 合约交易对
     */
    private _symbol!:string;
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

    private _timeInForceValue!:string;

    private _clientOid!:string;

    private _channelApiCode!:string;

    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
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

    get timeInForceValue(): string {
        return this._timeInForceValue;
    }

    set timeInForceValue(value: string) {
        this._timeInForceValue = value;
    }

    get clientOid(): string {
        return this._clientOid;
    }

    set clientOid(value: string) {
        this._clientOid = value;
    }

    get channelApiCode(): string {
        return this._channelApiCode;
    }

    set channelApiCode(value: string) {
        this._channelApiCode = value;
    }
}