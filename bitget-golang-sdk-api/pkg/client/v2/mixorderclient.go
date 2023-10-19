package v2

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
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/order/place-order", postBody)
	return resp, err
}

func (p *MixOrderClient) BatchPlaceOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/order/batch-place-order", postBody)
	return resp, err
}

func (p *MixOrderClient) CancelOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/order/cancel-order", postBody)
	return resp, err
}

func (p *MixOrderClient) BatchCancelOrders(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/order/batch-cancel-orders", postBody)
	return resp, err
}

func (p *MixOrderClient) OrdersHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/order/orders-history", params)
	return resp, err
}

func (p *MixOrderClient) OrdersPending(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/order/orders-pending", params)
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
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/order/place-plan-order", postBody)
	return resp, err
}

func (p *MixOrderClient) CancelPlanOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/order/cancel-plan-order", postBody)
	return resp, err
}

func (p *MixOrderClient) OrdersPlanPending(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/order/orders-plan-pending", params)
	return resp, err
}

func (p *MixOrderClient) OrdersPlanHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/order/orders-plan-history", params)
	return resp, err
}

// trader
func (p *MixOrderClient) TraderOrderClosePositions(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/copy/mix-trader/order-close-positions", postBody)
	return resp, err
}

func (p *MixOrderClient) TraderOrderCurrentTrack(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/copy/mix-trader/order-current-track", params)
	return resp, err
}

func (p *MixOrderClient) TraderOrderHistoryTrack(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/copy/mix-trader/order-history-track", params)
	return resp, err
}

func (p *MixOrderClient) FollowerClosePositions(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/copy/mix-follower/close-positions", postBody)
	return resp, err
}

func (p *MixOrderClient) FollowerQueryCurrentOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/copy/mix-follower/query-current-orders", params)
	return resp, err
}

func (p *MixOrderClient) FollowerQueryHistoryOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/copy/mix-follower/query-history-orders", params)
	return resp, err
}
