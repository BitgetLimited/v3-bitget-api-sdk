# MarginBatchCancelOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Failure** | Pointer to [**[]MarginCancelOrderFailureResult**](MarginCancelOrderFailureResult.md) |  | [optional] 
**ResultList** | Pointer to [**[]MarginCancelOrderResult**](MarginCancelOrderResult.md) |  | [optional] 

## Methods

### NewMarginBatchCancelOrderResult

`func NewMarginBatchCancelOrderResult() *MarginBatchCancelOrderResult`

NewMarginBatchCancelOrderResult instantiates a new MarginBatchCancelOrderResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginBatchCancelOrderResultWithDefaults

`func NewMarginBatchCancelOrderResultWithDefaults() *MarginBatchCancelOrderResult`

NewMarginBatchCancelOrderResultWithDefaults instantiates a new MarginBatchCancelOrderResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFailure

`func (o *MarginBatchCancelOrderResult) GetFailure() []MarginCancelOrderFailureResult`

GetFailure returns the Failure field if non-nil, zero value otherwise.

### GetFailureOk

`func (o *MarginBatchCancelOrderResult) GetFailureOk() (*[]MarginCancelOrderFailureResult, bool)`

GetFailureOk returns a tuple with the Failure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailure

`func (o *MarginBatchCancelOrderResult) SetFailure(v []MarginCancelOrderFailureResult)`

SetFailure sets Failure field to given value.

### HasFailure

`func (o *MarginBatchCancelOrderResult) HasFailure() bool`

HasFailure returns a boolean if a field has been set.

### GetResultList

`func (o *MarginBatchCancelOrderResult) GetResultList() []MarginCancelOrderResult`

GetResultList returns the ResultList field if non-nil, zero value otherwise.

### GetResultListOk

`func (o *MarginBatchCancelOrderResult) GetResultListOk() (*[]MarginCancelOrderResult, bool)`

GetResultListOk returns a tuple with the ResultList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultList

`func (o *MarginBatchCancelOrderResult) SetResultList(v []MarginCancelOrderResult)`

SetResultList sets ResultList field to given value.

### HasResultList

`func (o *MarginBatchCancelOrderResult) HasResultList() bool`

HasResultList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


