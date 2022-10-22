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
 * Get server time
 * @return ResponseResult
 */
func (p *SpotPublicClient) Time() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotPublic + "/time"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Basic information of currency
 * @return ResponseResult
 */
func (p *SpotPublicClient) Currencies() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotPublic + "/currencies"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Get all product information
 * @return ResponseResult
 */
func (p *SpotPublicClient) Products() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotPublic + "/products"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Get single product information
 * @param symbol
 * @return ResponseResult
 */
func (p *SpotPublicClient) Product(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	uri := constants.SpotPublic + "/product"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}
