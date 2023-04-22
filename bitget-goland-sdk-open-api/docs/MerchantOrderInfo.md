# MerchantOrderInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvNo** | Pointer to **string** |  | [optional] 
**Amount** | Pointer to **string** |  | [optional] 
**BuyerRealName** | Pointer to **string** |  | [optional] 
**Coin** | Pointer to **string** |  | [optional] 
**Count** | Pointer to **string** |  | [optional] 
**Ctime** | Pointer to **string** |  | [optional] 
**Fiat** | Pointer to **string** |  | [optional] 
**OrderId** | Pointer to **string** |  | [optional] 
**OrderNo** | Pointer to **string** |  | [optional] 
**PaymentInfo** | Pointer to [**MerchantOrderPaymentInfo**](MerchantOrderPaymentInfo.md) |  | [optional] 
**PaymentTime** | Pointer to **string** |  | [optional] 
**Price** | Pointer to **string** |  | [optional] 
**ReleaseCoinTime** | Pointer to **string** |  | [optional] 
**RepresentTime** | Pointer to **string** |  | [optional] 
**SellerRealName** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 
**WithdrawTime** | Pointer to **string** |  | [optional] 

## Methods

### NewMerchantOrderInfo

`func NewMerchantOrderInfo() *MerchantOrderInfo`

NewMerchantOrderInfo instantiates a new MerchantOrderInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMerchantOrderInfoWithDefaults

`func NewMerchantOrderInfoWithDefaults() *MerchantOrderInfo`

NewMerchantOrderInfoWithDefaults instantiates a new MerchantOrderInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvNo

`func (o *MerchantOrderInfo) GetAdvNo() string`

GetAdvNo returns the AdvNo field if non-nil, zero value otherwise.

### GetAdvNoOk

`func (o *MerchantOrderInfo) GetAdvNoOk() (*string, bool)`

GetAdvNoOk returns a tuple with the AdvNo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvNo

`func (o *MerchantOrderInfo) SetAdvNo(v string)`

SetAdvNo sets AdvNo field to given value.

### HasAdvNo

`func (o *MerchantOrderInfo) HasAdvNo() bool`

HasAdvNo returns a boolean if a field has been set.

### GetAmount

`func (o *MerchantOrderInfo) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *MerchantOrderInfo) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *MerchantOrderInfo) SetAmount(v string)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *MerchantOrderInfo) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetBuyerRealName

`func (o *MerchantOrderInfo) GetBuyerRealName() string`

GetBuyerRealName returns the BuyerRealName field if non-nil, zero value otherwise.

### GetBuyerRealNameOk

`func (o *MerchantOrderInfo) GetBuyerRealNameOk() (*string, bool)`

GetBuyerRealNameOk returns a tuple with the BuyerRealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerRealName

`func (o *MerchantOrderInfo) SetBuyerRealName(v string)`

SetBuyerRealName sets BuyerRealName field to given value.

### HasBuyerRealName

`func (o *MerchantOrderInfo) HasBuyerRealName() bool`

HasBuyerRealName returns a boolean if a field has been set.

### GetCoin

`func (o *MerchantOrderInfo) GetCoin() string`

GetCoin returns the Coin field if non-nil, zero value otherwise.

### GetCoinOk

`func (o *MerchantOrderInfo) GetCoinOk() (*string, bool)`

GetCoinOk returns a tuple with the Coin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoin

`func (o *MerchantOrderInfo) SetCoin(v string)`

SetCoin sets Coin field to given value.

### HasCoin

`func (o *MerchantOrderInfo) HasCoin() bool`

HasCoin returns a boolean if a field has been set.

### GetCount

`func (o *MerchantOrderInfo) GetCount() string`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *MerchantOrderInfo) GetCountOk() (*string, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *MerchantOrderInfo) SetCount(v string)`

SetCount sets Count field to given value.

### HasCount

`func (o *MerchantOrderInfo) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetCtime

`func (o *MerchantOrderInfo) GetCtime() string`

GetCtime returns the Ctime field if non-nil, zero value otherwise.

### GetCtimeOk

`func (o *MerchantOrderInfo) GetCtimeOk() (*string, bool)`

GetCtimeOk returns a tuple with the Ctime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCtime

`func (o *MerchantOrderInfo) SetCtime(v string)`

SetCtime sets Ctime field to given value.

### HasCtime

`func (o *MerchantOrderInfo) HasCtime() bool`

HasCtime returns a boolean if a field has been set.

### GetFiat

`func (o *MerchantOrderInfo) GetFiat() string`

GetFiat returns the Fiat field if non-nil, zero value otherwise.

### GetFiatOk

`func (o *MerchantOrderInfo) GetFiatOk() (*string, bool)`

GetFiatOk returns a tuple with the Fiat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiat

`func (o *MerchantOrderInfo) SetFiat(v string)`

SetFiat sets Fiat field to given value.

### HasFiat

`func (o *MerchantOrderInfo) HasFiat() bool`

HasFiat returns a boolean if a field has been set.

### GetOrderId

`func (o *MerchantOrderInfo) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *MerchantOrderInfo) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *MerchantOrderInfo) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *MerchantOrderInfo) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetOrderNo

`func (o *MerchantOrderInfo) GetOrderNo() string`

