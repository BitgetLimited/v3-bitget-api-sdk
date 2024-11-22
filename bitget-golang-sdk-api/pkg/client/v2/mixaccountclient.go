package v2

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
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/account/account", params)
	return resp, err
}

func (p *MixAccountClient) Accounts(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/account/accounts", params)
	return resp, err
}

func (p *MixAccountClient) SetLeverage(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/account/set-leverage", postBody)
	return resp, err
}

func (p *MixAccountClient) SetMargin(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/account/set-margin", postBody)
	return resp, err
}

func (p *MixAccountClient) SetMarginMode(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/account/set-margin-mode", postBody)
	return resp, err
}

// position
func (p *MixAccountClient) SetPositionMode(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v2/mix/account/set-position-mode", postBody)
	return resp, err
}

func (p *MixAccountClient) SinglePosition(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/position/single-position", params)
	return resp, err
}

func (p *MixAccountClient) AllPosition(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v2/mix/position/all-position", params)
	return resp, err
}
