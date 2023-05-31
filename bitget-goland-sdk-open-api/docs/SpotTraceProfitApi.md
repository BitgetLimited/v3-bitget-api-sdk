# \SpotTraceProfitApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SpotTraceProfitHisDetailList**](SpotTraceProfitApi.md#SpotTraceProfitHisDetailList) | **Post** /api/spot/v1/trace/profit/profitHisDetailList | profitHisDetailList
[**SpotTraceProfitHisList**](SpotTraceProfitApi.md#SpotTraceProfitHisList) | **Post** /api/spot/v1/trace/profit/profitHisList | profitHisList
[**SpotTraceTotalProfitInfo**](SpotTraceProfitApi.md#SpotTraceTotalProfitInfo) | **Post** /api/spot/v1/trace/profit/totalProfitInfo | totalProfitInfo
[**SpotTraceTotalProfitList**](SpotTraceProfitApi.md#SpotTraceTotalProfitList) | **Post** /api/spot/v1/trace/profit/totalProfitList | totalProfitList
[**SpotTraceWaitProfitDetailList**](SpotTraceProfitApi.md#SpotTraceWaitProfitDetailList) | **Post** /api/spot/v1/trace/profit/waitProfitDetailList | waitProfitDetailList



## SpotTraceProfitHisDetailList

> ApiResponseResultOfTraderProfitHisDetailListResult SpotTraceProfitHisDetailList(ctx).TotalProfitHisDetailListRequest(totalProfitHisDetailListRequest).Execute()

profitHisDetailList



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
    totalProfitHisDetailListRequest := *openapiclient.NewTotalProfitHisDetailListRequest("USDT", "1681985100000") // TotalProfitHisDetailListRequest | totalProfitHisDetailListRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceProfitApi.SpotTraceProfitHisDetailList(context.Background()).TotalProfitHisDetailListRequest(totalProfitHisDetailListRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceProfitApi.SpotTraceProfitHisDetailList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceProfitHisDetailList`: ApiResponseResultOfTraderProfitHisDetailListResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceProfitApi.SpotTraceProfitHisDetailList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceProfitHisDetailListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **totalProfitHisDetailListRequest** | [**TotalProfitHisDetailListRequest**](TotalProfitHisDetailListRequest.md) | totalProfitHisDetailListRequest | 

### Return type

[**ApiResponseResultOfTraderProfitHisDetailListResult**](ApiResponseResultOfTraderProfitHisDetailListResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceProfitHisList

> ApiResponseResultOfTraderProfitHisListResult SpotTraceProfitHisList(ctx).TotalProfitHisListRequest(totalProfitHisListRequest).Execute()

profitHisList



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
    totalProfitHisListRequest := *openapiclient.NewTotalProfitHisListRequest() // TotalProfitHisListRequest | totalProfitHisListRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceProfitApi.SpotTraceProfitHisList(context.Background()).TotalProfitHisListRequest(totalProfitHisListRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceProfitApi.SpotTraceProfitHisList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceProfitHisList`: ApiResponseResultOfTraderProfitHisListResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceProfitApi.SpotTraceProfitHisList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceProfitHisListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **totalProfitHisListRequest** | [**TotalProfitHisListRequest**](TotalProfitHisListRequest.md) | totalProfitHisListRequest | 

### Return type

[**ApiResponseResultOfTraderProfitHisListResult**](ApiResponseResultOfTraderProfitHisListResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceTotalProfitInfo

> ApiResponseResultOfTraderTotalProfitResult SpotTraceTotalProfitInfo(ctx).Execute()

totalProfitInfo



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
    resp, r, err := apiClient.SpotTraceProfitApi.SpotTraceTotalProfitInfo(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceProfitApi.SpotTraceTotalProfitInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceTotalProfitInfo`: ApiResponseResultOfTraderTotalProfitResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceProfitApi.SpotTraceTotalProfitInfo`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceTotalProfitInfoRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfTraderTotalProfitResult**](ApiResponseResultOfTraderTotalProfitResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceTotalProfitList

> ApiResponseResultOfListOfTraderTotalProfitListResult SpotTraceTotalProfitList(ctx).TotalProfitListRequest(totalProfitListRequest).Execute()

totalProfitList



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
    totalProfitListRequest := *openapiclient.NewTotalProfitListRequest() // TotalProfitListRequest | totalProfitListRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceProfitApi.SpotTraceTotalProfitList(context.Background()).TotalProfitListRequest(totalProfitListRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceProfitApi.SpotTraceTotalProfitList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceTotalProfitList`: ApiResponseResultOfListOfTraderTotalProfitListResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceProfitApi.SpotTraceTotalProfitList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceTotalProfitListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **totalProfitListRequest** | [**TotalProfitListRequest**](TotalProfitListRequest.md) | totalProfitListRequest | 

### Return type

[**ApiResponseResultOfListOfTraderTotalProfitListResult**](ApiResponseResultOfListOfTraderTotalProfitListResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SpotTraceWaitProfitDetailList

> ApiResponseResultOfTraderWaitProfitDetailListResult SpotTraceWaitProfitDetailList(ctx).WaitProfitDetailListRequest(waitProfitDetailListRequest).Execute()

waitProfitDetailList



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
    waitProfitDetailListRequest := *openapiclient.NewWaitProfitDetailListRequest() // WaitProfitDetailListRequest | waitProfitDetailListRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SpotTraceProfitApi.SpotTraceWaitProfitDetailList(context.Background()).WaitProfitDetailListRequest(waitProfitDetailListRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SpotTraceProfitApi.SpotTraceWaitProfitDetailList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SpotTraceWaitProfitDetailList`: ApiResponseResultOfTraderWaitProfitDetailListResult
    fmt.Fprintf(os.Stdout, "Response from `SpotTraceProfitApi.SpotTraceWaitProfitDetailList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSpotTraceWaitProfitDetailListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitProfitDetailListRequest** | [**WaitProfitDetailListRequest**](WaitProfitDetailListRequest.md) | waitProfitDetailListRequest | 

### Return type

[**ApiResponseResultOfTraderWaitProfitDetailListResult**](ApiResponseResultOfTraderWaitProfitDetailListResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

