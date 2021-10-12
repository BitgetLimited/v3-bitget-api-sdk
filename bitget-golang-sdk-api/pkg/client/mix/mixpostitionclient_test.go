package mix

import (
	"fmt"
	"testing"
)

func TestMixPositionClient_SinglePosition(t *testing.T) {
	client := new(MixPositionClient).Init()

	resp, err := client.SinglePosition("BTCUSDT_UMCBL", "USDT")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixPositionClient_AllPosition(t *testing.T) {
	client := new(MixPositionClient).Init()

	resp, err := client.AllPosition("umcbl", "USDT")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
