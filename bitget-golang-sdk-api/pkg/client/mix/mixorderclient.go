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
 * place an order
 * @param PlaceOrderReq
 * @return ResponseResult
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
 * Place orders in batches
 * @param BatchOrdersReq
 * @return ResponseResult
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
 * cancel the order
 * @param CancelOrderReq
 * @return ResponseResult
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
 * Batch cancellation
 * @param CancelBatchOrdersReq
 * @return ResponseResult
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
 * Get Historical Delegation
 * @param symbol
 * @param startTime
 * @param endTime
 * @param pageSize
 * @param lastEndId
 * @param isPre
 * @return ResponseResult
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
 * Get the current delegate
 * @param symbol
 * @return ResponseResult
 */
func (p *MixOrderClient) Current(symbol string) (string, error) {
	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixOrder + "/current"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get order details
 * @param symbol
 * @param orderId
 * @return ResponseResult
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
 * Query transaction details
 * @param symbol
 * @param orderId
 * @return ResponseResult
 */
func (p *MixOrderClient) Fills(symbol string, orderId string) (string, error) {
	params := internal.NewParams()
	params["symbol"] = symbol
	params["orderId"] = orderId

	uri := constants.MixOrder + "/fills"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}
