package ws

import (
	"bitget/internal/model"
	"fmt"
	"testing"
)

func TestBitgetWsClient_New(t *testing.T) {

	client := new(BitgetWsClient).Init(false, func(message string) {
		fmt.Println("success:" + message)
	}, func(message string) {
		fmt.Println("error:" + message)
	})

	var channelsDef []model.SubscribeReq
	subReqDef1 := model.SubscribeReq{
		InstType: "UMCBL",
		Channel:  "account",
		InstId:   "default",
	}
	channelsDef = append(channelsDef, subReqDef1)
	client.SubscribeDef(channelsDef)

	var channels []model.SubscribeReq
	subReq1 := model.SubscribeReq{
		InstType: "UMCBL",
		Channel:  "account",
		InstId:   "default",
	}
	channels = append(channels, subReq1)
	client.Subscribe(channels, func(message string) {
		fmt.Println("appoint:" + message)
	})
	client.Connect()

}
