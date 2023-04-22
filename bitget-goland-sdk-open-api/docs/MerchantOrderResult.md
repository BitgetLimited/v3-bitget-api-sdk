# MerchantOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinId** | Pointer to **string** |  | [optional] 
**OrderList** | Pointer to [**[]MerchantOrderInfo**](MerchantOrderInfo.md) |  | [optional] 

## Methods

### NewMerchantOrderResult

`func NewMerchantOrderResult() *MerchantOrderResult`

NewMerchantOrderResult instantiates a new MerchantOrderResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMerchantOrderResultWithDefaults

`func NewMerchantOrderResultWithDefaults() *MerchantOrderResult`

NewMerchantOrderResultWithDefaults instantiates a new MerchantOrderResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinId

`func (o *MerchantOrderResult) GetMinId() string`

GetMinId returns the MinId field if non-nil, zero value otherwise.

### GetMinIdOk

`func (o *MerchantOrderResult) GetMinIdOk() (*string, bool)`

GetMinIdOk returns a tuple with the MinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinId

`func (o *MerchantOrderResult) SetMinId(v string)`

SetMinId sets MinId field to given value.

### HasMinId

`func (o *MerchantOrderResult) HasMinId() bool`

HasMinId returns a boolean if a field has been set.

### GetOrderList

`func (o *MerchantOrderResult) GetOrderList() []MerchantOrderInfo`

GetOrderList returns the OrderList field if non-nil, zero value otherwise.

### GetOrderListOk

`func (o *MerchantOrderResult) GetOrderListOk() (*[]MerchantOrderInfo, bool)`

GetOrderListOk returns a tuple with the OrderList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderList

`func (o *MerchantOrderResult) SetOrderList(v []MerchantOrderInfo)`

SetOrderList sets OrderList field to given value.

### HasOrderList

`func (o *MerchantOrderResult) HasOrderList() bool`

HasOrderList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


