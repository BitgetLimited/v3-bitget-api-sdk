# Bitget Go

This is a lightweight library that works as a connector to [Bitget API](https://bitgetlimited.github.io/apidoc/en/mix/)

## Supported API Endpoints:
- pkg/client/v1: `*client.go`
- pkg/client/v2: `*client.go`
- pkg/client/ws: `bitgetwsclient.go`


## Installation
```shell
git clone git@github.com:BitgetLimited/v3-bitget-api-sdk.git
```

## REST API Demo
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

func Test_post(t *testing.T) {
  client := new(client.BitgetApiClient).Init()

  params := internal.NewParams()
  params["symbol"] = "BTCUSDT_UMCBL"
  params["marginCoin"] = "USDT"
  params["side"] = "open_long"
  params["orderType"] = "limit"
  params["price"] = "27012"
  params["size"] = "0.01"
  params["timInForceValue"] = "normal"

  resp, err := client.Post("/api/mix/v1/order/placeOrder", params)
  if err != nil {
    println(err.Error())
  }
  fmt.Println(resp)
}

func Test_get(t *testing.T) {
  client := new(client.BitgetApiClient).Init()

  params := internal.NewParams()
  params["productType"] = "umcbl"

  resp, err := client.Get("/api/mix/v1/account/accounts", params)
  if err != nil {
    println(err.Error())
  }
  fmt.Println(resp)
}

func Test_get_with_params(t *testing.T) {
  client := new(client.BitgetApiClient).Init()

  params := internal.NewParams()

  resp, err := client.Get("/api/spot/v1/account/getInfo", params)
  if err != nil {
    println(err.Error())
  }
  fmt.Println(resp)
}
```

## Websocket Demo
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

## RSA
If your apikey is of RSA type, actively set the signature type to RSA
```go
// config.go
const (
	BaseUrl = "https://api.bitget.com"
	WsUrl   = "wss://ws.bitget.com/mix/v1/stream"

	ApiKey        = ""
	SecretKey     = "" // If it is RSA type, set the RSA private key
	PASSPHRASE    = ""
	TimeoutSecond = 30 
	SignType      = constants.RSA // If your apikey is of RSA type, actively set the signature type to RSA
)
```
