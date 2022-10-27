package mix

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/mix/account"
)

type MixAccountClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixAccountClient) Init() *MixAccountClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * Get account  information
 * @param symbol
 * @param marginCoin
 * @return ResponseResult
 */
func (p *MixAccountClient) Account(symbol string, marginCoin string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["marginCoin"] = marginCoin

	uri := constants.MixAccount + "/account"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get account  information list
 * @param productType
 * @return ResponseResult
 */
func (p *MixAccountClient) Accounts(productType string) (string, error) {

	params := internal.NewParams()
	params["productType"] = productType

	uri := constants.MixAccount + "/accounts"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * set lever
 * @param SetLeveragerReq
 * @return ResponseResult
 */
func (p *MixAccountClient) SetLeverage(params account.SetLeveragerReq) (string, error) {
	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixAccount + "/setLeverage"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
 * Adjustment margin
 * @param SetMarginReq
 * @return ResponseResult
 */
func (p *MixAccountClient) SetMargin(params account.SetMarginReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixAccount + "/setMargin"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
 * Adjust margin mode
 * @param SetMarginModeReq
 * @return ResponseResult
 */
func (p *MixAccountClient) SetMarginMode(params account.SetMarginModeReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixAccount + "/setMarginMode"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}

/**
 * Get the openable quantity
 * @param OpenCountReq
 * @return ResponseResult
 */
func (p *MixAccountClient) OpenCount(params account.OpenCountReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.MixAccount + "/open-count"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}
