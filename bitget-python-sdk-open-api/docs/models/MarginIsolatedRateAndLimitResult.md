# bitget.model.margin_isolated_rate_and_limit_result.MarginIsolatedRateAndLimitResult

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**baseBorrowAble** | bool,  | BoolClass,  |  | [optional] 
**baseCoin** | str,  | str,  |  | [optional] 
**baseDailyInterestRate** | str,  | str,  |  | [optional] 
**baseMaxBorrowableAmount** | str,  | str,  |  | [optional] 
**baseTransferInAble** | bool,  | BoolClass,  |  | [optional] 
**[baseVips](#baseVips)** | list, tuple,  | tuple,  |  | [optional] 
**baseYearlyInterestRate** | str,  | str,  |  | [optional] 
**leverage** | str,  | str,  |  | [optional] 
**quoteBorrowAble** | bool,  | BoolClass,  |  | [optional] 
**quoteCoin** | str,  | str,  |  | [optional] 
**quoteDailyInterestRate** | str,  | str,  |  | [optional] 
**quoteMaxBorrowableAmount** | str,  | str,  |  | [optional] 
**quoteTransferInAble** | bool,  | BoolClass,  |  | [optional] 
**[quoteVips](#quoteVips)** | list, tuple,  | tuple,  |  | [optional] 
**quoteYearlyInterestRate** | str,  | str,  |  | [optional] 
**symbol** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# baseVips

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**MarginIsolatedVipResult**](MarginIsolatedVipResult.md) | [**MarginIsolatedVipResult**](MarginIsolatedVipResult.md) | [**MarginIsolatedVipResult**](MarginIsolatedVipResult.md) |  | 

# quoteVips

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**MarginIsolatedVipResult**](MarginIsolatedVipResult.md) | [**MarginIsolatedVipResult**](MarginIsolatedVipResult.md) | [**MarginIsolatedVipResult**](MarginIsolatedVipResult.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

