# MarginPublicApi

All URIs are relative to *https://api.bitget.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marginPublicCurrencies**](MarginPublicApi.md#marginPublicCurrencies) | **GET** /api/margin/v1/public/currencies | currencies |


<a name="marginPublicCurrencies"></a>
# **marginPublicCurrencies**
> ApiResponseResultOfListOfMarginSystemResult marginPublicCurrencies()

currencies

Get Currencies

### Example
```java
// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");

    MarginPublicApi apiInstance = new MarginPublicApi(defaultClient);
    try {
      ApiResponseResultOfListOfMarginSystemResult result = apiInstance.marginPublicCurrencies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginPublicApi#marginPublicCurrencies");
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

[**ApiResponseResultOfListOfMarginSystemResult**](ApiResponseResultOfListOfMarginSystemResult.md)

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

