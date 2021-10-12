package spot

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
)

type SpotPublicClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotPublicClient) Init() *SpotPublicClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
单个币种账户信息
symbol:
marginCoin:
*/
func (p *SpotPublicClient) Time() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotPublic + "/time"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
单个币种账户信息
symbol:
marginCoin:
*/
func (p *SpotPublicClient) Currencies() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotPublic + "/currencies"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
单个币种账户信息
symbol:
marginCoin:
*/
func (p *SpotPublicClient) Products() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotPublic + "/products"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
单个币种账户信息
symbol:
marginCoin:
*/
func (p *SpotPublicClient) Product(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	uri := constants.SpotPublic + "/product"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}
