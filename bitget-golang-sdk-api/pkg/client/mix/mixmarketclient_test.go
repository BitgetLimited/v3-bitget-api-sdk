package mix

import (
	"fmt"
	"testing"
)

func TestMixMarketClient_Contracts(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Contracts("sdmcbl")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_Depth(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Depth("BTCUSDT_UMCBL", "20")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_Ticker(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Ticker("BTCUSDT_UMCBL")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_Tickers(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Tickers("sdmcbl")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_Fills(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Fills("BTCUSDT_UMCBL", "20")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_Candles(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Candles("BTCUSDT_UMCBL", "60", "1629177891000", "1629181491000")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_Index(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.Index("BTCUSDT_UMCBL")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_FundingTime(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.FundingTime("BTCUSDT_UMCBL")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_HistoryFundRate(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.HistoryFundRate("BTCUSDT_UMCBL", "10", "1", "true")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_CurrentFundRate(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.CurrentFundRate("BTCUSDT_UMCBL")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_OpenInterest(t *testing.T) {
	client := new(MixMarketClient).Init()

	resp, err := client.OpenInterest("BTCUSDT_UMCBL")

	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestMixMarketClient_MarkPrice(t *testing.T) {

}
