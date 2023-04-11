# MarginIsolatedPublicApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marginIsolatedPublicInterestRateAndLimit**](MarginIsolatedPublicApi.md#marginIsolatedPublicInterestRateAndLimit) | **GET** /api/margin/v1/isolated/public/interestRateAndLimit | interestRateAndLimit |
| [**marginIsolatedPublicTierData**](MarginIsolatedPublicApi.md#marginIsolatedPublicTierData) | **GET** /api/margin/v1/isolated/public/tierData | tierData |


<a name="marginIsolatedPublicInterestRateAndLimit"></a>
# **marginIsolatedPublicInterestRateAndLimit**
> ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult marginIsolatedPublicInterestRateAndLimit(symbol)

interestRateAndLimit

Get InterestRateAndLimit

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");

    MarginIsolatedPublicApi apiInstance = new MarginIsolatedPublicApi(defaultClient);
    String symbol = "BTCUSDT"; // String | symbol
    try {
      ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult result = apiInstance.marginIsolatedPublicInterestRateAndLimit(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedPublicApi#marginIsolatedPublicInterestRateAndLimit");
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

### Return type

[**ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult**](ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult.md)

### Authorization

No authorization required

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

<a name="marginIsolatedPublicTierData"></a>
# **marginIsolatedPublicTierData**
> ApiResponseResultOfListOfMarginIsolatedLevelResult marginIsolatedPublicTierData(symbol)

tierData

Get TierData

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginIsolatedPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");

    MarginIsolatedPublicApi apiInstance = new MarginIsolatedPublicApi(defaultClient);
    String symbol = "BTCUSDT"; // String | symbol
    try {
      ApiResponseResultOfListOfMarginIsolatedLevelResult result = apiInstance.marginIsolatedPublicTierData(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginIsolatedPublicApi#marginIsolatedPublicTierData");
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

### Return type

[**ApiResponseResultOfListOfMarginIsolatedLevelResult**](ApiResponseResultOfListOfMarginIsolatedLevelResult.md)

### Authorization

No authorization required

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

