# Bitget\MarginIsolatedPublicApi

All URIs are relative to https://api.bitget.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**marginIsolatedPublicInterestRateAndLimit()**](MarginIsolatedPublicApi.md#marginIsolatedPublicInterestRateAndLimit) | **GET** /api/margin/v1/isolated/public/interestRateAndLimit | interestRateAndLimit |
| [**marginIsolatedPublicTierData()**](MarginIsolatedPublicApi.md#marginIsolatedPublicTierData) | **GET** /api/margin/v1/isolated/public/tierData | tierData |


## `marginIsolatedPublicInterestRateAndLimit()`

```php
marginIsolatedPublicInterestRateAndLimit($symbol): \Bitget\Model\ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult
```

interestRateAndLimit

Get InterestRateAndLimit

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new Bitget\Api\MarginIsolatedPublicApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$symbol = BTCUSDT; // string | symbol

try {
    $result = $apiInstance->marginIsolatedPublicInterestRateAndLimit($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedPublicApi->marginIsolatedPublicInterestRateAndLimit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| symbol | |

### Return type

[**\Bitget\Model\ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult**](../Model/ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginIsolatedPublicTierData()`

```php
marginIsolatedPublicTierData($symbol): \Bitget\Model\ApiResponseResultOfListOfMarginIsolatedLevelResult
```

tierData

Get TierData

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new Bitget\Api\MarginIsolatedPublicApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$symbol = BTCUSDT; // string | symbol

try {
    $result = $apiInstance->marginIsolatedPublicTierData($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedPublicApi->marginIsolatedPublicTierData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| symbol | |

### Return type

[**\Bitget\Model\ApiResponseResultOfListOfMarginIsolatedLevelResult**](../Model/ApiResponseResultOfListOfMarginIsolatedLevelResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
