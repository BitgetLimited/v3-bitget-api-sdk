# OrderHistoryListResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinId** | Pointer to **string** |  | [optional] 
**ResultList** | Pointer to [**[]OrderHistoryResult**](OrderHistoryResult.md) |  | [optional] 

## Methods

### NewOrderHistoryListResult

`func NewOrderHistoryListResult() *OrderHistoryListResult`

NewOrderHistoryListResult instantiates a new OrderHistoryListResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderHistoryListResultWithDefaults

`func NewOrderHistoryListResultWithDefaults() *OrderHistoryListResult`

NewOrderHistoryListResultWithDefaults instantiates a new OrderHistoryListResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinId

`func (o *OrderHistoryListResult) GetMinId() string`

GetMinId returns the MinId field if non-nil, zero value otherwise.

### GetMinIdOk

`func (o *OrderHistoryListResult) GetMinIdOk() (*string, bool)`

GetMinIdOk returns a tuple with the MinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinId

`func (o *OrderHistoryListResult) SetMinId(v string)`

SetMinId sets MinId field to given value.

### HasMinId

`func (o *OrderHistoryListResult) HasMinId() bool`

HasMinId returns a boolean if a field has been set.

### GetResultList

`func (o *OrderHistoryListResult) GetResultList() []OrderHistoryResult`

GetResultList returns the ResultList field if non-nil, zero value otherwise.

### GetResultListOk

`func (o *OrderHistoryListResult) GetResultListOk() (*[]OrderHistoryResult, bool)`

GetResultListOk returns a tuple with the ResultList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultList

`func (o *OrderHistoryListResult) SetResultList(v []OrderHistoryResult)`

SetResultList sets ResultList field to given value.

### HasResultList

`func (o *OrderHistoryListResult) HasResultList() bool`

HasResultList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


