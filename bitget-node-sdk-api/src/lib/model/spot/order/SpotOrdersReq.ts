export class SpotOrdersReq {
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Order direction
     */
    private _side!:string;

    /**
     * Order type
     */
    private _orderType!:string;

    /**
     * Order Control Type
     */
    private _force!:string;

    /**
     * Entrusted price, only applicable to price limit order
     */
    private _price!:string;

    /**
     * quantity
     */
    private _quantity!:string;

    /**
     * Client order ID
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