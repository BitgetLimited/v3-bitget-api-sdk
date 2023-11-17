import {describe, test} from '@jest/globals';
import {BitgetWsClient, Listenner} from '../src/lib/ws/BitgetWsClient';
import * as Console from 'console';
import {SubscribeReq} from '../src/lib/model/ws/SubscribeReq';


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
       // const subscribeTow = new SubscribeReq('SP','candle1W','BTCUSDT');
        bitgetWsClient.on()
        subArr.push(subscribeOne);
        // subArr.push(subscribeTow);

        bitgetWsClient.subscribe(subArr)

    })
});