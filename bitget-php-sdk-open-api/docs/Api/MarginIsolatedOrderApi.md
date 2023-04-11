# Bitget\MarginIsolatedOrderApi

All URIs are relative to https://api.bitget.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**marginIsolatedBatchCancelOrder()**](MarginIsolatedOrderApi.md#marginIsolatedBatchCancelOrder) | **POST** /api/margin/v1/isolated/order/batchCancelOrder | batchCancelOrder |
| [**marginIsolatedBatchPlaceOrder()**](MarginIsolatedOrderApi.md#marginIsolatedBatchPlaceOrder) | **POST** /api/margin/v1/isolated/order/batchPlaceOrder | batchPlaceOrder |
| [**marginIsolatedCancelOrder()**](MarginIsolatedOrderApi.md#marginIsolatedCancelOrder) | **POST** /api/margin/v1/isolated/order/cancelOrder | cancelOrder |
| [**marginIsolatedFills()**](MarginIsolatedOrderApi.md#marginIsolatedFills) | **GET** /api/margin/v1/isolated/order/fills | fills |
| [**marginIsolatedHistoryOrders()**](MarginIsolatedOrderApi.md#marginIsolatedHistoryOrders) | **GET** /api/margin/v1/isolated/order/history | history |
| [**marginIsolatedOpenOrders()**](MarginIsolatedOrderApi.md#marginIsolatedOpenOrders) | **GET** /api/margin/v1/isolated/order/openOrders | openOrders |
| [**marginIsolatedPlaceOrder()**](MarginIsolatedOrderApi.md#marginIsolatedPlaceOrder) | **POST** /api/margin/v1/isolated/order/placeOrder | placeOrder |


## `marginIsolatedBatchCancelOrder()`

```php
marginIsolatedBatchCancelOrder($margin_batch_cancel_order_request): \Bitget\Model\ApiResponseResultOfMarginBatchCancelOrderResult
```

batchCancelOrder

Margin Isolated BatchCancelOrder

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_batch_cancel_order_request = new \Bitget\Model\MarginBatchCancelOrderRequest(); // \Bitget\Model\MarginBatchCancelOrderRequest | marginBatchCancelOrderRequest

try {
    $result = $apiInstance->marginIsolatedBatchCancelOrder($margin_batch_cancel_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedBatchCancelOrder: ', $e->getMessage(), PHP_EOL;
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

## `marginIsolatedBatchPlaceOrder()`

```php
marginIsolatedBatchPlaceOrder($margin_order_request): \Bitget\Model\ApiResponseResultOfMarginBatchPlaceOrderResult
```

batchPlaceOrder

Margin Isolated PlaceOrder

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_order_request = new \Bitget\Model\MarginBatchOrdersRequest(); // \Bitget\Model\MarginBatchOrdersRequest | marginOrderRequest

try {
    $result = $apiInstance->marginIsolatedBatchPlaceOrder($margin_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedBatchPlaceOrder: ', $e->getMessage(), PHP_EOL;
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

## `marginIsolatedCancelOrder()`

```php
marginIsolatedCancelOrder($margin_cancel_order_request): \Bitget\Model\ApiResponseResultOfMarginBatchCancelOrderResult
```

cancelOrder

Margin Isolated CancelOrder

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_cancel_order_request = new \Bitget\Model\MarginCancelOrderRequest(); // \Bitget\Model\MarginCancelOrderRequest | marginCancelOrderRequest

try {
    $result = $apiInstance->marginIsolatedCancelOrder($margin_cancel_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedCancelOrder: ', $e->getMessage(), PHP_EOL;
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

## `marginIsolatedFills()`

```php
marginIsolatedFills($start_time, $symbol, $end_time, $order_id, $last_fill_id, $page_size): \Bitget\Model\ApiResponseResultOfMarginTradeDetailInfoResult
```

fills

Margin Isolated Fills

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 1678193338000; // string | startTime
$symbol = BTCUSDT; // string | symbol
$end_time = 1678193338000; // string | endTime
$order_id = 32428347234; // string | orderId
$last_fill_id = 'last_fill_id_example'; // string | lastFillId
$page_size = 10; // string | pageSize

try {
    $result = $apiInstance->marginIsolatedFills($start_time, $symbol, $end_time, $order_id, $last_fill_id, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedFills: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **string**| startTime | |
| **symbol** | **string**| symbol | [optional] |
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

## `marginIsolatedHistoryOrders()`

```php
marginIsolatedHistoryOrders($start_time, $symbol, $source, $end_time, $order_id, $client_oid, $page_size, $min_id): \Bitget\Model\ApiResponseResultOfMarginOpenOrderInfoResult
```

history

Margin Isolated historyOrders

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 1678193338000; // string | startTime
$symbol = BTCUSDT; // string | symbol
$source = API; // string | source
$end_time = 1678193338000; // string | endTime
$order_id = 32428347234; // string | orderId
$client_oid = 123456; // string | clientOid
$page_size = 10; // string | pageSize
$min_id = 'min_id_example'; // string | minId

try {
    $result = $apiInstance->marginIsolatedHistoryOrders($start_time, $symbol, $source, $end_time, $order_id, $client_oid, $page_size, $min_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedHistoryOrders: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **string**| startTime | |
| **symbol** | **string**| symbol | [optional] |
| **source** | **string**| source | [optional] |
| **end_time** | **string**| endTime | [optional] |
| **order_id** | **string**| orderId | [optional] |
| **client_oid** | **string**| clientOid | [optional] |
| **page_size** | **string**| pageSize | [optional] |
| **min_id** | **string**| minId | [optional] |

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

## `marginIsolatedOpenOrders()`

```php
marginIsolatedOpenOrders($symbol, $start_time, $end_time, $order_id, $client_oid, $page_size): \Bitget\Model\ApiResponseResultOfMarginOpenOrderInfoResult
```

openOrders

Margin Isolated openOrders

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
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
    $result = $apiInstance->marginIsolatedOpenOrders($symbol, $start_time, $end_time, $order_id, $client_oid, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedOpenOrders: ', $e->getMessage(), PHP_EOL;
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

## `marginIsolatedPlaceOrder()`

```php
marginIsolatedPlaceOrder($margin_order_request): \Bitget\Model\ApiResponseResultOfMarginPlaceOrderResult
```

placeOrder

Margin Isolated PlaceOrder

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


$apiInstance = new Bitget\Api\MarginIsolatedOrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$margin_order_request = new \Bitget\Model\MarginOrderRequest(); // \Bitget\Model\MarginOrderRequest | marginOrderRequest

try {
    $result = $apiInstance->marginIsolatedPlaceOrder($margin_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarginIsolatedOrderApi->marginIsolatedPlaceOrder: ', $e->getMessage(), PHP_EOL;
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
