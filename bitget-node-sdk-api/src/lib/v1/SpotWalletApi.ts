import {BaseApi} from '../BaseApi';

export class SpotWalletApi extends BaseApi {

    transfer(qsOrBody: object) {
        const url = '/api/spot/v1/wallet/transfer';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    depositAddress(qsOrBody: object) {
        const url = '/api/spot/v1/wallet/deposit-address';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    withdrawal(qsOrBody: object) {
        const url = '/api/spot/v1/wallet/withdrawal';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    withdrawalRecords(qsOrBody: object) {
        const url = '/api/spot/v1/wallet/withdrawal-list';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    depositRecords(qsOrBody: object) {
        const url = '/api/spot/v1/wallet/deposit-list';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}