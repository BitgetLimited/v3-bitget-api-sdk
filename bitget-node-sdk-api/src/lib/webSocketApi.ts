import { EventEmitter } from 'events';
import WebSocket from 'ws';
import pako from 'pako';
import crypto from 'crypto';
import crc32 from 'crc-32';

export class WebSocketApi extends EventEmitter{

   private websocketUri: string;
     private socket?: WebSocket;
     private interval?: NodeJS.Timeout | null;

     constructor(websocketURI = 'wss://csocketapi.bitgetapi.com/ws/v1') {
       super();
       this.websocketUri = websocketURI;
     }

     connect(options = {}) {
       if (this.socket) {
         this.socket.close();
       }

       this.socket = new WebSocket(this.websocketUri, options);
       console.log(`Connecting to ${this.websocketUri}`);

       this.socket.on('open', () => this.onOpen());
       this.socket.on('close', (code, reason) => this.onClose(code, reason));
       this.socket.on('message', data => this.onMessage(data));
     }

     login(apiKey: string, apiSecret: string, passphrase: string) {
       const timestamp = Date.now() / 1000;
       const str = timestamp +'GET'+'/user/verify';
       const hmac = crypto.createHmac('sha256', apiSecret);
       const request = JSON.stringify({
         op: 'login',
         args: [
           apiKey,
           passphrase,
           timestamp.toString(),
           hmac.update(str).digest('base64')
         ]
       });
       this.socket!.send(request);
     }

     subscribe(...args: string[]) {
       this.send({ op: 'subscribe', args });
     }

     unsubscribe(...args: string[]) {
       this.send({ op: 'unsubscribe', args });
     }

     private send(messageObject: any) {
       if (!this.socket) throw Error('socket is not open');
       this.socket.send(JSON.stringify(messageObject));
     }

     private onOpen() {
       console.log(`Connected to ${this.websocketUri}`);
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

     private resetTimer() {
       if (this.interval) {
         clearInterval(this.interval);
         this.interval = null;
         this.initTimer();
       }
     }

     private onMessage(data: WebSocket.Data) {
       this.resetTimer();
       if (!(typeof data === 'string')) {
         data = pako.inflateRaw(data as any, { to: 'string' });
       }
       if (data === 'pong') {
         return;
       }
       this.emit('message', data);
     }

     private onClose(code: number, reason: string) {
       console.log(`Websocket connection is closed.code=${code},reason=${reason}`);
       this.socket = undefined;
       if (this.interval) {
         clearInterval(this.interval);
         this.interval = null;
       }
       this.emit('close');
     }

     close() {
       if (this.socket) {
         console.log(`Closing websocket connection...`);
         this.socket.close();
         if (this.interval) {
           clearInterval(this.interval);
           this.interval = null;
         }
         this.socket = undefined;
       }
     }

}

