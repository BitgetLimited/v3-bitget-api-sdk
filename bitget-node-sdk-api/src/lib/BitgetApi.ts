import {BaseApi} from './BaseApi';

export class BitgetApi extends BaseApi {

    get(url: string, qsOrBody: object) {
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    post(url: string, qsOrBody: object) {
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

}