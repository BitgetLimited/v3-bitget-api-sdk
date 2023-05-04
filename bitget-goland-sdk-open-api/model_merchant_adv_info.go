/*
Bitget Open API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 2.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// MerchantAdvInfo struct for MerchantAdvInfo
type MerchantAdvInfo struct {
	AdvId                *string                   `json:"advId,omitempty"`
	AdvNo                *string                   `json:"advNo,omitempty"`
	Amount               *string                   `json:"amount,omitempty"`
	Coin                 *string                   `json:"coin,omitempty"`
	CoinPrecision        *string                   `json:"coinPrecision,omitempty"`
	Ctime                *string                   `json:"ctime,omitempty"`
	DealAmount           *string                   `json:"dealAmount,omitempty"`
	FiatCode             *string                   `json:"fiatCode,omitempty"`
	FiatPrecision        *string                   `json:"fiatPrecision,omitempty"`
	FiatSymbol           *string                   `json:"fiatSymbol,omitempty"`
	Hide                 *string                   `json:"hide,omitempty"`
	MaxAmount            *string                   `json:"maxAmount,omitempty"`
	MinAmount            *string                   `json:"minAmount,omitempty"`
	PayDuration          *string                   `json:"payDuration,omitempty"`
	PaymentMethod        []FiatPaymentInfo         `json:"paymentMethod,omitempty"`
	Price                *string                   `json:"price,omitempty"`
	Remark               *string                   `json:"remark,omitempty"`
	Status               *string                   `json:"status,omitempty"`
	TurnoverNum          *string                   `json:"turnoverNum,omitempty"`
	TurnoverRate         *string                   `json:"turnoverRate,omitempty"`
	Type                 *string                   `json:"type,omitempty"`
	UserLimit            *MerchantAdvUserLimitInfo `json:"userLimit,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _MerchantAdvInfo MerchantAdvInfo

// NewMerchantAdvInfo instantiates a new MerchantAdvInfo object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMerchantAdvInfo() *MerchantAdvInfo {
	this := MerchantAdvInfo{}
	return &this
}

// NewMerchantAdvInfoWithDefaults instantiates a new MerchantAdvInfo object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMerchantAdvInfoWithDefaults() *MerchantAdvInfo {
	this := MerchantAdvInfo{}
	return &this
}

// GetAdvId returns the AdvId field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetAdvId() string {
	if o == nil || isNil(o.AdvId) {
		var ret string
		return ret
	}
	return *o.AdvId
}

// GetAdvIdOk returns a tuple with the AdvId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetAdvIdOk() (*string, bool) {
	if o == nil || isNil(o.AdvId) {
		return nil, false
	}
	return o.AdvId, true
}

// HasAdvId returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasAdvId() bool {
	if o != nil && !isNil(o.AdvId) {
		return true
	}

	return false
}

// SetAdvId gets a reference to the given string and assigns it to the AdvId field.
func (o *MerchantAdvInfo) SetAdvId(v string) {
	o.AdvId = &v
}

// GetAdvNo returns the AdvNo field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetAdvNo() string {
	if o == nil || isNil(o.AdvNo) {
		var ret string
		return ret
	}
	return *o.AdvNo
}

// GetAdvNoOk returns a tuple with the AdvNo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetAdvNoOk() (*string, bool) {
	if o == nil || isNil(o.AdvNo) {
		return nil, false
	}
	return o.AdvNo, true
}

// HasAdvNo returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasAdvNo() bool {
	if o != nil && !isNil(o.AdvNo) {
		return true
	}

	return false
}

// SetAdvNo gets a reference to the given string and assigns it to the AdvNo field.
func (o *MerchantAdvInfo) SetAdvNo(v string) {
	o.AdvNo = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetAmount() string {
	if o == nil || isNil(o.Amount) {
		var ret string
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetAmountOk() (*string, bool) {
	if o == nil || isNil(o.Amount) {
		return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasAmount() bool {
	if o != nil && !isNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given string and assigns it to the Amount field.
func (o *MerchantAdvInfo) SetAmount(v string) {
	o.Amount = &v
}

// GetCoin returns the Coin field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetCoin() string {
	if o == nil || isNil(o.Coin) {
		var ret string
		return ret
	}
	return *o.Coin
}

// GetCoinOk returns a tuple with the Coin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetCoinOk() (*string, bool) {
	if o == nil || isNil(o.Coin) {
		return nil, false
	}
	return o.Coin, true
}

// HasCoin returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasCoin() bool {
	if o != nil && !isNil(o.Coin) {
		return true
	}

	return false
}

// SetCoin gets a reference to the given string and assigns it to the Coin field.
func (o *MerchantAdvInfo) SetCoin(v string) {
	o.Coin = &v
}

// GetCoinPrecision returns the CoinPrecision field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetCoinPrecision() string {
	if o == nil || isNil(o.CoinPrecision) {
		var ret string
		return ret
	}
	return *o.CoinPrecision
}

// GetCoinPrecisionOk returns a tuple with the CoinPrecision field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetCoinPrecisionOk() (*string, bool) {
	if o == nil || isNil(o.CoinPrecision) {
		return nil, false
	}
	return o.CoinPrecision, true
}

// HasCoinPrecision returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasCoinPrecision() bool {
	if o != nil && !isNil(o.CoinPrecision) {
		return true
	}

	return false
}

// SetCoinPrecision gets a reference to the given string and assigns it to the CoinPrecision field.
func (o *MerchantAdvInfo) SetCoinPrecision(v string) {
	o.CoinPrecision = &v
}

// GetCtime returns the Ctime field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetCtime() string {
	if o == nil || isNil(o.Ctime) {
		var ret string
		return ret
	}
	return *o.Ctime
}

// GetCtimeOk returns a tuple with the Ctime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetCtimeOk() (*string, bool) {
	if o == nil || isNil(o.Ctime) {
		return nil, false
	}
	return o.Ctime, true
}

// HasCtime returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasCtime() bool {
	if o != nil && !isNil(o.Ctime) {
		return true
	}

	return false
}

// SetCtime gets a reference to the given string and assigns it to the Ctime field.
func (o *MerchantAdvInfo) SetCtime(v string) {
	o.Ctime = &v
}

// GetDealAmount returns the DealAmount field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetDealAmount() string {
	if o == nil || isNil(o.DealAmount) {
		var ret string
		return ret
	}
	return *o.DealAmount
}

// GetDealAmountOk returns a tuple with the DealAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetDealAmountOk() (*string, bool) {
	if o == nil || isNil(o.DealAmount) {
		return nil, false
	}
	return o.DealAmount, true
}

// HasDealAmount returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasDealAmount() bool {
	if o != nil && !isNil(o.DealAmount) {
		return true
	}

	return false
}

// SetDealAmount gets a reference to the given string and assigns it to the DealAmount field.
func (o *MerchantAdvInfo) SetDealAmount(v string) {
	o.DealAmount = &v
}

// GetFiatCode returns the FiatCode field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetFiatCode() string {
	if o == nil || isNil(o.FiatCode) {
		var ret string
		return ret
	}
	return *o.FiatCode
}

// GetFiatCodeOk returns a tuple with the FiatCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetFiatCodeOk() (*string, bool) {
	if o == nil || isNil(o.FiatCode) {
		return nil, false
	}
	return o.FiatCode, true
}

// HasFiatCode returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasFiatCode() bool {
	if o != nil && !isNil(o.FiatCode) {
		return true
	}

	return false
}

// SetFiatCode gets a reference to the given string and assigns it to the FiatCode field.
func (o *MerchantAdvInfo) SetFiatCode(v string) {
	o.FiatCode = &v
}

// GetFiatPrecision returns the FiatPrecision field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetFiatPrecision() string {
	if o == nil || isNil(o.FiatPrecision) {
		var ret string
		return ret
	}
	return *o.FiatPrecision
}

// GetFiatPrecisionOk returns a tuple with the FiatPrecision field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetFiatPrecisionOk() (*string, bool) {
	if o == nil || isNil(o.FiatPrecision) {
		return nil, false
	}
	return o.FiatPrecision, true
}

// HasFiatPrecision returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasFiatPrecision() bool {
	if o != nil && !isNil(o.FiatPrecision) {
		return true
	}

	return false
}

// SetFiatPrecision gets a reference to the given string and assigns it to the FiatPrecision field.
func (o *MerchantAdvInfo) SetFiatPrecision(v string) {
	o.FiatPrecision = &v
}

// GetFiatSymbol returns the FiatSymbol field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetFiatSymbol() string {
	if o == nil || isNil(o.FiatSymbol) {
		var ret string
		return ret
	}
	return *o.FiatSymbol
}

// GetFiatSymbolOk returns a tuple with the FiatSymbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetFiatSymbolOk() (*string, bool) {
	if o == nil || isNil(o.FiatSymbol) {
		return nil, false
	}
	return o.FiatSymbol, true
}

// HasFiatSymbol returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasFiatSymbol() bool {
	if o != nil && !isNil(o.FiatSymbol) {
		return true
	}

	return false
}

// SetFiatSymbol gets a reference to the given string and assigns it to the FiatSymbol field.
func (o *MerchantAdvInfo) SetFiatSymbol(v string) {
	o.FiatSymbol = &v
}

// GetHide returns the Hide field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetHide() string {
	if o == nil || isNil(o.Hide) {
		var ret string
		return ret
	}
	return *o.Hide
}

// GetHideOk returns a tuple with the Hide field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetHideOk() (*string, bool) {
	if o == nil || isNil(o.Hide) {
		return nil, false
	}
	return o.Hide, true
}

// HasHide returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasHide() bool {
	if o != nil && !isNil(o.Hide) {
		return true
	}

	return false
}

// SetHide gets a reference to the given string and assigns it to the Hide field.
func (o *MerchantAdvInfo) SetHide(v string) {
	o.Hide = &v
}

// GetMaxAmount returns the MaxAmount field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetMaxAmount() string {
	if o == nil || isNil(o.MaxAmount) {
		var ret string
		return ret
	}
	return *o.MaxAmount
}

// GetMaxAmountOk returns a tuple with the MaxAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetMaxAmountOk() (*string, bool) {
	if o == nil || isNil(o.MaxAmount) {
		return nil, false
	}
	return o.MaxAmount, true
}

// HasMaxAmount returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasMaxAmount() bool {
	if o != nil && !isNil(o.MaxAmount) {
		return true
	}

	return false
}

// SetMaxAmount gets a reference to the given string and assigns it to the MaxAmount field.
func (o *MerchantAdvInfo) SetMaxAmount(v string) {
	o.MaxAmount = &v
}

// GetMinAmount returns the MinAmount field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetMinAmount() string {
	if o == nil || isNil(o.MinAmount) {
		var ret string
		return ret
	}
	return *o.MinAmount
}

// GetMinAmountOk returns a tuple with the MinAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetMinAmountOk() (*string, bool) {
	if o == nil || isNil(o.MinAmount) {
		return nil, false
	}
	return o.MinAmount, true
}

// HasMinAmount returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasMinAmount() bool {
	if o != nil && !isNil(o.MinAmount) {
		return true
	}

	return false
}

// SetMinAmount gets a reference to the given string and assigns it to the MinAmount field.
func (o *MerchantAdvInfo) SetMinAmount(v string) {
	o.MinAmount = &v
}

// GetPayDuration returns the PayDuration field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetPayDuration() string {
	if o == nil || isNil(o.PayDuration) {
		var ret string
		return ret
	}
	return *o.PayDuration
}

// GetPayDurationOk returns a tuple with the PayDuration field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetPayDurationOk() (*string, bool) {
	if o == nil || isNil(o.PayDuration) {
		return nil, false
	}
	return o.PayDuration, true
}

// HasPayDuration returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasPayDuration() bool {
	if o != nil && !isNil(o.PayDuration) {
		return true
	}

	return false
}

// SetPayDuration gets a reference to the given string and assigns it to the PayDuration field.
func (o *MerchantAdvInfo) SetPayDuration(v string) {
	o.PayDuration = &v
}

// GetPaymentMethod returns the PaymentMethod field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetPaymentMethod() []FiatPaymentInfo {
	if o == nil || isNil(o.PaymentMethod) {
		var ret []FiatPaymentInfo
		return ret
	}
	return o.PaymentMethod
}

// GetPaymentMethodOk returns a tuple with the PaymentMethod field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetPaymentMethodOk() ([]FiatPaymentInfo, bool) {
	if o == nil || isNil(o.PaymentMethod) {
		return nil, false
	}
	return o.PaymentMethod, true
}

// HasPaymentMethod returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasPaymentMethod() bool {
	if o != nil && !isNil(o.PaymentMethod) {
		return true
	}

	return false
}

// SetPaymentMethod gets a reference to the given []FiatPaymentInfo and assigns it to the PaymentMethod field.
func (o *MerchantAdvInfo) SetPaymentMethod(v []FiatPaymentInfo) {
	o.PaymentMethod = v
}

// GetPrice returns the Price field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetPrice() string {
	if o == nil || isNil(o.Price) {
		var ret string
		return ret
	}
	return *o.Price
}

// GetPriceOk returns a tuple with the Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetPriceOk() (*string, bool) {
	if o == nil || isNil(o.Price) {
		return nil, false
	}
	return o.Price, true
}

// HasPrice returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasPrice() bool {
	if o != nil && !isNil(o.Price) {
		return true
	}

	return false
}

// SetPrice gets a reference to the given string and assigns it to the Price field.
func (o *MerchantAdvInfo) SetPrice(v string) {
	o.Price = &v
}

// GetRemark returns the Remark field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetRemark() string {
	if o == nil || isNil(o.Remark) {
		var ret string
		return ret
	}
	return *o.Remark
}

// GetRemarkOk returns a tuple with the Remark field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetRemarkOk() (*string, bool) {
	if o == nil || isNil(o.Remark) {
		return nil, false
	}
	return o.Remark, true
}

// HasRemark returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasRemark() bool {
	if o != nil && !isNil(o.Remark) {
		return true
	}

	return false
}

// SetRemark gets a reference to the given string and assigns it to the Remark field.
func (o *MerchantAdvInfo) SetRemark(v string) {
	o.Remark = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetStatus() string {
	if o == nil || isNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetStatusOk() (*string, bool) {
	if o == nil || isNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *MerchantAdvInfo) SetStatus(v string) {
	o.Status = &v
}

// GetTurnoverNum returns the TurnoverNum field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetTurnoverNum() string {
	if o == nil || isNil(o.TurnoverNum) {
		var ret string
		return ret
	}
	return *o.TurnoverNum
}

// GetTurnoverNumOk returns a tuple with the TurnoverNum field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetTurnoverNumOk() (*string, bool) {
	if o == nil || isNil(o.TurnoverNum) {
		return nil, false
	}
	return o.TurnoverNum, true
}

// HasTurnoverNum returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasTurnoverNum() bool {
	if o != nil && !isNil(o.TurnoverNum) {
		return true
	}

	return false
}

// SetTurnoverNum gets a reference to the given string and assigns it to the TurnoverNum field.
func (o *MerchantAdvInfo) SetTurnoverNum(v string) {
	o.TurnoverNum = &v
}

// GetTurnoverRate returns the TurnoverRate field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetTurnoverRate() string {
	if o == nil || isNil(o.TurnoverRate) {
		var ret string
		return ret
	}
	return *o.TurnoverRate
}

// GetTurnoverRateOk returns a tuple with the TurnoverRate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetTurnoverRateOk() (*string, bool) {
	if o == nil || isNil(o.TurnoverRate) {
		return nil, false
	}
	return o.TurnoverRate, true
}

// HasTurnoverRate returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasTurnoverRate() bool {
	if o != nil && !isNil(o.TurnoverRate) {
		return true
	}

	return false
}

// SetTurnoverRate gets a reference to the given string and assigns it to the TurnoverRate field.
func (o *MerchantAdvInfo) SetTurnoverRate(v string) {
	o.TurnoverRate = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetType() string {
	if o == nil || isNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetTypeOk() (*string, bool) {
	if o == nil || isNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasType() bool {
	if o != nil && !isNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *MerchantAdvInfo) SetType(v string) {
	o.Type = &v
}

// GetUserLimit returns the UserLimit field value if set, zero value otherwise.
func (o *MerchantAdvInfo) GetUserLimit() MerchantAdvUserLimitInfo {
	if o == nil || isNil(o.UserLimit) {
		var ret MerchantAdvUserLimitInfo
		return ret
	}
	return *o.UserLimit
}

// GetUserLimitOk returns a tuple with the UserLimit field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MerchantAdvInfo) GetUserLimitOk() (*MerchantAdvUserLimitInfo, bool) {
	if o == nil || isNil(o.UserLimit) {
		return nil, false
	}
	return o.UserLimit, true
}

// HasUserLimit returns a boolean if a field has been set.
func (o *MerchantAdvInfo) HasUserLimit() bool {
	if o != nil && !isNil(o.UserLimit) {
		return true
	}

	return false
}

// SetUserLimit gets a reference to the given MerchantAdvUserLimitInfo and assigns it to the UserLimit field.
func (o *MerchantAdvInfo) SetUserLimit(v MerchantAdvUserLimitInfo) {
	o.UserLimit = &v
}

func (o MerchantAdvInfo) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AdvId) {
		toSerialize["advId"] = o.AdvId
	}
	if !isNil(o.AdvNo) {
		toSerialize["advNo"] = o.AdvNo
	}
	if !isNil(o.Amount) {
		toSerialize["amount"] = o.Amount
	}
	if !isNil(o.Coin) {
		toSerialize["coin"] = o.Coin
	}
	if !isNil(o.CoinPrecision) {
		toSerialize["coinPrecision"] = o.CoinPrecision
	}
	if !isNil(o.Ctime) {
		toSerialize["ctime"] = o.Ctime
	}
	if !isNil(o.DealAmount) {
		toSerialize["dealAmount"] = o.DealAmount
	}
	if !isNil(o.FiatCode) {
		toSerialize["fiatCode"] = o.FiatCode
	}
	if !isNil(o.FiatPrecision) {
		toSerialize["fiatPrecision"] = o.FiatPrecision
	}
	if !isNil(o.FiatSymbol) {
		toSerialize["fiatSymbol"] = o.FiatSymbol
	}
	if !isNil(o.Hide) {
		toSerialize["hide"] = o.Hide
	}
	if !isNil(o.MaxAmount) {
		toSerialize["maxAmount"] = o.MaxAmount
	}
	if !isNil(o.MinAmount) {
		toSerialize["minAmount"] = o.MinAmount
	}
	if !isNil(o.PayDuration) {
		toSerialize["payDuration"] = o.PayDuration
	}
	if !isNil(o.PaymentMethod) {
		toSerialize["paymentMethod"] = o.PaymentMethod
	}
	if !isNil(o.Price) {
		toSerialize["price"] = o.Price
	}
	if !isNil(o.Remark) {
		toSerialize["remark"] = o.Remark
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !isNil(o.TurnoverNum) {
		toSerialize["turnoverNum"] = o.TurnoverNum
	}
	if !isNil(o.TurnoverRate) {
		toSerialize["turnoverRate"] = o.TurnoverRate
	}
	if !isNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !isNil(o.UserLimit) {
		toSerialize["userLimit"] = o.UserLimit
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *MerchantAdvInfo) UnmarshalJSON(bytes []byte) (err error) {
	varMerchantAdvInfo := _MerchantAdvInfo{}

	if err = json.Unmarshal(bytes, &varMerchantAdvInfo); err == nil {
		*o = MerchantAdvInfo(varMerchantAdvInfo)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "advId")
		delete(additionalProperties, "advNo")
		delete(additionalProperties, "amount")
		delete(additionalProperties, "coin")
		delete(additionalProperties, "coinPrecision")
		delete(additionalProperties, "ctime")
		delete(additionalProperties, "dealAmount")
		delete(additionalProperties, "fiatCode")
		delete(additionalProperties, "fiatPrecision")
		delete(additionalProperties, "fiatSymbol")
		delete(additionalProperties, "hide")
		delete(additionalProperties, "maxAmount")
		delete(additionalProperties, "minAmount")
		delete(additionalProperties, "payDuration")
		delete(additionalProperties, "paymentMethod")
		delete(additionalProperties, "price")
		delete(additionalProperties, "remark")
		delete(additionalProperties, "status")
		delete(additionalProperties, "turnoverNum")
		delete(additionalProperties, "turnoverRate")
		delete(additionalProperties, "type")
		delete(additionalProperties, "userLimit")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableMerchantAdvInfo struct {
	value *MerchantAdvInfo
	isSet bool
}

func (v NullableMerchantAdvInfo) Get() *MerchantAdvInfo {
	return v.value
}

func (v *NullableMerchantAdvInfo) Set(val *MerchantAdvInfo) {
	v.value = val
	v.isSet = true
}

func (v NullableMerchantAdvInfo) IsSet() bool {
	return v.isSet
}

func (v *NullableMerchantAdvInfo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMerchantAdvInfo(val *MerchantAdvInfo) *NullableMerchantAdvInfo {
	return &NullableMerchantAdvInfo{value: val, isSet: true}
}

func (v NullableMerchantAdvInfo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMerchantAdvInfo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}