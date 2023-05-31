package spot

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
	"bitget/pkg/model/spot/wallet"
)

type SpotWalletClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotWalletClient) Init() *SpotWalletClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * withdrawal
 * @param BillsReq
 * @return ResponseResult
 */
func (p *SpotWalletClient) withdrawal(params wallet.WithdrawalReq) (string, error) {

	postBody, jsonErr := internal.ToJson(params)

	if jsonErr != nil {
		return "", jsonErr
	}

	uri := constants.SpotWallet + "/withdrawal"

	resp, err := p.BitgetRestClient.DoPost(uri, postBody)

	return resp, err
}
