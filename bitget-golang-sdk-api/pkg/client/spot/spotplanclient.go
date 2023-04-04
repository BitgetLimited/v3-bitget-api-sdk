package spot

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/spot/plan"
)

type SpotPlanClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotPlanClient) Init() *SpotPlanClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

func (p *SpotPlanClient) PlacePlan(params plan.SpotPlanReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotPlan + "/placePlan"
	resp, err := p.BitgetRestClient.DoPost(uri, postBody)
	return resp, err
}

func (p *SpotPlanClient) ModifyPlan(params plan.SpotModifyPlanReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotPlan + "/modifyPlan"
	resp, err := p.BitgetRestClient.DoPost(uri, postBody)
	return resp, err
}

func (p *SpotPlanClient) CancelPlan(params plan.SpotCancelPlanReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotPlan + "/cancelPlan"
	resp, err := p.BitgetRestClient.DoPost(uri, postBody)
	return resp, err
}

func (p *SpotPlanClient) CurrentPlan(params plan.SpotQueryPlanReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotPlan + "/currentPlan"
	resp, err := p.BitgetRestClient.DoPost(uri, postBody)
	return resp, err
}

func (p *SpotPlanClient) HistoryPlan(params plan.SpotQueryPlanReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotPlan + "/historyPlan"
	resp, err := p.BitgetRestClient.DoPost(uri, postBody)
	return resp, err
}
