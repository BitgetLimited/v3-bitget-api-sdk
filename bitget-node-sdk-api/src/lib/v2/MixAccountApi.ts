import {BaseApi} from '../BaseApi';

export class MixAccountApi extends BaseApi {

    account(qsOrBody: object) {
        const url = '/api/v2/mix/account/account';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    accounts(qsOrBody: object) {
        const url = '/api/v2/mix/account/accounts';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    setLeverage(qsOrBody: object) {
        const url = '/api/v2/mix/account/set-leverage';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    setMargin(qsOrBody: object) {
        const url = '/api/v2/mix/account/set-margin';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    setMarginMode(qsOrBody: object) {
        const url = '/api/v2/mix/account/set-margin-mode';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    setPositionMode(qsOrBody: object) {
        const url = '/api/v2/mix/account/set-position-mode';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    singlePosition(qsOrBody: object) {
        const url = '/api/v2/mix/position/single-position';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    allPosition(qsOrBody: object) {
        const url = '/api/v2/mix/position/all-position';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

}