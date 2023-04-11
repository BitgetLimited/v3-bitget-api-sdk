# Bitget\MarginCrossOrderApi

All URIs are relative to https://api.bitget.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**marginCrossBatchCancelOrder()**](MarginCrossOrderApi.md#marginCrossBatchCancelOrder) | **POST** /api/margin/v1/cross/order/batchCancelOrder | batchCancelOrder |
| [**marginCrossBatchPlaceOrder()**](MarginCrossOrderApi.md#marginCrossBatchPlaceOrder) | **POST** /api/margin/v1/cross/order/batchPlaceOrder | batchPlaceOrder |
| [**marginCrossCancelOrder()**](MarginCrossOrderApi.md#marginCrossCancelOrder) | **POST** /api/margin/v1/cross/order/cancelOrder | cancelOrder |
| [**marginCrossFills()**](MarginCrossOrderApi.md#marginCrossFills) | **GET** /api/margin/v1/cross/order/fills | fills |
| [**marginCrossHistoryOrders()**](MarginCrossOrderApi.md#marginCrossHistoryOrders) | **GET** /api/margin/v1/cross/order/history | history |
| [**marginCrossOpenOrders()**](MarginCrossOrderApi.md#marginCrossOpenOrders) | **GET** /api/margin/v1/cross/order/openOrders | openOrders |
| [**marginCrossPlaceOrder()**](MarginCrossOrderApi.md#marginCrossPlaceOrder) | **POST** /api/margin/v1/cross/order/placeOrder | placeOrder |


## `marginCrossBatchCancelOrder()`

```php
marginCrossBatchCancelOrder($margin_batch_cancel_order_request): \Bitget\Model\ApiResponseResultOfMarginBatchCancelOrderResult
```

batchCancelOrder

Margin Cross BatchCancelOrder

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_batch_cancel_order_request = new \Bitget\Model\MarginBatchCancelOrderRequest(); // \Bitget\Model\MarginBatchCancelOrderRequest | marginBatchCancelOrderRequest

try {
    $result = $apiInstance->marginCrossBatchCancelOrder($margin_batch_cancel_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossBatchCancelOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **margin_batch_cancel_order_request** | [**\Bitget\Model\MarginBatchCancelOrderRequest**](../Model/MarginBatchCancelOrderRequest.md)| marginBatchCancelOrderRequest | |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginBatchCancelOrderResult**](../Model/ApiResponseResultOfMarginBatchCancelOrderResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossBatchPlaceOrder()`

```php
marginCrossBatchPlaceOrder($margin_order_request): \Bitget\Model\ApiResponseResultOfMarginBatchPlaceOrderResult
```

batchPlaceOrder

Margin Cross PlaceOrder

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_order_request = new \Bitget\Model\MarginBatchOrdersRequest(); // \Bitget\Model\MarginBatchOrdersRequest | marginOrderRequest

try {
    $result = $apiInstance->marginCrossBatchPlaceOrder($margin_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossBatchPlaceOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **margin_order_request** | [**\Bitget\Model\MarginBatchOrdersRequest**](../Model/MarginBatchOrdersRequest.md)| marginOrderRequest | |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginBatchPlaceOrderResult**](../Model/ApiResponseResultOfMarginBatchPlaceOrderResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossCancelOrder()`

```php
marginCrossCancelOrder($margin_cancel_order_request): \Bitget\Model\ApiResponseResultOfMarginBatchCancelOrderResult
```

cancelOrder

Margin Cross CancelOrder

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_cancel_order_request = new \Bitget\Model\MarginCancelOrderRequest(); // \Bitget\Model\MarginCancelOrderRequest | marginCancelOrderRequest

try {
    $result = $apiInstance->marginCrossCancelOrder($margin_cancel_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossCancelOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **margin_cancel_order_request** | [**\Bitget\Model\MarginCancelOrderRequest**](../Model/MarginCancelOrderRequest.md)| marginCancelOrderRequest | |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginBatchCancelOrderResult**](../Model/ApiResponseResultOfMarginBatchCancelOrderResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossFills()`

```php
marginCrossFills($symbol, $start_time, $source, $end_time, $order_id, $last_fill_id, $page_size): \Bitget\Model\ApiResponseResultOfMarginTradeDetailInfoResult
```

fills

Margin Cross Fills

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = BTCUSDT; // string | symbol
$start_time = 1678193338000; // string | startTime
$source = API; // string | source
$end_time = 1678193338000; // string | endTime
$order_id = 32428347234; // string | orderId
$last_fill_id = 'last_fill_id_example'; // string | lastFillId
$page_size = 10; // string | pageSize

try {
    $result = $apiInstance->marginCrossFills($symbol, $start_time, $source, $end_time, $order_id, $last_fill_id, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossFills: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| symbol | |
| **start_time** | **string**| startTime | |
| **source** | **string**| source | [optional] |
| **end_time** | **string**| endTime | [optional] |
| **order_id** | **string**| orderId | [optional] |
| **last_fill_id** | **string**| lastFillId | [optional] |
| **page_size** | **string**| pageSize | [optional] |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginTradeDetailInfoResult**](../Model/ApiResponseResultOfMarginTradeDetailInfoResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossHistoryOrders()`

```php
marginCrossHistoryOrders($symbol, $start_time, $source, $end_time, $order_id, $client_oid, $min_id, $page_size): \Bitget\Model\ApiResponseResultOfMarginOpenOrderInfoResult
```

history

Margin Cross historyOrders

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = BTCUSDT; // string | symbol
$start_time = 1678193338000; // string | startTime
$source = API; // string | source
$end_time = 1678193338000; // string | endTime
$order_id = 32428347234; // string | orderId
$client_oid = 123456; // string | clientOid
$min_id = 'min_id_example'; // string | minId
$page_size = 10; // string | pageSize

try {
    $result = $apiInstance->marginCrossHistoryOrders($symbol, $start_time, $source, $end_time, $order_id, $client_oid, $min_id, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossHistoryOrders: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| symbol | |
| **start_time** | **string**| startTime | |
| **source** | **string**| source | [optional] |
| **end_time** | **string**| endTime | [optional] |
| **order_id** | **string**| orderId | [optional] |
| **client_oid** | **string**| clientOid | [optional] |
| **min_id** | **string**| minId | [optional] |
| **page_size** | **string**| pageSize | [optional] |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginOpenOrderInfoResult**](../Model/ApiResponseResultOfMarginOpenOrderInfoResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossOpenOrders()`

```php
marginCrossOpenOrders($symbol, $start_time, $end_time, $order_id, $client_oid, $page_size): \Bitget\Model\ApiResponseResultOfMarginOpenOrderInfoResult
```

openOrders

Margin Cross openOrders

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = BTCUSDT; // string | symbol
$start_time = 1678193338000; // string | startTime
$end_time = 1678193338000; // string | endTime
$order_id = 32428347234; // string | orderId
$client_oid = 123456; // string | clientOid
$page_size = 10; // string | pageSize

try {
    $result = $apiInstance->marginCrossOpenOrders($symbol, $start_time, $end_time, $order_id, $client_oid, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossOpenOrders: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| symbol | |
| **start_time** | **string**| startTime | |
| **end_time** | **string**| endTime | [optional] |
| **order_id** | **string**| orderId | [optional] |
| **client_oid** | **string**| clientOid | [optional] |
| **page_size** | **string**| pageSize | [optional] |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginOpenOrderInfoResult**](../Model/ApiResponseResultOfMarginOpenOrderInfoResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `marginCrossPlaceOrder()`

```php
marginCrossPlaceOrder($margin_order_request): \Bitget\Model\ApiResponseResultOfMarginPlaceOrderResult
```

placeOrder

Margin Cross PlaceOrder

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ACCESS_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-KEY', 'Bearer');

// Configure API key authorization: ACCESS_PASSPHRASE
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-PASSPHRASE', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-PASSPHRASE', 'Bearer');

// Configure API key authorization: ACCESS_SIGN
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-SIGN', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-SIGN', 'Bearer');

// Configure API key authorization: ACCESS_TIMESTAMP
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('ACCESS-TIMESTAMP', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ACCESS-TIMESTAMP', 'Bearer');

// Configure API key authorization: SECRET_KEY
$config = Bitget\Configuration::getDefaultConfiguration()->setApiKey('SECRET-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Bitget\Configuration::getDefaultConfiguration()->setApiKeyPrefix('SECRET-KEY', 'Bearer');


$apiInstance = new Bitget\Api\MarginCrossOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_order_request = new \Bitget\Model\MarginOrderRequest(); // \Bitget\Model\MarginOrderRequest | marginOrderRequest

try {
    $result = $apiInstance->marginCrossPlaceOrder($margin_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginCrossOrderApi->marginCrossPlaceOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **margin_order_request** | [**\Bitget\Model\MarginOrderRequest**](../Model/MarginOrderRequest.md)| marginOrderRequest | |

### Return type

[**\Bitget\Model\ApiResponseResultOfMarginPlaceOrderResult**](../Model/ApiResponseResultOfMarginPlaceOrderResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
