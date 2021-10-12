package spot

import (
	"bitget/pkg/model/spot/order"
	"fmt"
	"testing"
)

func TestSpotOrderClient_Orders(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.OrdersReq{
		Symbol:    "bftusdt_spbl",
		Price:     "2.68111",
		Quantity:  "10",
		Side:      "buy",
		OrderType: "limit",
		Force:     "normal",
	}

	resp, err := client.Orders(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_BatchOrders(t *testing.T) {
	client := new(SpotOrderClient).Init()

	oneOrder := order.SpotOrdersReq{
		Price:         "2.60222",
		Quantity:      "1",
		Side:          "buy",
		OrderType:     "limit",
		Force:         "normal",
		ClientOrderId: "spot#1625039618000",
	}

	towOrder := order.SpotOrdersReq{
		Price:         "2.60111",
		Quantity:      "1",
		Side:          "buy",
		OrderType:     "limit",
		Force:         "normal",
		ClientOrderId: "spot#1625039618122",
	}

	var params []order.SpotOrdersReq
	params = append(params, oneOrder)
	params = append(params, towOrder)

	req := order.BatchOrdersReq{
		OrderList: params,
		Symbol:    "BTCUSDT_SPBL",
	}

	resp, err := client.BatchOrders(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_CancelOrder(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.CancelOrderReq{
		Symbol:  "bftusdt_spbl",
		OrderId: "213123",
	}

	resp, err := client.CancelOrder(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_CancelBatchOrders(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.CancelBatchOrdersReq{
		Symbol:   "bftusdt_spbl",
		OrderIds: []string{"213123", "213123"},
	}

	resp, err := client.CancelBatchOrders(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_OrderInfo(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.OrderInfoReq{
		OrderId: "123",
	}

	resp, err := client.OrderInfo(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_OpenOrders(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.OpenOrdersReq{
		Symbol: "bftusdt_spbl",
	}

	resp, err := client.OpenOrders(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_History(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.HistoryReq{
		Symbol: "bftusdt_spbl",
		Limit:  "100",
	}

	resp, err := client.History(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotOrderClient_Fills(t *testing.T) {
	client := new(SpotOrderClient).Init()

	req := order.FillsReq{
		Symbol: "bftusdt_spbl",
	}

	resp, err := client.Fills(req)
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
