<a name="__pageTop"></a>
# bitget.apis.tags.margin_public_api.MarginPublicApi

All URIs are relative to *https://api.bitget.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**margin_public_currencies**](#margin_public_currencies) | **get** /api/margin/v1/public/currencies | currencies

# **margin_public_currencies**
<a name="margin_public_currencies"></a>
> ApiResponseResultOfListOfMarginSystemResult margin_public_currencies()

currencies

Get Currencies

### Example

```python
import bitget
from bitget.apis.tags import margin_public_api
from bitget.model.api_response_result_of_void import ApiResponseResultOfVoid
from bitget.model.api_response_result_of_list_of_margin_system_result import ApiResponseResultOfListOfMarginSystemResult
from pprint import pprint
# Defining the host is optional and defaults to https://api.bitget.com
# See configuration.py for a list of all supported configuration parameters.
configuration = bitget.Configuration(
    host = "https://api.bitget.com"
)

# Enter a context with an instance of the API client
with bitget.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = margin_public_api.MarginPublicApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # currencies
        api_response = api_instance.margin_public_currencies()
        pprint(api_response)
    except bitget.ApiException as e:
        print("Exception when calling MarginPublicApi->margin_public_currencies: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#margin_public_currencies.ApiResponseFor200) | OK
400 | [ApiResponseFor400](#margin_public_currencies.ApiResponseFor400) | Bad Request
429 | [ApiResponseFor429](#margin_public_currencies.ApiResponseFor429) | Gateway Frequency Limit
500 | [ApiResponseFor500](#margin_public_currencies.ApiResponseFor500) | Server Error

#### margin_public_currencies.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfListOfMarginSystemResult**](../../models/ApiResponseResultOfListOfMarginSystemResult.md) |  | 


#### margin_public_currencies.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_public_currencies.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponseResultOfVoid**](../../models/ApiResponseResultOfVoid.md) |  | 


#### margin_public_currencies.ApiResponseFor500
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

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

