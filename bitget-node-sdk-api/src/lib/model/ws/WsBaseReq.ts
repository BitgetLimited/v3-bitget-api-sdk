export class WsBaseReq {
    private _op!:string;
    private _args!:object[];


    constructor(op: string, args: object[]) {
        this._op = op;
        this._args = args;
    }

    get op(): string {
        return this._op;
    }

    set op(value: string) {
        this._op = value;
    }

    get args(): object[] {
        return this._args;
    }

    set args(value: object[]) {
        this._args = value;
    }
}