# \MarginPublicApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MarginPublicCurrencies**](MarginPublicApi.md#MarginPublicCurrencies) | **Get** /api/margin/v1/public/currencies | currencies



## MarginPublicCurrencies

> ApiResponseResultOfListOfMarginSystemResult MarginPublicCurrencies(ctx).Execute()

currencies



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
    resp, r, err := apiClient.MarginPublicApi.MarginPublicCurrencies(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginPublicApi.MarginPublicCurrencies``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarginPublicCurrencies`: ApiResponseResultOfListOfMarginSystemResult
    fmt.Fprintf(os.Stdout, "Response from `MarginPublicApi.MarginPublicCurrencies`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiMarginPublicCurrenciesRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfListOfMarginSystemResult**](ApiResponseResultOfListOfMarginSystemResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

