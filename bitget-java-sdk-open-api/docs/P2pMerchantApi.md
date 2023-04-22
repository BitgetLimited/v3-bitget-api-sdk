# P2pMerchantApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**merchantAdvList**](P2pMerchantApi.md#merchantAdvList) | **GET** /api/p2p/v1/merchant/advList | advList |
| [**merchantInfo**](P2pMerchantApi.md#merchantInfo) | **GET** /api/p2p/v1/merchant/merchantInfo | merchantInfo |
| [**merchantList**](P2pMerchantApi.md#merchantList) | **GET** /api/p2p/v1/merchant/merchantList | merchantList |
| [**merchantOrderList**](P2pMerchantApi.md#merchantOrderList) | **GET** /api/p2p/v1/merchant/orderList | orderList |


<a name="merchantAdvList"></a>
# **merchantAdvList**
> ApiResponseResultOfMerchantAdvResult merchantAdvList(startTime, endTime, status, type, advNo, coin, languageType, fiat, lastMinId, pageSize, orderBy)

advList

P2P merchant adv info

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.P2pMerchantApi;

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

    P2pMerchantApi apiInstance = new P2pMerchantApi(defaultClient);
    String startTime = "1678193338000"; // String | startTime
    String endTime = "1678193338000"; // String | endTime
    String status = "upper"; // String | status
    String type = "sell"; // String | type
    String advNo = "1678193338000"; // String | advNo
    String coin = "USDT"; // String | coin
    String languageType = "en-US"; // String | languageType
    String fiat = "USD"; // String | fiat
    String lastMinId = "43534"; // String | languageType
    String pageSize = "10"; // String | pageSize
    String orderBy = "createTime"; // String | orderBy
    try {
      ApiResponseResultOfMerchantAdvResult result = apiInstance.merchantAdvList(startTime, endTime, status, type, advNo, coin, languageType, fiat, lastMinId, pageSize, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling P2pMerchantApi#merchantAdvList");
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
| **endTime** | **String**| endTime | [optional] |
| **status** | **String**| status | [optional] |
| **type** | **String**| type | [optional] |
| **advNo** | **String**| advNo | [optional] |
| **coin** | **String**| coin | [optional] |
| **languageType** | **String**| languageType | [optional] |
| **fiat** | **String**| fiat | [optional] |
| **lastMinId** | **String**| languageType | [optional] |
| **pageSize** | **String**| pageSize | [optional] |
| **orderBy** | **String**| orderBy | [optional] |

### Return type

[**ApiResponseResultOfMerchantAdvResult**](ApiResponseResultOfMerchantAdvResult.md)

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

<a name="merchantInfo"></a>
# **merchantInfo**
> ApiResponseResultOfMerchantPersonInfo merchantInfo()

merchantInfo

P2P merchant info self

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.P2pMerchantApi;

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

    P2pMerchantApi apiInstance = new P2pMerchantApi(defaultClient);
    try {
      ApiResponseResultOfMerchantPersonInfo result = apiInstance.merchantInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling P2pMerchantApi#merchantInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseResultOfMerchantPersonInfo**](ApiResponseResultOfMerchantPersonInfo.md)

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

<a name="merchantList"></a>
# **merchantList**
> ApiResponseResultOfMerchantInfoResult merchantList(online, merchantId, lastMinId, pageSize)

merchantList

P2P merchant list

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.P2pMerchantApi;

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

    P2pMerchantApi apiInstance = new P2pMerchantApi(defaultClient);
    String online = "yes"; // String | online
    String merchantId = "4534534534"; // String | merchantId
    String lastMinId = "1678193338000"; // String | lastMinId
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMerchantInfoResult result = apiInstance.merchantList(online, merchantId, lastMinId, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling P2pMerchantApi#merchantList");
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
| **online** | **String**| online | [optional] |
| **merchantId** | **String**| merchantId | [optional] |
| **lastMinId** | **String**| lastMinId | [optional] |
| **pageSize** | **String**| pageSize | [optional] |

### Return type

[**ApiResponseResultOfMerchantInfoResult**](ApiResponseResultOfMerchantInfoResult.md)

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

<a name="merchantOrderList"></a>
# **merchantOrderList**
> ApiResponseResultOfMerchantOrderResult merchantOrderList(startTime, endTime, status, type, advNo, orderNo, coin, languageType, fiat, lastMinId, pageSize)

orderList

P2P merchant order info

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.P2pMerchantApi;

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

    P2pMerchantApi apiInstance = new P2pMerchantApi(defaultClient);
    String startTime = "1678193338000"; // String | startTime
    String endTime = "1678193338000"; // String | endTime
    String status = "wait_pay"; // String | status
    String type = "sell"; // String | type
    String advNo = "1678193338000"; // String | advNo
    String orderNo = "23842478324723423"; // String | orderNo
    String coin = "USDT"; // String | coin
    String languageType = "en-US"; // String | languageType
    String fiat = "USD"; // String | fiat
    String lastMinId = "43534"; // String | languageType
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMerchantOrderResult result = apiInstance.merchantOrderList(startTime, endTime, status, type, advNo, orderNo, coin, languageType, fiat, lastMinId, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling P2pMerchantApi#merchantOrderList");
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
| **endTime** | **String**| endTime | [optional] |
| **status** | **String**| status | [optional] |
| **type** | **String**| type | [optional] |
| **advNo** | **String**| advNo | [optional] |
| **orderNo** | **String**| orderNo | [optional] |
| **coin** | **String**| coin | [optional] |
| **languageType** | **String**| languageType | [optional] |
| **fiat** | **String**| fiat | [optional] |
| **lastMinId** | **String**| languageType | [optional] |
| **pageSize** | **String**| pageSize | [optional] |

### Return type

[**ApiResponseResultOfMerchantOrderResult**](ApiResponseResultOfMerchantOrderResult.md)

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

