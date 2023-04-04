export class SpotCancelPlanReq{
    /**
     * 订单Id
     */
    private _orderId!:string;

    get orderId(): string {
        return this._orderId;
    }

    set orderId(value: string) {
        this._orderId = value;
    }
}