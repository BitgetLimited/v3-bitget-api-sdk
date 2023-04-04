export class SpotModifyPlanReq{
    /**
     * 订单Id
     */
    private _orderId!:string;
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
     * 交易类型
     */
    private _orderType!:string;

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
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

    get orderType(): string {
        return this._orderType;
    }

    set orderType(value: string) {
        this._orderType = value;
    }
}