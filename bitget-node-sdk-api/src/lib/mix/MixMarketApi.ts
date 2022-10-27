import {BaseApi} from '../BaseApi';
import {MIX_URL} from '../config';

export class MixMarketApi extends BaseApi {
    /**
     * Contract information
     * @param productType
     */
    contracts(productType: string) {
        const url = MIX_URL.MIX_MARKET + '/contracts';
        const qsOrBody = {productType};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Deep market
     * @param symbol
     * @param limit
     */
    depth(symbol: string, limit: string) {
        const url = MIX_URL.MIX_MARKET + '/depth';
        const qsOrBody = {symbol, limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Deep market
     * @param symbol
     */
    ticker(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/ticker';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Acquisition of single ticker market
     * @param productType
     */
    tickers(productType: string) {
        const url = MIX_URL.MIX_MARKET + '/tickers';
        const qsOrBody = {productType};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Obtain transaction details
     * @param symbol
     * @param limit
     */
    fills(symbol: string, limit: string) {
        const url = MIX_URL.MIX_MARKET + '/fills';
        const qsOrBody = {symbol,limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Obtain K line data
     * @param symbol
     * @param granularity (Category of k line)
     * @param startTime
     * @param endTime
     */
    candles(symbol: string, granularity: string,startTime: string,endTime: string) {
        const url = MIX_URL.MIX_MARKET + '/candles';
        const qsOrBody = {symbol,granularity,startTime,endTime};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Get currency index
     * @param symbol
     */
    index(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/index';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Get the next settlement time of the contract
     * @param symbol
     */
    fundingTime(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/funding-time';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Get historical fund rate
     * @param symbol
     * @param pageSize
     * @param pageNo
     * @param nextPage
     */
    historyFundRate(symbol: string,pageSize: string,pageNo: string,nextPage: boolean) {
        const url = MIX_URL.MIX_MARKET + '/history-fundRate';
        const qsOrBody = {symbol,pageSize,pageNo,nextPage};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    /**
     * Get the current fund rate
     * @param symbol
     */
    currentFundRate(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/current-fundRate';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Obtain the total position of the platform
     * @param symbol
     */
    openInterest(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/open-interest';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Get contract tag price
     * @param symbol
     */
    markPrice(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/mark-price';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}