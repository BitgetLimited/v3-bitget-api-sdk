package spot

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/spot/order"
)

type SpotOrderClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotOrderClient) Init() *SpotOrderClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
获取账单流水
*/
func (p *SpotOrderClient) Orders(params order.OrdersReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/orders"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) BatchOrders(params order.BatchOrdersReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/batch-orders"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) CancelOrder(params order.CancelOrderReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/cancel-order"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) CancelBatchOrders(params order.CancelBatchOrdersReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/cancel-batch-orders"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) OrderInfo(params order.OrderInfoReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/orderInfo"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) OpenOrders(params order.OpenOrdersReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/open-orders"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) History(params order.HistoryReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/history"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) Fills(params order.FillsReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/fills"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
获取账单流水
*/
func (p *SpotOrderClient) ChangeDepth(params order.ChangeDepthReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/changeDepth"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}
