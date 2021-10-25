import {BaseApi} from '../BaseApi';
import {MIX_URL} from '../config';

export class MixMarketApi extends BaseApi {

    contracts(productType: string) {
        const url = MIX_URL.MIX_MARKET + '/contracts';
        const qsOrBody = {productType};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    depth(symbol: string, limit: string) {
        const url = MIX_URL.MIX_MARKET + '/depth';
        const qsOrBody = {symbol, limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ticker(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/ticker';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    tickers(productType: string) {
        const url = MIX_URL.MIX_MARKET + '/tickers';
        const qsOrBody = {productType};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(symbol: string, limit: string) {
        const url = MIX_URL.MIX_MARKET + '/fills';
        const qsOrBody = {symbol,limit};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    candles(symbol: string, granularity: string,startTime: string,endTime: string) {
        const url = MIX_URL.MIX_MARKET + '/candles';
        const qsOrBody = {symbol,granularity,startTime,endTime};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    index(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/index';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    fundingTime(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/funding-time';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    historyFundRate(symbol: string,pageSize: string,pageNo: string,nextPage: boolean) {
        const url = MIX_URL.MIX_MARKET + '/history-fundRate';
        const qsOrBody = {symbol,pageSize,pageNo,nextPage};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    currentFundRate(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/current-fundRate';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    openInterest(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/open-interest';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    markPrice(symbol: string) {
        const url = MIX_URL.MIX_MARKET + '/mark-price';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}