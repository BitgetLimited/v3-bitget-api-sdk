# MarginCrossFinflowApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crossFinList**](MarginCrossFinflowApi.md#crossFinList) | **GET** /api/margin/v1/cross/fin/list | list |


<a name="crossFinList"></a>
# **crossFinList**
> ApiResponseResultOfMarginCrossFinFlowResult crossFinList(startTime, coin, endTime, marginType, pageSize, pageId)

list

Get finance flow List

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossFinflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");
    
    // Configure API key authorization: ACCESS_KEY
    ApiKeyAuth ACCESS_KEY = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_KEY");
    ACCESS_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_KEY.setApiKeyPrefix("Token");

    // Configure API key authorization: ACCESS_PASSPHRASE
    ApiKeyAuth ACCESS_PASSPHRASE = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_PASSPHRASE");
    ACCESS_PASSPHRASE.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_PASSPHRASE.setApiKeyPrefix("Token");

    // Configure API key authorization: ACCESS_SIGN
    ApiKeyAuth ACCESS_SIGN = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_SIGN");
    ACCESS_SIGN.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_SIGN.setApiKeyPrefix("Token");

    // Configure API key authorization: ACCESS_TIMESTAMP
    ApiKeyAuth ACCESS_TIMESTAMP = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_TIMESTAMP");
    ACCESS_TIMESTAMP.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_TIMESTAMP.setApiKeyPrefix("Token");

    // Configure API key authorization: SECRET_KEY
    ApiKeyAuth SECRET_KEY = (ApiKeyAuth) defaultClient.getAuthentication("SECRET_KEY");
    SECRET_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SECRET_KEY.setApiKeyPrefix("Token");

    MarginCrossFinflowApi apiInstance = new MarginCrossFinflowApi(defaultClient);
    String startTime = "1678193338000"; // String | startTime
    String coin = "USDT"; // String | coin
    String endTime = "1678193338000"; // String | endTime
    String marginType = "transfer_in"; // String | marginType
    String pageSize = "10"; // String | pageSize
    String pageId = "minId"; // String | pageId
    try {
      ApiResponseResultOfMarginCrossFinFlowResult result = apiInstance.crossFinList(startTime, coin, endTime, marginType, pageSize, pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossFinflowApi#crossFinList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | **String**| startTime | |
| **coin** | **String**| coin | [optional] |
| **endTime** | **String**| endTime | [optional] |
| **marginType** | **String**| marginType | [optional] |
| **pageSize** | **String**| pageSize | [optional] |
| **pageId** | **String**| pageId | [optional] |

### Return type

[**ApiResponseResultOfMarginCrossFinFlowResult**](ApiResponseResultOfMarginCrossFinFlowResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Gateway Frequency Limit |  -  |
| **500** | Server Error |  -  |

