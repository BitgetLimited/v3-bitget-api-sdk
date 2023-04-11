# MarginBatchPlaceOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Failure** | Pointer to [**[]MarginBatchPlaceOrderFailureResult**](MarginBatchPlaceOrderFailureResult.md) |  | [optional] 
**ResultList** | Pointer to [**[]MarginCancelOrderResult**](MarginCancelOrderResult.md) |  | [optional] 

## Methods

### NewMarginBatchPlaceOrderResult

`func NewMarginBatchPlaceOrderResult() *MarginBatchPlaceOrderResult`

NewMarginBatchPlaceOrderResult instantiates a new MarginBatchPlaceOrderResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginBatchPlaceOrderResultWithDefaults

`func NewMarginBatchPlaceOrderResultWithDefaults() *MarginBatchPlaceOrderResult`

NewMarginBatchPlaceOrderResultWithDefaults instantiates a new MarginBatchPlaceOrderResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFailure

`func (o *MarginBatchPlaceOrderResult) GetFailure() []MarginBatchPlaceOrderFailureResult`

GetFailure returns the Failure field if non-nil, zero value otherwise.

### GetFailureOk

`func (o *MarginBatchPlaceOrderResult) GetFailureOk() (*[]MarginBatchPlaceOrderFailureResult, bool)`

GetFailureOk returns a tuple with the Failure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailure

`func (o *MarginBatchPlaceOrderResult) SetFailure(v []MarginBatchPlaceOrderFailureResult)`

SetFailure sets Failure field to given value.

### HasFailure

`func (o *MarginBatchPlaceOrderResult) HasFailure() bool`

HasFailure returns a boolean if a field has been set.

### GetResultList

`func (o *MarginBatchPlaceOrderResult) GetResultList() []MarginCancelOrderResult`

GetResultList returns the ResultList field if non-nil, zero value otherwise.

### GetResultListOk

`func (o *MarginBatchPlaceOrderResult) GetResultListOk() (*[]MarginCancelOrderResult, bool)`

GetResultListOk returns a tuple with the ResultList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultList

`func (o *MarginBatchPlaceOrderResult) SetResultList(v []MarginCancelOrderResult)`

SetResultList sets ResultList field to given value.

### HasResultList

`func (o *MarginBatchPlaceOrderResult) HasResultList() bool`

HasResultList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


