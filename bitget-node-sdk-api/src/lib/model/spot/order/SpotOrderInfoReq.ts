export class SpotOrderInfoReq {
    /**
     * Currency pair
     */
    private _symbol!:string;
    /**
     * Order Id
     */
    private _orderId!:string;
    /**
     * Client Order Id
     */
    private _clientOrderId!:string;


    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
    }

    get clientOrderId(): string {
        return this._clientOrderId;
    }

    set clientOrderId(value: string) {
        this._clientOrderId = value;
    }
}