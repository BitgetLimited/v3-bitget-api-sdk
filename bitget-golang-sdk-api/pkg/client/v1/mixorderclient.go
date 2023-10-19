package v1

import (
	"bitget/internal"
	"bitget/internal/common"
)

type MixOrderClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixOrderClient) Init() *MixOrderClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// normal order
func (p *MixOrderClient) PlaceOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/order/placeOrder", postBody)
	return resp, err
}

func (p *MixOrderClient) BatchPlaceOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/order/batch-orders", postBody)
	return resp, err
}

func (p *MixOrderClient) CancelOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/order/cancel-order", postBody)
	return resp, err
}

func (p *MixOrderClient) BatchCancelOrders(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/order/cancel-batch-orders", postBody)
	return resp, err
}

func (p *MixOrderClient) OrdersHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/order/history", params)
	return resp, err
}

func (p *MixOrderClient) OrdersPending(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/order/current", params)
	return resp, err
}

func (p *MixOrderClient) Fills(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/order/fills", params)
	return resp, err
}

// plan
func (p *MixOrderClient) PlacePlanOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/plan/placePlan", postBody)
	return resp, err
}

func (p *MixOrderClient) CancelPlanOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/plan/cancelPlan", postBody)
	return resp, err
}

func (p *MixOrderClient) OrdersPlanPending(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/plan/currentPlan", params)
	return resp, err
}

func (p *MixOrderClient) OrdersPlanHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/plan/historyPlan", params)
	return resp, err
}

// trader
func (p *MixOrderClient) TraderOrderClosePositions(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/trace/closeTrackOrder", postBody)
	return resp, err
}

func (p *MixOrderClient) TraderOrderCurrentTrack(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/trace/currentTrack", params)
	return resp, err
}

func (p *MixOrderClient) TraderOrderHistoryTrack(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/trace/historyTrack", params)
	return resp, err
}

func (p *MixOrderClient) FollowerClosePositions(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/trace/followerCloseByTrackingNo", postBody)
	return resp, err
}

func (p *MixOrderClient) FollowerQueryCurrentOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/trace/followerOrder", params)
	return resp, err
}

func (p *MixOrderClient) FollowerQueryHistoryOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/trace/followerHistoryOrders", params)
	return resp, err
}
