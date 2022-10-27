export class PlaceOrderBaseParam{
    /**
     * Client ID
     */
    private _clientOid!:string;
    /**
     * Amount of currency placed
     */
    private _size!:string;
    /**
     * 1: Kaiduo 2: Kaikong 3: Pingduo 4: Pingkong
     */
    private _side!:string;
    /**
     * Order Type
     */
    private _orderType!:string;
    /**
     * Entrusted price
     */
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