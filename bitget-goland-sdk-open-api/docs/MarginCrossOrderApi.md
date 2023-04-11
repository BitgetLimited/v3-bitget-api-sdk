# \MarginCrossOrderApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginCrossBatchCancelOrder**](MarginCrossOrderApi.md#MarginCrossBatchCancelOrder) | **Post** /api/margin/v1/cross/order/batchCancelOrder | batchCancelOrder
[**MarginCrossBatchPlaceOrder**](MarginCrossOrderApi.md#MarginCrossBatchPlaceOrder) | **Post** /api/margin/v1/cross/order/batchPlaceOrder | batchPlaceOrder
[**MarginCrossCancelOrder**](MarginCrossOrderApi.md#MarginCrossCancelOrder) | **Post** /api/margin/v1/cross/order/cancelOrder | cancelOrder
[**MarginCrossFills**](MarginCrossOrderApi.md#MarginCrossFills) | **Get** /api/margin/v1/cross/order/fills | fills
[**MarginCrossHistoryOrders**](MarginCrossOrderApi.md#MarginCrossHistoryOrders) | **Get** /api/margin/v1/cross/order/history | history
[**MarginCrossOpenOrders**](MarginCrossOrderApi.md#MarginCrossOpenOrders) | **Get** /api/margin/v1/cross/order/openOrders | openOrders
[**MarginCrossPlaceOrder**](MarginCrossOrderApi.md#MarginCrossPlaceOrder) | **Post** /api/margin/v1/cross/order/placeOrder | placeOrder



## MarginCrossBatchCancelOrder

> ApiResponseResultOfMarginBatchCancelOrderResult MarginCrossBatchCancelOrder(ctx).MarginBatchCancelOrderRequest(marginBatchCancelOrderRequest).Execute()

batchCancelOrder



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    marginBatchCancelOrderRequest := *openapiclient.NewMarginBatchCancelOrderRequest("BTCUSDT_SPBL") // MarginBatchCancelOrderRequest | marginBatchCancelOrderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossBatchCancelOrder(context.Background()).MarginBatchCancelOrderRequest(marginBatchCancelOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossBatchCancelOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossBatchCancelOrder`: ApiResponseResultOfMarginBatchCancelOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossBatchCancelOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossBatchCancelOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginBatchCancelOrderRequest** | [**MarginBatchCancelOrderRequest**](MarginBatchCancelOrderRequest.md) | marginBatchCancelOrderRequest | 

### Return type

[**ApiResponseResultOfMarginBatchCancelOrderResult**](ApiResponseResultOfMarginBatchCancelOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossBatchPlaceOrder

> ApiResponseResultOfMarginBatchPlaceOrderResult MarginCrossBatchPlaceOrder(ctx).MarginOrderRequest(marginOrderRequest).Execute()

batchPlaceOrder



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    marginOrderRequest := *openapiclient.NewMarginBatchOrdersRequest("BTCUSDT_SPBL") // MarginBatchOrdersRequest | marginOrderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossBatchPlaceOrder(context.Background()).MarginOrderRequest(marginOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossBatchPlaceOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossBatchPlaceOrder`: ApiResponseResultOfMarginBatchPlaceOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossBatchPlaceOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossBatchPlaceOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginOrderRequest** | [**MarginBatchOrdersRequest**](MarginBatchOrdersRequest.md) | marginOrderRequest | 

### Return type

[**ApiResponseResultOfMarginBatchPlaceOrderResult**](ApiResponseResultOfMarginBatchPlaceOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossCancelOrder

> ApiResponseResultOfMarginBatchCancelOrderResult MarginCrossCancelOrder(ctx).MarginCancelOrderRequest(marginCancelOrderRequest).Execute()

cancelOrder



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    marginCancelOrderRequest := *openapiclient.NewMarginCancelOrderRequest("BTCUSDT_SPBL") // MarginCancelOrderRequest | marginCancelOrderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossCancelOrder(context.Background()).MarginCancelOrderRequest(marginCancelOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossCancelOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossCancelOrder`: ApiResponseResultOfMarginBatchCancelOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossCancelOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossCancelOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginCancelOrderRequest** | [**MarginCancelOrderRequest**](MarginCancelOrderRequest.md) | marginCancelOrderRequest | 

### Return type

[**ApiResponseResultOfMarginBatchCancelOrderResult**](ApiResponseResultOfMarginBatchCancelOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossFills

> ApiResponseResultOfMarginTradeDetailInfoResult MarginCrossFills(ctx).Symbol(symbol).StartTime(startTime).Source(source).EndTime(endTime).OrderId(orderId).LastFillId(lastFillId).PageSize(pageSize).Execute()

fills



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    symbol := "BTCUSDT" // string | symbol
    startTime := "1678193338000" // string | startTime
    source := "API" // string | source (optional)
    endTime := "1678193338000" // string | endTime (optional)
    orderId := "32428347234" // string | orderId (optional)
    lastFillId := "lastFillId_example" // string | lastFillId (optional)
    pageSize := "10" // string | pageSize (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossFills(context.Background()).Symbol(symbol).StartTime(startTime).Source(source).EndTime(endTime).OrderId(orderId).LastFillId(lastFillId).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossFills``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossFills`: ApiResponseResultOfMarginTradeDetailInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossFills`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossFillsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 
 **startTime** | **string** | startTime | 
 **source** | **string** | source | 
 **endTime** | **string** | endTime | 
 **orderId** | **string** | orderId | 
 **lastFillId** | **string** | lastFillId | 
 **pageSize** | **string** | pageSize | 

### Return type

[**ApiResponseResultOfMarginTradeDetailInfoResult**](ApiResponseResultOfMarginTradeDetailInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossHistoryOrders

> ApiResponseResultOfMarginOpenOrderInfoResult MarginCrossHistoryOrders(ctx).Symbol(symbol).StartTime(startTime).Source(source).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).MinId(minId).PageSize(pageSize).Execute()

history



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    symbol := "BTCUSDT" // string | symbol
    startTime := "1678193338000" // string | startTime
    source := "API" // string | source (optional)
    endTime := "1678193338000" // string | endTime (optional)
    orderId := "32428347234" // string | orderId (optional)
    clientOid := "123456" // string | clientOid (optional)
    minId := "minId_example" // string | minId (optional)
    pageSize := "10" // string | pageSize (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossHistoryOrders(context.Background()).Symbol(symbol).StartTime(startTime).Source(source).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).MinId(minId).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossHistoryOrders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossHistoryOrders`: ApiResponseResultOfMarginOpenOrderInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossHistoryOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossHistoryOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 
 **startTime** | **string** | startTime | 
 **source** | **string** | source | 
 **endTime** | **string** | endTime | 
 **orderId** | **string** | orderId | 
 **clientOid** | **string** | clientOid | 
 **minId** | **string** | minId | 
 **pageSize** | **string** | pageSize | 

### Return type

[**ApiResponseResultOfMarginOpenOrderInfoResult**](ApiResponseResultOfMarginOpenOrderInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossOpenOrders

> ApiResponseResultOfMarginOpenOrderInfoResult MarginCrossOpenOrders(ctx).Symbol(symbol).StartTime(startTime).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).PageSize(pageSize).Execute()

openOrders



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    symbol := "BTCUSDT" // string | symbol
    startTime := "1678193338000" // string | startTime
    endTime := "1678193338000" // string | endTime (optional)
    orderId := "32428347234" // string | orderId (optional)
    clientOid := "123456" // string | clientOid (optional)
    pageSize := "10" // string | pageSize (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossOpenOrders(context.Background()).Symbol(symbol).StartTime(startTime).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossOpenOrders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossOpenOrders`: ApiResponseResultOfMarginOpenOrderInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossOpenOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossOpenOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 
 **startTime** | **string** | startTime | 
 **endTime** | **string** | endTime | 
 **orderId** | **string** | orderId | 
 **clientOid** | **string** | clientOid | 
 **pageSize** | **string** | pageSize | 

### Return type

[**ApiResponseResultOfMarginOpenOrderInfoResult**](ApiResponseResultOfMarginOpenOrderInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossPlaceOrder

> ApiResponseResultOfMarginPlaceOrderResult MarginCrossPlaceOrder(ctx).MarginOrderRequest(marginOrderRequest).Execute()

placeOrder



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    marginOrderRequest := *openapiclient.NewMarginOrderRequest("normal/autoLoan/autoRepay", "limit/market", "sell/buy", "BTCUSDT_SPBL") // MarginOrderRequest | marginOrderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossOrderApi.MarginCrossPlaceOrder(context.Background()).MarginOrderRequest(marginOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossOrderApi.MarginCrossPlaceOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossPlaceOrder`: ApiResponseResultOfMarginPlaceOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossOrderApi.MarginCrossPlaceOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossPlaceOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginOrderRequest** | [**MarginOrderRequest**](MarginOrderRequest.md) | marginOrderRequest | 

### Return type

[**ApiResponseResultOfMarginPlaceOrderResult**](ApiResponseResultOfMarginPlaceOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

