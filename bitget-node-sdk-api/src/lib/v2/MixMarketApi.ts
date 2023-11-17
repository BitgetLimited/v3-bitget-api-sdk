import {BaseApi} from '../BaseApi';

export class MixMarketApi extends BaseApi {

    contracts(qsOrBody: object) {
        const url = '/api/v2/mix/market/contracts';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    orderbook(qsOrBody: object) {
        const url = '/api/v2/mix/market/orderbook';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ticker(qsOrBody: object) {
        const url = '/api/v2/mix/market/ticker';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers})
    }

    tickers(qsOrBody: object) {
        const url = '/api/v2/mix/market/tickers';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers})
    }

    fills(qsOrBody: object) {
        const url = '/api/v2/mix/market/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    candles(qsOrBody: object) {
        const url = '/api/v2/mix/market/candles';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}