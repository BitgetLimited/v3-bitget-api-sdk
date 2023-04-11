# MarginCancelOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientOid** | Pointer to **string** | clientOid | [optional] 
**OrderId** | Pointer to **string** | orderId | [optional] 
**Symbol** | **string** | symbol | 

## Methods

### NewMarginCancelOrderRequest

`func NewMarginCancelOrderRequest(symbol string, ) *MarginCancelOrderRequest`

NewMarginCancelOrderRequest instantiates a new MarginCancelOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginCancelOrderRequestWithDefaults

`func NewMarginCancelOrderRequestWithDefaults() *MarginCancelOrderRequest`

NewMarginCancelOrderRequestWithDefaults instantiates a new MarginCancelOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientOid

`func (o *MarginCancelOrderRequest) GetClientOid() string`

GetClientOid returns the ClientOid field if non-nil, zero value otherwise.

### GetClientOidOk

`func (o *MarginCancelOrderRequest) GetClientOidOk() (*string, bool)`

GetClientOidOk returns a tuple with the ClientOid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientOid

`func (o *MarginCancelOrderRequest) SetClientOid(v string)`

SetClientOid sets ClientOid field to given value.

### HasClientOid

`func (o *MarginCancelOrderRequest) HasClientOid() bool`

HasClientOid returns a boolean if a field has been set.

### GetOrderId

`func (o *MarginCancelOrderRequest) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *MarginCancelOrderRequest) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *MarginCancelOrderRequest) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *MarginCancelOrderRequest) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetSymbol

`func (o *MarginCancelOrderRequest) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MarginCancelOrderRequest) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MarginCancelOrderRequest) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


