package mix

import (
	"bitget/constants"
	"bitget/internal"
	"bitget/internal/common"
)

type MixMarketClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixMarketClient) Init() *MixMarketClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

/**
 * Contract information
 * @param productType
 * @return ResponseResult
 */
func (p *MixMarketClient) Contracts(productType string) (string, error) {

	params := internal.NewParams()
	params["productType"] = productType

	uri := constants.MixMarket + "/contracts"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err

}

/**
 * Deep market
 * @param symbol
 * @param limit
 * @return ResponseResult
 */
func (p *MixMarketClient) Depth(symbol string, limit string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["limit"] = limit

	uri := constants.MixMarket + "/depth"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Acquisition of single ticker market
 * @param productType
 * @return ResponseResult
 */
func (p *MixMarketClient) Tickers(productType string) (string, error) {

	params := internal.NewParams()
	params["productType"] = productType

	uri := constants.MixMarket + "/tickers"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Deep market
 * @param symbol
 * @return ResponseResult
 */
func (p *MixMarketClient) Ticker(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixMarket + "/ticker"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Obtain transaction details
 * @param symbol
 * @param limit
 * @return ResponseResult
 */
func (p *MixMarketClient) Fills(symbol string, limit string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["limit"] = limit

	uri := constants.MixMarket + "/fills"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Obtain K line data
 * @param symbol
 * @param granularity (Category of k line)
 * @param startTime
 * @param endTime
 * @return ResponseResult
 */
func (p *MixMarketClient) Candles(symbol string, granularity string, startTime string, endTime string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	params["granularity"] = granularity
	params["startTime"] = startTime
	params["endTime"] = endTime

	uri := constants.MixMarket + "/candles"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
获取币种指数。
*/
func (p *MixMarketClient) Index(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixMarket + "/index"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Get the next settlement time of the contract
 * @param symbol
 * @return ResponseResult
 */
func (p *MixMarketClient) FundingTime(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixMarket + "/funding-time"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Get contract tag price
 * @param symbol
 * @return ResponseResult
 */
func (p *MixMarketClient) MarkPrice(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixMarket + "/mark-price"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Get historical fund rate
 * @param symbol
 * @param pageSize
 * @param pageNo
 * @param nextPage
 * @return ResponseResult
 */
func (p *MixMarketClient) HistoryFundRate(symbol string, pageSize string, pageNo string, nextPage string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol
	if len(pageSize) > 0 {
		params["pageSize"] = pageSize
	}
	if len(pageNo) > 0 {
		params["pageNo"] = pageNo
	}
	if len(nextPage) > 0 {
		params["nextPage"] = nextPage
	}

	uri := constants.MixMarket + "/history-fundRate"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Get the current fund rate
 * @param symbol
 * @return ResponseResult
 */
func (p *MixMarketClient) CurrentFundRate(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixMarket + "/current-fundRate"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}

/**
 * Obtain the total position of the platform
 * @param symbol
 * @return ResponseResult
 */
func (p *MixMarketClient) OpenInterest(symbol string) (string, error) {

	params := internal.NewParams()
	params["symbol"] = symbol

	uri := constants.MixMarket + "/open-interest"

	resp, err := p.BitgetRestClient.DoGet(uri, params)

	return resp, err
}
