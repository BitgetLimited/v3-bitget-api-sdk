# MerchantAdvInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvId** | Pointer to **string** |  | [optional] 
**AdvNo** | Pointer to **string** |  | [optional] 
**Amount** | Pointer to **string** |  | [optional] 
**Coin** | Pointer to **string** |  | [optional] 
**CoinPrecision** | Pointer to **string** |  | [optional] 
**Ctime** | Pointer to **string** |  | [optional] 
**DealAmount** | Pointer to **string** |  | [optional] 
**FiatCode** | Pointer to **string** |  | [optional] 
**FiatPrecision** | Pointer to **string** |  | [optional] 
**FiatSymbol** | Pointer to **string** |  | [optional] 
**Hide** | Pointer to **string** |  | [optional] 
**MaxAmount** | Pointer to **string** |  | [optional] 
**MinAmount** | Pointer to **string** |  | [optional] 
**PayDuration** | Pointer to **string** |  | [optional] 
**PaymentMethod** | Pointer to [**[]FiatPaymentInfo**](FiatPaymentInfo.md) |  | [optional] 
**Price** | Pointer to **string** |  | [optional] 
**Remark** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 
**TurnoverNum** | Pointer to **string** |  | [optional] 
**TurnoverRate** | Pointer to **string** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 
**UserLimit** | Pointer to [**MerchantAdvUserLimitInfo**](MerchantAdvUserLimitInfo.md) |  | [optional] 

## Methods

### NewMerchantAdvInfo

`func NewMerchantAdvInfo() *MerchantAdvInfo`

NewMerchantAdvInfo instantiates a new MerchantAdvInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMerchantAdvInfoWithDefaults

`func NewMerchantAdvInfoWithDefaults() *MerchantAdvInfo`

NewMerchantAdvInfoWithDefaults instantiates a new MerchantAdvInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvId

`func (o *MerchantAdvInfo) GetAdvId() string`

GetAdvId returns the AdvId field if non-nil, zero value otherwise.

### GetAdvIdOk

`func (o *MerchantAdvInfo) GetAdvIdOk() (*string, bool)`

GetAdvIdOk returns a tuple with the AdvId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvId

`func (o *MerchantAdvInfo) SetAdvId(v string)`

SetAdvId sets AdvId field to given value.

### HasAdvId

`func (o *MerchantAdvInfo) HasAdvId() bool`

HasAdvId returns a boolean if a field has been set.

### GetAdvNo

`func (o *MerchantAdvInfo) GetAdvNo() string`

GetAdvNo returns the AdvNo field if non-nil, zero value otherwise.

### GetAdvNoOk

`func (o *MerchantAdvInfo) GetAdvNoOk() (*string, bool)`

GetAdvNoOk returns a tuple with the AdvNo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvNo

`func (o *MerchantAdvInfo) SetAdvNo(v string)`

SetAdvNo sets AdvNo field to given value.

### HasAdvNo

`func (o *MerchantAdvInfo) HasAdvNo() bool`

HasAdvNo returns a boolean if a field has been set.

### GetAmount

