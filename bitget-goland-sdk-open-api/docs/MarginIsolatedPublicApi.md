# \MarginIsolatedPublicApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginIsolatedPublicInterestRateAndLimit**](MarginIsolatedPublicApi.md#MarginIsolatedPublicInterestRateAndLimit) | **Get** /api/margin/v1/isolated/public/interestRateAndLimit | interestRateAndLimit
[**MarginIsolatedPublicTierData**](MarginIsolatedPublicApi.md#MarginIsolatedPublicTierData) | **Get** /api/margin/v1/isolated/public/tierData | tierData



## MarginIsolatedPublicInterestRateAndLimit

> ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult MarginIsolatedPublicInterestRateAndLimit(ctx).Symbol(symbol).Execute()

interestRateAndLimit



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
    resp, r, err := apiClient.MarginIsolatedPublicApi.MarginIsolatedPublicInterestRateAndLimit(context.Background()).Symbol(symbol).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedPublicApi.MarginIsolatedPublicInterestRateAndLimit``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedPublicInterestRateAndLimit`: ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedPublicApi.MarginIsolatedPublicInterestRateAndLimit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedPublicInterestRateAndLimitRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 

### Return type

[**ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult**](ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginIsolatedPublicTierData

> ApiResponseResultOfListOfMarginIsolatedLevelResult MarginIsolatedPublicTierData(ctx).Symbol(symbol).Execute()

tierData



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
    resp, r, err := apiClient.MarginIsolatedPublicApi.MarginIsolatedPublicTierData(context.Background()).Symbol(symbol).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedPublicApi.MarginIsolatedPublicTierData``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginIsolatedPublicTierData`: ApiResponseResultOfListOfMarginIsolatedLevelResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedPublicApi.MarginIsolatedPublicTierData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginIsolatedPublicTierDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 

### Return type

[**ApiResponseResultOfListOfMarginIsolatedLevelResult**](ApiResponseResultOfListOfMarginIsolatedLevelResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

