# \MarginIsolatedAccountApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginIsolatedAccountAssets**](MarginIsolatedAccountApi.md#MarginIsolatedAccountAssets) | **Get** /api/margin/v1/isolated/account/assets | assets
[**MarginIsolatedAccountBorrow**](MarginIsolatedAccountApi.md#MarginIsolatedAccountBorrow) | **Post** /api/margin/v1/isolated/account/borrow | borrow
[**MarginIsolatedAccountMaxBorrowableAmount**](MarginIsolatedAccountApi.md#MarginIsolatedAccountMaxBorrowableAmount) | **Post** /api/margin/v1/isolated/account/maxBorrowableAmount | maxBorrowableAmount
[**MarginIsolatedAccountMaxTransferOutAmount**](MarginIsolatedAccountApi.md#MarginIsolatedAccountMaxTransferOutAmount) | **Get** /api/margin/v1/isolated/account/maxTransferOutAmount | maxTransferOutAmount
[**MarginIsolatedAccountRepay**](MarginIsolatedAccountApi.md#MarginIsolatedAccountRepay) | **Post** /api/margin/v1/isolated/account/repay | repay
[**MarginIsolatedAccountRiskRate**](MarginIsolatedAccountApi.md#MarginIsolatedAccountRiskRate) | **Post** /api/margin/v1/isolated/account/riskRate | riskRate



## MarginIsolatedAccountAssets

> ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult MarginIsolatedAccountAssets(ctx).Symbol(symbol).Execute()

assets



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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedAccountApi.MarginIsolatedAccountAssets(context.Background()).Symbol(symbol).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedAccountApi.MarginIsolatedAccountAssets``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedAccountAssets`: ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedAccountApi.MarginIsolatedAccountAssets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedAccountAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 

### Return type

[**ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult**](ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginIsolatedAccountBorrow

> ApiResponseResultOfMarginIsolatedBorrowLimitResult MarginIsolatedAccountBorrow(ctx).MarginIsolatedLimitRequest(marginIsolatedLimitRequest).Execute()

borrow



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
    marginIsolatedLimitRequest := *openapiclient.NewMarginIsolatedLimitRequest("1.0", "USDT", "USDT") // MarginIsolatedLimitRequest | marginIsolatedLimitRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedAccountApi.MarginIsolatedAccountBorrow(context.Background()).MarginIsolatedLimitRequest(marginIsolatedLimitRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedAccountApi.MarginIsolatedAccountBorrow``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedAccountBorrow`: ApiResponseResultOfMarginIsolatedBorrowLimitResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedAccountApi.MarginIsolatedAccountBorrow`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedAccountBorrowRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginIsolatedLimitRequest** | [**MarginIsolatedLimitRequest**](MarginIsolatedLimitRequest.md) | marginIsolatedLimitRequest | 

### Return type

[**ApiResponseResultOfMarginIsolatedBorrowLimitResult**](ApiResponseResultOfMarginIsolatedBorrowLimitResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginIsolatedAccountMaxBorrowableAmount

> ApiResponseResultOfMarginIsolatedMaxBorrowResult MarginIsolatedAccountMaxBorrowableAmount(ctx).MarginIsolatedMaxBorrowRequest(marginIsolatedMaxBorrowRequest).Execute()

maxBorrowableAmount



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
    marginIsolatedMaxBorrowRequest := *openapiclient.NewMarginIsolatedMaxBorrowRequest("USDT", "BTCUSDT") // MarginIsolatedMaxBorrowRequest | marginIsolatedMaxBorrowRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedAccountApi.MarginIsolatedAccountMaxBorrowableAmount(context.Background()).MarginIsolatedMaxBorrowRequest(marginIsolatedMaxBorrowRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedAccountApi.MarginIsolatedAccountMaxBorrowableAmount``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedAccountMaxBorrowableAmount`: ApiResponseResultOfMarginIsolatedMaxBorrowResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedAccountApi.MarginIsolatedAccountMaxBorrowableAmount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedAccountMaxBorrowableAmountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginIsolatedMaxBorrowRequest** | [**MarginIsolatedMaxBorrowRequest**](MarginIsolatedMaxBorrowRequest.md) | marginIsolatedMaxBorrowRequest | 

### Return type

[**ApiResponseResultOfMarginIsolatedMaxBorrowResult**](ApiResponseResultOfMarginIsolatedMaxBorrowResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginIsolatedAccountMaxTransferOutAmount

> ApiResponseResultOfMarginIsolatedAssetsResult MarginIsolatedAccountMaxTransferOutAmount(ctx).Coin(coin).Symbol(symbol).Execute()

maxTransferOutAmount



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
    coin := "USDT" // string | coin
    symbol := "BTCUSDT" // string | symbol

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedAccountApi.MarginIsolatedAccountMaxTransferOutAmount(context.Background()).Coin(coin).Symbol(symbol).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedAccountApi.MarginIsolatedAccountMaxTransferOutAmount``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedAccountMaxTransferOutAmount`: ApiResponseResultOfMarginIsolatedAssetsResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedAccountApi.MarginIsolatedAccountMaxTransferOutAmount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedAccountMaxTransferOutAmountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **string** | coin | 
 **symbol** | **string** | symbol | 

### Return type

[**ApiResponseResultOfMarginIsolatedAssetsResult**](ApiResponseResultOfMarginIsolatedAssetsResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginIsolatedAccountRepay

> ApiResponseResultOfMarginIsolatedRepayResult MarginIsolatedAccountRepay(ctx).MarginIsolatedRepayRequest(marginIsolatedRepayRequest).Execute()

repay



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
    marginIsolatedRepayRequest := *openapiclient.NewMarginIsolatedRepayRequest("USDT", "1.0", "BTCUSDT") // MarginIsolatedRepayRequest | marginIsolatedRepayRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedAccountApi.MarginIsolatedAccountRepay(context.Background()).MarginIsolatedRepayRequest(marginIsolatedRepayRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedAccountApi.MarginIsolatedAccountRepay``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedAccountRepay`: ApiResponseResultOfMarginIsolatedRepayResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedAccountApi.MarginIsolatedAccountRepay`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedAccountRepayRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginIsolatedRepayRequest** | [**MarginIsolatedRepayRequest**](MarginIsolatedRepayRequest.md) | marginIsolatedRepayRequest | 

### Return type

[**ApiResponseResultOfMarginIsolatedRepayResult**](ApiResponseResultOfMarginIsolatedRepayResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginIsolatedAccountRiskRate

> ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult MarginIsolatedAccountRiskRate(ctx).MarginIsolatedAssetsRiskRequest(marginIsolatedAssetsRiskRequest).Execute()

riskRate



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
    marginIsolatedAssetsRiskRequest := *openapiclient.NewMarginIsolatedAssetsRiskRequest("BTCUSDT") // MarginIsolatedAssetsRiskRequest | marginIsolatedAssetsRiskRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedAccountApi.MarginIsolatedAccountRiskRate(context.Background()).MarginIsolatedAssetsRiskRequest(marginIsolatedAssetsRiskRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedAccountApi.MarginIsolatedAccountRiskRate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedAccountRiskRate`: ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedAccountApi.MarginIsolatedAccountRiskRate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedAccountRiskRateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginIsolatedAssetsRiskRequest** | [**MarginIsolatedAssetsRiskRequest**](MarginIsolatedAssetsRiskRequest.md) | marginIsolatedAssetsRiskRequest | 

### Return type

[**ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult**](ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

