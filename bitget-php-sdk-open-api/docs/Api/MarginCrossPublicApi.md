# Bitget\MarginCrossPublicApi

All URIs are relative to https://api.bitget.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**marginCrossPublicInterestRateAndLimit()**](MarginCrossPublicApi.md#marginCrossPublicInterestRateAndLimit) | **GET** /api/margin/v1/cross/public/interestRateAndLimit | interestRateAndLimit |
| [**marginCrossPublicTierData()**](MarginCrossPublicApi.md#marginCrossPublicTierData) | **GET** /api/margin/v1/cross/public/tierData | tierData |


## `marginCrossPublicInterestRateAndLimit()`

```php
marginCrossPublicInterestRateAndLimit($coin): \Bitget\Model\ApiResponseResultOfListOfMarginCrossRateAndLimitResult
```

interestRateAndLimit

Get InterestRateAndLimit

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new Bitget\Api\MarginCrossPublicApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$coin = USDT; // string | coin

try {
    $result = $apiInstance->marginCrossPublicInterestRateAndLimit($coin);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossPublicApi->marginCrossPublicInterestRateAndLimit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coin** | **string**| coin | |

### Return type

[**\Bitget\Model\ApiResponseResultOfListOfMarginCrossRateAndLimitResult**](../Model/ApiResponseResultOfListOfMarginCrossRateAndLimitResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossPublicTierData()`

```php
marginCrossPublicTierData($coin): \Bitget\Model\ApiResponseResultOfListOfMarginCrossLevelResult
```

tierData

Get TierData

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new Bitget\Api\MarginCrossPublicApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$coin = USDT; // string | coin

try {
    $result = $apiInstance->marginCrossPublicTierData($coin);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossPublicApi->marginCrossPublicTierData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coin** | **string**| coin | |

### Return type

[**\Bitget\Model\ApiResponseResultOfListOfMarginCrossLevelResult**](../Model/ApiResponseResultOfListOfMarginCrossLevelResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
