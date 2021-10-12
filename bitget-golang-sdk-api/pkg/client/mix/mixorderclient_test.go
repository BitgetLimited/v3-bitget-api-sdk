package mix

import (
	"bitget/internal"
	"bitget/pkg/model/mix/order"
	"fmt"
	"testing"
)

func TestMixOrderClient_PlaceOrder(t *testing.T) {
	client := new(MixOrderClient).Init()

	req := order.PlaceOrderReq{
		ClientOid:        internal.TimesStamp(),
		Symbol:           "SBTCSUSDT_SUMCBL",
		Price:            "44067.0",
		Size:             "1",
		MarginCoin:       "SUSDT",
		Side:             "open_long",
		TimeInForceValue: "normal",
		OrderType:        "limit",
	}

	resp, err := client.PlaceOrder(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_BatchOrders(t *testing.T) {
	client := new(MixOrderClient).Init()

	oneOrder := order.PlaceOrderBaseParam{
		ClientOid:        internal.TimesStamp(),
		Size:             "1",
		Side:             "open_long",
		OrderType:        "limit",
		Price:            "23789.30",
		TimeInForceValue: "normal",
	}

	towOrder := order.PlaceOrderBaseParam{
		ClientOid:        internal.TimesStamp(),
		Size:             "1",
		Side:             "open_long",
		OrderType:        "limit",
		Price:            "23888.30",
		TimeInForceValue: "normal",
	}

	var params []order.PlaceOrderBaseParam
	params = append(params, oneOrder)
	params = append(params, towOrder)

	req := order.BatchOrdersReq{
		OrderDataList: params,
		Symbol:        "SBTCSUSDT_SUMCBL",
		MarginCoin:    "SUSDT",
	}

	resp, err := client.BatchOrders(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_CancelOrder(t *testing.T) {
	client := new(MixOrderClient).Init()

	req := order.CancelOrderReq{
		Symbol:     "SBTCSUSDT_SUMCBL",
		MarginCoin: "SUSDT",
		OrderId:    "811489712408248322",
	}
	resp, err := client.CancelOrder(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_CancelBatchOrders(t *testing.T) {
	client := new(MixOrderClient).Init()

	req := order.CancelBatchOrdersReq{
		Symbol:     "SBTCSUSDT_SUMCBL",
		MarginCoin: "SUSDT",
		OrderIds:   []string{"811489712408248322"},
	}
	resp, err := client.CancelBatchOrders(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_History(t *testing.T) {
	client := new(MixOrderClient).Init()
	resp, err := client.History("SBTCSUSDT_SUMCBL", "1629113823000", "1629513368000", "20", "", "false")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_Current(t *testing.T) {
	client := new(MixOrderClient).Init()
	resp, err := client.Current("SBTCSUSDT_SUMCBL")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_Detail(t *testing.T) {
	client := new(MixOrderClient).Init()
	resp, err := client.Detail("SBTCSUSDT_SUMCBL", "811489712408248322")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixOrderClient_Fills(t *testing.T) {
	client := new(MixOrderClient).Init()
	resp, err := client.Fills("SBTCSUSDT_SUMCBL", "811489712408248322")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
