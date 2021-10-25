import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';

export class SpotMarketApi extends BaseApi{
    fills(symbol:string,limit:string){
        const url = SPOT_URL.SPOT_MARKET + '/fills';
        const qsOrBody = {symbol, limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    depth(symbol:string,limit:string,type:string){
        const url = SPOT_URL.SPOT_MARKET + '/depth';
        const qsOrBody = {symbol, limit,type};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ticker(symbol:string){
        const url = SPOT_URL.SPOT_MARKET + '/ticker';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    tickers(){
        const url = SPOT_URL.SPOT_MARKET + '/tickers';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    candles(symbol:string,period:string,after:string,before:string,limit:string){
        const url = SPOT_URL.SPOT_MARKET + '/candles';
        const qsOrBody = {symbol,period,after,before,limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params:qsOrBody})
    }
}