# \SpotTraceOrderApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SpotTraceCloseTrackingOrder**](SpotTraceOrderApi.md#SpotTraceCloseTrackingOrder) | **Post** /api/spot/v1/trace/order/closeTrackingOrder | closeTrackingOrder
[**SpotTraceEndOrder**](SpotTraceOrderApi.md#SpotTraceEndOrder) | **Post** /api/spot/v1/trace/order/endOrder | endOrder
[**SpotTraceGetTraceSettings**](SpotTraceOrderApi.md#SpotTraceGetTraceSettings) | **Post** /api/spot/v1/trace/order/getTraceSettings | getTraceSettings
[**SpotTraceGetTraderSettings**](SpotTraceOrderApi.md#SpotTraceGetTraderSettings) | **Post** /api/spot/v1/trace/order/getTraderSettings | getTraderSettings
[**SpotTraceMyTracers**](SpotTraceOrderApi.md#SpotTraceMyTracers) | **Post** /api/spot/v1/trace/order/myTracers | myTracers
[**SpotTraceMyTraders**](SpotTraceOrderApi.md#SpotTraceMyTraders) | **Post** /api/spot/v1/trace/order/myTraders | myTraders
[**SpotTraceOrderCurrentList**](SpotTraceOrderApi.md#SpotTraceOrderCurrentList) | **Post** /api/spot/v1/trace/order/orderCurrentList | orderCurrentList
[**SpotTraceOrderHistoryList**](SpotTraceOrderApi.md#SpotTraceOrderHistoryList) | **Post** /api/spot/v1/trace/order/orderHistoryList | orderHistoryList
[**SpotTraceRemoveTrader**](SpotTraceOrderApi.md#SpotTraceRemoveTrader) | **Post** /api/spot/v1/trace/order/removeTrader | removeTrader
[**SpotTraceSetProductCode**](SpotTraceOrderApi.md#SpotTraceSetProductCode) | **Post** /api/spot/v1/trace/order/setProductCode | setProductCode
[**SpotTraceSetTraceConfig**](SpotTraceOrderApi.md#SpotTraceSetTraceConfig) | **Post** /api/spot/v1/trace/order/setTraceConfig | setTraceConfig
[**SpotTraceSpotInfoList**](SpotTraceOrderApi.md#SpotTraceSpotInfoList) | **Post** /api/spot/v1/trace/order/spotInfoList | spotInfoList
[**SpotTraceUpdateTpsl**](SpotTraceOrderApi.md#SpotTraceUpdateTpsl) | **Post** /api/spot/v1/trace/order/updateTpsl | updateTpsl



## SpotTraceCloseTrackingOrder

> ApiResponseResultOfboolean SpotTraceCloseTrackingOrder(ctx).CloseTrackingOrderRequest(closeTrackingOrderRequest).Execute()

closeTrackingOrder



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
    closeTrackingOrderRequest := *openapiclient.NewCloseTrackingOrderRequest("BTCUSDT_SPBL", []string{"TrackingOrderNos_example"}) // CloseTrackingOrderRequest | closeTrackingOrderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceCloseTrackingOrder(context.Background()).CloseTrackingOrderRequest(closeTrackingOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceCloseTrackingOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceCloseTrackingOrder`: ApiResponseResultOfboolean
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceCloseTrackingOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceCloseTrackingOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **closeTrackingOrderRequest** | [**CloseTrackingOrderRequest**](CloseTrackingOrderRequest.md) | closeTrackingOrderRequest | 

### Return type

[**ApiResponseResultOfboolean**](ApiResponseResultOfboolean.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceEndOrder

> ApiResponseResultOfboolean SpotTraceEndOrder(ctx).EndOrderRequest(endOrderRequest).Execute()

endOrder



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
    endOrderRequest := *openapiclient.NewEndOrderRequest([]string{"TrackingOrderNos_example"}) // EndOrderRequest | endOrderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceEndOrder(context.Background()).EndOrderRequest(endOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceEndOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceEndOrder`: ApiResponseResultOfboolean
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceEndOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceEndOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endOrderRequest** | [**EndOrderRequest**](EndOrderRequest.md) | endOrderRequest | 

### Return type

[**ApiResponseResultOfboolean**](ApiResponseResultOfboolean.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceGetTraceSettings

> ApiResponseResultOfTraceSettingResult SpotTraceGetTraceSettings(ctx).TraceSettingsRequest(traceSettingsRequest).Execute()

getTraceSettings



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
    traceSettingsRequest := *openapiclient.NewTraceSettingsRequest("TraderUserId_example") // TraceSettingsRequest | traceSettingsRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceGetTraceSettings(context.Background()).TraceSettingsRequest(traceSettingsRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceGetTraceSettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceGetTraceSettings`: ApiResponseResultOfTraceSettingResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceGetTraceSettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceGetTraceSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceSettingsRequest** | [**TraceSettingsRequest**](TraceSettingsRequest.md) | traceSettingsRequest | 

### Return type

[**ApiResponseResultOfTraceSettingResult**](ApiResponseResultOfTraceSettingResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceGetTraderSettings

> ApiResponseResultOfTraderSettingResult SpotTraceGetTraderSettings(ctx).Execute()

getTraderSettings



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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceGetTraderSettings(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceGetTraderSettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceGetTraderSettings`: ApiResponseResultOfTraderSettingResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceGetTraderSettings`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceGetTraderSettingsRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfTraderSettingResult**](ApiResponseResultOfTraderSettingResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceMyTracers

> ApiResponseResultOfMyTracersResult SpotTraceMyTracers(ctx).MyTracersRequest(myTracersRequest).Execute()

myTracers



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
    myTracersRequest := *openapiclient.NewMyTracersRequest() // MyTracersRequest | myTracersRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceMyTracers(context.Background()).MyTracersRequest(myTracersRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceMyTracers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceMyTracers`: ApiResponseResultOfMyTracersResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceMyTracers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceMyTracersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **myTracersRequest** | [**MyTracersRequest**](MyTracersRequest.md) | myTracersRequest | 

### Return type

[**ApiResponseResultOfMyTracersResult**](ApiResponseResultOfMyTracersResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceMyTraders

> ApiResponseResultOfMyTradersResult SpotTraceMyTraders(ctx).MyTradersRequest(myTradersRequest).Execute()

myTraders



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
    myTradersRequest := *openapiclient.NewMyTradersRequest() // MyTradersRequest | myTradersRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceMyTraders(context.Background()).MyTradersRequest(myTradersRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceMyTraders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceMyTraders`: ApiResponseResultOfMyTradersResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceMyTraders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceMyTradersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **myTradersRequest** | [**MyTradersRequest**](MyTradersRequest.md) | myTradersRequest | 

### Return type

[**ApiResponseResultOfMyTradersResult**](ApiResponseResultOfMyTradersResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceOrderCurrentList

> ApiResponseResultOfOrderCurrentListResult SpotTraceOrderCurrentList(ctx).CurrentOrderListRequest(currentOrderListRequest).Execute()

orderCurrentList



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
    currentOrderListRequest := *openapiclient.NewCurrentOrderListRequest() // CurrentOrderListRequest | currentOrderListRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceOrderCurrentList(context.Background()).CurrentOrderListRequest(currentOrderListRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceOrderCurrentList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceOrderCurrentList`: ApiResponseResultOfOrderCurrentListResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceOrderCurrentList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceOrderCurrentListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentOrderListRequest** | [**CurrentOrderListRequest**](CurrentOrderListRequest.md) | currentOrderListRequest | 

### Return type

[**ApiResponseResultOfOrderCurrentListResult**](ApiResponseResultOfOrderCurrentListResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceOrderHistoryList

> ApiResponseResultOfOrderHistoryListResult SpotTraceOrderHistoryList(ctx).HistoryOrderListRequest(historyOrderListRequest).Execute()

orderHistoryList



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
    historyOrderListRequest := *openapiclient.NewHistoryOrderListRequest() // HistoryOrderListRequest | historyOrderListRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceOrderHistoryList(context.Background()).HistoryOrderListRequest(historyOrderListRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceOrderHistoryList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceOrderHistoryList`: ApiResponseResultOfOrderHistoryListResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceOrderHistoryList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceOrderHistoryListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **historyOrderListRequest** | [**HistoryOrderListRequest**](HistoryOrderListRequest.md) | historyOrderListRequest | 

### Return type

[**ApiResponseResultOfOrderHistoryListResult**](ApiResponseResultOfOrderHistoryListResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceRemoveTrader

> ApiResponseResultOfboolean SpotTraceRemoveTrader(ctx).RemoveTraderRequest(removeTraderRequest).Execute()

removeTrader



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
    removeTraderRequest := *openapiclient.NewRemoveTraderRequest("TraderUserId_example") // RemoveTraderRequest | removeTraderRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceRemoveTrader(context.Background()).RemoveTraderRequest(removeTraderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceRemoveTrader``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceRemoveTrader`: ApiResponseResultOfboolean
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceRemoveTrader`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceRemoveTraderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **removeTraderRequest** | [**RemoveTraderRequest**](RemoveTraderRequest.md) | removeTraderRequest | 

### Return type

[**ApiResponseResultOfboolean**](ApiResponseResultOfboolean.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceSetProductCode

> ApiResponseResultOfboolean SpotTraceSetProductCode(ctx).ProductCodeRequest(productCodeRequest).Execute()

setProductCode



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
    productCodeRequest := *openapiclient.NewProductCodeRequest([]string{"SymbolIds_example"}) // ProductCodeRequest | productCodeRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceSetProductCode(context.Background()).ProductCodeRequest(productCodeRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceSetProductCode``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceSetProductCode`: ApiResponseResultOfboolean
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceSetProductCode`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceSetProductCodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCodeRequest** | [**ProductCodeRequest**](ProductCodeRequest.md) | productCodeRequest | 

### Return type

[**ApiResponseResultOfboolean**](ApiResponseResultOfboolean.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceSetTraceConfig

> ApiResponseResultOfboolean SpotTraceSetTraceConfig(ctx).TraceConfigRequest(traceConfigRequest).Execute()

setTraceConfig



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
    traceConfigRequest := *openapiclient.NewTraceConfigRequest("0,1", "TraderUserId_example") // TraceConfigRequest | traceConfigRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceSetTraceConfig(context.Background()).TraceConfigRequest(traceConfigRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceSetTraceConfig``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceSetTraceConfig`: ApiResponseResultOfboolean
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceSetTraceConfig`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceSetTraceConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceConfigRequest** | [**TraceConfigRequest**](TraceConfigRequest.md) | traceConfigRequest | 

### Return type

[**ApiResponseResultOfboolean**](ApiResponseResultOfboolean.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceSpotInfoList

> ApiResponseResultOfListOfSpotInfoResult SpotTraceSpotInfoList(ctx).Execute()

spotInfoList



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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceSpotInfoList(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceSpotInfoList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceSpotInfoList`: ApiResponseResultOfListOfSpotInfoResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceSpotInfoList`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceSpotInfoListRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfListOfSpotInfoResult**](ApiResponseResultOfListOfSpotInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceUpdateTpsl

> ApiResponseResultOfboolean SpotTraceUpdateTpsl(ctx).UpdateTpslRequest(updateTpslRequest).Execute()

updateTpsl



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
    updateTpslRequest := *openapiclient.NewUpdateTpslRequest("1", "1", "1032884851114008576") // UpdateTpslRequest | updateTpslRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceOrderApi.SpotTraceUpdateTpsl(context.Background()).UpdateTpslRequest(updateTpslRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceOrderApi.SpotTraceUpdateTpsl``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceUpdateTpsl`: ApiResponseResultOfboolean
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceOrderApi.SpotTraceUpdateTpsl`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceUpdateTpslRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateTpslRequest** | [**UpdateTpslRequest**](UpdateTpslRequest.md) | updateTpslRequest | 

### Return type

[**ApiResponseResultOfboolean**](ApiResponseResultOfboolean.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

