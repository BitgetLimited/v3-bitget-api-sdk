# bitget.model.merchant_adv_info.MerchantAdvInfo

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**advId** | str,  | str,  |  | [optional] 
**advNo** | str,  | str,  |  | [optional] 
**amount** | str,  | str,  |  | [optional] 
**coin** | str,  | str,  |  | [optional] 
**coinPrecision** | str,  | str,  |  | [optional] 
**ctime** | str,  | str,  |  | [optional] 
**dealAmount** | str,  | str,  |  | [optional] 
**fiatCode** | str,  | str,  |  | [optional] 
**fiatPrecision** | str,  | str,  |  | [optional] 
**fiatSymbol** | str,  | str,  |  | [optional] 
**hide** | str,  | str,  |  | [optional] 
**maxAmount** | str,  | str,  |  | [optional] 
**minAmount** | str,  | str,  |  | [optional] 
**payDuration** | str,  | str,  |  | [optional] 
**[paymentMethod](#paymentMethod)** | list, tuple,  | tuple,  |  | [optional] 
**price** | str,  | str,  |  | [optional] 
**remark** | str,  | str,  |  | [optional] 
**status** | str,  | str,  |  | [optional] 
**turnoverNum** | str,  | str,  |  | [optional] 
**turnoverRate** | str,  | str,  |  | [optional] 
**type** | str,  | str,  |  | [optional] 
**userLimit** | [**MerchantAdvUserLimitInfo**](MerchantAdvUserLimitInfo.md) | [**MerchantAdvUserLimitInfo**](MerchantAdvUserLimitInfo.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# paymentMethod

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**FiatPaymentInfo**](FiatPaymentInfo.md) | [**FiatPaymentInfo**](FiatPaymentInfo.md) | [**FiatPaymentInfo**](FiatPaymentInfo.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

