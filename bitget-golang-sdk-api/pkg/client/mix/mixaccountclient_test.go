package mix

import (
	"bitget/pkg/model/mix/account"
	"fmt"
	"testing"
)

func TestMixAccountClient_GetAccount(t *testing.T) {
	client := new(MixAccountClient).Init()
	resp, err := client.Account("BTCUSDT_UMCBL", "USDT")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixAccountClient_GetAccounts(t *testing.T) {
	client := new(MixAccountClient).Init()
	resp, err := client.Accounts("umcbl")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
func TestMixAccountClient_SetLeverage(t *testing.T) {
	client := new(MixAccountClient).Init()
	req := account.SetLeveragerReq{Symbol: "BTCUSDT_UMCBL", MarginCoin: "USDT", Leverage: "10"}

	resp, err := client.SetLeverage(req)

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixAccountClient_SetMargin(t *testing.T) {
	client := new(MixAccountClient).Init()
	req := account.SetMarginReq{Symbol: "BTCUSDT_UMCBL", MarginCoin: "USDT", HoldSide: "long", Amount: "10"}

	resp, err := client.SetMargin(req)

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
func TestMixAccountClient_SetMarginMode(t *testing.T) {
	client := new(MixAccountClient).Init()
	req := account.SetMarginModeReq{Symbol: "BTCUSDT_UMCBL", MarginCoin: "USDT", MarginMode: "fixed"}

	resp, err := client.SetMarginMode(req)

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixAccountClient_OpenCount(t *testing.T) {
	client := new(MixAccountClient).Init()
	req := account.OpenCountReq{Symbol: "BTCUSDT_UMCBL", MarginCoin: "USDT", OpenPrice: "3000", OpenAmount: "99999", Leverage: "20"}

	resp, err := client.OpenCount(req)

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
