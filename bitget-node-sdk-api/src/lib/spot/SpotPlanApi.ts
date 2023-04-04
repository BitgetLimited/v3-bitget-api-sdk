import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';
import {SpotPlanReq} from '../model/spot/plan/SpotPlanReq';
import {SpotModifyPlanReq} from '../model/spot/plan/SpotModifyPlanReq';
import {SpotCancelPlanReq} from '../model/spot/plan/SpotCancelPlanReq';
import {SpotQueryPlanReq} from '../model/spot/plan/SpotQueryPlanReq';

export class SpotPlanApi extends BaseApi{

    placePlan(req:SpotPlanReq) {
        const url = SPOT_URL.SPOT_PLAN + '/placePlan';
        const headers = this.signer('POST', url, req)
        return this.axiosInstance.post(url, req, {headers})
    }

    modifyPlan(req:SpotModifyPlanReq) {
        const url = SPOT_URL.SPOT_PLAN + '/modifyPlan';
        const headers = this.signer('POST', url, req)
        return this.axiosInstance.post(url, req, {headers})
    }

    cancelPlan(req:SpotCancelPlanReq) {
        const url = SPOT_URL.SPOT_PLAN + '/cancelPlan';
        const headers = this.signer('POST', url, req)
        return this.axiosInstance.post(url, req, {headers})
    }

    currentPlan(req:SpotQueryPlanReq) {
        const url = SPOT_URL.SPOT_PLAN + '/currentPlan';
        const headers = this.signer('POST', url, req)
        return this.axiosInstance.post(url, req, {headers})
    }

    historyPlan(req:SpotQueryPlanReq) {
        const url = SPOT_URL.SPOT_PLAN + '/historyPlan';
        const headers = this.signer('POST', url, req)
        return this.axiosInstance.post(url, req, {headers})
    }
}