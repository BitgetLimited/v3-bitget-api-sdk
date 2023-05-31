# MyTracersResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NextFlag** | Pointer to **bool** |  | [optional] 
**ResultList** | Pointer to [**[]MyTracerResult**](MyTracerResult.md) |  | [optional] 

## Methods

### NewMyTracersResult

`func NewMyTracersResult() *MyTracersResult`

NewMyTracersResult instantiates a new MyTracersResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMyTracersResultWithDefaults

`func NewMyTracersResultWithDefaults() *MyTracersResult`

NewMyTracersResultWithDefaults instantiates a new MyTracersResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNextFlag

`func (o *MyTracersResult) GetNextFlag() bool`

GetNextFlag returns the NextFlag field if non-nil, zero value otherwise.

### GetNextFlagOk

`func (o *MyTracersResult) GetNextFlagOk() (*bool, bool)`

GetNextFlagOk returns a tuple with the NextFlag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextFlag

`func (o *MyTracersResult) SetNextFlag(v bool)`

SetNextFlag sets NextFlag field to given value.

### HasNextFlag

`func (o *MyTracersResult) HasNextFlag() bool`

HasNextFlag returns a boolean if a field has been set.

### GetResultList

`func (o *MyTracersResult) GetResultList() []MyTracerResult`

GetResultList returns the ResultList field if non-nil, zero value otherwise.

### GetResultListOk

`func (o *MyTracersResult) GetResultListOk() (*[]MyTracerResult, bool)`

GetResultListOk returns a tuple with the ResultList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultList

`func (o *MyTracersResult) SetResultList(v []MyTracerResult)`

SetResultList sets ResultList field to given value.

### HasResultList

`func (o *MyTracersResult) HasResultList() bool`

HasResultList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


