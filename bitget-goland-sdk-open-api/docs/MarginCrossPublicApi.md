# \MarginCrossPublicApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginCrossPublicInterestRateAndLimit**](MarginCrossPublicApi.md#MarginCrossPublicInterestRateAndLimit) | **Get** /api/margin/v1/cross/public/interestRateAndLimit | interestRateAndLimit
[**MarginCrossPublicTierData**](MarginCrossPublicApi.md#MarginCrossPublicTierData) | **Get** /api/margin/v1/cross/public/tierData | tierData



## MarginCrossPublicInterestRateAndLimit

> ApiResponseResultOfListOfMarginCrossRateAndLimitResult MarginCrossPublicInterestRateAndLimit(ctx).Coin(coin).Execute()

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
    coin := "USDT" // string | coin

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossPublicApi.MarginCrossPublicInterestRateAndLimit(context.Background()).Coin(coin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossPublicApi.MarginCrossPublicInterestRateAndLimit``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossPublicInterestRateAndLimit`: ApiResponseResultOfListOfMarginCrossRateAndLimitResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossPublicApi.MarginCrossPublicInterestRateAndLimit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossPublicInterestRateAndLimitRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **string** | coin | 

### Return type

[**ApiResponseResultOfListOfMarginCrossRateAndLimitResult**](ApiResponseResultOfListOfMarginCrossRateAndLimitResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MarginCrossPublicTierData

> ApiResponseResultOfListOfMarginCrossLevelResult MarginCrossPublicTierData(ctx).Coin(coin).Execute()

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
    coin := "USDT" // string | coin

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossPublicApi.MarginCrossPublicTierData(context.Background()).Coin(coin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossPublicApi.MarginCrossPublicTierData``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginCrossPublicTierData`: ApiResponseResultOfListOfMarginCrossLevelResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossPublicApi.MarginCrossPublicTierData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarginCrossPublicTierDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **string** | coin | 

### Return type

[**ApiResponseResultOfListOfMarginCrossLevelResult**](ApiResponseResultOfListOfMarginCrossLevelResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

