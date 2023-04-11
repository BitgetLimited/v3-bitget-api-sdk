# MarginOpenOrderInfoResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxId** | Pointer to **string** |  | [optional] 
**MinId** | Pointer to **string** |  | [optional] 
**OrderList** | Pointer to [**[]MarginOrderInfo**](MarginOrderInfo.md) |  | [optional] 

## Methods

### NewMarginOpenOrderInfoResult

`func NewMarginOpenOrderInfoResult() *MarginOpenOrderInfoResult`

NewMarginOpenOrderInfoResult instantiates a new MarginOpenOrderInfoResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginOpenOrderInfoResultWithDefaults

`func NewMarginOpenOrderInfoResultWithDefaults() *MarginOpenOrderInfoResult`

NewMarginOpenOrderInfoResultWithDefaults instantiates a new MarginOpenOrderInfoResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMaxId

`func (o *MarginOpenOrderInfoResult) GetMaxId() string`

GetMaxId returns the MaxId field if non-nil, zero value otherwise.

### GetMaxIdOk

`func (o *MarginOpenOrderInfoResult) GetMaxIdOk() (*string, bool)`

GetMaxIdOk returns a tuple with the MaxId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxId

`func (o *MarginOpenOrderInfoResult) SetMaxId(v string)`

SetMaxId sets MaxId field to given value.

### HasMaxId

`func (o *MarginOpenOrderInfoResult) HasMaxId() bool`

HasMaxId returns a boolean if a field has been set.

### GetMinId

`func (o *MarginOpenOrderInfoResult) GetMinId() string`

GetMinId returns the MinId field if non-nil, zero value otherwise.

### GetMinIdOk

`func (o *MarginOpenOrderInfoResult) GetMinIdOk() (*string, bool)`

GetMinIdOk returns a tuple with the MinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinId

`func (o *MarginOpenOrderInfoResult) SetMinId(v string)`

SetMinId sets MinId field to given value.

### HasMinId

`func (o *MarginOpenOrderInfoResult) HasMinId() bool`

HasMinId returns a boolean if a field has been set.

### GetOrderList

`func (o *MarginOpenOrderInfoResult) GetOrderList() []MarginOrderInfo`

GetOrderList returns the OrderList field if non-nil, zero value otherwise.

### GetOrderListOk

`func (o *MarginOpenOrderInfoResult) GetOrderListOk() (*[]MarginOrderInfo, bool)`

GetOrderListOk returns a tuple with the OrderList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderList

`func (o *MarginOpenOrderInfoResult) SetOrderList(v []MarginOrderInfo)`

SetOrderList sets OrderList field to given value.

### HasOrderList

`func (o *MarginOpenOrderInfoResult) HasOrderList() bool`

HasOrderList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


