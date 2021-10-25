import {BaseApi} from '../BaseApi';
import {CloseTrackOrderReq} from '../model/mix/trace/CloseTrackOrderReq';
import {MIX_URL} from '../config';

export class MixTraceApi extends BaseApi{
    closeTrackOrder(closeTrackOrderReq: CloseTrackOrderReq) {
        const url = MIX_URL.MIX_TRACE + '/closeTrackOrder';
        const headers = this.signer('POST', url, closeTrackOrderReq)
        return this.axiosInstance.post(url, closeTrackOrderReq, {headers})
    }

    currentTrack(symbol: string,productType:string,pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/currentTrack';
        const qsOrBody = {symbol,productType,pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    historyTrack(startTime: string,endTime:string,pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/historyTrack';
        const qsOrBody = {startTime,endTime,pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    summary() {
        const url = MIX_URL.MIX_TRACE + '/summary';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    profitSettleTokenIdGroup() {
        const url = MIX_URL.MIX_TRACE + '/profitSettleTokenIdGroup';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    profitDateGroupList(pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/profitSettleTokenIdGroup';
        const qsOrBody = {pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }

    profitDateList(marginCoin:string,date:string,pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/profitDateList';
        const qsOrBody = {marginCoin,date,pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }

    waitProfitDateList(pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/waitProfitDateList';
        const qsOrBody = {pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }
}