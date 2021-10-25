export class WsLoginReq{
    private _apiKey!:string;
    private _passphrase!:string;
    private _timestamp!:string;
    private _sign!:string;


    constructor(apiKey: string, passphrase: string, timestamp: string, sign: string) {
        this._apiKey = apiKey;
        this._passphrase = passphrase;
        this._timestamp = timestamp;
        this._sign = sign;
    }
}