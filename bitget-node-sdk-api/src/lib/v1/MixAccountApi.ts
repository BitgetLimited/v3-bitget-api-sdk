import {BaseApi} from '../BaseApi';

export class MixAccountApi extends BaseApi {

    account(qsOrBody: object) {
        const url = '/api/mix/v1/account/account';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    accounts(qsOrBody: object) {
        const url = '/api/mix/v1/account/accounts';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    setLeverage(qsOrBody: object) {
        const url = '/api/mix/v1/account/setLeverage';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    setMargin(qsOrBody: object) {
        const url = '/api/mix/v1/account/setMargin';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    setMarginMode(qsOrBody: object) {
        const url = '/api/mix/v1/account/setMarginMode';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    setPositionMode(qsOrBody: object) {
        const url = '/api/mix/v1/account/setPositionMode';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    singlePosition(qsOrBody: object) {
        const url = '/api/mix/v1/position/singlePosition';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    allPosition(qsOrBody: object) {
        const url = '/api/mix/v1/position/allPosition';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

}