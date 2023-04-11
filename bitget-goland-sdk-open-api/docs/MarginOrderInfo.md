# MarginOrderInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseQuantity** | Pointer to **string** |  | [optional] 
**ClientOid** | Pointer to **string** |  | [optional] 
**Ctime** | Pointer to **string** |  | [optional] 
**FillPrice** | Pointer to **string** |  | [optional] 
**FillQuantity** | Pointer to **string** |  | [optional] 
**FillTotalAmount** | Pointer to **string** |  | [optional] 
**LoanType** | Pointer to **string** |  | [optional] 
**OrderId** | Pointer to **string** |  | [optional] 
**OrderType** | Pointer to **string** |  | [optional] 
**Price** | Pointer to **string** |  | [optional] 
**QuoteAmount** | Pointer to **string** |  | [optional] 
**Side** | Pointer to **string** |  | [optional] 
**Source** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 
**Symbol** | Pointer to **string** |  | [optional] 

## Methods

### NewMarginOrderInfo

`func NewMarginOrderInfo() *MarginOrderInfo`

NewMarginOrderInfo instantiates a new MarginOrderInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginOrderInfoWithDefaults

`func NewMarginOrderInfoWithDefaults() *MarginOrderInfo`

NewMarginOrderInfoWithDefaults instantiates a new MarginOrderInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseQuantity

`func (o *MarginOrderInfo) GetBaseQuantity() string`

GetBaseQuantity returns the BaseQuantity field if non-nil, zero value otherwise.

### GetBaseQuantityOk

`func (o *MarginOrderInfo) GetBaseQuantityOk() (*string, bool)`

GetBaseQuantityOk returns a tuple with the BaseQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseQuantity

`func (o *MarginOrderInfo) SetBaseQuantity(v string)`

SetBaseQuantity sets BaseQuantity field to given value.

### HasBaseQuantity

`func (o *MarginOrderInfo) HasBaseQuantity() bool`

HasBaseQuantity returns a boolean if a field has been set.

### GetClientOid

`func (o *MarginOrderInfo) GetClientOid() string`

GetClientOid returns the ClientOid field if non-nil, zero value otherwise.

### GetClientOidOk

`func (o *MarginOrderInfo) GetClientOidOk() (*string, bool)`

GetClientOidOk returns a tuple with the ClientOid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientOid

`func (o *MarginOrderInfo) SetClientOid(v string)`

SetClientOid sets ClientOid field to given value.

### HasClientOid

`func (o *MarginOrderInfo) HasClientOid() bool`

HasClientOid returns a boolean if a field has been set.

### GetCtime

`func (o *MarginOrderInfo) GetCtime() string`

GetCtime returns the Ctime field if non-nil, zero value otherwise.

### GetCtimeOk

`func (o *MarginOrderInfo) GetCtimeOk() (*string, bool)`

GetCtimeOk returns a tuple with the Ctime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCtime

`func (o *MarginOrderInfo) SetCtime(v string)`

SetCtime sets Ctime field to given value.

### HasCtime

`func (o *MarginOrderInfo) HasCtime() bool`

HasCtime returns a boolean if a field has been set.

### GetFillPrice

`func (o *MarginOrderInfo) GetFillPrice() string`

GetFillPrice returns the FillPrice field if non-nil, zero value otherwise.

### GetFillPriceOk

`func (o *MarginOrderInfo) GetFillPriceOk() (*string, bool)`

GetFillPriceOk returns a tuple with the FillPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFillPrice

`func (o *MarginOrderInfo) SetFillPrice(v string)`

SetFillPrice sets FillPrice field to given value.

### HasFillPrice

`func (o *MarginOrderInfo) HasFillPrice() bool`

HasFillPrice returns a boolean if a field has been set.

### GetFillQuantity

`func (o *MarginOrderInfo) GetFillQuantity() string`

GetFillQuantity returns the FillQuantity field if non-nil, zero value otherwise.

### GetFillQuantityOk

`func (o *MarginOrderInfo) GetFillQuantityOk() (*string, bool)`

GetFillQuantityOk returns a tuple with the FillQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFillQuantity

`func (o *MarginOrderInfo) SetFillQuantity(v string)`

