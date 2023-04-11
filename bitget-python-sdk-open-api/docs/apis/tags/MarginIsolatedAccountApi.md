<a name="__pageTop"></a>
# bitget.apis.tags.margin_isolated_account_api.MarginIsolatedAccountApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**margin_isolated_account_assets**](#margin_isolated_account_assets) | **get** /api/margin/v1/isolated/account/assets | assets
[**margin_isolated_account_borrow**](#margin_isolated_account_borrow) | **post** /api/margin/v1/isolated/account/borrow | borrow
[**margin_isolated_account_max_borrowable_amount**](#margin_isolated_account_max_borrowable_amount) | **post** /api/margin/v1/isolated/account/maxBorrowableAmount | maxBorrowableAmount
[**margin_isolated_account_max_transfer_out_amount**](#margin_isolated_account_max_transfer_out_amount) | **get** /api/margin/v1/isolated/account/maxTransferOutAmount | maxTransferOutAmount
[**margin_isolated_account_repay**](#margin_isolated_account_repay) | **post** /api/margin/v1/isolated/account/repay | repay
[**margin_isolated_account_risk_rate**](#margin_isolated_account_risk_rate) | **post** /api/margin/v1/isolated/account/riskRate | riskRate

# **margin_isolated_account_assets**
<a name="margin_isolated_account_assets"></a>
> ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult margin_isolated_account_assets(symbol)

assets

Get Assets

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_isolated_account_api
from bitget.model.api_response_result_of_list_of_margin_isolated_assets_population_result import ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ACCESS_KEY
configuration.api_key['ACCESS_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_KEY'] = 'Bearer'

# Configure API key authorization: ACCESS_PASSPHRASE
configuration.api_key['ACCESS_PASSPHRASE'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_PASSPHRASE'] = 'Bearer'

# Configure API key authorization: ACCESS_SIGN
configuration.api_key['ACCESS_SIGN'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_SIGN'] = 'Bearer'

# Configure API key authorization: ACCESS_TIMESTAMP
configuration.api_key['ACCESS_TIMESTAMP'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_TIMESTAMP'] = 'Bearer'

# Configure API key authorization: SECRET_KEY
configuration.api_key['SECRET_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['SECRET_KEY'] = 'Bearer'
# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_isolated_account_api.MarginIsolatedAccountApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'symbol': "BTCUSDT",
    }
    try:
        # assets
        api_response = api_instance.margin_isolated_account_assets(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginIsolatedAccountApi->margin_isolated_account_assets: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
symbol | SymbolSchema | | 


# SymbolSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_isolated_account_assets.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_isolated_account_assets.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_isolated_account_assets.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_isolated_account_assets.ApiResponseFor500) | Server Error

#### margin_isolated_account_assets.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult**](../../models/ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult.md) |  | 


#### margin_isolated_account_assets.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_assets.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_assets.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


### Authorization

[ACCESS_KEY](../../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../../README.md#SECRET_KEY)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **margin_isolated_account_borrow**
<a name="margin_isolated_account_borrow"></a>
> ApiResponseResultOfMarginIsolatedBorrowLimitResult margin_isolated_account_borrow(margin_isolated_limit_request)

borrow

borrow

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_isolated_account_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_margin_isolated_borrow_limit_result import ApiResponseResultOfMarginIsolatedBorrowLimitResult
from bitget.model.margin_isolated_limit_request import MarginIsolatedLimitRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ACCESS_KEY
configuration.api_key['ACCESS_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_KEY'] = 'Bearer'

# Configure API key authorization: ACCESS_PASSPHRASE
configuration.api_key['ACCESS_PASSPHRASE'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_PASSPHRASE'] = 'Bearer'

# Configure API key authorization: ACCESS_SIGN
configuration.api_key['ACCESS_SIGN'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_SIGN'] = 'Bearer'

# Configure API key authorization: ACCESS_TIMESTAMP
configuration.api_key['ACCESS_TIMESTAMP'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_TIMESTAMP'] = 'Bearer'

# Configure API key authorization: SECRET_KEY
configuration.api_key['SECRET_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['SECRET_KEY'] = 'Bearer'
# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_isolated_account_api.MarginIsolatedAccountApi(api_client)

    # example passing only required values which don't have defaults set
    body = MarginIsolatedLimitRequest(
        borrow_amount="1.0",
        coin="USDT",
        symbol="USDT",
    )
    try:
        # borrow
        api_response = api_instance.margin_isolated_account_borrow(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginIsolatedAccountApi->margin_isolated_account_borrow: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MarginIsolatedLimitRequest**](../../models/MarginIsolatedLimitRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_isolated_account_borrow.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_isolated_account_borrow.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_isolated_account_borrow.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_isolated_account_borrow.ApiResponseFor500) | Server Error

#### margin_isolated_account_borrow.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMarginIsolatedBorrowLimitResult**](../../models/ApiResponseResultOfMarginIsolatedBorrowLimitResult.md) |  | 


#### margin_isolated_account_borrow.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_borrow.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_borrow.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


### Authorization

[ACCESS_KEY](../../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../../README.md#SECRET_KEY)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **margin_isolated_account_max_borrowable_amount**
<a name="margin_isolated_account_max_borrowable_amount"></a>
> ApiResponseResultOfMarginIsolatedMaxBorrowResult margin_isolated_account_max_borrowable_amount(margin_isolated_max_borrow_request)

maxBorrowableAmount

Get MaxBorrowableAmount

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_isolated_account_api
from bitget.model.api_response_result_of_margin_isolated_max_borrow_result import ApiResponseResultOfMarginIsolatedMaxBorrowResult
from bitget.model.margin_isolated_max_borrow_request import MarginIsolatedMaxBorrowRequest
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ACCESS_KEY
configuration.api_key['ACCESS_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_KEY'] = 'Bearer'

# Configure API key authorization: ACCESS_PASSPHRASE
configuration.api_key['ACCESS_PASSPHRASE'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_PASSPHRASE'] = 'Bearer'

# Configure API key authorization: ACCESS_SIGN
configuration.api_key['ACCESS_SIGN'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_SIGN'] = 'Bearer'

# Configure API key authorization: ACCESS_TIMESTAMP
configuration.api_key['ACCESS_TIMESTAMP'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_TIMESTAMP'] = 'Bearer'

# Configure API key authorization: SECRET_KEY
configuration.api_key['SECRET_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['SECRET_KEY'] = 'Bearer'
# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_isolated_account_api.MarginIsolatedAccountApi(api_client)

    # example passing only required values which don't have defaults set
    body = MarginIsolatedMaxBorrowRequest(
        coin="USDT",
        symbol="BTCUSDT",
    )
    try:
        # maxBorrowableAmount
        api_response = api_instance.margin_isolated_account_max_borrowable_amount(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginIsolatedAccountApi->margin_isolated_account_max_borrowable_amount: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MarginIsolatedMaxBorrowRequest**](../../models/MarginIsolatedMaxBorrowRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_isolated_account_max_borrowable_amount.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_isolated_account_max_borrowable_amount.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_isolated_account_max_borrowable_amount.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_isolated_account_max_borrowable_amount.ApiResponseFor500) | Server Error

#### margin_isolated_account_max_borrowable_amount.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMarginIsolatedMaxBorrowResult**](../../models/ApiResponseResultOfMarginIsolatedMaxBorrowResult.md) |  | 


#### margin_isolated_account_max_borrowable_amount.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_max_borrowable_amount.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_max_borrowable_amount.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


### Authorization

[ACCESS_KEY](../../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../../README.md#SECRET_KEY)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **margin_isolated_account_max_transfer_out_amount**
<a name="margin_isolated_account_max_transfer_out_amount"></a>
> ApiResponseResultOfMarginIsolatedAssetsResult margin_isolated_account_max_transfer_out_amount(coinsymbol)

maxTransferOutAmount

Get Max TransferOutAmount

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_isolated_account_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_margin_isolated_assets_result import ApiResponseResultOfMarginIsolatedAssetsResult
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ACCESS_KEY
configuration.api_key['ACCESS_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_KEY'] = 'Bearer'

# Configure API key authorization: ACCESS_PASSPHRASE
configuration.api_key['ACCESS_PASSPHRASE'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_PASSPHRASE'] = 'Bearer'

# Configure API key authorization: ACCESS_SIGN
configuration.api_key['ACCESS_SIGN'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_SIGN'] = 'Bearer'

# Configure API key authorization: ACCESS_TIMESTAMP
configuration.api_key['ACCESS_TIMESTAMP'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_TIMESTAMP'] = 'Bearer'

# Configure API key authorization: SECRET_KEY
configuration.api_key['SECRET_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['SECRET_KEY'] = 'Bearer'
# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_isolated_account_api.MarginIsolatedAccountApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'coin': "USDT",
        'symbol': "BTCUSDT",
    }
    try:
        # maxTransferOutAmount
        api_response = api_instance.margin_isolated_account_max_transfer_out_amount(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginIsolatedAccountApi->margin_isolated_account_max_transfer_out_amount: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
coin | CoinSchema | | 
symbol | SymbolSchema | | 


# CoinSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# SymbolSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_isolated_account_max_transfer_out_amount.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_isolated_account_max_transfer_out_amount.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_isolated_account_max_transfer_out_amount.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_isolated_account_max_transfer_out_amount.ApiResponseFor500) | Server Error

#### margin_isolated_account_max_transfer_out_amount.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMarginIsolatedAssetsResult**](../../models/ApiResponseResultOfMarginIsolatedAssetsResult.md) |  | 


#### margin_isolated_account_max_transfer_out_amount.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_max_transfer_out_amount.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_max_transfer_out_amount.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


### Authorization

[ACCESS_KEY](../../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../../README.md#SECRET_KEY)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **margin_isolated_account_repay**
<a name="margin_isolated_account_repay"></a>
> ApiResponseResultOfMarginIsolatedRepayResult margin_isolated_account_repay(margin_isolated_repay_request)

repay

repay

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_isolated_account_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.margin_isolated_repay_request import MarginIsolatedRepayRequest
from bitget.model.api_response_result_of_margin_isolated_repay_result import ApiResponseResultOfMarginIsolatedRepayResult
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ACCESS_KEY
configuration.api_key['ACCESS_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_KEY'] = 'Bearer'

# Configure API key authorization: ACCESS_PASSPHRASE
configuration.api_key['ACCESS_PASSPHRASE'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_PASSPHRASE'] = 'Bearer'

# Configure API key authorization: ACCESS_SIGN
configuration.api_key['ACCESS_SIGN'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_SIGN'] = 'Bearer'

# Configure API key authorization: ACCESS_TIMESTAMP
configuration.api_key['ACCESS_TIMESTAMP'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_TIMESTAMP'] = 'Bearer'

# Configure API key authorization: SECRET_KEY
configuration.api_key['SECRET_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['SECRET_KEY'] = 'Bearer'
# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_isolated_account_api.MarginIsolatedAccountApi(api_client)

    # example passing only required values which don't have defaults set
    body = MarginIsolatedRepayRequest(
        coin="USDT",
        repay_amount="1.0",
        symbol="BTCUSDT",
    )
    try:
        # repay
        api_response = api_instance.margin_isolated_account_repay(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginIsolatedAccountApi->margin_isolated_account_repay: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MarginIsolatedRepayRequest**](../../models/MarginIsolatedRepayRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_isolated_account_repay.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_isolated_account_repay.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_isolated_account_repay.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_isolated_account_repay.ApiResponseFor500) | Server Error

#### margin_isolated_account_repay.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMarginIsolatedRepayResult**](../../models/ApiResponseResultOfMarginIsolatedRepayResult.md) |  | 


#### margin_isolated_account_repay.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_repay.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_repay.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


### Authorization

[ACCESS_KEY](../../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../../README.md#SECRET_KEY)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **margin_isolated_account_risk_rate**
<a name="margin_isolated_account_risk_rate"></a>
> ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult margin_isolated_account_risk_rate(margin_isolated_assets_risk_request)

riskRate

riskRate

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_isolated_account_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_list_of_margin_isolated_assets_risk_result import ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult
from bitget.model.margin_isolated_assets_risk_request import MarginIsolatedAssetsRiskRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ACCESS_KEY
configuration.api_key['ACCESS_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_KEY'] = 'Bearer'

# Configure API key authorization: ACCESS_PASSPHRASE
configuration.api_key['ACCESS_PASSPHRASE'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_PASSPHRASE'] = 'Bearer'

# Configure API key authorization: ACCESS_SIGN
configuration.api_key['ACCESS_SIGN'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_SIGN'] = 'Bearer'

# Configure API key authorization: ACCESS_TIMESTAMP
configuration.api_key['ACCESS_TIMESTAMP'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ACCESS_TIMESTAMP'] = 'Bearer'

# Configure API key authorization: SECRET_KEY
configuration.api_key['SECRET_KEY'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['SECRET_KEY'] = 'Bearer'
# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_isolated_account_api.MarginIsolatedAccountApi(api_client)

    # example passing only required values which don't have defaults set
    body = MarginIsolatedAssetsRiskRequest(
        page_num="1",
        page_size="100",
        symbol="BTCUSDT",
    )
    try:
        # riskRate
        api_response = api_instance.margin_isolated_account_risk_rate(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginIsolatedAccountApi->margin_isolated_account_risk_rate: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MarginIsolatedAssetsRiskRequest**](../../models/MarginIsolatedAssetsRiskRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_isolated_account_risk_rate.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_isolated_account_risk_rate.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_isolated_account_risk_rate.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_isolated_account_risk_rate.ApiResponseFor500) | Server Error

#### margin_isolated_account_risk_rate.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult**](../../models/ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult.md) |  | 


#### margin_isolated_account_risk_rate.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_risk_rate.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_isolated_account_risk_rate.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


### Authorization

[ACCESS_KEY](../../../README.md#ACCESS_KEY), [ACCESS_PASSPHRASE](../../../README.md#ACCESS_PASSPHRASE), [ACCESS_SIGN](../../../README.md#ACCESS_SIGN), [ACCESS_TIMESTAMP](../../../README.md#ACCESS_TIMESTAMP), [SECRET_KEY](../../../README.md#SECRET_KEY)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

