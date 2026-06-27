package v1

import (
	"bitget/internal"
	"bitget/internal/common"
)

type SpotOrderClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotOrderClient) Init() *SpotOrderClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// normal order
func (p *SpotOrderClient) PlaceOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trade/orders", postBody)
	return resp, err
}

func (p *SpotOrderClient) BatchPlaceOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trade/batch-orders", postBody)
	return resp, err
}

func (p *SpotOrderClient) CancelOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trade/cancel-order", postBody)
	return resp, err
}

func (p *SpotOrderClient) BatchCancelOrders(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trade/cancel-batch-orders", postBody)
	return resp, err
}

func (p *SpotOrderClient) OrdersHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/trade/history", params)
	return resp, err
}

func (p *SpotOrderClient) OrdersPending(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/trade/open-orders", params)
	return resp, err
}

func (p *SpotOrderClient) Fills(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/trade/fills", params)
	return resp, err
}

// plan
func (p *SpotOrderClient) PlacePlanOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/plan/placePlan", postBody)
	return resp, err
}

func (p *SpotOrderClient) CancelPlanOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/plan/cancelPlan", postBody)
	return resp, err
}

func (p *SpotOrderClient) OrdersPlanPending(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/plan/currentPlan", postBody)
	return resp, err
}

func (p *SpotOrderClient) OrdersPlanHistory(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/plan/historyPlan", postBody)
	return resp, err
}

// trader
func (p *SpotOrderClient) TraderOrderCloseTracking(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trace/order/closeTrackingOrder", postBody)
	return resp, err
}

func (p *SpotOrderClient) TraderOrderCurrentTrack(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trace/order/orderCurrentList", postBody)
	return resp, err
}

func (p *SpotOrderClient) TraderOrderHistoryTrack(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/spot/v1/trace/order/orderHistoryList", postBody)
	return resp, err
}
