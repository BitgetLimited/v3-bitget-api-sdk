# FiatPaymentInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentId** | Pointer to **string** |  | [optional] 
**PaymentInfo** | Pointer to [**[]FiatPaymentDetailInfo**](FiatPaymentDetailInfo.md) |  | [optional] 
**PaymentMethod** | Pointer to **string** |  | [optional] 

## Methods

### NewFiatPaymentInfo

`func NewFiatPaymentInfo() *FiatPaymentInfo`

NewFiatPaymentInfo instantiates a new FiatPaymentInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFiatPaymentInfoWithDefaults

`func NewFiatPaymentInfoWithDefaults() *FiatPaymentInfo`

NewFiatPaymentInfoWithDefaults instantiates a new FiatPaymentInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentId

`func (o *FiatPaymentInfo) GetPaymentId() string`

GetPaymentId returns the PaymentId field if non-nil, zero value otherwise.

### GetPaymentIdOk

`func (o *FiatPaymentInfo) GetPaymentIdOk() (*string, bool)`

GetPaymentIdOk returns a tuple with the PaymentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentId

`func (o *FiatPaymentInfo) SetPaymentId(v string)`

SetPaymentId sets PaymentId field to given value.

### HasPaymentId

`func (o *FiatPaymentInfo) HasPaymentId() bool`

HasPaymentId returns a boolean if a field has been set.

### GetPaymentInfo

`func (o *FiatPaymentInfo) GetPaymentInfo() []FiatPaymentDetailInfo`

GetPaymentInfo returns the PaymentInfo field if non-nil, zero value otherwise.

### GetPaymentInfoOk

`func (o *FiatPaymentInfo) GetPaymentInfoOk() (*[]FiatPaymentDetailInfo, bool)`

GetPaymentInfoOk returns a tuple with the PaymentInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentInfo

`func (o *FiatPaymentInfo) SetPaymentInfo(v []FiatPaymentDetailInfo)`

SetPaymentInfo sets PaymentInfo field to given value.

### HasPaymentInfo

`func (o *FiatPaymentInfo) HasPaymentInfo() bool`

HasPaymentInfo returns a boolean if a field has been set.

### GetPaymentMethod

`func (o *FiatPaymentInfo) GetPaymentMethod() string`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *FiatPaymentInfo) GetPaymentMethodOk() (*string, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *FiatPaymentInfo) SetPaymentMethod(v string)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *FiatPaymentInfo) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