SetFillQuantity sets FillQuantity field to given value.

### HasFillQuantity

`func (o *MarginOrderInfo) HasFillQuantity() bool`

HasFillQuantity returns a boolean if a field has been set.

### GetFillTotalAmount

`func (o *MarginOrderInfo) GetFillTotalAmount() string`

GetFillTotalAmount returns the FillTotalAmount field if non-nil, zero value otherwise.

### GetFillTotalAmountOk

`func (o *MarginOrderInfo) GetFillTotalAmountOk() (*string, bool)`

GetFillTotalAmountOk returns a tuple with the FillTotalAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFillTotalAmount

`func (o *MarginOrderInfo) SetFillTotalAmount(v string)`

SetFillTotalAmount sets FillTotalAmount field to given value.

### HasFillTotalAmount

`func (o *MarginOrderInfo) HasFillTotalAmount() bool`

HasFillTotalAmount returns a boolean if a field has been set.

### GetLoanType

`func (o *MarginOrderInfo) GetLoanType() string`

GetLoanType returns the LoanType field if non-nil, zero value otherwise.

### GetLoanTypeOk

`func (o *MarginOrderInfo) GetLoanTypeOk() (*string, bool)`

GetLoanTypeOk returns a tuple with the LoanType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoanType

`func (o *MarginOrderInfo) SetLoanType(v string)`

SetLoanType sets LoanType field to given value.

### HasLoanType

`func (o *MarginOrderInfo) HasLoanType() bool`

HasLoanType returns a boolean if a field has been set.

### GetOrderId

`func (o *MarginOrderInfo) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *MarginOrderInfo) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *MarginOrderInfo) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *MarginOrderInfo) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetOrderType

`func (o *MarginOrderInfo) GetOrderType() string`

GetOrderType returns the OrderType field if non-nil, zero value otherwise.

### GetOrderTypeOk

`func (o *MarginOrderInfo) GetOrderTypeOk() (*string, bool)`

GetOrderTypeOk returns a tuple with the OrderType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderType

`func (o *MarginOrderInfo) SetOrderType(v string)`

SetOrderType sets OrderType field to given value.

### HasOrderType

`func (o *MarginOrderInfo) HasOrderType() bool`

HasOrderType returns a boolean if a field has been set.

### GetPrice

`func (o *MarginOrderInfo) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *MarginOrderInfo) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *MarginOrderInfo) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *MarginOrderInfo) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetQuoteAmount

`func (o *MarginOrderInfo) GetQuoteAmount() string`

GetQuoteAmount returns the QuoteAmount field if non-nil, zero value otherwise.

### GetQuoteAmountOk

`func (o *MarginOrderInfo) GetQuoteAmountOk() (*string, bool)`

GetQuoteAmountOk returns a tuple with the QuoteAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmount

`func (o *MarginOrderInfo) SetQuoteAmount(v string)`

SetQuoteAmount sets QuoteAmount field to given value.

### HasQuoteAmount

`func (o *MarginOrderInfo) HasQuoteAmount() bool`

HasQuoteAmount returns a boolean if a field has been set.

### GetSide

`func (o *MarginOrderInfo) GetSide() string`

GetSide returns the Side field if non-nil, zero value otherwise.

### GetSideOk

`func (o *MarginOrderInfo) GetSideOk() (*string, bool)`

GetSideOk returns a tuple with the Side field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSide

`func (o *MarginOrderInfo) SetSide(v string)`

SetSide sets Side field to given value.

### HasSide

`func (o *MarginOrderInfo) HasSide() bool`

HasSide returns a boolean if a field has been set.

### GetSource

`func (o *MarginOrderInfo) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *MarginOrderInfo) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *MarginOrderInfo) SetSource(v string)`

SetSource sets Source field to given value.

### HasSource

`func (o *MarginOrderInfo) HasSource() bool`

HasSource returns a boolean if a field has been set.

### GetStatus

`func (o *MarginOrderInfo) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MarginOrderInfo) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MarginOrderInfo) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *MarginOrderInfo) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSymbol

`func (o *MarginOrderInfo) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MarginOrderInfo) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MarginOrderInfo) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.

### HasSymbol

`func (o *MarginOrderInfo) HasSymbol() bool`

HasSymbol returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


