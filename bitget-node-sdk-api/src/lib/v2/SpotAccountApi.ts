import {BaseApi} from '../BaseApi';

export class SpotAccountApi extends BaseApi {

    info() {
        const url = '/api/v2/spot/account/info';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    assets(qsOrBody: object) {
        const url = '/api/v2/spot/account/assets';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    bills(qsOrBody: object) {
        const url = '/api/v2/spot/account/bills';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    transferRecords(qsOrBody: object) {
        const url = '/api/v2/spot/account/transferRecords';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}