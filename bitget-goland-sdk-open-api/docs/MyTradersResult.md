# MyTradersResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NextFlag** | Pointer to **bool** |  | [optional] 
**ResultList** | Pointer to [**[]MyTraderResult**](MyTraderResult.md) |  | [optional] 

## Methods

### NewMyTradersResult

`func NewMyTradersResult() *MyTradersResult`

NewMyTradersResult instantiates a new MyTradersResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMyTradersResultWithDefaults

`func NewMyTradersResultWithDefaults() *MyTradersResult`

NewMyTradersResultWithDefaults instantiates a new MyTradersResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNextFlag

`func (o *MyTradersResult) GetNextFlag() bool`

GetNextFlag returns the NextFlag field if non-nil, zero value otherwise.

### GetNextFlagOk

`func (o *MyTradersResult) GetNextFlagOk() (*bool, bool)`

GetNextFlagOk returns a tuple with the NextFlag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextFlag

`func (o *MyTradersResult) SetNextFlag(v bool)`

SetNextFlag sets NextFlag field to given value.

### HasNextFlag

`func (o *MyTradersResult) HasNextFlag() bool`

HasNextFlag returns a boolean if a field has been set.

### GetResultList

`func (o *MyTradersResult) GetResultList() []MyTraderResult`

GetResultList returns the ResultList field if non-nil, zero value otherwise.

### GetResultListOk

`func (o *MyTradersResult) GetResultListOk() (*[]MyTraderResult, bool)`

GetResultListOk returns a tuple with the ResultList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultList

`func (o *MyTradersResult) SetResultList(v []MyTraderResult)`

SetResultList sets ResultList field to given value.

### HasResultList

`func (o *MyTradersResult) HasResultList() bool`

HasResultList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


