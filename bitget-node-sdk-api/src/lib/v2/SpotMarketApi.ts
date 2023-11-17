import {BaseApi} from '../BaseApi';

export class SpotMarketApi extends BaseApi {
    coins(qsOrBody: object) {
        const url = '/api/v2/spot/public/coins';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    symbols(qsOrBody: object) {
        const url = '/api/v2/spot/public/symbols';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(qsOrBody: object) {
        const url = '/api/v2/spot/market/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    orderbook(qsOrBody: object) {
        const url = '/api/v2/spot/market/orderbook';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    tickers(qsOrBody: object) {
        const url = '/api/v2/spot/market/tickers';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers})
    }

    candles(qsOrBody: object) {
        const url = '/api/v2/spot/market/candles';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}