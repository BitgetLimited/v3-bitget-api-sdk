# \MarginCrossAccountApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginCrossAccountAssets**](MarginCrossAccountApi.md#MarginCrossAccountAssets) | **Get** /api/margin/v1/cross/account/assets | assets
[**MarginCrossAccountBorrow**](MarginCrossAccountApi.md#MarginCrossAccountBorrow) | **Post** /api/margin/v1/cross/account/borrow | borrow
[**MarginCrossAccountMaxBorrowableAmount**](MarginCrossAccountApi.md#MarginCrossAccountMaxBorrowableAmount) | **Post** /api/margin/v1/cross/account/maxBorrowableAmount | maxBorrowableAmount
[**MarginCrossAccountMaxTransferOutAmount**](MarginCrossAccountApi.md#MarginCrossAccountMaxTransferOutAmount) | **Get** /api/margin/v1/cross/account/maxTransferOutAmount | maxTransferOutAmount
[**MarginCrossAccountRepay**](MarginCrossAccountApi.md#MarginCrossAccountRepay) | **Post** /api/margin/v1/cross/account/repay | repay
[**MarginCrossAccountRiskRate**](MarginCrossAccountApi.md#MarginCrossAccountRiskRate) | **Get** /api/margin/v1/cross/account/riskRate | riskRate
[**Void**](MarginCrossAccountApi.md#Void) | **Get** /api/margin/v1/cross/account/void | void



## MarginCrossAccountAssets

> ApiResponseResultOfListOfMarginCrossAssetsPopulationResult MarginCrossAccountAssets(ctx).Coin(coin).Execute()

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
    coin := "USDT" // string | coin

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossAccountApi.MarginCrossAccountAssets(context.Background()).Coin(coin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.MarginCrossAccountAssets``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossAccountAssets`: ApiResponseResultOfListOfMarginCrossAssetsPopulationResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.MarginCrossAccountAssets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossAccountAssetsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **string** | coin | 

### Return type

[**ApiResponseResultOfListOfMarginCrossAssetsPopulationResult**](ApiResponseResultOfListOfMarginCrossAssetsPopulationResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossAccountBorrow

> ApiResponseResultOfMarginCrossBorrowLimitResult MarginCrossAccountBorrow(ctx).MarginCrossLimitRequest(marginCrossLimitRequest).Execute()

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
    marginCrossLimitRequest := *openapiclient.NewMarginCrossLimitRequest("1.0", "USDT") // MarginCrossLimitRequest | marginCrossLimitRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossAccountApi.MarginCrossAccountBorrow(context.Background()).MarginCrossLimitRequest(marginCrossLimitRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.MarginCrossAccountBorrow``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossAccountBorrow`: ApiResponseResultOfMarginCrossBorrowLimitResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.MarginCrossAccountBorrow`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossAccountBorrowRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginCrossLimitRequest** | [**MarginCrossLimitRequest**](MarginCrossLimitRequest.md) | marginCrossLimitRequest | 

### Return type

[**ApiResponseResultOfMarginCrossBorrowLimitResult**](ApiResponseResultOfMarginCrossBorrowLimitResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossAccountMaxBorrowableAmount

> ApiResponseResultOfMarginCrossMaxBorrowResult MarginCrossAccountMaxBorrowableAmount(ctx).MarginCrossMaxBorrowRequest(marginCrossMaxBorrowRequest).Execute()

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
    marginCrossMaxBorrowRequest := *openapiclient.NewMarginCrossMaxBorrowRequest("USDT") // MarginCrossMaxBorrowRequest | marginCrossMaxBorrowRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossAccountApi.MarginCrossAccountMaxBorrowableAmount(context.Background()).MarginCrossMaxBorrowRequest(marginCrossMaxBorrowRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.MarginCrossAccountMaxBorrowableAmount``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossAccountMaxBorrowableAmount`: ApiResponseResultOfMarginCrossMaxBorrowResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.MarginCrossAccountMaxBorrowableAmount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossAccountMaxBorrowableAmountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginCrossMaxBorrowRequest** | [**MarginCrossMaxBorrowRequest**](MarginCrossMaxBorrowRequest.md) | marginCrossMaxBorrowRequest | 

### Return type

[**ApiResponseResultOfMarginCrossMaxBorrowResult**](ApiResponseResultOfMarginCrossMaxBorrowResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossAccountMaxTransferOutAmount

> ApiResponseResultOfMarginCrossAssetsResult MarginCrossAccountMaxTransferOutAmount(ctx).Coin(coin).Execute()

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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossAccountApi.MarginCrossAccountMaxTransferOutAmount(context.Background()).Coin(coin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.MarginCrossAccountMaxTransferOutAmount``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossAccountMaxTransferOutAmount`: ApiResponseResultOfMarginCrossAssetsResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.MarginCrossAccountMaxTransferOutAmount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossAccountMaxTransferOutAmountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **string** | coin | 

### Return type

[**ApiResponseResultOfMarginCrossAssetsResult**](ApiResponseResultOfMarginCrossAssetsResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossAccountRepay

> ApiResponseResultOfMarginCrossRepayResult MarginCrossAccountRepay(ctx).MarginCrossRepayRequest(marginCrossRepayRequest).Execute()

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
    marginCrossRepayRequest := *openapiclient.NewMarginCrossRepayRequest("USDT", "1.0") // MarginCrossRepayRequest | marginCrossRepayRequest

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossAccountApi.MarginCrossAccountRepay(context.Background()).MarginCrossRepayRequest(marginCrossRepayRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.MarginCrossAccountRepay``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossAccountRepay`: ApiResponseResultOfMarginCrossRepayResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.MarginCrossAccountRepay`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossAccountRepayRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marginCrossRepayRequest** | [**MarginCrossRepayRequest**](MarginCrossRepayRequest.md) | marginCrossRepayRequest | 

### Return type

[**ApiResponseResultOfMarginCrossRepayResult**](ApiResponseResultOfMarginCrossRepayResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossAccountRiskRate

> ApiResponseResultOfMarginCrossAssetsRiskResult MarginCrossAccountRiskRate(ctx).Execute()

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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossAccountApi.MarginCrossAccountRiskRate(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.MarginCrossAccountRiskRate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossAccountRiskRate`: ApiResponseResultOfMarginCrossAssetsRiskResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.MarginCrossAccountRiskRate`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossAccountRiskRateRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfMarginCrossAssetsRiskResult**](ApiResponseResultOfMarginCrossAssetsRiskResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Void

> ApiResponseResultOfVoid Void(ctx).Execute()

void



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
    resp, r, err := apiClient.MarginCrossAccountApi.Void(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossAccountApi.Void``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Void`: ApiResponseResultOfVoid
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossAccountApi.Void`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiVoidRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfVoid**](ApiResponseResultOfVoid.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

