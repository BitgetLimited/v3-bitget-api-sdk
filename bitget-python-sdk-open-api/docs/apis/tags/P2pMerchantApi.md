<a name="__pageTop"></a>
# bitget.apis.tags.p2p_merchant_api.P2pMerchantApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchant_adv_list**](#merchant_adv_list) | **get** /api/p2p/v1/merchant/advList | advList
[**merchant_info**](#merchant_info) | **get** /api/p2p/v1/merchant/merchantInfo | merchantInfo
[**merchant_list**](#merchant_list) | **get** /api/p2p/v1/merchant/merchantList | merchantList
[**merchant_order_list**](#merchant_order_list) | **get** /api/p2p/v1/merchant/orderList | orderList

# **merchant_adv_list**
<a name="merchant_adv_list"></a>
> ApiResponseResultOfMerchantAdvResult merchant_adv_list(start_time)

advList

P2P merchant adv info

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import p2p_merchant_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_merchant_adv_result import ApiResponseResultOfMerchantAdvResult
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
    api_instance = p2p_merchant_api.P2pMerchantApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'startTime': "1678193338000",
    }
    try:
        # advList
        api_response = api_instance.merchant_adv_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling P2pMerchantApi->merchant_adv_list: %s\n" % e)

    # example passing only optional values
    query_params = {
        'startTime': "1678193338000",
        'endTime': "1678193338000",
        'status': "upper",
        'type': "sell",
        'advNo': "1678193338000",
        'coin': "USDT",
        'languageType': "en-US",
        'fiat': "USD",
        'lastMinId': "43534",
        'pageSize': "10",
        'orderBy': "createTime",
    }
    try:
        # advList
        api_response = api_instance.merchant_adv_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling P2pMerchantApi->merchant_adv_list: %s\n" % e)
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
startTime | StartTimeSchema | | 
endTime | EndTimeSchema | | optional
status | StatusSchema | | optional
type | TypeSchema | | optional
advNo | AdvNoSchema | | optional
coin | CoinSchema | | optional
languageType | LanguageTypeSchema | | optional
fiat | FiatSchema | | optional
lastMinId | LastMinIdSchema | | optional
pageSize | PageSizeSchema | | optional
orderBy | OrderBySchema | | optional


# StartTimeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# EndTimeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# StatusSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AdvNoSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CoinSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LanguageTypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FiatSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LastMinIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# OrderBySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#merchant_adv_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#merchant_adv_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#merchant_adv_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#merchant_adv_list.ApiResponseFor500) | Server Error

#### merchant_adv_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMerchantAdvResult**](../../models/ApiResponseResultOfMerchantAdvResult.md) |  | 


#### merchant_adv_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_adv_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_adv_list.ApiResponseFor500
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

# **merchant_info**
<a name="merchant_info"></a>
> ApiResponseResultOfMerchantPersonInfo merchant_info()

merchantInfo

P2P merchant info self

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import p2p_merchant_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_merchant_person_info import ApiResponseResultOfMerchantPersonInfo
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
    api_instance = p2p_merchant_api.P2pMerchantApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # merchantInfo
        api_response = api_instance.merchant_info()
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling P2pMerchantApi->merchant_info: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#merchant_info.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#merchant_info.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#merchant_info.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#merchant_info.ApiResponseFor500) | Server Error

#### merchant_info.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMerchantPersonInfo**](../../models/ApiResponseResultOfMerchantPersonInfo.md) |  | 


#### merchant_info.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_info.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_info.ApiResponseFor500
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

# **merchant_list**
<a name="merchant_list"></a>
> ApiResponseResultOfMerchantInfoResult merchant_list()

merchantList

P2P merchant list

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import p2p_merchant_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_merchant_info_result import ApiResponseResultOfMerchantInfoResult
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
    api_instance = p2p_merchant_api.P2pMerchantApi(api_client)

    # example passing only optional values
    query_params = {
        'online': "yes",
        'merchantId': "4534534534",
        'lastMinId': "1678193338000",
        'pageSize': "10",
    }
    try:
        # merchantList
        api_response = api_instance.merchant_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling P2pMerchantApi->merchant_list: %s\n" % e)
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
online | OnlineSchema | | optional
merchantId | MerchantIdSchema | | optional
lastMinId | LastMinIdSchema | | optional
pageSize | PageSizeSchema | | optional


# OnlineSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# MerchantIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LastMinIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#merchant_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#merchant_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#merchant_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#merchant_list.ApiResponseFor500) | Server Error

#### merchant_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMerchantInfoResult**](../../models/ApiResponseResultOfMerchantInfoResult.md) |  | 


#### merchant_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_list.ApiResponseFor500
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

# **merchant_order_list**
<a name="merchant_order_list"></a>
> ApiResponseResultOfMerchantOrderResult merchant_order_list(start_time)

orderList

P2P merchant order info

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import p2p_merchant_api
from bitget.model.api_response_result_of_merchant_order_result import ApiResponseResultOfMerchantOrderResult
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
    api_instance = p2p_merchant_api.P2pMerchantApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'startTime': "1678193338000",
    }
    try:
        # orderList
        api_response = api_instance.merchant_order_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling P2pMerchantApi->merchant_order_list: %s\n" % e)

    # example passing only optional values
    query_params = {
        'startTime': "1678193338000",
        'endTime': "1678193338000",
        'status': "wait_pay",
        'type': "sell",
        'advNo': "1678193338000",
        'orderNo': "23842478324723423",
        'coin': "USDT",
        'languageType': "en-US",
        'fiat': "USD",
        'lastMinId': "43534",
        'pageSize': "10",
    }
    try:
        # orderList
        api_response = api_instance.merchant_order_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling P2pMerchantApi->merchant_order_list: %s\n" % e)
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
startTime | StartTimeSchema | | 
endTime | EndTimeSchema | | optional
status | StatusSchema | | optional
type | TypeSchema | | optional
advNo | AdvNoSchema | | optional
orderNo | OrderNoSchema | | optional
coin | CoinSchema | | optional
languageType | LanguageTypeSchema | | optional
fiat | FiatSchema | | optional
lastMinId | LastMinIdSchema | | optional
pageSize | PageSizeSchema | | optional


# StartTimeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# EndTimeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# StatusSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AdvNoSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# OrderNoSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CoinSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LanguageTypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FiatSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LastMinIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#merchant_order_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#merchant_order_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#merchant_order_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#merchant_order_list.ApiResponseFor500) | Server Error

#### merchant_order_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMerchantOrderResult**](../../models/ApiResponseResultOfMerchantOrderResult.md) |  | 


#### merchant_order_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_order_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### merchant_order_list.ApiResponseFor500
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

