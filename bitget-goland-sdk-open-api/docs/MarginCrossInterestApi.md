# \MarginCrossInterestApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CrossInterestList**](MarginCrossInterestApi.md#CrossInterestList) | **Get** /api/margin/v1/cross/interest/list | list



## CrossInterestList

> ApiResponseResultOfMarginInterestInfoResult CrossInterestList(ctx).StartTime(startTime).Coin(coin).PageSize(pageSize).PageId(pageId).Execute()

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
    startTime := "1678193138000" // string | startTime
    coin := "USDT" // string | coin (optional)
    pageSize := "10" // string | pageSize (optional)
    pageId := "pageId_example" // string | pageId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossInterestApi.CrossInterestList(context.Background()).StartTime(startTime).Coin(coin).PageSize(pageSize).PageId(pageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossInterestApi.CrossInterestList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CrossInterestList`: ApiResponseResultOfMarginInterestInfoResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossInterestApi.CrossInterestList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCrossInterestListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **coin** | **string** | coin | 
 **pageSize** | **string** | pageSize | 
 **pageId** | **string** | pageId | 

### Return type

[**ApiResponseResultOfMarginInterestInfoResult**](ApiResponseResultOfMarginInterestInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

