import {FIAT_URL, MIX_URL} from '../config';
import {SetLeverageReq} from '../model/mix/account/SetLeverageReq';
import {SetMarginReq} from '../model/mix/account/SetMarginReq';
import {SetMarginModeReq} from '../model/mix/account/SetMarginModeReq';
import {SetPositionModeReq} from '../model/mix/account/SetPositionModeReq';
import {OpenCountReq} from '../model/mix/account/OpenCountReq';
import {BaseApi} from '../BaseApi';

export class FiatExchangeRateApi extends BaseApi{

    account(symbol: string) {
        const url = FIAT_URL.FIAT_MARKET + '/exchange-rate';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}







