export class PlaceOrderBaseParam{
    private _clientOid!:string;
    private _size!:string;
    private _side!:string;
    private _orderType!:string;
    private _price!:string;
    private _timeInForceValue!:string;


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
}