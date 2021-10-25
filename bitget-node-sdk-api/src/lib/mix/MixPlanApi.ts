import {BaseApi} from '../BaseApi';
import {PlacePlanReq} from '../model/mix/plan/PlacePlanReq';
import {MIX_URL} from '../config';
import {ModifyPlanReq} from '../model/mix/plan/ModifyPlanReq';
import {ModifyPlanPresetReq} from '../model/mix/plan/ModifyPlanPresetReq';
import {ModifyTPSLPlanReq} from '../model/mix/plan/ModifyTPSLPlanReq';
import {PlaceTPSLReq} from '../model/mix/plan/PlaceTPSLReq';
import {CancelPlanReq} from '../model/mix/plan/CancelPlanReq';

export class MixPlanApi extends BaseApi{
    placePlan(placePlanReq: PlacePlanReq) {
        const url = MIX_URL.MIX_PLAN + '/placePlan';
        const headers = this.signer('POST', url, placePlanReq)
        return this.axiosInstance.post(url, placePlanReq, {headers})
    }

    modifyPlan(modifyPlanReq: ModifyPlanReq) {
        const url = MIX_URL.MIX_PLAN + '/modifyPlan';
        const headers = this.signer('POST', url, modifyPlanReq)
        return this.axiosInstance.post(url, modifyPlanReq, {headers})
    }

    modifyPlanPreset(modifyPlanPresetReq: ModifyPlanPresetReq) {
        const url = MIX_URL.MIX_PLAN + '/modifyPlanPreset';
        const headers = this.signer('POST', url, modifyPlanPresetReq)
        return this.axiosInstance.post(url, modifyPlanPresetReq, {headers})
    }

    modifyTPSLPlan(modifyTPSLPlanReq: ModifyTPSLPlanReq) {
        const url = MIX_URL.MIX_PLAN + '/modifyTPSLPlan';
        const headers = this.signer('POST', url, modifyTPSLPlanReq)
        return this.axiosInstance.post(url, modifyTPSLPlanReq, {headers})
    }

    placeTPSL(placeTPSLReq: PlaceTPSLReq) {
        const url = MIX_URL.MIX_PLAN + '/placeTPSL';
        const headers = this.signer('POST', url, placeTPSLReq)
        return this.axiosInstance.post(url, placeTPSLReq, {headers})
    }

    cancelPlan(cancelPlanReq: CancelPlanReq) {
        const url = MIX_URL.MIX_PLAN + '/cancelPlan';
        const headers = this.signer('POST', url, cancelPlanReq)
        return this.axiosInstance.post(url, cancelPlanReq, {headers})
    }

    currentPlan(symbol: string,isPlan:string) {
        const url = MIX_URL.MIX_PLAN + '/currentPlan';
        const qsOrBody = {symbol,isPlan};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    historyPlan(symbol: string,startTime:string,endTime:string,pageSize:string,isPre:boolean,isPlan:string) {
        const url = MIX_URL.MIX_PLAN + '/historyPlan';
        const qsOrBody = {symbol,startTime,endTime,pageSize,isPre,isPlan};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}