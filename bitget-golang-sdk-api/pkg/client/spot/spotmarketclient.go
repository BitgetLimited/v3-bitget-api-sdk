package spot

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
)

type SpotMarketClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *SpotMarketClient) Init() *SpotMarketClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * Obtain transaction data
 * @param symbol
 * @param limit
 * @return ResponseResult
 */
func (p *SpotMarketClient) Fills(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	uri := constants.SpotMarket + "/fills"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get depth data
 * @param symbol
 * @param limit
 * @param tp
 * @return ResponseResult
 */
func (p *SpotMarketClient) Depth(symbol string, limit string, tp string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	if len(limit) > 0 {
		params["limit"] = limit
	}
	if len(tp) > 0 {
		params["type"] = tp
	}

	uri := constants.SpotMarket + "/depth"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get a Ticker Information
 * @param symbol
 * @return ResponseResult
 */
func (p *SpotMarketClient) Ticker(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.SpotMarket + "/ticker"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Get all Ticker information
 * @return ResponseResult
 */
func (p *SpotMarketClient) Tickers() (string, error) {

	params := internal.NewParams()

	uri := constants.SpotMarket + "/tickers"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Obtain K line data
 * @param symbol
 * @param period (Time unit and granularity of K line (refer to the following list for values))
 * @param after
 * @param before
 * @param limit
 * @return ResponseResult
 */
func (p *SpotMarketClient) Candles(symbol string, period string, after string, before string, limit string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["period"] = period
	if len(after) > 0 {
		params["after"] = after
	}
	if len(before) > 0 {
		params["before"] = before
	}
	if len(limit) > 0 {
		params["limit"] = limit
	}
	uri := constants.SpotMarket + "/candles"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}
