# \MarginIsolatedInterestApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IsolatedInterestList**](MarginIsolatedInterestApi.md#IsolatedInterestList) | **Get** /api/margin/v1/isolated/interest/list | list



## IsolatedInterestList

> ApiResponseResultOfMarginIsolatedInterestInfoResult IsolatedInterestList(ctx).Symbol(symbol).StartTime(startTime).Coin(coin).PageSize(pageSize).PageId(pageId).Execute()

list



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
    startTime := "1678193138000" // string | startTime
    coin := "USDT" // string | coin (optional)
    pageSize := "10" // string | pageSize (optional)
    pageId := "pageId_example" // string | pageId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedInterestApi.IsolatedInterestList(context.Background()).Symbol(symbol).StartTime(startTime).Coin(coin).PageSize(pageSize).PageId(pageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedInterestApi.IsolatedInterestList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `IsolatedInterestList`: ApiResponseResultOfMarginIsolatedInterestInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedInterestApi.IsolatedInterestList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIsolatedInterestListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 
 **startTime** | **string** | startTime | 
 **coin** | **string** | coin | 
 **pageSize** | **string** | pageSize | 
 **pageId** | **string** | pageId | 

### Return type

[**ApiResponseResultOfMarginIsolatedInterestInfoResult**](ApiResponseResultOfMarginIsolatedInterestInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

