export class CancelPlanReq{
    private _orderId!:string;

    private _symbol!:string;

    private _planType!:string;

    private _marginCoin!:string;


    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
    }

    get symbol(): string {
        return this._symbol;
    }

    set symbol(value: string) {
        this._symbol = value;
    }

    get planType(): string {
        return this._planType;
    }

    set planType(value: string) {
        this._planType = value;
    }

    get marginCoin(): string {
        return this._marginCoin;
    }

    set marginCoin(value: string) {
        this._marginCoin = value;
    }
}