package mix

import (
	"bitget/internal"
	"bitget/pkg/model/mix/plan"
	"fmt"
	"testing"
)

func TestMixPlanClient_PlacePlan(t *testing.T) {
	client := new(MixPlanClient).Init()

	req := plan.PlacePlanReq{
		Symbol:       "BTCUSDT_UMCBL",
		MarginCoin:   "USDT",
		ClientOid:    internal.TimesStamp(),
		TriggerPrice: "45000.3",
		ExecutePrice: "38923.1",
		Size:         "1",
		Side:         "open_long",
		OrderType:    "limit",
		TriggerType:  "fill_price",
	}
	resp, err := client.PlacePlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_ModifyPlan(t *testing.T) {
	client := new(MixPlanClient).Init()

	req := plan.ModifyPlanReq{
		OrderId:      "826353122748112896",
		Symbol:       "BTCUSDT_UMCBL",
		TriggerPrice: "55000.0",
		ExecutePrice: "38923.1",
		MarginCoin:   "USDT",
		TriggerType:  "fill_price",
		OrderType:    "limit",
	}
	resp, err := client.ModifyPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_ModifyPlanPreset(t *testing.T) {
	client := new(MixPlanClient).Init()

	req := plan.ModifyPlanPresetReq{
		OrderId:             "826353122748112896",
		Symbol:              "BTCUSDT_UMCBL",
		MarginCoin:          "USDT",
		PresetStopLossPrice: "66000.01",
	}
	resp, err := client.ModifyPlanPreset(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_PlaceTPSL(t *testing.T) {
	client := new(MixPlanClient).Init()

	req := plan.PlaceTPSLReq{
		Symbol:       "BTCUSDT_UMCBL",
		MarginCoin:   "USDT",
		PlanType:     "profit_plan",
		TriggerPrice: "30000.01",
		HoldSide:     "short",
	}
	resp, err := client.PlaceTPSL(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_ModifyTPSLPlan(t *testing.T) {
	client := new(MixPlanClient).Init()

	req := plan.ModifyTPSLPlanReq{
		Symbol:       "BTCUSDT_UMCBL",
		MarginCoin:   "USDT",
		TriggerPrice: "30000.01",
		OrderId:      "826353122748112896",
	}
	resp, err := client.ModifyTPSLPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_CancelPlan(t *testing.T) {
	client := new(MixPlanClient).Init()

	req := plan.CancelPlanReq{
		Symbol:     "BTCUSDT_UMCBL",
		MarginCoin: "USDT",
		OrderId:    "826353122748112896",
		PlanType:   "normal_plan",
	}
	resp, err := client.CancelPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_CurrentPlan(t *testing.T) {
	client := new(MixPlanClient).Init()

	resp, err := client.CurrentPlan("BTCUSDT_UMCBL", "plan")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPlanClient_HistoryPlan(t *testing.T) {
	client := new(MixPlanClient).Init()

	resp, err := client.HistoryPlan("BTCUSDT_UMCBL", "1627210955000", "1627383755000", "100", "false", "plan")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