`func (o *MerchantAdvInfo) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *MerchantAdvInfo) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *MerchantAdvInfo) SetAmount(v string)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *MerchantAdvInfo) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCoin

`func (o *MerchantAdvInfo) GetCoin() string`

GetCoin returns the Coin field if non-nil, zero value otherwise.

### GetCoinOk

`func (o *MerchantAdvInfo) GetCoinOk() (*string, bool)`

GetCoinOk returns a tuple with the Coin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoin

`func (o *MerchantAdvInfo) SetCoin(v string)`

SetCoin sets Coin field to given value.

### HasCoin

`func (o *MerchantAdvInfo) HasCoin() bool`

HasCoin returns a boolean if a field has been set.

### GetCoinPrecision

`func (o *MerchantAdvInfo) GetCoinPrecision() string`

GetCoinPrecision returns the CoinPrecision field if non-nil, zero value otherwise.

### GetCoinPrecisionOk

`func (o *MerchantAdvInfo) GetCoinPrecisionOk() (*string, bool)`

GetCoinPrecisionOk returns a tuple with the CoinPrecision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoinPrecision

`func (o *MerchantAdvInfo) SetCoinPrecision(v string)`

SetCoinPrecision sets CoinPrecision field to given value.

### HasCoinPrecision

`func (o *MerchantAdvInfo) HasCoinPrecision() bool`

HasCoinPrecision returns a boolean if a field has been set.

### GetCtime

`func (o *MerchantAdvInfo) GetCtime() string`

GetCtime returns the Ctime field if non-nil, zero value otherwise.

### GetCtimeOk

`func (o *MerchantAdvInfo) GetCtimeOk() (*string, bool)`

GetCtimeOk returns a tuple with the Ctime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCtime

`func (o *MerchantAdvInfo) SetCtime(v string)`

SetCtime sets Ctime field to given value.

### HasCtime

`func (o *MerchantAdvInfo) HasCtime() bool`

HasCtime returns a boolean if a field has been set.

### GetDealAmount

`func (o *MerchantAdvInfo) GetDealAmount() string`

GetDealAmount returns the DealAmount field if non-nil, zero value otherwise.

### GetDealAmountOk

`func (o *MerchantAdvInfo) GetDealAmountOk() (*string, bool)`

GetDealAmountOk returns a tuple with the DealAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDealAmount

`func (o *MerchantAdvInfo) SetDealAmount(v string)`

SetDealAmount sets DealAmount field to given value.

### HasDealAmount

`func (o *MerchantAdvInfo) HasDealAmount() bool`

HasDealAmount returns a boolean if a field has been set.

### GetFiatCode

`func (o *MerchantAdvInfo) GetFiatCode() string`

GetFiatCode returns the FiatCode field if non-nil, zero value otherwise.

### GetFiatCodeOk

`func (o *MerchantAdvInfo) GetFiatCodeOk() (*string, bool)`

GetFiatCodeOk returns a tuple with the FiatCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiatCode

`func (o *MerchantAdvInfo) SetFiatCode(v string)`

SetFiatCode sets FiatCode field to given value.

### HasFiatCode

`func (o *MerchantAdvInfo) HasFiatCode() bool`

HasFiatCode returns a boolean if a field has been set.

### GetFiatPrecision

`func (o *MerchantAdvInfo) GetFiatPrecision() string`

GetFiatPrecision returns the FiatPrecision field if non-nil, zero value otherwise.

### GetFiatPrecisionOk

`func (o *MerchantAdvInfo) GetFiatPrecisionOk() (*string, bool)`

GetFiatPrecisionOk returns a tuple with the FiatPrecision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiatPrecision

`func (o *MerchantAdvInfo) SetFiatPrecision(v string)`

SetFiatPrecision sets FiatPrecision field to given value.

### HasFiatPrecision

`func (o *MerchantAdvInfo) HasFiatPrecision() bool`

HasFiatPrecision returns a boolean if a field has been set.

### GetFiatSymbol

`func (o *MerchantAdvInfo) GetFiatSymbol() string`

GetFiatSymbol returns the FiatSymbol field if non-nil, zero value otherwise.

### GetFiatSymbolOk

`func (o *MerchantAdvInfo) GetFiatSymbolOk() (*string, bool)`

GetFiatSymbolOk returns a tuple with the FiatSymbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiatSymbol

`func (o *MerchantAdvInfo) SetFiatSymbol(v string)`

SetFiatSymbol sets FiatSymbol field to given value.

### HasFiatSymbol

`func (o *MerchantAdvInfo) HasFiatSymbol() bool`

HasFiatSymbol returns a boolean if a field has been set.

### GetHide

`func (o *MerchantAdvInfo) GetHide() string`

GetHide returns the Hide field if non-nil, zero value otherwise.

### GetHideOk

`func (o *MerchantAdvInfo) GetHideOk() (*string, bool)`

GetHideOk returns a tuple with the Hide field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHide

`func (o *MerchantAdvInfo) SetHide(v string)`

SetHide sets Hide field to given value.

### HasHide

`func (o *MerchantAdvInfo) HasHide() bool`

HasHide returns a boolean if a field has been set.

### GetMaxAmount

`func (o *MerchantAdvInfo) GetMaxAmount() string`

GetMaxAmount returns the MaxAmount field if non-nil, zero value otherwise.

### GetMaxAmountOk

`func (o *MerchantAdvInfo) GetMaxAmountOk() (*string, bool)`

GetMaxAmountOk returns a tuple with the MaxAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxAmount

`func (o *MerchantAdvInfo) SetMaxAmount(v string)`

SetMaxAmount sets MaxAmount field to given value.

### HasMaxAmount

`func (o *MerchantAdvInfo) HasMaxAmount() bool`

HasMaxAmount returns a boolean if a field has been set.

### GetMinAmount

`func (o *MerchantAdvInfo) GetMinAmount() string`

GetMinAmount returns the MinAmount field if non-nil, zero value otherwise.

### GetMinAmountOk

`func (o *MerchantAdvInfo) GetMinAmountOk() (*string, bool)`

GetMinAmountOk returns a tuple with the MinAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinAmount

`func (o *MerchantAdvInfo) SetMinAmount(v string)`

SetMinAmount sets MinAmount field to given value.

### HasMinAmount

`func (o *MerchantAdvInfo) HasMinAmount() bool`

HasMinAmount returns a boolean if a field has been set.

### GetPayDuration

`func (o *MerchantAdvInfo) GetPayDuration() string`

GetPayDuration returns the PayDuration field if non-nil, zero value otherwise.

### GetPayDurationOk

`func (o *MerchantAdvInfo) GetPayDurationOk() (*string, bool)`

GetPayDurationOk returns a tuple with the PayDuration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayDuration

`func (o *MerchantAdvInfo) SetPayDuration(v string)`

SetPayDuration sets PayDuration field to given value.

### HasPayDuration

`func (o *MerchantAdvInfo) HasPayDuration() bool`

HasPayDuration returns a boolean if a field has been set.

### GetPaymentMethod

`func (o *MerchantAdvInfo) GetPaymentMethod() []FiatPaymentInfo`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *MerchantAdvInfo) GetPaymentMethodOk() (*[]FiatPaymentInfo, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *MerchantAdvInfo) SetPaymentMethod(v []FiatPaymentInfo)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *MerchantAdvInfo) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.

### GetPrice

`func (o *MerchantAdvInfo) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *MerchantAdvInfo) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *MerchantAdvInfo) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *MerchantAdvInfo) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetRemark

