import {describe, test} from '@jest/globals';
import {BitgetWsClient, Listenner,SubscribeReq} from '../src';
import * as Console from 'console';


const apiKey = '';
const secretKey = '';
const passphrase = '';
describe('BitgetWsClientTest', () => {


    test('websocket', () => {
       const bitgetWsClient = new BitgetWsClient({
            reveice:(message)=>{
                Console.info('>>>'+message);
            }
        } as Listenner,apiKey,secretKey,passphrase);

       const subArr = new Array<SubscribeReq>();

       const subscribeOne = new SubscribeReq('mc','ticker','BTCUSD');
       const subscribeTow = new SubscribeReq('SP','candle1W','BTCUSDT');

        subArr.push(subscribeOne);
        subArr.push(subscribeTow);

        bitgetWsClient.subscribe(subArr)

    })
});