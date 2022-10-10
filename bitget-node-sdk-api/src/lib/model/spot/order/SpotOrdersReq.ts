export class SpotOrdersReq {
    /**
     * 币对
     */
    private _symbol!:string;
    /**
     * 订单方向
     */
    private _side!:string;

    /**
     * 订单类型
     */
    private _orderType!:string;

    /**
     * 订单控制类型
     */
    private _force!:string;

    /**
     * 委托价格，仅适用于限价单
     */
    private _price!:string;

    /**
     * 数量
     */
    private _quantity!:string;

    /**
     * 客户端订单ID
     */
    private _clientOrderId!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
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

    get force(): string {
        return this._force;
    }

    set force(value: string) {
        this._force = value;
    }

    get price(): string {
        return this._price;
    }

    set price(value: string) {
        this._price = value;
    }

    get quantity(): string {
        return this._quantity;
    }

    set quantity(value: string) {
        this._quantity = value;
    }

    get clientOrderId(): string {
        return this._clientOrderId;
    }

    set clientOrderId(value: string) {
        this._clientOrderId = value;
    }
}