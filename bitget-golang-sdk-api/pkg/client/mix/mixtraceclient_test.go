package mix

import (
	"bitget/pkg/model/mix/trace"
	"fmt"
	"testing"
)

func TestMixTraceClient_CloseTrackOrder(t *testing.T) {
	client := new(MixTraceClient).Init()
	req := trace.CloseTrackOrderReq{Symbol: "BTCUSDT_UMCBL", TrackingNo: "0"}

	resp, err := client.CloseTrackOrder(req)

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_CurrentTrack(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.CurrentTrack("BTCUSDT_UMCBL", "umcbl", "10", "1")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_HistoryTrack(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.HistoryTrack("", "", "10", "1")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_Summary(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.Summary()

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_ProfitSettleTokenIdGroup(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.ProfitSettleTokenIdGroup()

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_ProfitDateGroupList(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.ProfitDateGroupList("", "")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_ProfitDateList(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.ProfitDateList("USDT", "", "10", "1")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixTraceClient_WaitProfitDateList(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.WaitProfitDateList("10", "1")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
