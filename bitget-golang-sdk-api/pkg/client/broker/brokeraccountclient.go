package broker

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/broker"
)

type BrokerAccountClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *BrokerAccountClient) Init() *BrokerAccountClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * Get broker  information
 * @return ResponseResult
 */
func (p *BrokerAccountClient) info() (string, error) {

	params := internal.NewParams()

	uri := constants.BrokerAccount + "/account"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get broker  information
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubCreate(params broker.SubCreateReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.BrokerAccount + "/sub-create"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Get sub list
 * @param symbol
 * @param marginCoin
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubList(pageSize string, lastEndId string, status string) (string, error) {

	params := internal.NewParams()
	params["pageSize"] = pageSize
	params["lastEndId"] = lastEndId
	params["status"] = status

	uri := constants.BrokerAccount + "/sub-list"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * broker modify sub info
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubModify(params broker.SubModifyReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.BrokerAccount + "/sub-modify"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * broker modify sub email
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubModifyEmail(params broker.SubModifyEmailReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.BrokerAccount + "/sub-modify-email"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * Get sub email
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubEmail(subUid string) (string, error) {

	params := internal.NewParams()
	params["subUid"] = subUid

	uri := constants.BrokerAccount + "/sub-email"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get sub spot assets
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubSpotAssets(subUid string) (string, error) {

	params := internal.NewParams()
	params["subUid"] = subUid

	uri := constants.BrokerAccount + "/sub-spot-assets"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get sub spot assets
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubFutureAssets(subUid string) (string, error) {

	params := internal.NewParams()
	params["subUid"] = subUid

	uri := constants.BrokerAccount + "/sub-future-assets"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * broker modify sub email
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubAddress(params broker.SubAddressReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.BrokerAccount + "/sub-address"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * broker sub withdrawal
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubWithdrawal(params broker.SubWithdrawalReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.BrokerAccount + "/sub-withdrawal"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}

/**
 * broker sub auto transfer
 * @return ResponseResult
 */
func (p *BrokerAccountClient) SubAutoTransfer(params broker.SubAutoTransferReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.BrokerAccount + "/sub-auto-transfer"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err

}
