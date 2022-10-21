package spot

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/spot/account"
)

type SpotAccountClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotAccountClient) Init() *SpotAccountClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
获取账户资产
symbol:
marginCoin:
*/
func (p *SpotAccountClient) Assets() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotAccount + "/assets"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
获取划转记录
*/
func (p *SpotAccountClient) TransferRecords(coinId string, fromType string, limit string, after string, before string) (string, error) {

	params := internal.NewParams()
	if len(coinId) > 0 {
		params["coinId"] = coinId
	}
	if len(fromType) > 0 {
		params["fromType"] = fromType
	}
	if len(limit) > 0 {
		params["limit"] = limit
	}
	if len(after) > 0 {
		params["after"] = after
	}
	if len(before) > 0 {
		params["before"] = before
	}

	uri := constants.SpotAccount + "/transferRecords"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
获取账单流水
*/
func (p *SpotAccountClient) Bills(params account.BillsReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotAccount + "/bills"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}
