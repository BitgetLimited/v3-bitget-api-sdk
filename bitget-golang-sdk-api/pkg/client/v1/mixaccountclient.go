package v1

import (
	"bitget/internal"
	"bitget/internal/common"
)

type MixAccountClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *MixAccountClient) Init() *MixAccountClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

func (p *MixAccountClient) Account(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/account/account", params)
	return resp, err
}

func (p *MixAccountClient) Accounts(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/account/accounts", params)
	return resp, err
}

func (p *MixAccountClient) SetLeverage(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/account/setLeverage", postBody)
	return resp, err
}

func (p *MixAccountClient) SetMargin(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/account/setMargin", postBody)
	return resp, err
}

func (p *MixAccountClient) SetMarginMode(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/account/setMarginMode", postBody)
	return resp, err
}

func (p *MixAccountClient) SetPositionMode(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/mix/v1/account/setPositionMode", postBody)
	return resp, err
}

// position
func (p *MixAccountClient) SinglePosition(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/position/singlePosition", params)
	return resp, err
}

func (p *MixAccountClient) AllPosition(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/mix/v1/position/allPosition", params)
	return resp, err
}
