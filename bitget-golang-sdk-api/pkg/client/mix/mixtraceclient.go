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
Dealers close positions
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
The trader obtains the current order
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
The trader obtains the historical order
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
Summary of traders' profit sharing
*/
func (p *MixTraceClient) Summary() (string, error) {

	params := internal.NewParams()

	uri := constants.MixTrace + "/summary"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
Summary of traders' profit sharing (by settlement currency)
*/
func (p *MixTraceClient) ProfitSettleTokenIdGroup() (string, error) {

	params := internal.NewParams()

	uri := constants.MixTrace + "/profitSettleTokenIdGroup"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
Historical profit sharing of traders
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
Historical profit distribution details of traders
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
Details of traders to be distributed
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
