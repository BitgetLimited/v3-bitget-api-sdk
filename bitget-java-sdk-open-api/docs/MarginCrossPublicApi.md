# MarginCrossPublicApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marginCrossPublicInterestRateAndLimit**](MarginCrossPublicApi.md#marginCrossPublicInterestRateAndLimit) | **GET** /api/margin/v1/cross/public/interestRateAndLimit | interestRateAndLimit |
| [**marginCrossPublicTierData**](MarginCrossPublicApi.md#marginCrossPublicTierData) | **GET** /api/margin/v1/cross/public/tierData | tierData |


<a name="marginCrossPublicInterestRateAndLimit"></a>
# **marginCrossPublicInterestRateAndLimit**
> ApiResponseResultOfListOfMarginCrossRateAndLimitResult marginCrossPublicInterestRateAndLimit(coin)

interestRateAndLimit

Get InterestRateAndLimit

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");

    MarginCrossPublicApi apiInstance = new MarginCrossPublicApi(defaultClient);
    String coin = "USDT"; // String | coin
    try {
      ApiResponseResultOfListOfMarginCrossRateAndLimitResult result = apiInstance.marginCrossPublicInterestRateAndLimit(coin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossPublicApi#marginCrossPublicInterestRateAndLimit");
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
| **coin** | **String**| coin | |

### Return type

[**ApiResponseResultOfListOfMarginCrossRateAndLimitResult**](ApiResponseResultOfListOfMarginCrossRateAndLimitResult.md)

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

<a name="marginCrossPublicTierData"></a>
# **marginCrossPublicTierData**
> ApiResponseResultOfListOfMarginCrossLevelResult marginCrossPublicTierData(coin)

tierData

Get TierData

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");

    MarginCrossPublicApi apiInstance = new MarginCrossPublicApi(defaultClient);
    String coin = "USDT"; // String | coin
    try {
      ApiResponseResultOfListOfMarginCrossLevelResult result = apiInstance.marginCrossPublicTierData(coin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossPublicApi#marginCrossPublicTierData");
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
| **coin** | **String**| coin | |

### Return type

[**ApiResponseResultOfListOfMarginCrossLevelResult**](ApiResponseResultOfListOfMarginCrossLevelResult.md)

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

