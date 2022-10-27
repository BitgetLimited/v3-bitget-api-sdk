export class ModifyPlanReq{
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Deposit currency
     */
    private _marginCoin!:string;
    /**
     * Planned entrusted order No
     */
    private _orderId!:string;
    /**
     * Execution price
     */
    private _executePrice!:string;
    /**
     * Trigger Price
     */
    private _triggerPrice!:string;
    /**
     * Trigger Type
     */
    private _triggerType!:string;
    /**
     * Order Type
     */
    private _orderType!:string;


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

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
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

    get triggerType(): string {
        return this._triggerType;
    }

    set triggerType(value: string) {
        this._triggerType = value;
    }

    get orderType(): string {
        return this._orderType;
    }

    set orderType(value: string) {
        this._orderType = value;
    }
}