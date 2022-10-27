import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';
import {SpotBillsReq} from '../model/spot/account/SpotBillsReq';

export class SpotAccountApi extends BaseApi{
    /**
     * Obtain account assets
     */
    assets() {
        const url = SPOT_URL.SPOT_ACCOUNT + '/assets';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    /**
     * Get the bill flow
     * @param spotBillQueryReq
     */
    bills(billsReq:SpotBillsReq) {
        const url = SPOT_URL.SPOT_ACCOUNT + '/bills';
        const headers = this.signer('POST', url, billsReq)
        return this.axiosInstance.post(url, billsReq, {headers})
    }
    /**
     * Obtain transfer records
     * @param coinId
     * @param fromType
     * @param limit
     * @param after
     * @param before
     */
    transferRecords(coinId:string,fromType:string,limit:string,after:string,before:string){
        const url = SPOT_URL.SPOT_ACCOUNT + '/transferRecords';
        const qsOrBody = {coinId, fromType,limit,after,before};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}