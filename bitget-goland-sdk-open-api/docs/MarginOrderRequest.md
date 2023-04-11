# MarginOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseQuantity** | Pointer to **string** | baseQuantity | [optional] 
**ChannelApiCode** | Pointer to **string** |  | [optional] 
**ClientOid** | Pointer to **string** | clientOid | [optional] 
**Ip** | Pointer to **string** |  | [optional] 
**LoanType** | **string** | loanType | 
**OrderType** | **string** | orderType | 
**Price** | Pointer to **string** | price | [optional] 
**QuoteAmount** | Pointer to **string** | quoteAmount | [optional] 
**Side** | **string** | side | 
**Symbol** | **string** | symbol | 
**TimeInForce** | Pointer to **string** | timeInForce | [optional] 

## Methods

### NewMarginOrderRequest

`func NewMarginOrderRequest(loanType string, orderType string, side string, symbol string, ) *MarginOrderRequest`

NewMarginOrderRequest instantiates a new MarginOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginOrderRequestWithDefaults

`func NewMarginOrderRequestWithDefaults() *MarginOrderRequest`

NewMarginOrderRequestWithDefaults instantiates a new MarginOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseQuantity

`func (o *MarginOrderRequest) GetBaseQuantity() string`

GetBaseQuantity returns the BaseQuantity field if non-nil, zero value otherwise.

### GetBaseQuantityOk

`func (o *MarginOrderRequest) GetBaseQuantityOk() (*string, bool)`

GetBaseQuantityOk returns a tuple with the BaseQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseQuantity

`func (o *MarginOrderRequest) SetBaseQuantity(v string)`

SetBaseQuantity sets BaseQuantity field to given value.

### HasBaseQuantity

`func (o *MarginOrderRequest) HasBaseQuantity() bool`

HasBaseQuantity returns a boolean if a field has been set.

### GetChannelApiCode

`func (o *MarginOrderRequest) GetChannelApiCode() string`

GetChannelApiCode returns the ChannelApiCode field if non-nil, zero value otherwise.

### GetChannelApiCodeOk

`func (o *MarginOrderRequest) GetChannelApiCodeOk() (*string, bool)`

GetChannelApiCodeOk returns a tuple with the ChannelApiCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannelApiCode

`func (o *MarginOrderRequest) SetChannelApiCode(v string)`

SetChannelApiCode sets ChannelApiCode field to given value.

### HasChannelApiCode

`func (o *MarginOrderRequest) HasChannelApiCode() bool`

HasChannelApiCode returns a boolean if a field has been set.

### GetClientOid

`func (o *MarginOrderRequest) GetClientOid() string`

GetClientOid returns the ClientOid field if non-nil, zero value otherwise.

### GetClientOidOk

`func (o *MarginOrderRequest) GetClientOidOk() (*string, bool)`

GetClientOidOk returns a tuple with the ClientOid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientOid

`func (o *MarginOrderRequest) SetClientOid(v string)`

SetClientOid sets ClientOid field to given value.

### HasClientOid

`func (o *MarginOrderRequest) HasClientOid() bool`

HasClientOid returns a boolean if a field has been set.

### GetIp

`func (o *MarginOrderRequest) GetIp() string`

GetIp returns the Ip field if non-nil, zero value otherwise.

### GetIpOk

`func (o *MarginOrderRequest) GetIpOk() (*string, bool)`

GetIpOk returns a tuple with the Ip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIp

`func (o *MarginOrderRequest) SetIp(v string)`

SetIp sets Ip field to given value.

### HasIp

`func (o *MarginOrderRequest) HasIp() bool`

HasIp returns a boolean if a field has been set.

### GetLoanType

`func (o *MarginOrderRequest) GetLoanType() string`

GetLoanType returns the LoanType field if non-nil, zero value otherwise.

### GetLoanTypeOk

`func (o *MarginOrderRequest) GetLoanTypeOk() (*string, bool)`

GetLoanTypeOk returns a tuple with the LoanType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoanType

`func (o *MarginOrderRequest) SetLoanType(v string)`

SetLoanType sets LoanType field to given value.


### GetOrderType

`func (o *MarginOrderRequest) GetOrderType() string`

GetOrderType returns the OrderType field if non-nil, zero value otherwise.

### GetOrderTypeOk

`func (o *MarginOrderRequest) GetOrderTypeOk() (*string, bool)`

GetOrderTypeOk returns a tuple with the OrderType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderType

`func (o *MarginOrderRequest) SetOrderType(v string)`

SetOrderType sets OrderType field to given value.


### GetPrice

`func (o *MarginOrderRequest) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *MarginOrderRequest) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *MarginOrderRequest) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *MarginOrderRequest) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetQuoteAmount

`func (o *MarginOrderRequest) GetQuoteAmount() string`

GetQuoteAmount returns the QuoteAmount field if non-nil, zero value otherwise.

### GetQuoteAmountOk

`func (o *MarginOrderRequest) GetQuoteAmountOk() (*string, bool)`

GetQuoteAmountOk returns a tuple with the QuoteAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmount

`func (o *MarginOrderRequest) SetQuoteAmount(v string)`

SetQuoteAmount sets QuoteAmount field to given value.

### HasQuoteAmount

`func (o *MarginOrderRequest) HasQuoteAmount() bool`

HasQuoteAmount returns a boolean if a field has been set.

### GetSide

`func (o *MarginOrderRequest) GetSide() string`

GetSide returns the Side field if non-nil, zero value otherwise.

### GetSideOk

`func (o *MarginOrderRequest) GetSideOk() (*string, bool)`

GetSideOk returns a tuple with the Side field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSide

`func (o *MarginOrderRequest) SetSide(v string)`

SetSide sets Side field to given value.


### GetSymbol

`func (o *MarginOrderRequest) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MarginOrderRequest) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MarginOrderRequest) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.


### GetTimeInForce

`func (o *MarginOrderRequest) GetTimeInForce() string`

GetTimeInForce returns the TimeInForce field if non-nil, zero value otherwise.

### GetTimeInForceOk

`func (o *MarginOrderRequest) GetTimeInForceOk() (*string, bool)`

GetTimeInForceOk returns a tuple with the TimeInForce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeInForce

`func (o *MarginOrderRequest) SetTimeInForce(v string)`

SetTimeInForce sets TimeInForce field to given value.

### HasTimeInForce

`func (o *MarginOrderRequest) HasTimeInForce() bool`

HasTimeInForce returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


