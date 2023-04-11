# \MarginIsolatedLiquidationApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IsolatedLiquidationList**](MarginIsolatedLiquidationApi.md#IsolatedLiquidationList) | **Get** /api/margin/v1/isolated/liquidation/list | list



## IsolatedLiquidationList

> ApiResponseResultOfMarginIsolatedLiquidationInfoResult IsolatedLiquidationList(ctx).Symbol(symbol).StartTime(startTime).EndTime(endTime).PageSize(pageSize).PageId(pageId).Execute()

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
    endTime := "1678193338000" // string | endTime (optional)
    pageSize := "10" // string | pageSize (optional)
    pageId := "pageId_example" // string | pageId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedLiquidationApi.IsolatedLiquidationList(context.Background()).Symbol(symbol).StartTime(startTime).EndTime(endTime).PageSize(pageSize).PageId(pageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedLiquidationApi.IsolatedLiquidationList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `IsolatedLiquidationList`: ApiResponseResultOfMarginIsolatedLiquidationInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedLiquidationApi.IsolatedLiquidationList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIsolatedLiquidationListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 
 **startTime** | **string** | startTime | 
 **endTime** | **string** | endTime | 
 **pageSize** | **string** | pageSize | 
 **pageId** | **string** | pageId | 

### Return type

[**ApiResponseResultOfMarginIsolatedLiquidationInfoResult**](ApiResponseResultOfMarginIsolatedLiquidationInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

