# \MarginCrossFinflowApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CrossFinList**](MarginCrossFinflowApi.md#CrossFinList) | **Get** /api/margin/v1/cross/fin/list | list



## CrossFinList

> ApiResponseResultOfMarginCrossFinFlowResult CrossFinList(ctx).StartTime(startTime).Coin(coin).EndTime(endTime).MarginType(marginType).PageSize(pageSize).PageId(pageId).Execute()

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
    endTime := "1678193338000" // string | endTime (optional)
    marginType := "transfer_in" // string | marginType (optional)
    pageSize := "10" // string | pageSize (optional)
    pageId := "minId" // string | pageId (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MarginCrossFinflowApi.CrossFinList(context.Background()).StartTime(startTime).Coin(coin).EndTime(endTime).MarginType(marginType).PageSize(pageSize).PageId(pageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MarginCrossFinflowApi.CrossFinList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CrossFinList`: ApiResponseResultOfMarginCrossFinFlowResult
    fmt.Fprintf(os.Stdout, "Response from `MarginCrossFinflowApi.CrossFinList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCrossFinListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **coin** | **string** | coin | 
 **endTime** | **string** | endTime | 
 **marginType** | **string** | marginType | 
 **pageSize** | **string** | pageSize | 
 **pageId** | **string** | pageId | 

### Return type

[**ApiResponseResultOfMarginCrossFinFlowResult**](ApiResponseResultOfMarginCrossFinFlowResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

