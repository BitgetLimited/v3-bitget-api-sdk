# MarginCrossOrderApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marginCrossBatchCancelOrder**](MarginCrossOrderApi.md#marginCrossBatchCancelOrder) | **POST** /api/margin/v1/cross/order/batchCancelOrder | batchCancelOrder |
| [**marginCrossBatchPlaceOrder**](MarginCrossOrderApi.md#marginCrossBatchPlaceOrder) | **POST** /api/margin/v1/cross/order/batchPlaceOrder | batchPlaceOrder |
| [**marginCrossCancelOrder**](MarginCrossOrderApi.md#marginCrossCancelOrder) | **POST** /api/margin/v1/cross/order/cancelOrder | cancelOrder |
| [**marginCrossFills**](MarginCrossOrderApi.md#marginCrossFills) | **GET** /api/margin/v1/cross/order/fills | fills |
| [**marginCrossHistoryOrders**](MarginCrossOrderApi.md#marginCrossHistoryOrders) | **GET** /api/margin/v1/cross/order/history | history |
| [**marginCrossOpenOrders**](MarginCrossOrderApi.md#marginCrossOpenOrders) | **GET** /api/margin/v1/cross/order/openOrders | openOrders |
| [**marginCrossPlaceOrder**](MarginCrossOrderApi.md#marginCrossPlaceOrder) | **POST** /api/margin/v1/cross/order/placeOrder | placeOrder |


<a name="marginCrossBatchCancelOrder"></a>
# **marginCrossBatchCancelOrder**
> ApiResponseResultOfMarginBatchCancelOrderResult marginCrossBatchCancelOrder(marginBatchCancelOrderRequest)

batchCancelOrder

Margin Cross BatchCancelOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    MarginBatchCancelOrderRequest marginBatchCancelOrderRequest = new MarginBatchCancelOrderRequest(); // MarginBatchCancelOrderRequest | marginBatchCancelOrderRequest
    try {
      ApiResponseResultOfMarginBatchCancelOrderResult result = apiInstance.marginCrossBatchCancelOrder(marginBatchCancelOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossBatchCancelOrder");
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
| **marginBatchCancelOrderRequest** | [**MarginBatchCancelOrderRequest**](MarginBatchCancelOrderRequest.md)| marginBatchCancelOrderRequest | |

### Return type

[**ApiResponseResultOfMarginBatchCancelOrderResult**](ApiResponseResultOfMarginBatchCancelOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Gateway Frequency Limit |  -  |
| **500** | Server Error |  -  |

<a name="marginCrossBatchPlaceOrder"></a>
# **marginCrossBatchPlaceOrder**
> ApiResponseResultOfMarginBatchPlaceOrderResult marginCrossBatchPlaceOrder(marginOrderRequest)

batchPlaceOrder

Margin Cross PlaceOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    MarginBatchOrdersRequest marginOrderRequest = new MarginBatchOrdersRequest(); // MarginBatchOrdersRequest | marginOrderRequest
    try {
      ApiResponseResultOfMarginBatchPlaceOrderResult result = apiInstance.marginCrossBatchPlaceOrder(marginOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossBatchPlaceOrder");
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
| **marginOrderRequest** | [**MarginBatchOrdersRequest**](MarginBatchOrdersRequest.md)| marginOrderRequest | |

### Return type

[**ApiResponseResultOfMarginBatchPlaceOrderResult**](ApiResponseResultOfMarginBatchPlaceOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Gateway Frequency Limit |  -  |
| **500** | Server Error |  -  |

<a name="marginCrossCancelOrder"></a>
# **marginCrossCancelOrder**
> ApiResponseResultOfMarginBatchCancelOrderResult marginCrossCancelOrder(marginCancelOrderRequest)

cancelOrder

Margin Cross CancelOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    MarginCancelOrderRequest marginCancelOrderRequest = new MarginCancelOrderRequest(); // MarginCancelOrderRequest | marginCancelOrderRequest
    try {
      ApiResponseResultOfMarginBatchCancelOrderResult result = apiInstance.marginCrossCancelOrder(marginCancelOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossCancelOrder");
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
| **marginCancelOrderRequest** | [**MarginCancelOrderRequest**](MarginCancelOrderRequest.md)| marginCancelOrderRequest | |

### Return type

[**ApiResponseResultOfMarginBatchCancelOrderResult**](ApiResponseResultOfMarginBatchCancelOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Gateway Frequency Limit |  -  |
| **500** | Server Error |  -  |

<a name="marginCrossFills"></a>
# **marginCrossFills**
> ApiResponseResultOfMarginTradeDetailInfoResult marginCrossFills(symbol, startTime, source, endTime, orderId, lastFillId, pageSize)

fills

Margin Cross Fills

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    String symbol = "BTCUSDT"; // String | symbol
    String startTime = "1678193338000"; // String | startTime
    String source = "API"; // String | source
    String endTime = "1678193338000"; // String | endTime
    String orderId = "32428347234"; // String | orderId
    String lastFillId = "lastFillId_example"; // String | lastFillId
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMarginTradeDetailInfoResult result = apiInstance.marginCrossFills(symbol, startTime, source, endTime, orderId, lastFillId, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossFills");
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
| **symbol** | **String**| symbol | |
| **startTime** | **String**| startTime | |
| **source** | **String**| source | [optional] |
| **endTime** | **String**| endTime | [optional] |
| **orderId** | **String**| orderId | [optional] |
| **lastFillId** | **String**| lastFillId | [optional] |
| **pageSize** | **String**| pageSize | [optional] |

### Return type

[**ApiResponseResultOfMarginTradeDetailInfoResult**](ApiResponseResultOfMarginTradeDetailInfoResult.md)

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

<a name="marginCrossHistoryOrders"></a>
# **marginCrossHistoryOrders**
> ApiResponseResultOfMarginOpenOrderInfoResult marginCrossHistoryOrders(symbol, startTime, source, endTime, orderId, clientOid, minId, pageSize)

history

Margin Cross historyOrders

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    String symbol = "BTCUSDT"; // String | symbol
    String startTime = "1678193338000"; // String | startTime
    String source = "API"; // String | source
    String endTime = "1678193338000"; // String | endTime
    String orderId = "32428347234"; // String | orderId
    String clientOid = "123456"; // String | clientOid
    String minId = "minId_example"; // String | minId
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMarginOpenOrderInfoResult result = apiInstance.marginCrossHistoryOrders(symbol, startTime, source, endTime, orderId, clientOid, minId, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossHistoryOrders");
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
| **symbol** | **String**| symbol | |
| **startTime** | **String**| startTime | |
| **source** | **String**| source | [optional] |
| **endTime** | **String**| endTime | [optional] |
| **orderId** | **String**| orderId | [optional] |
| **clientOid** | **String**| clientOid | [optional] |
| **minId** | **String**| minId | [optional] |
| **pageSize** | **String**| pageSize | [optional] |

### Return type

[**ApiResponseResultOfMarginOpenOrderInfoResult**](ApiResponseResultOfMarginOpenOrderInfoResult.md)

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

<a name="marginCrossOpenOrders"></a>
# **marginCrossOpenOrders**
> ApiResponseResultOfMarginOpenOrderInfoResult marginCrossOpenOrders(symbol, startTime, endTime, orderId, clientOid, pageSize)

openOrders

Margin Cross openOrders

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    String symbol = "BTCUSDT"; // String | symbol
    String startTime = "1678193338000"; // String | startTime
    String endTime = "1678193338000"; // String | endTime
    String orderId = "32428347234"; // String | orderId
    String clientOid = "123456"; // String | clientOid
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMarginOpenOrderInfoResult result = apiInstance.marginCrossOpenOrders(symbol, startTime, endTime, orderId, clientOid, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossOpenOrders");
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
| **symbol** | **String**| symbol | |
| **startTime** | **String**| startTime | |
| **endTime** | **String**| endTime | [optional] |
| **orderId** | **String**| orderId | [optional] |
| **clientOid** | **String**| clientOid | [optional] |
| **pageSize** | **String**| pageSize | [optional] |

### Return type

[**ApiResponseResultOfMarginOpenOrderInfoResult**](ApiResponseResultOfMarginOpenOrderInfoResult.md)

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

<a name="marginCrossPlaceOrder"></a>
# **marginCrossPlaceOrder**
> ApiResponseResultOfMarginPlaceOrderResult marginCrossPlaceOrder(marginOrderRequest)

placeOrder

Margin Cross PlaceOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossOrderApi;

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

    MarginCrossOrderApi apiInstance = new MarginCrossOrderApi(defaultClient);
    MarginOrderRequest marginOrderRequest = new MarginOrderRequest(); // MarginOrderRequest | marginOrderRequest
    try {
      ApiResponseResultOfMarginPlaceOrderResult result = apiInstance.marginCrossPlaceOrder(marginOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossOrderApi#marginCrossPlaceOrder");
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
| **marginOrderRequest** | [**MarginOrderRequest**](MarginOrderRequest.md)| marginOrderRequest | |

### Return type

[**ApiResponseResultOfMarginPlaceOrderResult**](ApiResponseResultOfMarginPlaceOrderResult.md)

### Authorization

[ACCESS_KEY](../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../README.md#SECRET_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Gateway Frequency Limit |  -  |
| **500** | Server Error |  -  |

