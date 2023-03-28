package mix

import (
	"bitget/pkg/model/mix/trace"
	"bytes"
	"fmt"
	"hash/crc32"
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

func TestMixTraceClient_FollowerHistoryOrders(t *testing.T) {
	crc32BaseBuffer := bytes.Buffer{}
	crc32BaseBuffer.WriteString("63249.5:15.499:63251.5:0.594:63248.5:0.811:63252.5:1.249:63246.5:4.255:63255.5:0.519:63245.5:5.336:63256.5:3.283:63243.5:10.800:63257.5:16.313:63242.5:2.443:63260.0:0.527:63241.5:1.067:63261.0:0.511:63240.5:0.519:63261.5:0.529:63239.5:1.044:63262.5:0.509:63238.5:0.548:63263.0:0.543:63237.5:48.015:63264.5:1.275:63237.0:0.534:63265.5:0.512:63236.5:0.002:63266.5:1.080:63236.0:0.516:63268.5:0.528:63235.5:5.945:63269.0:1.431:63234.0:7.138:63269.5:0.951:63233.5:0.036:63270.0:0.511:63232.5:4.898:63270.5:0.772:63231.5:1.620:63271.0:7.414:63230.0:8.888:63271.5:0.522:63229.5:2.527:63272.5:13.025:63228.5:0.502:63273.0:0.713:63227.5:0.521:63273.5:10.173:63226.5:6.480:63274.0:0.540:63225.0:0.545:63274.5:0.643")

	i := int32(crc32.ChecksumIEEE(crc32BaseBuffer.Bytes()))
	fmt.Println(i)
}

func TestMixTraceClient_followerOrder(t *testing.T) {
	client := new(MixTraceClient).Init()

	resp, err := client.followerOrder("BTCUSDT_UMCBL", "umcbl", "10", "1")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
