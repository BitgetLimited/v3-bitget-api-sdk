package mix

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/mix/order"
)

type MixOrderClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixOrderClient) Init() *MixOrderClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
下单
*/
func (p *MixOrderClient) PlaceOrder(params order.PlaceOrderReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixOrder + "/placeOrder"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
批量下单
*/
func (p *MixOrderClient) BatchOrders(params order.BatchOrdersReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixOrder + "/batch-orders"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
撤单
*/
func (p *MixOrderClient) CancelOrder(params order.CancelOrderReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixOrder + "/cancel-order"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
批量撤单
*/
func (p *MixOrderClient) CancelBatchOrders(params order.CancelBatchOrdersReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixOrder + "/cancel-batch-orders"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
获取订单列表的 历史委托---带分页的
*/
func (p *MixOrderClient) History(symbol string, startTime string, endTime string, pageSize string, lastEndId string, isPre string) (string, error) {
	params := internal.NewParams()
	params["symbol"] = symbol
	params["startTime"] = startTime
	params["endTime"] = endTime
	params["pageSize"] = pageSize

	if len(lastEndId) > 0 {
		params["lastEndId"] = lastEndId
	}
	if len(isPre) > 0 {
		params["isPre"] = isPre
	}

	uri := constants.MixOrder + "/history"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
获取当前委托----不带分页的
*/
func (p *MixOrderClient) Current(symbol string) (string, error) {
	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixOrder + "/current"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
获取订单信息
*/
func (p *MixOrderClient) Detail(symbol string, orderId string) (string, error) {
	params := internal.NewParams()
	params["symbol"] = symbol
	params["orderId"] = orderId

	uri := constants.MixOrder + "/detail"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
查询成交明细
*/
func (p *MixOrderClient) Fills(symbol string, orderId string) (string, error) {
	params := internal.NewParams()
	params["symbol"] = symbol
	params["orderId"] = orderId

	uri := constants.MixOrder + "/fills"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}
