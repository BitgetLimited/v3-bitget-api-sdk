# \MarginIsolatedFinflowApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IsolatedFinList**](MarginIsolatedFinflowApi.md#IsolatedFinList) | **Get** /api/margin/v1/isolated/fin/list | list



## IsolatedFinList

> ApiResponseResultOfMarginIsolatedFinFlowResult IsolatedFinList(ctx).Symbol(symbol).StartTime(startTime).Coin(coin).MarginType(marginType).EndTime(endTime).LoanId(loanId).PageSize(pageSize).PageId(pageId).Execute()

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
    startTime := "1678193338000" // string | startTime
    coin := "USDT" // string | coin (optional)
    marginType := "transfer_in" // string | marginType (optional)
    endTime := "1678193338000" // string | endTime (optional)
    loanId := "loanId_example" // string | loanId (optional)
    pageSize := "10" // string | pageSize (optional)
    pageId := "pageId_example" // string | pageId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginIsolatedFinflowApi.IsolatedFinList(context.Background()).Symbol(symbol).StartTime(startTime).Coin(coin).MarginType(marginType).EndTime(endTime).LoanId(loanId).PageSize(pageSize).PageId(pageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginIsolatedFinflowApi.IsolatedFinList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `IsolatedFinList`: ApiResponseResultOfMarginIsolatedFinFlowResult
    fmt.Fprintf(os.Stdout, "Response from `MarginIsolatedFinflowApi.IsolatedFinList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIsolatedFinListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string** | symbol | 
 **startTime** | **string** | startTime | 
 **coin** | **string** | coin | 
 **marginType** | **string** | marginType | 
 **endTime** | **string** | endTime | 
 **loanId** | **string** | loanId | 
 **pageSize** | **string** | pageSize | 
 **pageId** | **string** | pageId | 

### Return type

[**ApiResponseResultOfMarginIsolatedFinFlowResult**](ApiResponseResultOfMarginIsolatedFinFlowResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

