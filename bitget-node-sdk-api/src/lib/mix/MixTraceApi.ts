import {BaseApi} from '../BaseApi';
import {CloseTrackOrderReq} from '../model/mix/trace/CloseTrackOrderReq';
import {MIX_URL} from '../config';

export class MixTraceApi extends BaseApi{
    /**
     * Dealer closing interface
     * @param mixCloseTrackOrderReq
     */
    closeTrackOrder(closeTrackOrderReq: CloseTrackOrderReq) {
        const url = MIX_URL.MIX_TRACE + '/closeTrackOrder';
        const headers = this.signer('POST', url, closeTrackOrderReq)
        return this.axiosInstance.post(url, closeTrackOrderReq, {headers})
    }
    /**
     * The trader obtains the current order
     * @param symbol
     * @param productType
     * @param pageSize
     * @param pageNo
     */
    currentTrack(symbol: string,productType:string,pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/currentTrack';
        const qsOrBody = {symbol,productType,pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    /**
     * The trader obtains the historical order
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param pageNo
     */
    historyTrack(startTime: string,endTime:string,pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/historyTrack';
        const qsOrBody = {startTime,endTime,pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Summary of traders' profit sharing
     */
    summary() {
        const url = MIX_URL.MIX_TRACE + '/summary';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }
    /**
     * Historical profit sharing summary of traders (by settlement currency)
     */
    profitSettleTokenIdGroup() {
        const url = MIX_URL.MIX_TRACE + '/profitSettleTokenIdGroup';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }
    /**
     * Historical profit sharing summary of traders (by settlement currency and date)
     * @param pageSize
     * @param pageNo
     */
    profitDateGroupList(pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/profitSettleTokenIdGroup';
        const qsOrBody = {pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }
    /**
     * Historical profit distribution details of traders
     * @param marginCoin
     * @param date
     * @param pageSize
     * @param pageNo
     */
    profitDateList(marginCoin:string,date:string,pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/profitDateList';
        const qsOrBody = {marginCoin,date,pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }
    /**
     * Details of traders to be distributed
     * @param pageSize
     * @param pageNo
     */
    waitProfitDateList(pageSize:string,pageNo:string) {
        const url = MIX_URL.MIX_TRACE + '/waitProfitDateList';
        const qsOrBody = {pageSize,pageNo};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }
    /**
     * Followers obtain documentary information
     * @param pageSize
     * @param pageNo
     * @param startTime
     * @param endTime
     */
    followerHistoryOrders(pageSize:string,pageNo:string,startTime:string,endTime:string) {
        const url = MIX_URL.MIX_TRACE + '/followerHistoryOrders';
        const qsOrBody = {pageSize,pageNo,startTime,endTime};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers,params: qsOrBody})
    }
}