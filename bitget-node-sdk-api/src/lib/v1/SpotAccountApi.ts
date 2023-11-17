import {BaseApi} from '../BaseApi';

export class SpotAccountApi extends BaseApi {

    getInfo() {
        const url = '/api/spot/v1/account/getInfo';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    assetsLite(qsOrBody: object) {
        const url = '/api/spot/v1/account/assets-lite';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    bills(qsOrBody: object) {
        const url = '/api/spot/v1/account/bills';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    transferRecords(qsOrBody: object) {
        const url = '/api/spot/v1/account/transferRecords';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

}