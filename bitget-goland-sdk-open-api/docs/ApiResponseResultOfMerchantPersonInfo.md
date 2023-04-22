# ApiResponseResultOfMerchantPersonInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | code | [optional] 
**Data** | Pointer to [**MerchantPersonInfo**](MerchantPersonInfo.md) |  | [optional] 
**Msg** | Pointer to **string** | msg | [optional] 
**RequestTime** | Pointer to **int64** | requestTime | [optional] 

## Methods

### NewApiResponseResultOfMerchantPersonInfo

`func NewApiResponseResultOfMerchantPersonInfo() *ApiResponseResultOfMerchantPersonInfo`

NewApiResponseResultOfMerchantPersonInfo instantiates a new ApiResponseResultOfMerchantPersonInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiResponseResultOfMerchantPersonInfoWithDefaults

`func NewApiResponseResultOfMerchantPersonInfoWithDefaults() *ApiResponseResultOfMerchantPersonInfo`

NewApiResponseResultOfMerchantPersonInfoWithDefaults instantiates a new ApiResponseResultOfMerchantPersonInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *ApiResponseResultOfMerchantPersonInfo) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ApiResponseResultOfMerchantPersonInfo) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ApiResponseResultOfMerchantPersonInfo) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *ApiResponseResultOfMerchantPersonInfo) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetData

`func (o *ApiResponseResultOfMerchantPersonInfo) GetData() MerchantPersonInfo`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ApiResponseResultOfMerchantPersonInfo) GetDataOk() (*MerchantPersonInfo, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ApiResponseResultOfMerchantPersonInfo) SetData(v MerchantPersonInfo)`

SetData sets Data field to given value.

### HasData

`func (o *ApiResponseResultOfMerchantPersonInfo) HasData() bool`

HasData returns a boolean if a field has been set.

### GetMsg

`func (o *ApiResponseResultOfMerchantPersonInfo) GetMsg() string`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *ApiResponseResultOfMerchantPersonInfo) GetMsgOk() (*string, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *ApiResponseResultOfMerchantPersonInfo) SetMsg(v string)`

SetMsg sets Msg field to given value.

### HasMsg

`func (o *ApiResponseResultOfMerchantPersonInfo) HasMsg() bool`

HasMsg returns a boolean if a field has been set.

### GetRequestTime

`func (o *ApiResponseResultOfMerchantPersonInfo) GetRequestTime() int64`

GetRequestTime returns the RequestTime field if non-nil, zero value otherwise.

### GetRequestTimeOk

`func (o *ApiResponseResultOfMerchantPersonInfo) GetRequestTimeOk() (*int64, bool)`

GetRequestTimeOk returns a tuple with the RequestTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestTime

`func (o *ApiResponseResultOfMerchantPersonInfo) SetRequestTime(v int64)`

SetRequestTime sets RequestTime field to given value.

### HasRequestTime

`func (o *ApiResponseResultOfMerchantPersonInfo) HasRequestTime() bool`

HasRequestTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


