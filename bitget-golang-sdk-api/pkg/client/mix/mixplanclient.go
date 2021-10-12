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
计划委托下单
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
修改计划委托
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
修改计划委托 预设止盈止损
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
止盈止损 下单
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
计划委托撤单
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
获取当前计划委托&止盈止损
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
获取历史计划委托&止盈止损
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
