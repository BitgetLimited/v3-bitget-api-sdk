package spot

import (
	"fmt"
	"testing"
)

func TestSpotMarketClient_Fills(t *testing.T) {
	client := new(SpotMarketClient).Init()

	resp, err := client.Fills("btcusdt_spbl")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotMarketClient_Depth(t *testing.T) {
	client := new(SpotMarketClient).Init()

	resp, err := client.Depth("btcusdt_spbl", "10", "")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotMarketClient_Ticker(t *testing.T) {
	client := new(SpotMarketClient).Init()

	resp, err := client.Ticker("btcusdt_spbl")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotMarketClient_Tickers(t *testing.T) {
	client := new(SpotMarketClient).Init()

	resp, err := client.Tickers()

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotMarketClient_Candles(t *testing.T) {
	client := new(SpotMarketClient).Init()

	resp, err := client.Candles("btcusdt_spbl", "1min", "1624929806000", "1624933406000", "50")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
