# Bitget Go

使用此sdk前请阅读api文档 [Bitget API](https://bitgetlimited.github.io/apidoc/en/mix/)

## Supported API Endpoints:
- pkg/v1: `*client.go`
- pkg/v2: `*client.go`
- pkg/ws: `bitgetwsclient.go`


## 下载
```shell
git clone  git@github.com:BitgetLimited/v3-bitget-api-sdk.git
```

## REST API

Create an order example

```go
package test

import (
  "bitget/internal"
  "bitget/pkg/client"
  "bitget/pkg/client/v1"
  "fmt"
  "testing"
)

func Test_PlaceOrder(t *testing.T) {
  client := new(v1.MixOrderClient).Init()

  params := internal.NewParams()
  params["symbol"] = "BTCUSDT_UMCBL"
  params["marginCoin"] = "USDT"
  params["side"] = "open_long"
  params["orderType"] = "limit"
  params["price"] = "27012"
  params["size"] = "0.01"
  params["timInForceValue"] = "normal"

  resp, err := client.PlaceOrder(params)
  if err != nil {
    println(err.Error())
  }
  fmt.Println(resp)
}
```

Please find more examples for each supported endpoint in the `test` folder.

## Websocket Stream


```go
package test

import (
  "bitget/internal/model"
  "bitget/pkg/client/ws"
  "fmt"
  "testing"
)

func TestBitgetWsClient_New(t *testing.T) {

  client := new(ws.BitgetWsClient).Init(true, func(message string) {
    fmt.Println("default error:" + message)
  }, func(message string) {
    fmt.Println("default error:" + message)
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

```

Combined Diff. Depth Stream Example

```go
package main

import (
	"fmt"
	"time"

	binance_connector "github.com/binance/binance-connector-go"
)

func main() {
	// Set isCombined parameter to true as we are using Combined Depth Stream
	websocketStreamClient := binance_connector.NewWebsocketStreamClient(true)

	wsCombinedDepthHandler := func(event *binance_connector.WsDepthEvent) {
		fmt.Println(binance_connector.PrettyPrint(event))
	}
	errHandler := func(err error) {
		fmt.Println(err)
	}
	// Use WsCombinedDepthServe to subscribe to multiple streams
	doneCh, stopCh, err := websocketStreamClient.WsCombinedDepthServe([]string{"LTCBTC", "BTCUSDT", "MATICUSDT"}, wsCombinedDepthHandler, errHandler)
	if err != nil {
		fmt.Println(err)
		return
	}
	go func() {
		time.Sleep(5 * time.Second)
		stopCh <- struct{}{}
	}()
	<-doneCh
}
```

## Websocket API

```go
func OCOHistoryExample() {
	// Initialise Websocket API Client
	client := binance_connector.NewWebsocketAPIClient("api_key", "secret_key")
	// Connect to Websocket API
	err := client.Connect()
	if err != nil {
		log.Printf("Error: %v", err)
		return
	}
	defer client.Close()

	// Send request to Websocket API
	response, err := client.NewAccountOCOHistoryService().Do(context.Background())
	if err != nil {
		log.Printf("Error: %v", err)
		return
	}

	// Print the response
	fmt.Println(binance_connector.PrettyPrint(response))

	client.WaitForCloseSignal()
}
```

## 域名
- Binance provides alternative Production URLs in case of performance issues:
    - https://api.bitget.com

