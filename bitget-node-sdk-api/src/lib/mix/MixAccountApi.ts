import {MIX_URL} from '../config';
import {SetLeverageReq} from '../model/mix/account/SetLeverageReq';
import {SetMarginReq} from '../model/mix/account/SetMarginReq';
import {SetMarginModeReq} from '../model/mix/account/SetMarginModeReq';
import {SetPositionModeReq} from '../model/mix/account/SetPositionModeReq';
import {OpenCountReq} from '../model/mix/account/OpenCountReq';
import {BaseApi} from '../BaseApi';

export class MixAccountApi extends BaseApi{

    account(symbol: string, marginCoin: string) {
        const url = MIX_URL.MIX_ACCOUNT + '/account';
        const qsOrBody = {symbol, marginCoin};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    accounts(productType: string) {
        const url = MIX_URL.MIX_ACCOUNT + '/accounts';
        const qsOrBody = {productType};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    setLeverage(leverageReq: SetLeverageReq) {
        const url = MIX_URL.MIX_ACCOUNT + '/setLeverage';
        const headers = this.signer('POST', url, leverageReq)
        return this.axiosInstance.post(url, leverageReq, {headers})
    }

    setMargin(setMarginReq: SetMarginReq) {
        const url = MIX_URL.MIX_ACCOUNT + '/setMargin';
        const headers = this.signer('POST', url, setMarginReq)
        return this.axiosInstance.post(url, setMarginReq, {headers})
    }

    setMarginMode(setMarginModeReq: SetMarginModeReq) {
        const url = MIX_URL.MIX_ACCOUNT + '/setMarginMode';
        const headers = this.signer('POST', url, setMarginModeReq)
        return this.axiosInstance.post(url, setMarginModeReq, {headers})
    }

    setPositionMode(setPositionModeReq: SetPositionModeReq) {
        const url = MIX_URL.MIX_ACCOUNT + '/setPositionMode';
        const headers = this.signer('POST', url, setPositionModeReq)
        return this.axiosInstance.post(url, setPositionModeReq, {headers})
    }

    openCount(openCountReq: OpenCountReq) {
        const url = MIX_URL.MIX_ACCOUNT + '/open-count';
        const headers = this.signer('POST', url, openCountReq)
        return this.axiosInstance.post(url, openCountReq, {headers})
    }
}







