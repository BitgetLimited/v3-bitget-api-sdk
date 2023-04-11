# Bitget\MarginPublicApi

All URIs are relative to https://api.bitget.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**marginPublicCurrencies()**](MarginPublicApi.md#marginPublicCurrencies) | **GET** /api/margin/v1/public/currencies | currencies |


## `marginPublicCurrencies()`

```php
marginPublicCurrencies(): \Bitget\Model\ApiResponseResultOfListOfMarginSystemResult
```

currencies

Get Currencies

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new Bitget\Api\MarginPublicApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->marginPublicCurrencies();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginPublicApi->marginPublicCurrencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\Bitget\Model\ApiResponseResultOfListOfMarginSystemResult**](../Model/ApiResponseResultOfListOfMarginSystemResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
