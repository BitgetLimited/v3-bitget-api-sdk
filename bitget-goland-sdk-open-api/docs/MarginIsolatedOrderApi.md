# \MarginIsolatedOrderApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginIsolatedBatchCancelOrder**](MarginIsolatedOrderApi.md#MarginIsolatedBatchCancelOrder) | **Post** /api/margin/v1/isolated/order/batchCancelOrder | batchCancelOrder
[**MarginIsolatedBatchPlaceOrder**](MarginIsolatedOrderApi.md#MarginIsolatedBatchPlaceOrder) | **Post** /api/margin/v1/isolated/order/batchPlaceOrder | batchPlaceOrder
[**MarginIsolatedCancelOrder**](MarginIsolatedOrderApi.md#MarginIsolatedCancelOrder) | **Post** /api/margin/v1/isolated/order/cancelOrder | cancelOrder
[**MarginIsolatedFills**](MarginIsolatedOrderApi.md#MarginIsolatedFills) | **Get** /api/margin/v1/isolated/order/fills | fills
[**MarginIsolatedHistoryOrders**](MarginIsolatedOrderApi.md#MarginIsolatedHistoryOrders) | **Get** /api/margin/v1/isolated/order/history | history
[**MarginIsolatedOpenOrders**](MarginIsolatedOrderApi.md#MarginIsolatedOpenOrders) | **Get** /api/margin/v1/isolated/order/openOrders | openOrders
[**MarginIsolatedPlaceOrder**](MarginIsolatedOrderApi.md#MarginIsolatedPlaceOrder) | **Post** /api/margin/v1/isolated/order/placeOrder | placeOrder



## MarginIsolatedBatchCancelOrder

> ApiResponseResultOfMarginBatchCancelOrderResult MarginIsolatedBatchCancelOrder(ctx).MarginBatchCancelOrderRequest(marginBatchCancelOrderRequest).Execute()

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
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedBatchCancelOrder(context.Background()).MarginBatchCancelOrderRequest(marginBatchCancelOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedBatchCancelOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedBatchCancelOrder`: ApiResponseResultOfMarginBatchCancelOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedBatchCancelOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedBatchCancelOrderRequest struct via the builder pattern


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


## MarginIsolatedBatchPlaceOrder

> ApiResponseResultOfMarginBatchPlaceOrderResult MarginIsolatedBatchPlaceOrder(ctx).MarginOrderRequest(marginOrderRequest).Execute()

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
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedBatchPlaceOrder(context.Background()).MarginOrderRequest(marginOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedBatchPlaceOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedBatchPlaceOrder`: ApiResponseResultOfMarginBatchPlaceOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedBatchPlaceOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedBatchPlaceOrderRequest struct via the builder pattern


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


## MarginIsolatedCancelOrder

> ApiResponseResultOfMarginBatchCancelOrderResult MarginIsolatedCancelOrder(ctx).MarginCancelOrderRequest(marginCancelOrderRequest).Execute()

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
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedCancelOrder(context.Background()).MarginCancelOrderRequest(marginCancelOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedCancelOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedCancelOrder`: ApiResponseResultOfMarginBatchCancelOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedCancelOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedCancelOrderRequest struct via the builder pattern


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


## MarginIsolatedFills

> ApiResponseResultOfMarginTradeDetailInfoResult MarginIsolatedFills(ctx).StartTime(startTime).Symbol(symbol).EndTime(endTime).OrderId(orderId).LastFillId(lastFillId).PageSize(pageSize).Execute()

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
    startTime := "1678193338000" // string | startTime
    symbol := "BTCUSDT" // string | symbol (optional)
    endTime := "1678193338000" // string | endTime (optional)
    orderId := "32428347234" // string | orderId (optional)
    lastFillId := "lastFillId_example" // string | lastFillId (optional)
    pageSize := "10" // string | pageSize (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedFills(context.Background()).StartTime(startTime).Symbol(symbol).EndTime(endTime).OrderId(orderId).LastFillId(lastFillId).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedFills``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedFills`: ApiResponseResultOfMarginTradeDetailInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedFills`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedFillsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **symbol** | **string** | symbol | 
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


## MarginIsolatedHistoryOrders

> ApiResponseResultOfMarginOpenOrderInfoResult MarginIsolatedHistoryOrders(ctx).StartTime(startTime).Symbol(symbol).Source(source).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).PageSize(pageSize).MinId(minId).Execute()

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
    startTime := "1678193338000" // string | startTime
    symbol := "BTCUSDT" // string | symbol (optional)
    source := "API" // string | source (optional)
    endTime := "1678193338000" // string | endTime (optional)
    orderId := "32428347234" // string | orderId (optional)
    clientOid := "123456" // string | clientOid (optional)
    pageSize := "10" // string | pageSize (optional)
    minId := "minId_example" // string | minId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedHistoryOrders(context.Background()).StartTime(startTime).Symbol(symbol).Source(source).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).PageSize(pageSize).MinId(minId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedHistoryOrders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedHistoryOrders`: ApiResponseResultOfMarginOpenOrderInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedHistoryOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedHistoryOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **symbol** | **string** | symbol | 
 **source** | **string** | source | 
 **endTime** | **string** | endTime | 
 **orderId** | **string** | orderId | 
 **clientOid** | **string** | clientOid | 
 **pageSize** | **string** | pageSize | 
 **minId** | **string** | minId | 

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


## MarginIsolatedOpenOrders

> ApiResponseResultOfMarginOpenOrderInfoResult MarginIsolatedOpenOrders(ctx).Symbol(symbol).StartTime(startTime).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).PageSize(pageSize).Execute()

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
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedOpenOrders(context.Background()).Symbol(symbol).StartTime(startTime).EndTime(endTime).OrderId(orderId).ClientOid(clientOid).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedOpenOrders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedOpenOrders`: ApiResponseResultOfMarginOpenOrderInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedOpenOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedOpenOrdersRequest struct via the builder pattern


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


## MarginIsolatedPlaceOrder

> ApiResponseResultOfMarginPlaceOrderResult MarginIsolatedPlaceOrder(ctx).MarginOrderRequest(marginOrderRequest).Execute()

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
    resp, r, err := apiClient.MarginIsolatedOrderApi.MarginIsolatedPlaceOrder(context.Background()).MarginOrderRequest(marginOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedOrderApi.MarginIsolatedPlaceOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedPlaceOrder`: ApiResponseResultOfMarginPlaceOrderResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedOrderApi.MarginIsolatedPlaceOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedPlaceOrderRequest struct via the builder pattern


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

