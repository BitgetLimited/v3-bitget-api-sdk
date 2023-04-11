<a name="__pageTop"></a>
# bitget.apis.tags.margin_cross_borrow_api.MarginCrossBorrowApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cross_loan_list**](#cross_loan_list) | **get** /api/margin/v1/cross/loan/list | list

# **cross_loan_list**
<a name="cross_loan_list"></a>
> ApiResponseResultOfMarginLoanInfoResult cross_loan_list(start_time)

list

Get Loan List

### Example

* Api Key Authentication (ACCESS_KEY):
* Api Key Authentication (ACCESS_PASSPHRASE):
* Api Key Authentication (ACCESS_SIGN):
* Api Key Authentication (ACCESS_TIMESTAMP):
* Api Key Authentication (SECRET_KEY):
```python
import bitget
from bitget.apis.tags import margin_cross_borrow_api
from bitget.model.api_response_result_of_margin_loan_info_result import ApiResponseResultOfMarginLoanInfoResult
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
    api_instance = margin_cross_borrow_api.MarginCrossBorrowApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'startTime': "1678193338000",
    }
    try:
        # list
        api_response = api_instance.cross_loan_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginCrossBorrowApi->cross_loan_list: %s\n" % e)

    # example passing only optional values
    query_params = {
        'coin': "USDT",
        'startTime': "1678193338000",
        'endTime': "1678193338000",
        'loanId': "loanId_example",
        'pageSize': "10",
        'pageId': "minId",
    }
    try:
        # list
        api_response = api_instance.cross_loan_list(
            query_params=query_params,
        )
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginCrossBorrowApi->cross_loan_list: %s\n" % e)
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
coin | CoinSchema | | optional
startTime | StartTimeSchema | | 
endTime | EndTimeSchema | | optional
loanId | LoanIdSchema | | optional
pageSize | PageSizeSchema | | optional
pageId | PageIdSchema | | optional


# CoinSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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

# LoanIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PageIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#cross_loan_list.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#cross_loan_list.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#cross_loan_list.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#cross_loan_list.ApiResponseFor500) | Server Error

#### cross_loan_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfMarginLoanInfoResult**](../../models/ApiResponseResultOfMarginLoanInfoResult.md) |  | 


#### cross_loan_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### cross_loan_list.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### cross_loan_list.ApiResponseFor500
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

