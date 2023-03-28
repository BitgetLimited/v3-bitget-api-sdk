package mix

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/mix/trace"
)

type MixTraceClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixTraceClient) Init() *MixTraceClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * Dealer closing interface
 * @param CloseTrackOrderReq
 * @return ResponseResult
 */
func (p *MixTraceClient) CloseTrackOrder(params trace.CloseTrackOrderReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixTrace + "/closeTrackOrder"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * The trader obtains the current order
 * @param symbol
 * @param productType
 * @param pageSize
 * @param pageNo
 * @return ResponseResult
 */
func (p *MixTraceClient) CurrentTrack(symbol string, productType string, pageSize string, pageNo string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["productType"] = productType

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}

	uri := constants.MixTrace + "/currentTrack"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * The trader obtains the historical order
 * @param startTime
 * @param endTime
 * @param pageSize
 * @param pageNo
 * @return ResponseResult
 */
func (p *MixTraceClient) HistoryTrack(startTime string, endTime string, pageSize string, pageNo string) (string, error) {

	params := internal.NewParams()
	params["startTime"] = startTime
	params["endTime"] = endTime

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}

	uri := constants.MixTrace + "/historyTrack"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Summary of traders' profit sharing
 * @return ResponseResult
 */
func (p *MixTraceClient) Summary() (string, error) {

	params := internal.NewParams()

	uri := constants.MixTrace + "/summary"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Historical profit sharing summary of traders (by settlement currency)
 * @return ResponseResult
 */
func (p *MixTraceClient) ProfitSettleTokenIdGroup() (string, error) {

	params := internal.NewParams()

	uri := constants.MixTrace + "/profitSettleTokenIdGroup"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Historical profit sharing summary of traders (by settlement currency and date)
 * @param pageSize
 * @param pageNo
 * @return ResponseResult
 */
func (p *MixTraceClient) ProfitDateGroupList(pageSize string, pageNo string) (string, error) {

	params := internal.NewParams()
	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}

	uri := constants.MixTrace + "/profitDateGroupList"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Historical profit distribution details of traders
 * @param marginCoin
 * @param date
 * @param pageSize
 * @param pageNo
 * @return ResponseResult
 */
func (p *MixTraceClient) ProfitDateList(marginCoin string, date string, pageSize string, pageNo string) (string, error) {

	params := internal.NewParams()
	params["marginCoin"] = marginCoin
	params["date"] = date

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}

	uri := constants.MixTrace + "/profitDateList"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Details of traders to be distributed
 * @param pageSize
 * @param pageNo
 * @return ResponseResult
 */
func (p *MixTraceClient) WaitProfitDateList(pageSize string, pageNo string) (string, error) {

	params := internal.NewParams()

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}

	uri := constants.MixTrace + "/waitProfitDateList"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Followers obtain documentary information
 * @param pageSize
 * @param pageNo
 * @param startTime
 * @param endTime
 * @return ResponseResult
 */
func (p *MixTraceClient) FollowerHistoryOrders(pageSize string, pageNo string, startTime string, endTime string) (string, error) {
	params := internal.NewParams()

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}
	if len(startTime) > 0 {
		params["startTime"] = startTime
	}
	if len(endTime) > 0 {
		params["endTime"] = endTime
	}
	uri := constants.MixTrace + "/followerHistoryOrders"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Trader get copyTader symbol
 * @return ResponseResult
 */
func (p *MixTraceClient) TraderSymbols() (string, error) {
	params := internal.NewParams()

	uri := constants.MixTrace + "/traderSymbols"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Trader set copyTader symbol
 * @return ResponseResult
 */
func (p *MixTraceClient) SetUpCopySymbols(params trace.CloseTrackOrderReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixTrace + "/setUpCopySymbols"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
 * Trader modify tpsl order
 * @return ResponseResult
 */
func (p *MixTraceClient) ModifyTPSL(params trace.TraderModifyTPSLOrderReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixTrace + "/modifyTPSL"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
 * trader get copytrade symbol
 * @param pageSize
 * @param pageNo
 * @param startTime
 * @param endTime
 * @return ResponseResult
 */
func (p *MixTraceClient) followerOrder(symbol string, productType string, pageSize string, pageNo string) (string, error) {
	params := internal.NewParams()

	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}
	params["symbol"] = symbol
	params["productType"] = productType
	uri := constants.MixTrace + "/followerOrder"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}
