import {BaseApi} from '../BaseApi';

export class MixMarketApi extends BaseApi {

    contracts(qsOrBody: object) {
        const url = '/api/mix/v1/market/contracts';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    depth(qsOrBody: object) {
        const url = '/api/mix/v1/market/depth';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ticker(qsOrBody: object) {
        const url = '/api/mix/v1/market/ticker';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers})
    }

    tickers(qsOrBody: object) {
        const url = '/api/mix/v1/market/tickers';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers})
    }

    fills(qsOrBody: object) {
        const url = '/api/mix/v1/market/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    candles(qsOrBody: object) {
        const url = '/api/mix/v1/market/candles';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}