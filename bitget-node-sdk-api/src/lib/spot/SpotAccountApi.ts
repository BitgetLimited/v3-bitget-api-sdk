import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';
import {BillsReq} from '../model/spot/account/BillsReq';

export class SpotAccountApi extends BaseApi{
    assets() {
        const url = SPOT_URL.SPOT_ACCOUNT + '/assets';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    bills(billsReq:BillsReq) {
        const url = SPOT_URL.SPOT_ACCOUNT + '/bills';
        const headers = this.signer('POST', url, billsReq)
        return this.axiosInstance.post(url, billsReq, {headers})
    }

    transferRecords(coinId:string,fromType:string,limit:string,after:string,before:string){
        const url = SPOT_URL.SPOT_ACCOUNT + '/transferRecords';
        const qsOrBody = {coinId, fromType,limit,after,before};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}