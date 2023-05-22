import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';
import {WithdrawalReq} from '../model/spot/wallet/WithdrawalReq';

export class SpotWalletApi extends BaseApi{

    /**
     * Get the bill flow
     * @param spotBillQueryReq
     */
    withdrawal(withdrawalReq:WithdrawalReq) {
        const url = SPOT_URL.SPOT_WALLET + '/withdrawal';
        const headers = this.signer('POST', url, withdrawalReq)
        return this.axiosInstance.post(url, withdrawalReq, {headers})
    }

}