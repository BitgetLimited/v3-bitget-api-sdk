import {EventEmitter} from 'events';
import {encrypt, toJsonString} from '../util';
import {API_CONFIG} from '../config';
import WebSocket from 'ws';
import * as Console from 'console';
import {WsLoginReq} from '../model/ws/WsLoginReq';
import {WsBaseReq} from '../model/ws/WsBaseReq';
import {SubscribeReq} from '../model/ws/SubscribeReq';
import {BookInfo} from '../model/ws/BookInfo';

export abstract class Listenner {
    abstract reveice(message: string): void;
}


export class BitgetWsClient extends EventEmitter {
    private websocketUri: string;
    private socket?: WebSocket;
    private interval?: NodeJS.Timeout | null;
    private isOpen?: boolean;
    private callBack?: Listenner;
    private apiKey!: string;
    private apiSecret!: string;
    private passphrase!: string;
    private allBooks!: Map<string, BookInfo>;
    private isLock: boolean = false //todo 重连锁
    private l_timer: NodeJS.Timeout | undefined //todo 重连定时器
    private lock_time: number = 4000 //todo 重连时间
    private isLogin: boolean = false //todo 登录状态

    constructor(callBack: Listenner, apiKey: string, apiSecret: string, passphrase: string) {
        super();
        this.websocketUri = API_CONFIG.WS_URL;
        this.callBack = callBack;
        this.socket = new WebSocket(API_CONFIG.WS_URL, {});
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.passphrase = passphrase;
        this.allBooks = new Map();
        this.socket.on('open', () => this.onOpen());
        this.socket.on('close', (code, reason) => this.onClose(code, reason));
        this.socket.on('message', data => this.onMessage(data));
        this.socket.on('error', (err) => this.onError(err));//todo 出错

    }

    login() {
        const timestamp = Math.floor(Date.now() / 1000);
        const sign = encrypt('GET', '/user/verify', null, timestamp, this.apiSecret);
        const wsLoginReq = new WsLoginReq(this.apiKey, this.passphrase, timestamp.toString(), sign);

        const args = new Array<WsLoginReq>();
        args.push(wsLoginReq);
        const request = new WsBaseReq('login', args);
        this.send(request);
        this.isLogin =true ;//todo
    }

    subscribe(args: SubscribeReq[]) {
        const request = new WsBaseReq('subscribe', args);
        this.send(request);
    }

    unsubscribe(args: SubscribeReq[]) {
        const request = new WsBaseReq('unsubscribe', args);
        this.send(request);
    }


    private send(messageObject: any) {
        const that = this;
        if (!this.socket) throw Error('socket is not open');
        const jsonStr = toJsonString(messageObject);
        Console.info('sendInfo:' + jsonStr)

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
            if (data === 'pong') {
                return;
            }
            if (!this.checkSum(data)) {
                return;
            }
            this.callBack?.reveice(data);
        }
    }

    private checkSum(data: string): boolean {
        const json = JSON.parse(data);
        if (!json.hasOwnProperty('arg') || !json.hasOwnProperty('action')) {
            return true;
        }
        const req = new SubscribeReq(json.arg.instType, json.arg.channel, json.arg.instId)

        if (json.arg.channel !== 'books') {
            return true;
        }

        const bookInfo = new BookInfo(json.data[0].asks, json.data[0].bids, json.data[0].checksum, json.data[0].ts);

        if (json.action === 'snapshot') {
            this.allBooks.set(req.toString, bookInfo);
            return true;
        }
        if (json.action === 'update') {
            const allbooksInfo = this.allBooks.get(req.toString);
            if (!allbooksInfo) {
                return true;
            }
            // tslint:disable-next-line:radix
            return allbooksInfo.merge(bookInfo).checkSum(parseInt(bookInfo.checksum));

        }

        return true;
    }


    private onClose(code: number, reason: string) {
        Console.log(`Websocket connection is closed.code=${code},reason=${reason}`);
        this.socket = undefined;
        if (this.interval) {
            clearInterval(this.interval);
            this.interval = null;
        }
        this.emit('close');
        this.reconnect();//todo
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
    //todo 出错
    private onError(err: Error){

        this.reconnect()
    }

    //todo 重连
    private reconnect(): void {
        if (this.isLock) {
            return
        }
        this.isLock = true
        this.l_timer && clearTimeout(this.l_timer)
        this.l_timer = setTimeout(() => {
           // this.constructor();//todo
            this.initSocket();
            this.isLock = false;
            if(this.isLogin){
                this.login();//todo
            }
        }, this.lock_time)
    }

    //todo 创建socket
    private initSocket(){

        this.socket = new WebSocket(API_CONFIG.WS_URL, {});
        this.websocketUri = API_CONFIG.WS_URL;
        //this.callBack = callBack;
        this.socket = new WebSocket(API_CONFIG.WS_URL, {});
        this.allBooks = new Map();
        this.socket.on('open', () => this.onOpen());
        this.socket.on('close', (code, reason) => this.onClose(code, reason));
        this.socket.on('message', data => this.onMessage(data));
        this.socket.on('error', (err) => this.onError(err));//todo 出错
    }
}