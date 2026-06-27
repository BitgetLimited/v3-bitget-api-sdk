import {EventEmitter} from 'events';
import {encrypt, encryptRSA, toJsonString} from '../util';
import {API_CONFIG} from '../config';
import WebSocket from 'ws';
import * as Console from 'console';
import {WsLoginReq} from '../model/ws/WsLoginReq';
import {WsBaseReq} from '../model/ws/WsBaseReq';
import {SubscribeReq} from '../model/ws/SubscribeReq';
import {BIZ_CONSTANT} from '../contant';

export abstract class Listenner{
    abstract reveice(message:string):void;
}

export class BitgetWsClient extends EventEmitter {
    private websocketUri: string;
    private socket?: WebSocket;
    private interval?: NodeJS.Timeout | null;
    private isOpen?: boolean;
    private callBack?: Listenner;
    private apiKey!:string;
    private apiSecret!:string;
    private passphrase!:string;

    constructor(callBack:Listenner,apiKey: string, apiSecret: string, passphrase: string) {
        super();
        this.websocketUri = API_CONFIG.WS_URL;
        this.callBack = callBack;
        this.socket = new WebSocket(API_CONFIG.WS_URL, {});
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.passphrase = passphrase;

        this.socket.on('open', () => this.onOpen());
        this.socket.on('close', (code, reason) => this.onClose(code, reason));
        this.socket.on('message', data => this.onMessage(data));
    }

    login() {
        const timestamp = Math.floor(Date.now() / 1000);
        let sign = encrypt('GET','/user/verify',null,timestamp,this.apiSecret);
        if (API_CONFIG.SIGN_TYPE === BIZ_CONSTANT.RSA) {
            sign = encryptRSA('GET','/user/verify',null,timestamp,this.apiSecret);
        }

        const wsLoginReq = new WsLoginReq(this.apiKey,this.passphrase,timestamp.toString(),sign);
        const args = new Array<WsLoginReq>();
        args.push(wsLoginReq);
        const request = new WsBaseReq('login',args);
        this.send(request);
    }

    subscribe(args: SubscribeReq[]) {
        const request = new WsBaseReq('subscribe',args);
        this.send(request);
    }

    unsubscribe(args: SubscribeReq[]) {
        const request = new WsBaseReq('unsubscribe',args);
        this.send(request);
    }

    private send(messageObject: any) {
        const that = this;
        if (!this.socket) throw Error('socket is not open');
        const jsonStr = toJsonString(messageObject);
        Console.info('sendInfo:'+jsonStr)

        setInterval(() => {
            if (that.isOpen) {
                this.socket?.send(jsonStr);
            }
        }, 1000);
    }

    private onOpen() {
        this.isOpen = true;
        Console.info(`on open Connected to ${this.websocketUri}`);
        this.initTimer();
        this.emit('open');
    }

    private initTimer() {
        this.interval = setInterval(() => {
            if (this.socket) {
                this.socket.send('ping');
            }
        }, 5000);
    }

    private onMessage(data: WebSocket.Data) {
        if (typeof data === 'string') {
            this.callBack?.reveice(data);
        }
    }

    private onClose(code: number, reason: string) {
        Console.log(`Websocket connection is closed.code=${code},reason=${reason}`);
        this.socket = undefined;
        if (this.interval) {
            clearInterval(this.interval);
            this.interval = null;
        }
        this.emit('close');
    }

    close() {
        if (this.socket) {
            Console.log(`Closing websocket connection...`);
            this.socket.close();
            if (this.interval) {
                clearInterval(this.interval);
                this.interval = null;
            }
            this.socket = undefined;
        }
    }
}