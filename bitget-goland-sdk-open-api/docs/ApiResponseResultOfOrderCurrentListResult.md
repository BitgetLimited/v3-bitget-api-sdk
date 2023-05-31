# ApiResponseResultOfOrderCurrentListResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | code | [optional] 
**Data** | Pointer to [**OrderCurrentListResult**](OrderCurrentListResult.md) |  | [optional] 
**Msg** | Pointer to **string** | msg | [optional] 
**RequestTime** | Pointer to **int64** | requestTime | [optional] 

## Methods

### NewApiResponseResultOfOrderCurrentListResult

`func NewApiResponseResultOfOrderCurrentListResult() *ApiResponseResultOfOrderCurrentListResult`

NewApiResponseResultOfOrderCurrentListResult instantiates a new ApiResponseResultOfOrderCurrentListResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiResponseResultOfOrderCurrentListResultWithDefaults

`func NewApiResponseResultOfOrderCurrentListResultWithDefaults() *ApiResponseResultOfOrderCurrentListResult`

NewApiResponseResultOfOrderCurrentListResultWithDefaults instantiates a new ApiResponseResultOfOrderCurrentListResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *ApiResponseResultOfOrderCurrentListResult) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ApiResponseResultOfOrderCurrentListResult) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ApiResponseResultOfOrderCurrentListResult) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *ApiResponseResultOfOrderCurrentListResult) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetData

`func (o *ApiResponseResultOfOrderCurrentListResult) GetData() OrderCurrentListResult`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ApiResponseResultOfOrderCurrentListResult) GetDataOk() (*OrderCurrentListResult, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ApiResponseResultOfOrderCurrentListResult) SetData(v OrderCurrentListResult)`

SetData sets Data field to given value.

### HasData

`func (o *ApiResponseResultOfOrderCurrentListResult) HasData() bool`

HasData returns a boolean if a field has been set.

### GetMsg

`func (o *ApiResponseResultOfOrderCurrentListResult) GetMsg() string`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *ApiResponseResultOfOrderCurrentListResult) GetMsgOk() (*string, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *ApiResponseResultOfOrderCurrentListResult) SetMsg(v string)`

SetMsg sets Msg field to given value.

### HasMsg

`func (o *ApiResponseResultOfOrderCurrentListResult) HasMsg() bool`

HasMsg returns a boolean if a field has been set.

### GetRequestTime

`func (o *ApiResponseResultOfOrderCurrentListResult) GetRequestTime() int64`

GetRequestTime returns the RequestTime field if non-nil, zero value otherwise.

### GetRequestTimeOk

`func (o *ApiResponseResultOfOrderCurrentListResult) GetRequestTimeOk() (*int64, bool)`

GetRequestTimeOk returns a tuple with the RequestTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestTime

`func (o *ApiResponseResultOfOrderCurrentListResult) SetRequestTime(v int64)`

SetRequestTime sets RequestTime field to given value.

### HasRequestTime

`func (o *ApiResponseResultOfOrderCurrentListResult) HasRequestTime() bool`

HasRequestTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


