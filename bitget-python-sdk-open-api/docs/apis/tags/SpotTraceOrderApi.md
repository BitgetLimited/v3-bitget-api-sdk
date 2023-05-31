<a name="__pageTop"></a>
# bitget.apis.tags.spot_trace_order_api.SpotTraceOrderApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spot_trace_close_tracking_order**](#spot_trace_close_tracking_order) | **post** /api/spot/v1/trace/order/closeTrackingOrder | closeTrackingOrder
[**spot_trace_end_order**](#spot_trace_end_order) | **post** /api/spot/v1/trace/order/endOrder | endOrder
[**spot_trace_get_trace_settings**](#spot_trace_get_trace_settings) | **post** /api/spot/v1/trace/order/getTraceSettings | getTraceSettings
[**spot_trace_get_trader_settings**](#spot_trace_get_trader_settings) | **post** /api/spot/v1/trace/order/getTraderSettings | getTraderSettings
[**spot_trace_my_tracers**](#spot_trace_my_tracers) | **post** /api/spot/v1/trace/order/myTracers | myTracers
[**spot_trace_my_traders**](#spot_trace_my_traders) | **post** /api/spot/v1/trace/order/myTraders | myTraders
[**spot_trace_order_current_list**](#spot_trace_order_current_list) | **post** /api/spot/v1/trace/order/orderCurrentList | orderCurrentList
[**spot_trace_order_history_list**](#spot_trace_order_history_list) | **post** /api/spot/v1/trace/order/orderHistoryList | orderHistoryList
[**spot_trace_remove_trader**](#spot_trace_remove_trader) | **post** /api/spot/v1/trace/order/removeTrader | removeTrader
[**spot_trace_set_product_code**](#spot_trace_set_product_code) | **post** /api/spot/v1/trace/order/setProductCode | setProductCode
[**spot_trace_set_trace_config**](#spot_trace_set_trace_config) | **post** /api/spot/v1/trace/order/setTraceConfig | setTraceConfig
[**spot_trace_spot_info_list**](#spot_trace_spot_info_list) | **post** /api/spot/v1/trace/order/spotInfoList | spotInfoList
[**spot_trace_update_tpsl**](#spot_trace_update_tpsl) | **post** /api/spot/v1/trace/order/updateTpsl | updateTpsl

# **spot_trace_close_tracking_order**
<a name="spot_trace_close_tracking_order"></a>
> ApiResponseResultOfboolean spot_trace_close_tracking_order(close_tracking_order_request)

closeTrackingOrder

closeTrackingOrder

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_ofboolean import ApiResponseResultOfboolean
from bitget.model.close_tracking_order_request import CloseTrackingOrderRequest
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = CloseTrackingOrderRequest(
        symbol_id="BTCUSDT_SPBL",
        tracking_order_nos=[
            "tracking_order_nos_example"
        ],
    )
    try:
        # closeTrackingOrder
        api_response = api_instance.spot_trace_close_tracking_order(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_close_tracking_order: %s\n" % e)
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
[**CloseTrackingOrderRequest**](../../models/CloseTrackingOrderRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_close_tracking_order.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_close_tracking_order.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_close_tracking_order.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_close_tracking_order.ApiResponseFor500) | Server Error

#### spot_trace_close_tracking_order.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfboolean**](../../models/ApiResponseResultOfboolean.md) |  | 


#### spot_trace_close_tracking_order.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_close_tracking_order.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_close_tracking_order.ApiResponseFor500
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

# **spot_trace_end_order**
<a name="spot_trace_end_order"></a>
> ApiResponseResultOfboolean spot_trace_end_order(end_order_request)

endOrder

endOrder

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_ofboolean import ApiResponseResultOfboolean
from bitget.model.end_order_request import EndOrderRequest
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = EndOrderRequest(
        tracking_order_nos=[
            "tracking_order_nos_example"
        ],
    )
    try:
        # endOrder
        api_response = api_instance.spot_trace_end_order(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_end_order: %s\n" % e)
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
[**EndOrderRequest**](../../models/EndOrderRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_end_order.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_end_order.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_end_order.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_end_order.ApiResponseFor500) | Server Error

#### spot_trace_end_order.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfboolean**](../../models/ApiResponseResultOfboolean.md) |  | 


#### spot_trace_end_order.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_end_order.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_end_order.ApiResponseFor500
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

# **spot_trace_get_trace_settings**
<a name="spot_trace_get_trace_settings"></a>
> ApiResponseResultOfTraceSettingResult spot_trace_get_trace_settings(trace_settings_request)

getTraceSettings

Get TraceSettings

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_trace_setting_result import ApiResponseResultOfTraceSettingResult
from bitget.model.trace_settings_request import TraceSettingsRequest
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = TraceSettingsRequest(
        trader_user_id="trader_user_id_example",
    )
    try:
        # getTraceSettings
        api_response = api_instance.spot_trace_get_trace_settings(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_get_trace_settings: %s\n" % e)
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
[**TraceSettingsRequest**](../../models/TraceSettingsRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_get_trace_settings.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_get_trace_settings.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_get_trace_settings.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_get_trace_settings.ApiResponseFor500) | Server Error

#### spot_trace_get_trace_settings.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfTraceSettingResult**](../../models/ApiResponseResultOfTraceSettingResult.md) |  | 


#### spot_trace_get_trace_settings.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_get_trace_settings.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_get_trace_settings.ApiResponseFor500
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

# **spot_trace_get_trader_settings**
<a name="spot_trace_get_trader_settings"></a>
> ApiResponseResultOfTraderSettingResult spot_trace_get_trader_settings()

getTraderSettings

Get TraderSettings

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_trader_setting_result import ApiResponseResultOfTraderSettingResult
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # getTraderSettings
        api_response = api_instance.spot_trace_get_trader_settings()
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_get_trader_settings: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_get_trader_settings.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_get_trader_settings.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_get_trader_settings.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_get_trader_settings.ApiResponseFor500) | Server Error

#### spot_trace_get_trader_settings.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfTraderSettingResult**](../../models/ApiResponseResultOfTraderSettingResult.md) |  | 


#### spot_trace_get_trader_settings.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_get_trader_settings.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_get_trader_settings.ApiResponseFor500
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

# **spot_trace_my_tracers**
<a name="spot_trace_my_tracers"></a>
> ApiResponseResultOfMyTracersResult spot_trace_my_tracers(my_tracers_request)

myTracers

Get MyTracers

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.my_tracers_request import MyTracersRequest
from bitget.model.api_response_result_of_my_tracers_result import ApiResponseResultOfMyTracersResult
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = MyTracersRequest(
        page_no="1",
        page_size="1",
    )
    try:
        # myTracers
        api_response = api_instance.spot_trace_my_tracers(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_my_tracers: %s\n" % e)
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
[**MyTracersRequest**](../../models/MyTracersRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_my_tracers.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_my_tracers.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_my_tracers.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_my_tracers.ApiResponseFor500) | Server Error

#### spot_trace_my_tracers.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMyTracersResult**](../../models/ApiResponseResultOfMyTracersResult.md) |  | 


#### spot_trace_my_tracers.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_my_tracers.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_my_tracers.ApiResponseFor500
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

# **spot_trace_my_traders**
<a name="spot_trace_my_traders"></a>
> ApiResponseResultOfMyTradersResult spot_trace_my_traders(my_traders_request)

myTraders

Get MyTraders

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_my_traders_result import ApiResponseResultOfMyTradersResult
from bitget.model.my_traders_request import MyTradersRequest
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = MyTradersRequest(
        page_no="1",
        page_size="1",
    )
    try:
        # myTraders
        api_response = api_instance.spot_trace_my_traders(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_my_traders: %s\n" % e)
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
[**MyTradersRequest**](../../models/MyTradersRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_my_traders.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_my_traders.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_my_traders.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_my_traders.ApiResponseFor500) | Server Error

#### spot_trace_my_traders.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMyTradersResult**](../../models/ApiResponseResultOfMyTradersResult.md) |  | 


#### spot_trace_my_traders.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_my_traders.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_my_traders.ApiResponseFor500
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

# **spot_trace_order_current_list**
<a name="spot_trace_order_current_list"></a>
> ApiResponseResultOfOrderCurrentListResult spot_trace_order_current_list(current_order_list_request)

orderCurrentList

Get OrderCurrentList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_order_current_list_result import ApiResponseResultOfOrderCurrentListResult
from bitget.model.current_order_list_request import CurrentOrderListRequest
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = CurrentOrderListRequest(
        mix_id="1",
        page_size="1",
        tracking_no="1032884851114008576",
    )
    try:
        # orderCurrentList
        api_response = api_instance.spot_trace_order_current_list(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_order_current_list: %s\n" % e)
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
[**CurrentOrderListRequest**](../../models/CurrentOrderListRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_order_current_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_order_current_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_order_current_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_order_current_list.ApiResponseFor500) | Server Error

#### spot_trace_order_current_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfOrderCurrentListResult**](../../models/ApiResponseResultOfOrderCurrentListResult.md) |  | 


#### spot_trace_order_current_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_order_current_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_order_current_list.ApiResponseFor500
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

# **spot_trace_order_history_list**
<a name="spot_trace_order_history_list"></a>
> ApiResponseResultOfOrderHistoryListResult spot_trace_order_history_list(history_order_list_request)

orderHistoryList

Get OrderHistoryList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.history_order_list_request import HistoryOrderListRequest
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_order_history_list_result import ApiResponseResultOfOrderHistoryListResult
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = HistoryOrderListRequest(
        mix_id="1",
        page_size="1",
        tracking_no="1032884851114008576",
    )
    try:
        # orderHistoryList
        api_response = api_instance.spot_trace_order_history_list(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_order_history_list: %s\n" % e)
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
[**HistoryOrderListRequest**](../../models/HistoryOrderListRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_order_history_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_order_history_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_order_history_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_order_history_list.ApiResponseFor500) | Server Error

#### spot_trace_order_history_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfOrderHistoryListResult**](../../models/ApiResponseResultOfOrderHistoryListResult.md) |  | 


#### spot_trace_order_history_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_order_history_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_order_history_list.ApiResponseFor500
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

# **spot_trace_remove_trader**
<a name="spot_trace_remove_trader"></a>
> ApiResponseResultOfboolean spot_trace_remove_trader(remove_trader_request)

removeTrader

RemoveTrader

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_ofboolean import ApiResponseResultOfboolean
from bitget.model.remove_trader_request import RemoveTraderRequest
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = RemoveTraderRequest(
        trader_user_id="trader_user_id_example",
    )
    try:
        # removeTrader
        api_response = api_instance.spot_trace_remove_trader(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_remove_trader: %s\n" % e)
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
[**RemoveTraderRequest**](../../models/RemoveTraderRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_remove_trader.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_remove_trader.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_remove_trader.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_remove_trader.ApiResponseFor500) | Server Error

#### spot_trace_remove_trader.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfboolean**](../../models/ApiResponseResultOfboolean.md) |  | 


#### spot_trace_remove_trader.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_remove_trader.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_remove_trader.ApiResponseFor500
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

# **spot_trace_set_product_code**
<a name="spot_trace_set_product_code"></a>
> ApiResponseResultOfboolean spot_trace_set_product_code(product_code_request)

setProductCode

SetProductCode

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.product_code_request import ProductCodeRequest
from bitget.model.api_response_result_ofboolean import ApiResponseResultOfboolean
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = ProductCodeRequest(
        symbol_ids=[
            "symbol_ids_example"
        ],
    )
    try:
        # setProductCode
        api_response = api_instance.spot_trace_set_product_code(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_set_product_code: %s\n" % e)
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
[**ProductCodeRequest**](../../models/ProductCodeRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_set_product_code.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_set_product_code.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_set_product_code.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_set_product_code.ApiResponseFor500) | Server Error

#### spot_trace_set_product_code.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfboolean**](../../models/ApiResponseResultOfboolean.md) |  | 


#### spot_trace_set_product_code.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_set_product_code.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_set_product_code.ApiResponseFor500
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

# **spot_trace_set_trace_config**
<a name="spot_trace_set_trace_config"></a>
> ApiResponseResultOfboolean spot_trace_set_trace_config(trace_config_request)

setTraceConfig

SetTraceConfig

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.trace_config_request import TraceConfigRequest
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_ofboolean import ApiResponseResultOfboolean
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = TraceConfigRequest(
        setting=[
            TraceConfigSettingRequest(
                max_hold_count="1",
                stop_loss_ration="stop_loss_ration_example",
                stop_profit_ration="stop_profit_ration_example",
                symbol_id="BTCUSDT_SPBL",
                trace_type="1,2,3",
                trace_value="1000",
            )
        ],
        setting_type="0,1",
        trader_user_id="trader_user_id_example",
    )
    try:
        # setTraceConfig
        api_response = api_instance.spot_trace_set_trace_config(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_set_trace_config: %s\n" % e)
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
[**TraceConfigRequest**](../../models/TraceConfigRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_set_trace_config.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_set_trace_config.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_set_trace_config.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_set_trace_config.ApiResponseFor500) | Server Error

#### spot_trace_set_trace_config.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfboolean**](../../models/ApiResponseResultOfboolean.md) |  | 


#### spot_trace_set_trace_config.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_set_trace_config.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_set_trace_config.ApiResponseFor500
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

# **spot_trace_spot_info_list**
<a name="spot_trace_spot_info_list"></a>
> ApiResponseResultOfListOfSpotInfoResult spot_trace_spot_info_list()

spotInfoList

Get SpotInfoList

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.api_response_result_of_list_of_spot_info_result import ApiResponseResultOfListOfSpotInfoResult
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # spotInfoList
        api_response = api_instance.spot_trace_spot_info_list()
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_spot_info_list: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_spot_info_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_spot_info_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_spot_info_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_spot_info_list.ApiResponseFor500) | Server Error

#### spot_trace_spot_info_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfListOfSpotInfoResult**](../../models/ApiResponseResultOfListOfSpotInfoResult.md) |  | 


#### spot_trace_spot_info_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_spot_info_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_spot_info_list.ApiResponseFor500
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

# **spot_trace_update_tpsl**
<a name="spot_trace_update_tpsl"></a>
> ApiResponseResultOfboolean spot_trace_update_tpsl(update_tpsl_request)

updateTpsl

updateTpsl

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import spot_trace_order_api
from bitget.model.update_tpsl_request import UpdateTpslRequest
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_ofboolean import ApiResponseResultOfboolean
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
    api_instance = spot_trace_order_api.SpotTraceOrderApi(api_client)

    # example passing only required values which don't have defaults set
    body = UpdateTpslRequest(
        stop_loss_price="1",
        stop_profit_price="1",
        tracking_no="1032884851114008576",
    )
    try:
        # updateTpsl
        api_response = api_instance.spot_trace_update_tpsl(
            body=body,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling SpotTraceOrderApi->spot_trace_update_tpsl: %s\n" % e)
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
[**UpdateTpslRequest**](../../models/UpdateTpslRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#spot_trace_update_tpsl.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#spot_trace_update_tpsl.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#spot_trace_update_tpsl.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#spot_trace_update_tpsl.ApiResponseFor500) | Server Error

#### spot_trace_update_tpsl.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfboolean**](../../models/ApiResponseResultOfboolean.md) |  | 


#### spot_trace_update_tpsl.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_update_tpsl.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### spot_trace_update_tpsl.ApiResponseFor500
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

