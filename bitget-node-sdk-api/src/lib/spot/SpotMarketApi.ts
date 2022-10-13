import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';

export class SpotMarketApi extends BaseApi{
    /**
     * Obtain transaction data
     * @param symbol
     * @param limit
     */
    fills(symbol:string,limit:string){
        const url = SPOT_URL.SPOT_MARKET + '/fills';
        const qsOrBody = {symbol, limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Get depth data
     * @param symbol
     * @param limit
     * @param type
     */
    depth(symbol:string,limit:string,type:string){
        const url = SPOT_URL.SPOT_MARKET + '/depth';
        const qsOrBody = {symbol, limit,type};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    /**
     * Get a Ticker Information
     * @param symbol
     */
    ticker(symbol:string){
        const url = SPOT_URL.SPOT_MARKET + '/ticker';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Get all Ticker information
     */
    tickers(){
        const url = SPOT_URL.SPOT_MARKET + '/tickers';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }
    /**
     * Obtain K line data
     * @param symbol
     * @param period (Time unit and granularity of K line (refer to the following list for values))
     * @param after
     * @param before
     * @param limit
     */
    candles(symbol:string,period:string,after:string,before:string,limit:string){
        const url = SPOT_URL.SPOT_MARKET + '/candles';
        const qsOrBody = {symbol,period,after,before,limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params:qsOrBody})
    }
}