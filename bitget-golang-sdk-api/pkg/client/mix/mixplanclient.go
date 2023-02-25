package mix

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/mix/plan"
)

type MixPlanClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixPlanClient) Init() *MixPlanClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * Plan Entrusted Order
 * @param PlacePlanReq
 * @return ResponseResult
 */
func (p *MixPlanClient) PlacePlan(params plan.PlacePlanReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/placePlan"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Modify Plan Delegation
 * @param ModifyPlanReq
 * @return ResponseResult
 */
func (p *MixPlanClient) ModifyPlan(params plan.ModifyPlanReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/modifyPlan"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Modify the preset profit and loss stop of plan entrustment
 * @param ModifyPlanPresetReq
 * @return ResponseResult
 */
func (p *MixPlanClient) ModifyPlanPreset(params plan.ModifyPlanPresetReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/modifyPlanPreset"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Modify profit and loss stop
 * @param ModifyTPSLPlanReq
 * @return ResponseResult
 */
func (p *MixPlanClient) ModifyTPSLPlan(params plan.ModifyTPSLPlanReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/modifyTPSLPlan"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Stop profit and stop loss Order
 * @param PlaceTPSLReq
 * @return ResponseResult
 */
func (p *MixPlanClient) PlaceTPSL(params plan.PlaceTPSLReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/placeTPSL"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Stop profit and stop loss Order
 * @param PlaceTPSLReq
 * @return ResponseResult
 */
func (p *MixPlanClient) PlaceTrailStop(params plan.PlaceTPSLReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/placeTrailStop"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Planned entrustment (profit and loss stop) cancellation
 * @param CancelPlanReq
 * @return ResponseResult
 */
func (p *MixPlanClient) CancelPlan(params plan.CancelPlanReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/cancelPlan"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Planned entrustment (profit and loss stop) cancellation
 * @param CancelPlanReq
 * @return ResponseResult
 */
func (p *MixPlanClient) CancelAllPlan(params plan.CancelAllPlanReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixPlan + "/cancelAllPlan"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Get the current plan commission (profit stop and loss stop) list
 * @param symbol
 * @param isPlan
 * @return ResponseResult
 */
func (p *MixPlanClient) CurrentPlan(symbol string, isPlan string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	if len(isPlan) > 0 {
		params["isPlan"] = isPlan
	}

	uri := constants.MixPlan + "/currentPlan"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Obtain the list of historical plan commissions (profit and loss stop)
 * @param symbol
 * @param startTime
 * @param endTime
 * @param pageSize
 * @param isPre
 * @param isPlan
 * @return ResponseResult
 */
func (p *MixPlanClient) HistoryPlan(symbol string, startTime string, endTime string, pageSize string, isPre string, isPlan string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["startTime"] = startTime
	params["endTime"] = endTime

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}

	if len(isPre) > 0 {
		params["isPre"] = isPre
	}
	if len(isPre) > 0 {
		params["isPlan"] = isPlan
	}

	uri := constants.MixPlan + "/historyPlan"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}
