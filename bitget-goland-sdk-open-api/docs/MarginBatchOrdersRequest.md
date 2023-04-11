# MarginBatchOrdersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChannelApiCode** | Pointer to **string** |  | [optional] 
**Ip** | Pointer to **string** |  | [optional] 
**OrderList** | Pointer to [**[]MarginOrderRequest**](MarginOrderRequest.md) |  | [optional] 
**Symbol** | **string** | symbol | 

## Methods

### NewMarginBatchOrdersRequest

`func NewMarginBatchOrdersRequest(symbol string, ) *MarginBatchOrdersRequest`

NewMarginBatchOrdersRequest instantiates a new MarginBatchOrdersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginBatchOrdersRequestWithDefaults

`func NewMarginBatchOrdersRequestWithDefaults() *MarginBatchOrdersRequest`

NewMarginBatchOrdersRequestWithDefaults instantiates a new MarginBatchOrdersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannelApiCode

`func (o *MarginBatchOrdersRequest) GetChannelApiCode() string`

GetChannelApiCode returns the ChannelApiCode field if non-nil, zero value otherwise.

### GetChannelApiCodeOk

`func (o *MarginBatchOrdersRequest) GetChannelApiCodeOk() (*string, bool)`

GetChannelApiCodeOk returns a tuple with the ChannelApiCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannelApiCode

`func (o *MarginBatchOrdersRequest) SetChannelApiCode(v string)`

SetChannelApiCode sets ChannelApiCode field to given value.

### HasChannelApiCode

`func (o *MarginBatchOrdersRequest) HasChannelApiCode() bool`

HasChannelApiCode returns a boolean if a field has been set.

### GetIp

`func (o *MarginBatchOrdersRequest) GetIp() string`

GetIp returns the Ip field if non-nil, zero value otherwise.

### GetIpOk

`func (o *MarginBatchOrdersRequest) GetIpOk() (*string, bool)`

GetIpOk returns a tuple with the Ip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIp

`func (o *MarginBatchOrdersRequest) SetIp(v string)`

SetIp sets Ip field to given value.

### HasIp

`func (o *MarginBatchOrdersRequest) HasIp() bool`

HasIp returns a boolean if a field has been set.

### GetOrderList

`func (o *MarginBatchOrdersRequest) GetOrderList() []MarginOrderRequest`

GetOrderList returns the OrderList field if non-nil, zero value otherwise.

### GetOrderListOk

`func (o *MarginBatchOrdersRequest) GetOrderListOk() (*[]MarginOrderRequest, bool)`

GetOrderListOk returns a tuple with the OrderList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderList

`func (o *MarginBatchOrdersRequest) SetOrderList(v []MarginOrderRequest)`

SetOrderList sets OrderList field to given value.

### HasOrderList

`func (o *MarginBatchOrdersRequest) HasOrderList() bool`

HasOrderList returns a boolean if a field has been set.

### GetSymbol

`func (o *MarginBatchOrdersRequest) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MarginBatchOrdersRequest) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MarginBatchOrdersRequest) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


