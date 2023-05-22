export class WithdrawalReq {
    /**
     * coin
     */
    private _coin!:string;

    /**
     * address
     */
    private _address!:string;

    /**
     * chain
     */
    private _chain!:string;

    /**
     * tag
     */
    private _tag!:string;

    /**
     * amount
     */
    private _amount!:string;
    /**
     * remark
     */
    private _remark!:string;
    /**
     * clientOid
     */
    private _clientOid!:string;

    get coin(): string {
        return this.coin;
    }

    set coin(value: string) {
        this._coin = value;
    }

    get address(): string {
        return this._address;
    }

    set address(value: string) {
        this._address = value;
    }


    get chain(): string {
        return this._chain;
    }

    set chain(value: string) {
        this._chain = value;
    }

    get tag(): string {
        return this._tag;
    }

    set tag(value: string) {
        this._tag = value;
    }

    get amount(): string {
        return this._amount;
    }

    set amount(value: string) {
        this._amount = value;
    }

    get remark(): string {
        return this._remark;
    }

    set remark(value: string) {
        this._remark = value;
    }

    get clientOid(): string {
        return this._clientOid;
    }

    set clientOid(value: string) {
        this._clientOid = value;
    }

}