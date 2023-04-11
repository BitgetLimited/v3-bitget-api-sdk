# MarginBatchCancelOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientOids** | Pointer to **[]string** | clientOids | [optional] 
**OrderIds** | Pointer to **[]string** | orderIds | [optional] 
**Symbol** | **string** | symbol | 

## Methods

### NewMarginBatchCancelOrderRequest

`func NewMarginBatchCancelOrderRequest(symbol string, ) *MarginBatchCancelOrderRequest`

NewMarginBatchCancelOrderRequest instantiates a new MarginBatchCancelOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginBatchCancelOrderRequestWithDefaults

`func NewMarginBatchCancelOrderRequestWithDefaults() *MarginBatchCancelOrderRequest`

NewMarginBatchCancelOrderRequestWithDefaults instantiates a new MarginBatchCancelOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientOids

`func (o *MarginBatchCancelOrderRequest) GetClientOids() []string`

GetClientOids returns the ClientOids field if non-nil, zero value otherwise.

### GetClientOidsOk

`func (o *MarginBatchCancelOrderRequest) GetClientOidsOk() (*[]string, bool)`

GetClientOidsOk returns a tuple with the ClientOids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientOids

`func (o *MarginBatchCancelOrderRequest) SetClientOids(v []string)`

SetClientOids sets ClientOids field to given value.

### HasClientOids

`func (o *MarginBatchCancelOrderRequest) HasClientOids() bool`

HasClientOids returns a boolean if a field has been set.

### GetOrderIds

`func (o *MarginBatchCancelOrderRequest) GetOrderIds() []string`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *MarginBatchCancelOrderRequest) GetOrderIdsOk() (*[]string, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *MarginBatchCancelOrderRequest) SetOrderIds(v []string)`

SetOrderIds sets OrderIds field to given value.

### HasOrderIds

`func (o *MarginBatchCancelOrderRequest) HasOrderIds() bool`

HasOrderIds returns a boolean if a field has been set.

### GetSymbol

`func (o *MarginBatchCancelOrderRequest) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MarginBatchCancelOrderRequest) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MarginBatchCancelOrderRequest) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


