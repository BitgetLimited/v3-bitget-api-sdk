# TraceSettingResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsMyTrader** | Pointer to **bool** |  | [optional] 
**ProfitRate** | Pointer to **string** |  | [optional] 
**SettingType** | Pointer to **string** |  | [optional] 
**SettledInDays** | Pointer to **string** |  | [optional] 
**TraceBatchDetails** | Pointer to [**[]TraceSettingBatchDetailsResult**](TraceSettingBatchDetailsResult.md) |  | [optional] 
**TraceProductConfigs** | Pointer to [**[]TraceSettingProductConfigsResult**](TraceSettingProductConfigsResult.md) |  | [optional] 
**TraderHeadPic** | Pointer to **string** |  | [optional] 
**TraderNickName** | Pointer to **string** |  | [optional] 

## Methods

### NewTraceSettingResult

`func NewTraceSettingResult() *TraceSettingResult`

NewTraceSettingResult instantiates a new TraceSettingResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTraceSettingResultWithDefaults

`func NewTraceSettingResultWithDefaults() *TraceSettingResult`

NewTraceSettingResultWithDefaults instantiates a new TraceSettingResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsMyTrader

`func (o *TraceSettingResult) GetIsMyTrader() bool`

GetIsMyTrader returns the IsMyTrader field if non-nil, zero value otherwise.

### GetIsMyTraderOk

`func (o *TraceSettingResult) GetIsMyTraderOk() (*bool, bool)`

GetIsMyTraderOk returns a tuple with the IsMyTrader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMyTrader

`func (o *TraceSettingResult) SetIsMyTrader(v bool)`

SetIsMyTrader sets IsMyTrader field to given value.

### HasIsMyTrader

`func (o *TraceSettingResult) HasIsMyTrader() bool`

HasIsMyTrader returns a boolean if a field has been set.

### GetProfitRate

`func (o *TraceSettingResult) GetProfitRate() string`

GetProfitRate returns the ProfitRate field if non-nil, zero value otherwise.

### GetProfitRateOk

`func (o *TraceSettingResult) GetProfitRateOk() (*string, bool)`

GetProfitRateOk returns a tuple with the ProfitRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfitRate

`func (o *TraceSettingResult) SetProfitRate(v string)`

SetProfitRate sets ProfitRate field to given value.

### HasProfitRate

`func (o *TraceSettingResult) HasProfitRate() bool`

HasProfitRate returns a boolean if a field has been set.

### GetSettingType

`func (o *TraceSettingResult) GetSettingType() string`

GetSettingType returns the SettingType field if non-nil, zero value otherwise.

### GetSettingTypeOk

`func (o *TraceSettingResult) GetSettingTypeOk() (*string, bool)`

GetSettingTypeOk returns a tuple with the SettingType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettingType

`func (o *TraceSettingResult) SetSettingType(v string)`

SetSettingType sets SettingType field to given value.

### HasSettingType

`func (o *TraceSettingResult) HasSettingType() bool`

HasSettingType returns a boolean if a field has been set.

### GetSettledInDays

`func (o *TraceSettingResult) GetSettledInDays() string`

GetSettledInDays returns the SettledInDays field if non-nil, zero value otherwise.

### GetSettledInDaysOk

`func (o *TraceSettingResult) GetSettledInDaysOk() (*string, bool)`

GetSettledInDaysOk returns a tuple with the SettledInDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettledInDays

`func (o *TraceSettingResult) SetSettledInDays(v string)`

SetSettledInDays sets SettledInDays field to given value.

### HasSettledInDays

`func (o *TraceSettingResult) HasSettledInDays() bool`

HasSettledInDays returns a boolean if a field has been set.

### GetTraceBatchDetails

`func (o *TraceSettingResult) GetTraceBatchDetails() []TraceSettingBatchDetailsResult`

GetTraceBatchDetails returns the TraceBatchDetails field if non-nil, zero value otherwise.

### GetTraceBatchDetailsOk

`func (o *TraceSettingResult) GetTraceBatchDetailsOk() (*[]TraceSettingBatchDetailsResult, bool)`

GetTraceBatchDetailsOk returns a tuple with the TraceBatchDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTraceBatchDetails

`func (o *TraceSettingResult) SetTraceBatchDetails(v []TraceSettingBatchDetailsResult)`

SetTraceBatchDetails sets TraceBatchDetails field to given value.

### HasTraceBatchDetails

`func (o *TraceSettingResult) HasTraceBatchDetails() bool`

HasTraceBatchDetails returns a boolean if a field has been set.

### GetTraceProductConfigs

`func (o *TraceSettingResult) GetTraceProductConfigs() []TraceSettingProductConfigsResult`

GetTraceProductConfigs returns the TraceProductConfigs field if non-nil, zero value otherwise.

### GetTraceProductConfigsOk

`func (o *TraceSettingResult) GetTraceProductConfigsOk() (*[]TraceSettingProductConfigsResult, bool)`

GetTraceProductConfigsOk returns a tuple with the TraceProductConfigs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTraceProductConfigs

`func (o *TraceSettingResult) SetTraceProductConfigs(v []TraceSettingProductConfigsResult)`

SetTraceProductConfigs sets TraceProductConfigs field to given value.

### HasTraceProductConfigs

`func (o *TraceSettingResult) HasTraceProductConfigs() bool`

HasTraceProductConfigs returns a boolean if a field has been set.

### GetTraderHeadPic

`func (o *TraceSettingResult) GetTraderHeadPic() string`

GetTraderHeadPic returns the TraderHeadPic field if non-nil, zero value otherwise.

### GetTraderHeadPicOk

`func (o *TraceSettingResult) GetTraderHeadPicOk() (*string, bool)`

GetTraderHeadPicOk returns a tuple with the TraderHeadPic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTraderHeadPic

`func (o *TraceSettingResult) SetTraderHeadPic(v string)`

SetTraderHeadPic sets TraderHeadPic field to given value.

### HasTraderHeadPic

`func (o *TraceSettingResult) HasTraderHeadPic() bool`

HasTraderHeadPic returns a boolean if a field has been set.

### GetTraderNickName

`func (o *TraceSettingResult) GetTraderNickName() string`

GetTraderNickName returns the TraderNickName field if non-nil, zero value otherwise.

### GetTraderNickNameOk

`func (o *TraceSettingResult) GetTraderNickNameOk() (*string, bool)`

GetTraderNickNameOk returns a tuple with the TraderNickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTraderNickName

`func (o *TraceSettingResult) SetTraderNickName(v string)`

SetTraderNickName sets TraderNickName field to given value.

### HasTraderNickName

`func (o *TraceSettingResult) HasTraderNickName() bool`

HasTraderNickName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


