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
 * place an order
 * @param OrdersReq
 * @return ResponseResult
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
 * Place orders in batches
 * @param BatchOrdersReq
 * @return ResponseResult
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
 * cancel the order
 * @param CancelOrderReq
 * @return ResponseResult
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
 * Batch cancellation
 * @param CancelBatchOrdersReq
 * @return ResponseResult
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
 * Get order details
 * @param OrderInfoReq
 * @return ResponseResult
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
 * Obtain orders that have not been closed or partially closed but not cancelled
 * @param OpenOrdersReq
 * @return ResponseResult
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
 * Get historical delegation list
 * @param HistoryReq
 * @return ResponseResult
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
 * Obtain transaction details
 * @param FillsReq
 * @return ResponseResult
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
/*func (p *SpotOrderClient) ChangeDepth(params order.ChangeDepthReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotTrade + "/changeDepth"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}*/
