package v1

import (
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

func (p *SpotMarketClient) Currencies() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/public/currencies", params)
	return resp, err
}

func (p *SpotMarketClient) Products(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/public/products", params)
	return resp, err
}

func (p *SpotMarketClient) Product(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/public/product", params)
	return resp, err
}

func (p *SpotMarketClient) Fills(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/market/fills", params)
	return resp, err
}

func (p *SpotMarketClient) Depth(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/market/depth", params)
	return resp, err
}

func (p *SpotMarketClient) Tickers(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/market/tickers", params)
	return resp, err
}

func (p *SpotMarketClient) Ticker(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/market/ticker", params)
	return resp, err
}

func (p *SpotMarketClient) Candles(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/spot/v1/market/candles", params)
	return resp, err
}
