# \MarginCrossRepayApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CrossRepayList**](MarginCrossRepayApi.md#CrossRepayList) | **Get** /api/margin/v1/cross/repay/list | list



## CrossRepayList

> ApiResponseResultOfMarginRepayInfoResult CrossRepayList(ctx).StartTime(startTime).Coin(coin).RepayId(repayId).EndTime(endTime).PageSize(pageSize).PageId(pageId).Execute()

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
    startTime := "1678193338000" // string | startTime
    coin := "USDT" // string | coin (optional)
    repayId := "32428347234" // string | repayId (optional)
    endTime := "1678193338000" // string | endTime (optional)
    pageSize := "10" // string | pageSize (optional)
    pageId := "minId" // string | pageId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossRepayApi.CrossRepayList(context.Background()).StartTime(startTime).Coin(coin).RepayId(repayId).EndTime(endTime).PageSize(pageSize).PageId(pageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossRepayApi.CrossRepayList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CrossRepayList`: ApiResponseResultOfMarginRepayInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossRepayApi.CrossRepayList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCrossRepayListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **coin** | **string** | coin | 
 **repayId** | **string** | repayId | 
 **endTime** | **string** | endTime | 
 **pageSize** | **string** | pageSize | 
 **pageId** | **string** | pageId | 

### Return type

[**ApiResponseResultOfMarginRepayInfoResult**](ApiResponseResultOfMarginRepayInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

