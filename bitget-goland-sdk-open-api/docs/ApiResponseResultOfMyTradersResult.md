# ApiResponseResultOfMyTradersResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | code | [optional] 
**Data** | Pointer to [**MyTradersResult**](MyTradersResult.md) |  | [optional] 
**Msg** | Pointer to **string** | msg | [optional] 
**RequestTime** | Pointer to **int64** | requestTime | [optional] 

## Methods

### NewApiResponseResultOfMyTradersResult

`func NewApiResponseResultOfMyTradersResult() *ApiResponseResultOfMyTradersResult`

NewApiResponseResultOfMyTradersResult instantiates a new ApiResponseResultOfMyTradersResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiResponseResultOfMyTradersResultWithDefaults

`func NewApiResponseResultOfMyTradersResultWithDefaults() *ApiResponseResultOfMyTradersResult`

NewApiResponseResultOfMyTradersResultWithDefaults instantiates a new ApiResponseResultOfMyTradersResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *ApiResponseResultOfMyTradersResult) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ApiResponseResultOfMyTradersResult) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ApiResponseResultOfMyTradersResult) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *ApiResponseResultOfMyTradersResult) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetData

`func (o *ApiResponseResultOfMyTradersResult) GetData() MyTradersResult`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ApiResponseResultOfMyTradersResult) GetDataOk() (*MyTradersResult, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ApiResponseResultOfMyTradersResult) SetData(v MyTradersResult)`

SetData sets Data field to given value.

### HasData

`func (o *ApiResponseResultOfMyTradersResult) HasData() bool`

HasData returns a boolean if a field has been set.

### GetMsg

`func (o *ApiResponseResultOfMyTradersResult) GetMsg() string`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *ApiResponseResultOfMyTradersResult) GetMsgOk() (*string, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *ApiResponseResultOfMyTradersResult) SetMsg(v string)`

SetMsg sets Msg field to given value.

### HasMsg

`func (o *ApiResponseResultOfMyTradersResult) HasMsg() bool`

HasMsg returns a boolean if a field has been set.

### GetRequestTime

`func (o *ApiResponseResultOfMyTradersResult) GetRequestTime() int64`

GetRequestTime returns the RequestTime field if non-nil, zero value otherwise.

### GetRequestTimeOk

`func (o *ApiResponseResultOfMyTradersResult) GetRequestTimeOk() (*int64, bool)`

GetRequestTimeOk returns a tuple with the RequestTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestTime

`func (o *ApiResponseResultOfMyTradersResult) SetRequestTime(v int64)`

SetRequestTime sets RequestTime field to given value.

### HasRequestTime

`func (o *ApiResponseResultOfMyTradersResult) HasRequestTime() bool`

HasRequestTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


