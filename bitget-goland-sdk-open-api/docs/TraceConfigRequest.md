# TraceConfigRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Setting** | Pointer to [**[]TraceConfigSettingRequest**](TraceConfigSettingRequest.md) |  | [optional] 
**SettingType** | **string** | settingType | 
**TraderUserId** | **string** | traderUserId | 

## Methods

### NewTraceConfigRequest

`func NewTraceConfigRequest(settingType string, traderUserId string, ) *TraceConfigRequest`

NewTraceConfigRequest instantiates a new TraceConfigRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTraceConfigRequestWithDefaults

`func NewTraceConfigRequestWithDefaults() *TraceConfigRequest`

NewTraceConfigRequestWithDefaults instantiates a new TraceConfigRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSetting

`func (o *TraceConfigRequest) GetSetting() []TraceConfigSettingRequest`

GetSetting returns the Setting field if non-nil, zero value otherwise.

### GetSettingOk

`func (o *TraceConfigRequest) GetSettingOk() (*[]TraceConfigSettingRequest, bool)`

GetSettingOk returns a tuple with the Setting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSetting

`func (o *TraceConfigRequest) SetSetting(v []TraceConfigSettingRequest)`

SetSetting sets Setting field to given value.

### HasSetting

`func (o *TraceConfigRequest) HasSetting() bool`

HasSetting returns a boolean if a field has been set.

### GetSettingType

`func (o *TraceConfigRequest) GetSettingType() string`

GetSettingType returns the SettingType field if non-nil, zero value otherwise.

### GetSettingTypeOk

`func (o *TraceConfigRequest) GetSettingTypeOk() (*string, bool)`

GetSettingTypeOk returns a tuple with the SettingType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettingType

`func (o *TraceConfigRequest) SetSettingType(v string)`

SetSettingType sets SettingType field to given value.


### GetTraderUserId

`func (o *TraceConfigRequest) GetTraderUserId() string`

GetTraderUserId returns the TraderUserId field if non-nil, zero value otherwise.

### GetTraderUserIdOk

`func (o *TraceConfigRequest) GetTraderUserIdOk() (*string, bool)`

GetTraderUserIdOk returns a tuple with the TraderUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTraderUserId

`func (o *TraceConfigRequest) SetTraderUserId(v string)`

SetTraderUserId sets TraderUserId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


