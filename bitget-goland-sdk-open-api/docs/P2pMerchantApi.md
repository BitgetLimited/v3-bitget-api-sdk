# \P2pMerchantApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MerchantAdvList**](P2pMerchantApi.md#MerchantAdvList) | **Get** /api/p2p/v1/merchant/advList | advList
[**MerchantInfo**](P2pMerchantApi.md#MerchantInfo) | **Get** /api/p2p/v1/merchant/merchantInfo | merchantInfo
[**MerchantList**](P2pMerchantApi.md#MerchantList) | **Get** /api/p2p/v1/merchant/merchantList | merchantList
[**MerchantOrderList**](P2pMerchantApi.md#MerchantOrderList) | **Get** /api/p2p/v1/merchant/orderList | orderList



## MerchantAdvList

> ApiResponseResultOfMerchantAdvResult MerchantAdvList(ctx).StartTime(startTime).EndTime(endTime).Status(status).Type_(type_).AdvNo(advNo).Coin(coin).LanguageType(languageType).Fiat(fiat).LastMinId(lastMinId).PageSize(pageSize).OrderBy(orderBy).Execute()

advList



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
    endTime := "1678193338000" // string | endTime (optional)
    status := "upper" // string | status (optional)
    type_ := "sell" // string | type (optional)
    advNo := "1678193338000" // string | advNo (optional)
    coin := "USDT" // string | coin (optional)
    languageType := "en-US" // string | languageType (optional)
    fiat := "USD" // string | fiat (optional)
    lastMinId := "43534" // string | languageType (optional)
    pageSize := "10" // string | pageSize (optional)
    orderBy := "createTime" // string | orderBy (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.P2pMerchantApi.MerchantAdvList(context.Background()).StartTime(startTime).EndTime(endTime).Status(status).Type_(type_).AdvNo(advNo).Coin(coin).LanguageType(languageType).Fiat(fiat).LastMinId(lastMinId).PageSize(pageSize).OrderBy(orderBy).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `P2pMerchantApi.MerchantAdvList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MerchantAdvList`: ApiResponseResultOfMerchantAdvResult
    fmt.Fprintf(os.Stdout, "Response from `P2pMerchantApi.MerchantAdvList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMerchantAdvListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **endTime** | **string** | endTime | 
 **status** | **string** | status | 
 **type_** | **string** | type | 
 **advNo** | **string** | advNo | 
 **coin** | **string** | coin | 
 **languageType** | **string** | languageType | 
 **fiat** | **string** | fiat | 
 **lastMinId** | **string** | languageType | 
 **pageSize** | **string** | pageSize | 
 **orderBy** | **string** | orderBy | 

### Return type

[**ApiResponseResultOfMerchantAdvResult**](ApiResponseResultOfMerchantAdvResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MerchantInfo

> ApiResponseResultOfMerchantPersonInfo MerchantInfo(ctx).Execute()

merchantInfo



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
    resp, r, err := apiClient.P2pMerchantApi.MerchantInfo(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `P2pMerchantApi.MerchantInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MerchantInfo`: ApiResponseResultOfMerchantPersonInfo
    fmt.Fprintf(os.Stdout, "Response from `P2pMerchantApi.MerchantInfo`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiMerchantInfoRequest struct via the builder pattern


### Return type

[**ApiResponseResultOfMerchantPersonInfo**](ApiResponseResultOfMerchantPersonInfo.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MerchantList

> ApiResponseResultOfMerchantInfoResult MerchantList(ctx).Online(online).MerchantId(merchantId).LastMinId(lastMinId).PageSize(pageSize).Execute()

merchantList



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
    online := "yes" // string | online (optional)
    merchantId := "4534534534" // string | merchantId (optional)
    lastMinId := "1678193338000" // string | lastMinId (optional)
    pageSize := "10" // string | pageSize (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.P2pMerchantApi.MerchantList(context.Background()).Online(online).MerchantId(merchantId).LastMinId(lastMinId).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `P2pMerchantApi.MerchantList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MerchantList`: ApiResponseResultOfMerchantInfoResult
    fmt.Fprintf(os.Stdout, "Response from `P2pMerchantApi.MerchantList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMerchantListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **online** | **string** | online | 
 **merchantId** | **string** | merchantId | 
 **lastMinId** | **string** | lastMinId | 
 **pageSize** | **string** | pageSize | 

### Return type

[**ApiResponseResultOfMerchantInfoResult**](ApiResponseResultOfMerchantInfoResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MerchantOrderList

> ApiResponseResultOfMerchantOrderResult MerchantOrderList(ctx).StartTime(startTime).EndTime(endTime).Status(status).Type_(type_).AdvNo(advNo).OrderNo(orderNo).Coin(coin).LanguageType(languageType).Fiat(fiat).LastMinId(lastMinId).PageSize(pageSize).Execute()

orderList



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
    endTime := "1678193338000" // string | endTime (optional)
    status := "wait_pay" // string | status (optional)
    type_ := "sell" // string | type (optional)
    advNo := "1678193338000" // string | advNo (optional)
    orderNo := "23842478324723423" // string | orderNo (optional)
    coin := "USDT" // string | coin (optional)
    languageType := "en-US" // string | languageType (optional)
    fiat := "USD" // string | fiat (optional)
    lastMinId := "43534" // string | languageType (optional)
    pageSize := "10" // string | pageSize (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.P2pMerchantApi.MerchantOrderList(context.Background()).StartTime(startTime).EndTime(endTime).Status(status).Type_(type_).AdvNo(advNo).OrderNo(orderNo).Coin(coin).LanguageType(languageType).Fiat(fiat).LastMinId(lastMinId).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `P2pMerchantApi.MerchantOrderList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MerchantOrderList`: ApiResponseResultOfMerchantOrderResult
    fmt.Fprintf(os.Stdout, "Response from `P2pMerchantApi.MerchantOrderList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMerchantOrderListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | startTime | 
 **endTime** | **string** | endTime | 
 **status** | **string** | status | 
 **type_** | **string** | type | 
 **advNo** | **string** | advNo | 
 **orderNo** | **string** | orderNo | 
 **coin** | **string** | coin | 
 **languageType** | **string** | languageType | 
 **fiat** | **string** | fiat | 
 **lastMinId** | **string** | languageType | 
 **pageSize** | **string** | pageSize | 

### Return type

[**ApiResponseResultOfMerchantOrderResult**](ApiResponseResultOfMerchantOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

