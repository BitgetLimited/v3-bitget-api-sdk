# Bitget\P2pMerchantApi

All URIs are relative to https://api.bitget.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**merchantAdvList()**](P2pMerchantApi.md#merchantAdvList) | **GET** /api/p2p/v1/merchant/advList | advList |
| [**merchantInfo()**](P2pMerchantApi.md#merchantInfo) | **GET** /api/p2p/v1/merchant/merchantInfo | merchantInfo |
| [**merchantList()**](P2pMerchantApi.md#merchantList) | **GET** /api/p2p/v1/merchant/merchantList | merchantList |
| [**merchantOrderList()**](P2pMerchantApi.md#merchantOrderList) | **GET** /api/p2p/v1/merchant/orderList | orderList |


## `merchantAdvList()`

```php
merchantAdvList($start_time, $end_time, $status, $type, $adv_no, $coin, $language_type, $fiat, $last_min_id, $page_size, $order_by): \Bitget\Model\ApiResponseResultOfMerchantAdvResult
```

advList

P2P merchant adv info

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


$apiInstance = new Bitget\Api\P2pMerchantApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 1678193338000; // string | startTime
$end_time = 1678193338000; // string | endTime
$status = upper; // string | status
$type = sell; // string | type
$adv_no = 1678193338000; // string | advNo
$coin = USDT; // string | coin
$language_type = en-US; // string | languageType
$fiat = USD; // string | fiat
$last_min_id = 43534; // string | languageType
$page_size = 10; // string | pageSize
$order_by = createTime; // string | orderBy

try {
    $result = $apiInstance->merchantAdvList($start_time, $end_time, $status, $type, $adv_no, $coin, $language_type, $fiat, $last_min_id, $page_size, $order_by);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling P2pMerchantApi->merchantAdvList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **string**| startTime | |
| **end_time** | **string**| endTime | [optional] |
| **status** | **string**| status | [optional] |
| **type** | **string**| type | [optional] |
| **adv_no** | **string**| advNo | [optional] |
| **coin** | **string**| coin | [optional] |
| **language_type** | **string**| languageType | [optional] |
| **fiat** | **string**| fiat | [optional] |
| **last_min_id** | **string**| languageType | [optional] |
| **page_size** | **string**| pageSize | [optional] |
| **order_by** | **string**| orderBy | [optional] |

### Return type

[**\Bitget\Model\ApiResponseResultOfMerchantAdvResult**](../Model/ApiResponseResultOfMerchantAdvResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `merchantInfo()`

```php
merchantInfo(): \Bitget\Model\ApiResponseResultOfMerchantPersonInfo
```

merchantInfo

P2P merchant info self

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


$apiInstance = new Bitget\Api\P2pMerchantApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->merchantInfo();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling P2pMerchantApi->merchantInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\Bitget\Model\ApiResponseResultOfMerchantPersonInfo**](../Model/ApiResponseResultOfMerchantPersonInfo.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `merchantList()`

```php
merchantList($online, $merchant_id, $last_min_id, $page_size): \Bitget\Model\ApiResponseResultOfMerchantInfoResult
```

merchantList

P2P merchant list

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


$apiInstance = new Bitget\Api\P2pMerchantApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$online = yes; // string | online
$merchant_id = 4534534534; // string | merchantId
$last_min_id = 1678193338000; // string | lastMinId
$page_size = 10; // string | pageSize

try {
    $result = $apiInstance->merchantList($online, $merchant_id, $last_min_id, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling P2pMerchantApi->merchantList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **online** | **string**| online | [optional] |
| **merchant_id** | **string**| merchantId | [optional] |
| **last_min_id** | **string**| lastMinId | [optional] |
| **page_size** | **string**| pageSize | [optional] |

### Return type

[**\Bitget\Model\ApiResponseResultOfMerchantInfoResult**](../Model/ApiResponseResultOfMerchantInfoResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `merchantOrderList()`

```php
merchantOrderList($start_time, $end_time, $status, $type, $adv_no, $order_no, $coin, $language_type, $fiat, $last_min_id, $page_size): \Bitget\Model\ApiResponseResultOfMerchantOrderResult
```

orderList

P2P merchant order info

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


$apiInstance = new Bitget\Api\P2pMerchantApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 1678193338000; // string | startTime
$end_time = 1678193338000; // string | endTime
$status = wait_pay; // string | status
$type = sell; // string | type
$adv_no = 1678193338000; // string | advNo
$order_no = 23842478324723423; // string | orderNo
$coin = USDT; // string | coin
$language_type = en-US; // string | languageType
$fiat = USD; // string | fiat
$last_min_id = 43534; // string | languageType
$page_size = 10; // string | pageSize

try {
    $result = $apiInstance->merchantOrderList($start_time, $end_time, $status, $type, $adv_no, $order_no, $coin, $language_type, $fiat, $last_min_id, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling P2pMerchantApi->merchantOrderList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **string**| startTime | |
| **end_time** | **string**| endTime | [optional] |
| **status** | **string**| status | [optional] |
| **type** | **string**| type | [optional] |
| **adv_no** | **string**| advNo | [optional] |
| **order_no** | **string**| orderNo | [optional] |
| **coin** | **string**| coin | [optional] |
| **language_type** | **string**| languageType | [optional] |
| **fiat** | **string**| fiat | [optional] |
| **last_min_id** | **string**| languageType | [optional] |
| **page_size** | **string**| pageSize | [optional] |

### Return type

[**\Bitget\Model\ApiResponseResultOfMerchantOrderResult**](../Model/ApiResponseResultOfMerchantOrderResult.md)

### Authorization

[ACCESS_KEY](../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../README.md#SECRET_KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