`func (o *MerchantAdvInfo) GetRemark() string`

GetRemark returns the Remark field if non-nil, zero value otherwise.

### GetRemarkOk

`func (o *MerchantAdvInfo) GetRemarkOk() (*string, bool)`

GetRemarkOk returns a tuple with the Remark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRemark

`func (o *MerchantAdvInfo) SetRemark(v string)`

SetRemark sets Remark field to given value.

### HasRemark

`func (o *MerchantAdvInfo) HasRemark() bool`

HasRemark returns a boolean if a field has been set.

### GetStatus

`func (o *MerchantAdvInfo) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MerchantAdvInfo) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MerchantAdvInfo) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *MerchantAdvInfo) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTurnoverNum

`func (o *MerchantAdvInfo) GetTurnoverNum() string`

GetTurnoverNum returns the TurnoverNum field if non-nil, zero value otherwise.

### GetTurnoverNumOk

`func (o *MerchantAdvInfo) GetTurnoverNumOk() (*string, bool)`

GetTurnoverNumOk returns a tuple with the TurnoverNum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnoverNum

`func (o *MerchantAdvInfo) SetTurnoverNum(v string)`

SetTurnoverNum sets TurnoverNum field to given value.

### HasTurnoverNum

`func (o *MerchantAdvInfo) HasTurnoverNum() bool`

HasTurnoverNum returns a boolean if a field has been set.

### GetTurnoverRate

`func (o *MerchantAdvInfo) GetTurnoverRate() string`

GetTurnoverRate returns the TurnoverRate field if non-nil, zero value otherwise.

### GetTurnoverRateOk

`func (o *MerchantAdvInfo) GetTurnoverRateOk() (*string, bool)`

GetTurnoverRateOk returns a tuple with the TurnoverRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnoverRate

`func (o *MerchantAdvInfo) SetTurnoverRate(v string)`

SetTurnoverRate sets TurnoverRate field to given value.

### HasTurnoverRate

`func (o *MerchantAdvInfo) HasTurnoverRate() bool`

HasTurnoverRate returns a boolean if a field has been set.

### GetType

`func (o *MerchantAdvInfo) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MerchantAdvInfo) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MerchantAdvInfo) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *MerchantAdvInfo) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUserLimit

`func (o *MerchantAdvInfo) GetUserLimit() MerchantAdvUserLimitInfo`

GetUserLimit returns the UserLimit field if non-nil, zero value otherwise.

### GetUserLimitOk

`func (o *MerchantAdvInfo) GetUserLimitOk() (*MerchantAdvUserLimitInfo, bool)`

GetUserLimitOk returns a tuple with the UserLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserLimit

`func (o *MerchantAdvInfo) SetUserLimit(v MerchantAdvUserLimitInfo)`

SetUserLimit sets UserLimit field to given value.

### HasUserLimit

`func (o *MerchantAdvInfo) HasUserLimit() bool`

HasUserLimit returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


