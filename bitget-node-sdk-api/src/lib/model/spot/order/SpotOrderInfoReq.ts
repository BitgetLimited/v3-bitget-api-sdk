export class SpotOrderInfoReq {
    private _symbol!:string;

    private _orderId!:string;

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