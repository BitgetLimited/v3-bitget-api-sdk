import {BaseApi} from '../BaseApi';

export class SpotMarketApi extends BaseApi {
    currencies() {
        const url = '/api/spot/v1/public/currencies';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    products() {
        const url = '/api/spot/v1/public/products';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    product(qsOrBody: object) {
        const url = '/api/spot/v1/public/product';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    fills(qsOrBody: object) {
        const url = '/api/spot/v1/market/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    depth(qsOrBody: object) {
        const url = '/api/spot/v1/market/depth';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    ticker(qsOrBody: object) {
        const url = '/api/spot/v1/market/ticker';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    tickers() {
        const url = '/api/spot/v1/market/tickers';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    candles(qsOrBody: object) {
        const url = '/api/spot/v1/market/candles';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}