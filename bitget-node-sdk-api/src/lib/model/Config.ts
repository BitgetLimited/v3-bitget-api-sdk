export class Config{
    private _apiUri!:string;
    private _apiKey!: string;
    private _secretKey!: string;
    private _passphrase!: string;


    constructor(apiUri: string, apiKey: string, secretKey: string, passphrase: string) {
        this._apiUri = apiUri;
        this._apiKey = apiKey;
        this._secretKey = secretKey;
        this._passphrase = passphrase;
    }

    get apiUri(): string {
        return this._apiUri;
    }

    set apiUri(value: string) {
        this._apiUri = value;
    }

    get apiKey(): string {
        return this._apiKey;
    }

    set apiKey(value: string) {
        this._apiKey = value;
    }

    get secretKey(): string {
        return this._secretKey;
    }

    set secretKey(value: string) {
        this._secretKey = value;
    }

    get passphrase(): string {
        return this._passphrase;
    }

    set passphrase(value: string) {
        this._passphrase = value;
    }
}