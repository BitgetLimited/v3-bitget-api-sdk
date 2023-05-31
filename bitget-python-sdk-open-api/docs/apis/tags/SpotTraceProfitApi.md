<a name="__pageTop"></a>
# bitget.apis.tags.spot_trace_profit_api.SpotTraceProfitApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spot_trace_profit_his_detail_list**](#spot_trace_profit_his_detail_list) | **post** /api/spot/v1/trace/profit/profitHisDetailList | profitHisDetailList
[**spot_trace_profit_his_list**](#spot_trace_profit_his_list) | **post** /api/spot/v1/trace/profit/profitHisList | profitHisList
[**spot_trace_total_profit_info**](#spot_trace_total_profit_info) | **post** /api/spot/v1/trace/profit/totalProfitInfo | totalProfitInfo
[**spot_trace_total_profit_list**](#spot_trace_total_profit_list) | **post** /api/spot/v1/trace/profit/totalProfitList | totalProfitList
[**spot_trace_wait_profit_detail_list**](#spot_trace_wait_profit_detail_list) | **post** /api/spot/v1/trace/profit/waitProfitDetailList | waitProfitDetailList

# **spot_trace_profit_his_detail_list**
<a name="spot_trace_profit_his_detail_list"></a>
> ApiResponseResultOfTraderProfitHisDetailListResult spot_trace_profit_his_detail_list(total_profit_his_detail_list_request)

profitHisDetailList

Get ProfitHisDetailList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_profit_api
from bitget.model.api_response_result_of_trader_profit_his_detail_list_result import ApiResponseResultOfTraderProfitHisDetailListResult
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.total_profit_his_detail_list_request import TotalProfitHisDetailListRequest
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
    api_instance = spot_trace_profit_api.SpotTraceProfitApi(api_client)

    # example passing only required values which don't have defaults set
    body = TotalProfitHisDetailListRequest(
        coin_name="USDT",
        date="1681985100000",
        page_no="1",
        page_size="1",
    )
    try:
        # profitHisDetailList
        api_response = api_instance.spot_trace_profit_his_detail_list(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceProfitApi->spot_trace_profit_his_detail_list: %s\n" % e)
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
[**TotalProfitHisDetailListRequest**](../../models/TotalProfitHisDetailListRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_profit_his_detail_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_profit_his_detail_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_profit_his_detail_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_profit_his_detail_list.ApiResponseFor500) | Server Error

#### spot_trace_profit_his_detail_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfTraderProfitHisDetailListResult**](../../models/ApiResponseResultOfTraderProfitHisDetailListResult.md) |  | 


#### spot_trace_profit_his_detail_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_profit_his_detail_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_profit_his_detail_list.ApiResponseFor500
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

# **spot_trace_profit_his_list**
<a name="spot_trace_profit_his_list"></a>
> ApiResponseResultOfTraderProfitHisListResult spot_trace_profit_his_list(total_profit_his_list_request)

profitHisList

Get ProfitHisList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_profit_api
from bitget.model.api_response_result_of_trader_profit_his_list_result import ApiResponseResultOfTraderProfitHisListResult
from bitget.model.total_profit_his_list_request import TotalProfitHisListRequest
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
    api_instance = spot_trace_profit_api.SpotTraceProfitApi(api_client)

    # example passing only required values which don't have defaults set
    body = TotalProfitHisListRequest(
        page_no="1",
        page_size="1",
    )
    try:
        # profitHisList
        api_response = api_instance.spot_trace_profit_his_list(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceProfitApi->spot_trace_profit_his_list: %s\n" % e)
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
[**TotalProfitHisListRequest**](../../models/TotalProfitHisListRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_profit_his_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_profit_his_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_profit_his_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_profit_his_list.ApiResponseFor500) | Server Error

#### spot_trace_profit_his_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfTraderProfitHisListResult**](../../models/ApiResponseResultOfTraderProfitHisListResult.md) |  | 


#### spot_trace_profit_his_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_profit_his_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_profit_his_list.ApiResponseFor500
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

# **spot_trace_total_profit_info**
<a name="spot_trace_total_profit_info"></a>
> ApiResponseResultOfTraderTotalProfitResult spot_trace_total_profit_info()

totalProfitInfo

Get TotalProfitInfo

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_profit_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_trader_total_profit_result import ApiResponseResultOfTraderTotalProfitResult
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
    api_instance = spot_trace_profit_api.SpotTraceProfitApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # totalProfitInfo
        api_response = api_instance.spot_trace_total_profit_info()
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceProfitApi->spot_trace_total_profit_info: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_total_profit_info.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_total_profit_info.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_total_profit_info.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_total_profit_info.ApiResponseFor500) | Server Error

#### spot_trace_total_profit_info.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfTraderTotalProfitResult**](../../models/ApiResponseResultOfTraderTotalProfitResult.md) |  | 


#### spot_trace_total_profit_info.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_total_profit_info.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_total_profit_info.ApiResponseFor500
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

# **spot_trace_total_profit_list**
<a name="spot_trace_total_profit_list"></a>
> ApiResponseResultOfListOfTraderTotalProfitListResult spot_trace_total_profit_list(total_profit_list_request)

totalProfitList

Get TotalProfitList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_profit_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.total_profit_list_request import TotalProfitListRequest
from bitget.model.api_response_result_of_list_of_trader_total_profit_list_result import ApiResponseResultOfListOfTraderTotalProfitListResult
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
    api_instance = spot_trace_profit_api.SpotTraceProfitApi(api_client)

    # example passing only required values which don't have defaults set
    body = TotalProfitListRequest(
        page_no="1",
        page_size="1",
    )
    try:
        # totalProfitList
        api_response = api_instance.spot_trace_total_profit_list(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceProfitApi->spot_trace_total_profit_list: %s\n" % e)
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
[**TotalProfitListRequest**](../../models/TotalProfitListRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_total_profit_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_total_profit_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_total_profit_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_total_profit_list.ApiResponseFor500) | Server Error

#### spot_trace_total_profit_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfListOfTraderTotalProfitListResult**](../../models/ApiResponseResultOfListOfTraderTotalProfitListResult.md) |  | 


#### spot_trace_total_profit_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_total_profit_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_total_profit_list.ApiResponseFor500
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

# **spot_trace_wait_profit_detail_list**
<a name="spot_trace_wait_profit_detail_list"></a>
> ApiResponseResultOfTraderWaitProfitDetailListResult spot_trace_wait_profit_detail_list(wait_profit_detail_list_request)

waitProfitDetailList

Get WaitProfitDetailList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_profit_api
from bitget.model.wait_profit_detail_list_request import WaitProfitDetailListRequest
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_trader_wait_profit_detail_list_result import ApiResponseResultOfTraderWaitProfitDetailListResult
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
    api_instance = spot_trace_profit_api.SpotTraceProfitApi(api_client)

    # example passing only required values which don't have defaults set
    body = WaitProfitDetailListRequest(
        page_no="1",
        page_size="1",
    )
    try:
        # waitProfitDetailList
        api_response = api_instance.spot_trace_wait_profit_detail_list(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceProfitApi->spot_trace_wait_profit_detail_list: %s\n" % e)
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
[**WaitProfitDetailListRequest**](../../models/WaitProfitDetailListRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_wait_profit_detail_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_wait_profit_detail_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_wait_profit_detail_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_wait_profit_detail_list.ApiResponseFor500) | Server Error

#### spot_trace_wait_profit_detail_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfTraderWaitProfitDetailListResult**](../../models/ApiResponseResultOfTraderWaitProfitDetailListResult.md) |  | 


#### spot_trace_wait_profit_detail_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_wait_profit_detail_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_wait_profit_detail_list.ApiResponseFor500
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

