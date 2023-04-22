# MarginIsolatedOrderApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marginIsolatedBatchCancelOrder**](MarginIsolatedOrderApi.md#marginIsolatedBatchCancelOrder) | **POST** /api/margin/v1/isolated/order/batchCancelOrder | batchCancelOrder |
| [**marginIsolatedBatchPlaceOrder**](MarginIsolatedOrderApi.md#marginIsolatedBatchPlaceOrder) | **POST** /api/margin/v1/isolated/order/batchPlaceOrder | batchPlaceOrder |
| [**marginIsolatedCancelOrder**](MarginIsolatedOrderApi.md#marginIsolatedCancelOrder) | **POST** /api/margin/v1/isolated/order/cancelOrder | cancelOrder |
| [**marginIsolatedFills**](MarginIsolatedOrderApi.md#marginIsolatedFills) | **GET** /api/margin/v1/isolated/order/fills | fills |
| [**marginIsolatedHistoryOrders**](MarginIsolatedOrderApi.md#marginIsolatedHistoryOrders) | **GET** /api/margin/v1/isolated/order/history | history |
| [**marginIsolatedOpenOrders**](MarginIsolatedOrderApi.md#marginIsolatedOpenOrders) | **GET** /api/margin/v1/isolated/order/openOrders | openOrders |
| [**marginIsolatedPlaceOrder**](MarginIsolatedOrderApi.md#marginIsolatedPlaceOrder) | **POST** /api/margin/v1/isolated/order/placeOrder | placeOrder |


<a name="marginIsolatedBatchCancelOrder"></a>
# **marginIsolatedBatchCancelOrder**
> ApiResponseResultOfMarginBatchCancelOrderResult marginIsolatedBatchCancelOrder(marginBatchCancelOrderRequest)

batchCancelOrder

Margin Isolated BatchCancelOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    MarginBatchCancelOrderRequest marginBatchCancelOrderRequest = new MarginBatchCancelOrderRequest(); // MarginBatchCancelOrderRequest | marginBatchCancelOrderRequest
    try {
      ApiResponseResultOfMarginBatchCancelOrderResult result = apiInstance.marginIsolatedBatchCancelOrder(marginBatchCancelOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedBatchCancelOrder");
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

<a name="marginIsolatedBatchPlaceOrder"></a>
# **marginIsolatedBatchPlaceOrder**
> ApiResponseResultOfMarginBatchPlaceOrderResult marginIsolatedBatchPlaceOrder(marginOrderRequest)

batchPlaceOrder

Margin Isolated PlaceOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    MarginBatchOrdersRequest marginOrderRequest = new MarginBatchOrdersRequest(); // MarginBatchOrdersRequest | marginOrderRequest
    try {
      ApiResponseResultOfMarginBatchPlaceOrderResult result = apiInstance.marginIsolatedBatchPlaceOrder(marginOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedBatchPlaceOrder");
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

<a name="marginIsolatedCancelOrder"></a>
# **marginIsolatedCancelOrder**
> ApiResponseResultOfMarginBatchCancelOrderResult marginIsolatedCancelOrder(marginCancelOrderRequest)

cancelOrder

Margin Isolated CancelOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    MarginCancelOrderRequest marginCancelOrderRequest = new MarginCancelOrderRequest(); // MarginCancelOrderRequest | marginCancelOrderRequest
    try {
      ApiResponseResultOfMarginBatchCancelOrderResult result = apiInstance.marginIsolatedCancelOrder(marginCancelOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedCancelOrder");
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

<a name="marginIsolatedFills"></a>
# **marginIsolatedFills**
> ApiResponseResultOfMarginTradeDetailInfoResult marginIsolatedFills(startTime, symbol, endTime, orderId, lastFillId, pageSize)

fills

Margin Isolated Fills

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    String startTime = "1678193338000"; // String | startTime
    String symbol = "BTCUSDT"; // String | symbol
    String endTime = "1678193338000"; // String | endTime
    String orderId = "32428347234"; // String | orderId
    String lastFillId = "lastFillId_example"; // String | lastFillId
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMarginTradeDetailInfoResult result = apiInstance.marginIsolatedFills(startTime, symbol, endTime, orderId, lastFillId, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedFills");
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
| **symbol** | **String**| symbol | [optional] |
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

<a name="marginIsolatedHistoryOrders"></a>
# **marginIsolatedHistoryOrders**
> ApiResponseResultOfMarginOpenOrderInfoResult marginIsolatedHistoryOrders(startTime, symbol, source, endTime, orderId, clientOid, pageSize, minId)

history

Margin Isolated historyOrders

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    String startTime = "1678193338000"; // String | startTime
    String symbol = "BTCUSDT"; // String | symbol
    String source = "API"; // String | source
    String endTime = "1678193338000"; // String | endTime
    String orderId = "32428347234"; // String | orderId
    String clientOid = "123456"; // String | clientOid
    String pageSize = "10"; // String | pageSize
    String minId = "minId_example"; // String | minId
    try {
      ApiResponseResultOfMarginOpenOrderInfoResult result = apiInstance.marginIsolatedHistoryOrders(startTime, symbol, source, endTime, orderId, clientOid, pageSize, minId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedHistoryOrders");
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
| **symbol** | **String**| symbol | [optional] |
| **source** | **String**| source | [optional] |
| **endTime** | **String**| endTime | [optional] |
| **orderId** | **String**| orderId | [optional] |
| **clientOid** | **String**| clientOid | [optional] |
| **pageSize** | **String**| pageSize | [optional] |
| **minId** | **String**| minId | [optional] |

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

<a name="marginIsolatedOpenOrders"></a>
# **marginIsolatedOpenOrders**
> ApiResponseResultOfMarginOpenOrderInfoResult marginIsolatedOpenOrders(symbol, startTime, endTime, orderId, clientOid, pageSize)

openOrders

Margin Isolated openOrders

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    String symbol = "BTCUSDT"; // String | symbol
    String startTime = "1678193338000"; // String | startTime
    String endTime = "1678193338000"; // String | endTime
    String orderId = "32428347234"; // String | orderId
    String clientOid = "123456"; // String | clientOid
    String pageSize = "10"; // String | pageSize
    try {
      ApiResponseResultOfMarginOpenOrderInfoResult result = apiInstance.marginIsolatedOpenOrders(symbol, startTime, endTime, orderId, clientOid, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedOpenOrders");
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

<a name="marginIsolatedPlaceOrder"></a>
# **marginIsolatedPlaceOrder**
> ApiResponseResultOfMarginPlaceOrderResult marginIsolatedPlaceOrder(marginOrderRequest)

placeOrder

Margin Isolated PlaceOrder

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedOrderApi;

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

    MarginIsolatedOrderApi apiInstance = new MarginIsolatedOrderApi(defaultClient);
    MarginOrderRequest marginOrderRequest = new MarginOrderRequest(); // MarginOrderRequest | marginOrderRequest
    try {
      ApiResponseResultOfMarginPlaceOrderResult result = apiInstance.marginIsolatedPlaceOrder(marginOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedOrderApi#marginIsolatedPlaceOrder");
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

