package spot

import (
	"bitget/pkg/model/spot/plan"
	"fmt"
	"testing"
)

func TestSpotPlanClient_PlacePlan(t *testing.T) {
	client := new(SpotPlanClient).Init()

	req := plan.SpotPlanReq{
		Symbol:           "BTCUSDT_SPBL",
		Side:             "buy",
		TriggerPrice:     "22031",
		ExecutePrice:     "22031",
		Size:             "100",
		TriggerType:      "market_price",
		OrderType:        "market",
		TimeInForceValue: "normal",
	}

	resp, err := client.PlacePlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPlanClient_ModifyPlan(t *testing.T) {
	client := new(SpotPlanClient).Init()

	req := plan.SpotModifyPlanReq{
		OrderId:      "987136018723487744",
		TriggerPrice: "16000",
		ExecutePrice: "16000",
		Size:         "50",
		OrderType:    "market",
	}

	resp, err := client.ModifyPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPlanClient_CancelPlan(t *testing.T) {
	client := new(SpotPlanClient).Init()

	req := plan.SpotCancelPlanReq{
		OrderId: "987136018723487744",
	}

	resp, err := client.CancelPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPlanClient_CurrentPlan(t *testing.T) {
	client := new(SpotPlanClient).Init()

	req := plan.SpotQueryPlanReq{
		Symbol:   "BTCUSDT_SPBL",
		PageSize: "5",
	}

	resp, err := client.CurrentPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPlanClient_HistoryPlan(t *testing.T) {
	client := new(SpotPlanClient).Init()

	req := plan.SpotQueryPlanReq{
		Symbol:    "BTCUSDT_SPBL",
		PageSize:  "5",
		StartTime: "1671005531000",
		EndTime:   "16710856520005",
	}

	resp, err := client.HistoryPlan(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