GetOrderNo returns the OrderNo field if non-nil, zero value otherwise.

### GetOrderNoOk

`func (o *MerchantOrderInfo) GetOrderNoOk() (*string, bool)`

GetOrderNoOk returns a tuple with the OrderNo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderNo

`func (o *MerchantOrderInfo) SetOrderNo(v string)`

SetOrderNo sets OrderNo field to given value.

### HasOrderNo

`func (o *MerchantOrderInfo) HasOrderNo() bool`

HasOrderNo returns a boolean if a field has been set.

### GetPaymentInfo

`func (o *MerchantOrderInfo) GetPaymentInfo() MerchantOrderPaymentInfo`

GetPaymentInfo returns the PaymentInfo field if non-nil, zero value otherwise.

### GetPaymentInfoOk

`func (o *MerchantOrderInfo) GetPaymentInfoOk() (*MerchantOrderPaymentInfo, bool)`

GetPaymentInfoOk returns a tuple with the PaymentInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentInfo

`func (o *MerchantOrderInfo) SetPaymentInfo(v MerchantOrderPaymentInfo)`

SetPaymentInfo sets PaymentInfo field to given value.

### HasPaymentInfo

`func (o *MerchantOrderInfo) HasPaymentInfo() bool`

HasPaymentInfo returns a boolean if a field has been set.

### GetPaymentTime

`func (o *MerchantOrderInfo) GetPaymentTime() string`

GetPaymentTime returns the PaymentTime field if non-nil, zero value otherwise.

### GetPaymentTimeOk

`func (o *MerchantOrderInfo) GetPaymentTimeOk() (*string, bool)`

GetPaymentTimeOk returns a tuple with the PaymentTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentTime

`func (o *MerchantOrderInfo) SetPaymentTime(v string)`

SetPaymentTime sets PaymentTime field to given value.

### HasPaymentTime

`func (o *MerchantOrderInfo) HasPaymentTime() bool`

HasPaymentTime returns a boolean if a field has been set.

### GetPrice

`func (o *MerchantOrderInfo) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *MerchantOrderInfo) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *MerchantOrderInfo) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *MerchantOrderInfo) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetReleaseCoinTime

`func (o *MerchantOrderInfo) GetReleaseCoinTime() string`

GetReleaseCoinTime returns the ReleaseCoinTime field if non-nil, zero value otherwise.

### GetReleaseCoinTimeOk

`func (o *MerchantOrderInfo) GetReleaseCoinTimeOk() (*string, bool)`

GetReleaseCoinTimeOk returns a tuple with the ReleaseCoinTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReleaseCoinTime

`func (o *MerchantOrderInfo) SetReleaseCoinTime(v string)`

SetReleaseCoinTime sets ReleaseCoinTime field to given value.

### HasReleaseCoinTime

`func (o *MerchantOrderInfo) HasReleaseCoinTime() bool`

HasReleaseCoinTime returns a boolean if a field has been set.

### GetRepresentTime

`func (o *MerchantOrderInfo) GetRepresentTime() string`

GetRepresentTime returns the RepresentTime field if non-nil, zero value otherwise.

### GetRepresentTimeOk

`func (o *MerchantOrderInfo) GetRepresentTimeOk() (*string, bool)`

GetRepresentTimeOk returns a tuple with the RepresentTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepresentTime

`func (o *MerchantOrderInfo) SetRepresentTime(v string)`

SetRepresentTime sets RepresentTime field to given value.

### HasRepresentTime

`func (o *MerchantOrderInfo) HasRepresentTime() bool`

HasRepresentTime returns a boolean if a field has been set.

### GetSellerRealName

`func (o *MerchantOrderInfo) GetSellerRealName() string`

GetSellerRealName returns the SellerRealName field if non-nil, zero value otherwise.

### GetSellerRealNameOk

`func (o *MerchantOrderInfo) GetSellerRealNameOk() (*string, bool)`

GetSellerRealNameOk returns a tuple with the SellerRealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellerRealName

`func (o *MerchantOrderInfo) SetSellerRealName(v string)`

SetSellerRealName sets SellerRealName field to given value.

### HasSellerRealName

`func (o *MerchantOrderInfo) HasSellerRealName() bool`

HasSellerRealName returns a boolean if a field has been set.

### GetStatus

`func (o *MerchantOrderInfo) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MerchantOrderInfo) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MerchantOrderInfo) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *MerchantOrderInfo) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetType

`func (o *MerchantOrderInfo) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MerchantOrderInfo) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MerchantOrderInfo) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *MerchantOrderInfo) HasType() bool`

HasType returns a boolean if a field has been set.

### GetWithdrawTime

`func (o *MerchantOrderInfo) GetWithdrawTime() string`

GetWithdrawTime returns the WithdrawTime field if non-nil, zero value otherwise.

### GetWithdrawTimeOk

`func (o *MerchantOrderInfo) GetWithdrawTimeOk() (*string, bool)`

GetWithdrawTimeOk returns a tuple with the WithdrawTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWithdrawTime

`func (o *MerchantOrderInfo) SetWithdrawTime(v string)`

SetWithdrawTime sets WithdrawTime field to given value.

### HasWithdrawTime

`func (o *MerchantOrderInfo) HasWithdrawTime() bool`

HasWithdrawTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


