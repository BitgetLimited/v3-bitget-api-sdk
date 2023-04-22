# MerchantOrderPaymentInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymethodId** | Pointer to **string** |  | [optional] 
**PaymethodInfo** | Pointer to [**[]OrderPaymentDetailInfo**](OrderPaymentDetailInfo.md) |  | [optional] 
**PaymethodName** | Pointer to **string** |  | [optional] 

## Methods

### NewMerchantOrderPaymentInfo

`func NewMerchantOrderPaymentInfo() *MerchantOrderPaymentInfo`

NewMerchantOrderPaymentInfo instantiates a new MerchantOrderPaymentInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMerchantOrderPaymentInfoWithDefaults

`func NewMerchantOrderPaymentInfoWithDefaults() *MerchantOrderPaymentInfo`

NewMerchantOrderPaymentInfoWithDefaults instantiates a new MerchantOrderPaymentInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymethodId

`func (o *MerchantOrderPaymentInfo) GetPaymethodId() string`

GetPaymethodId returns the PaymethodId field if non-nil, zero value otherwise.

### GetPaymethodIdOk

`func (o *MerchantOrderPaymentInfo) GetPaymethodIdOk() (*string, bool)`

GetPaymethodIdOk returns a tuple with the PaymethodId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymethodId

`func (o *MerchantOrderPaymentInfo) SetPaymethodId(v string)`

SetPaymethodId sets PaymethodId field to given value.

### HasPaymethodId

`func (o *MerchantOrderPaymentInfo) HasPaymethodId() bool`

HasPaymethodId returns a boolean if a field has been set.

### GetPaymethodInfo

`func (o *MerchantOrderPaymentInfo) GetPaymethodInfo() []OrderPaymentDetailInfo`

GetPaymethodInfo returns the PaymethodInfo field if non-nil, zero value otherwise.

### GetPaymethodInfoOk

`func (o *MerchantOrderPaymentInfo) GetPaymethodInfoOk() (*[]OrderPaymentDetailInfo, bool)`

GetPaymethodInfoOk returns a tuple with the PaymethodInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymethodInfo

`func (o *MerchantOrderPaymentInfo) SetPaymethodInfo(v []OrderPaymentDetailInfo)`

SetPaymethodInfo sets PaymethodInfo field to given value.

### HasPaymethodInfo

`func (o *MerchantOrderPaymentInfo) HasPaymethodInfo() bool`

HasPaymethodInfo returns a boolean if a field has been set.

### GetPaymethodName

`func (o *MerchantOrderPaymentInfo) GetPaymethodName() string`

GetPaymethodName returns the PaymethodName field if non-nil, zero value otherwise.

### GetPaymethodNameOk

`func (o *MerchantOrderPaymentInfo) GetPaymethodNameOk() (*string, bool)`

GetPaymethodNameOk returns a tuple with the PaymethodName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymethodName

`func (o *MerchantOrderPaymentInfo) SetPaymethodName(v string)`

SetPaymethodName sets PaymethodName field to given value.

### HasPaymethodName

`func (o *MerchantOrderPaymentInfo) HasPaymethodName() bool`

HasPaymethodName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


