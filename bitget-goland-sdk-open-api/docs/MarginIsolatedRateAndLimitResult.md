# MarginIsolatedRateAndLimitResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseBorrowAble** | Pointer to **bool** |  | [optional] 
**BaseCoin** | Pointer to **string** |  | [optional] 
**BaseDailyInterestRate** | Pointer to **string** |  | [optional] 
**BaseMaxBorrowableAmount** | Pointer to **string** |  | [optional] 
**BaseTransferInAble** | Pointer to **bool** |  | [optional] 
**BaseVips** | Pointer to [**[]MarginIsolatedVipResult**](MarginIsolatedVipResult.md) |  | [optional] 
**BaseYearlyInterestRate** | Pointer to **string** |  | [optional] 
**Leverage** | Pointer to **string** |  | [optional] 
**QuoteBorrowAble** | Pointer to **bool** |  | [optional] 
**QuoteCoin** | Pointer to **string** |  | [optional] 
**QuoteDailyInterestRate** | Pointer to **string** |  | [optional] 
**QuoteMaxBorrowableAmount** | Pointer to **string** |  | [optional] 
**QuoteTransferInAble** | Pointer to **bool** |  | [optional] 
**QuoteVips** | Pointer to [**[]MarginIsolatedVipResult**](MarginIsolatedVipResult.md) |  | [optional] 
**QuoteYearlyInterestRate** | Pointer to **string** |  | [optional] 
**Symbol** | Pointer to **string** |  | [optional] 

## Methods

### NewMarginIsolatedRateAndLimitResult

`func NewMarginIsolatedRateAndLimitResult() *MarginIsolatedRateAndLimitResult`

NewMarginIsolatedRateAndLimitResult instantiates a new MarginIsolatedRateAndLimitResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMarginIsolatedRateAndLimitResultWithDefaults

`func NewMarginIsolatedRateAndLimitResultWithDefaults() *MarginIsolatedRateAndLimitResult`

NewMarginIsolatedRateAndLimitResultWithDefaults instantiates a new MarginIsolatedRateAndLimitResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseBorrowAble

`func (o *MarginIsolatedRateAndLimitResult) GetBaseBorrowAble() bool`

GetBaseBorrowAble returns the BaseBorrowAble field if non-nil, zero value otherwise.

### GetBaseBorrowAbleOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseBorrowAbleOk() (*bool, bool)`

GetBaseBorrowAbleOk returns a tuple with the BaseBorrowAble field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseBorrowAble

`func (o *MarginIsolatedRateAndLimitResult) SetBaseBorrowAble(v bool)`

SetBaseBorrowAble sets BaseBorrowAble field to given value.

### HasBaseBorrowAble

`func (o *MarginIsolatedRateAndLimitResult) HasBaseBorrowAble() bool`

HasBaseBorrowAble returns a boolean if a field has been set.

### GetBaseCoin

`func (o *MarginIsolatedRateAndLimitResult) GetBaseCoin() string`

GetBaseCoin returns the BaseCoin field if non-nil, zero value otherwise.

### GetBaseCoinOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseCoinOk() (*string, bool)`

GetBaseCoinOk returns a tuple with the BaseCoin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseCoin

`func (o *MarginIsolatedRateAndLimitResult) SetBaseCoin(v string)`

SetBaseCoin sets BaseCoin field to given value.

### HasBaseCoin

`func (o *MarginIsolatedRateAndLimitResult) HasBaseCoin() bool`

HasBaseCoin returns a boolean if a field has been set.

### GetBaseDailyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) GetBaseDailyInterestRate() string`

GetBaseDailyInterestRate returns the BaseDailyInterestRate field if non-nil, zero value otherwise.

### GetBaseDailyInterestRateOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseDailyInterestRateOk() (*string, bool)`

GetBaseDailyInterestRateOk returns a tuple with the BaseDailyInterestRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseDailyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) SetBaseDailyInterestRate(v string)`

SetBaseDailyInterestRate sets BaseDailyInterestRate field to given value.

### HasBaseDailyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) HasBaseDailyInterestRate() bool`

HasBaseDailyInterestRate returns a boolean if a field has been set.

### GetBaseMaxBorrowableAmount

`func (o *MarginIsolatedRateAndLimitResult) GetBaseMaxBorrowableAmount() string`

GetBaseMaxBorrowableAmount returns the BaseMaxBorrowableAmount field if non-nil, zero value otherwise.

### GetBaseMaxBorrowableAmountOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseMaxBorrowableAmountOk() (*string, bool)`

GetBaseMaxBorrowableAmountOk returns a tuple with the BaseMaxBorrowableAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseMaxBorrowableAmount

`func (o *MarginIsolatedRateAndLimitResult) SetBaseMaxBorrowableAmount(v string)`

SetBaseMaxBorrowableAmount sets BaseMaxBorrowableAmount field to given value.

### HasBaseMaxBorrowableAmount

`func (o *MarginIsolatedRateAndLimitResult) HasBaseMaxBorrowableAmount() bool`

HasBaseMaxBorrowableAmount returns a boolean if a field has been set.

### GetBaseTransferInAble

`func (o *MarginIsolatedRateAndLimitResult) GetBaseTransferInAble() bool`

GetBaseTransferInAble returns the BaseTransferInAble field if non-nil, zero value otherwise.

### GetBaseTransferInAbleOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseTransferInAbleOk() (*bool, bool)`

GetBaseTransferInAbleOk returns a tuple with the BaseTransferInAble field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseTransferInAble

`func (o *MarginIsolatedRateAndLimitResult) SetBaseTransferInAble(v bool)`

SetBaseTransferInAble sets BaseTransferInAble field to given value.

### HasBaseTransferInAble

`func (o *MarginIsolatedRateAndLimitResult) HasBaseTransferInAble() bool`

HasBaseTransferInAble returns a boolean if a field has been set.

### GetBaseVips

`func (o *MarginIsolatedRateAndLimitResult) GetBaseVips() []MarginIsolatedVipResult`

GetBaseVips returns the BaseVips field if non-nil, zero value otherwise.

### GetBaseVipsOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseVipsOk() (*[]MarginIsolatedVipResult, bool)`

GetBaseVipsOk returns a tuple with the BaseVips field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseVips

`func (o *MarginIsolatedRateAndLimitResult) SetBaseVips(v []MarginIsolatedVipResult)`

SetBaseVips sets BaseVips field to given value.

### HasBaseVips

`func (o *MarginIsolatedRateAndLimitResult) HasBaseVips() bool`

HasBaseVips returns a boolean if a field has been set.

### GetBaseYearlyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) GetBaseYearlyInterestRate() string`

GetBaseYearlyInterestRate returns the BaseYearlyInterestRate field if non-nil, zero value otherwise.

### GetBaseYearlyInterestRateOk

`func (o *MarginIsolatedRateAndLimitResult) GetBaseYearlyInterestRateOk() (*string, bool)`

GetBaseYearlyInterestRateOk returns a tuple with the BaseYearlyInterestRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseYearlyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) SetBaseYearlyInterestRate(v string)`

SetBaseYearlyInterestRate sets BaseYearlyInterestRate field to given value.

### HasBaseYearlyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) HasBaseYearlyInterestRate() bool`

HasBaseYearlyInterestRate returns a boolean if a field has been set.

### GetLeverage

`func (o *MarginIsolatedRateAndLimitResult) GetLeverage() string`

GetLeverage returns the Leverage field if non-nil, zero value otherwise.

### GetLeverageOk

`func (o *MarginIsolatedRateAndLimitResult) GetLeverageOk() (*string, bool)`

GetLeverageOk returns a tuple with the Leverage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeverage

`func (o *MarginIsolatedRateAndLimitResult) SetLeverage(v string)`

SetLeverage sets Leverage field to given value.

### HasLeverage

`func (o *MarginIsolatedRateAndLimitResult) HasLeverage() bool`

HasLeverage returns a boolean if a field has been set.

### GetQuoteBorrowAble

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteBorrowAble() bool`

GetQuoteBorrowAble returns the QuoteBorrowAble field if non-nil, zero value otherwise.

### GetQuoteBorrowAbleOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteBorrowAbleOk() (*bool, bool)`

GetQuoteBorrowAbleOk returns a tuple with the QuoteBorrowAble field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteBorrowAble

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteBorrowAble(v bool)`

SetQuoteBorrowAble sets QuoteBorrowAble field to given value.

### HasQuoteBorrowAble

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteBorrowAble() bool`

HasQuoteBorrowAble returns a boolean if a field has been set.

### GetQuoteCoin

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteCoin() string`

GetQuoteCoin returns the QuoteCoin field if non-nil, zero value otherwise.

### GetQuoteCoinOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteCoinOk() (*string, bool)`

GetQuoteCoinOk returns a tuple with the QuoteCoin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteCoin

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteCoin(v string)`

SetQuoteCoin sets QuoteCoin field to given value.

### HasQuoteCoin

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteCoin() bool`

HasQuoteCoin returns a boolean if a field has been set.

### GetQuoteDailyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteDailyInterestRate() string`

GetQuoteDailyInterestRate returns the QuoteDailyInterestRate field if non-nil, zero value otherwise.

### GetQuoteDailyInterestRateOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteDailyInterestRateOk() (*string, bool)`

GetQuoteDailyInterestRateOk returns a tuple with the QuoteDailyInterestRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteDailyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteDailyInterestRate(v string)`

SetQuoteDailyInterestRate sets QuoteDailyInterestRate field to given value.

### HasQuoteDailyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteDailyInterestRate() bool`

HasQuoteDailyInterestRate returns a boolean if a field has been set.

### GetQuoteMaxBorrowableAmount

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteMaxBorrowableAmount() string`

GetQuoteMaxBorrowableAmount returns the QuoteMaxBorrowableAmount field if non-nil, zero value otherwise.

### GetQuoteMaxBorrowableAmountOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteMaxBorrowableAmountOk() (*string, bool)`

GetQuoteMaxBorrowableAmountOk returns a tuple with the QuoteMaxBorrowableAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteMaxBorrowableAmount

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteMaxBorrowableAmount(v string)`

SetQuoteMaxBorrowableAmount sets QuoteMaxBorrowableAmount field to given value.

### HasQuoteMaxBorrowableAmount

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteMaxBorrowableAmount() bool`

HasQuoteMaxBorrowableAmount returns a boolean if a field has been set.

### GetQuoteTransferInAble

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteTransferInAble() bool`

GetQuoteTransferInAble returns the QuoteTransferInAble field if non-nil, zero value otherwise.

### GetQuoteTransferInAbleOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteTransferInAbleOk() (*bool, bool)`

GetQuoteTransferInAbleOk returns a tuple with the QuoteTransferInAble field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteTransferInAble

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteTransferInAble(v bool)`

SetQuoteTransferInAble sets QuoteTransferInAble field to given value.

### HasQuoteTransferInAble

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteTransferInAble() bool`

HasQuoteTransferInAble returns a boolean if a field has been set.

### GetQuoteVips

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteVips() []MarginIsolatedVipResult`

GetQuoteVips returns the QuoteVips field if non-nil, zero value otherwise.

### GetQuoteVipsOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteVipsOk() (*[]MarginIsolatedVipResult, bool)`

GetQuoteVipsOk returns a tuple with the QuoteVips field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteVips

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteVips(v []MarginIsolatedVipResult)`

SetQuoteVips sets QuoteVips field to given value.

### HasQuoteVips

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteVips() bool`

HasQuoteVips returns a boolean if a field has been set.

### GetQuoteYearlyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteYearlyInterestRate() string`

GetQuoteYearlyInterestRate returns the QuoteYearlyInterestRate field if non-nil, zero value otherwise.

### GetQuoteYearlyInterestRateOk

`func (o *MarginIsolatedRateAndLimitResult) GetQuoteYearlyInterestRateOk() (*string, bool)`

GetQuoteYearlyInterestRateOk returns a tuple with the QuoteYearlyInterestRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteYearlyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) SetQuoteYearlyInterestRate(v string)`

SetQuoteYearlyInterestRate sets QuoteYearlyInterestRate field to given value.

### HasQuoteYearlyInterestRate

`func (o *MarginIsolatedRateAndLimitResult) HasQuoteYearlyInterestRate() bool`

HasQuoteYearlyInterestRate returns a boolean if a field has been set.

### GetSymbol

`func (o *MarginIsolatedRateAndLimitResult) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MarginIsolatedRateAndLimitResult) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MarginIsolatedRateAndLimitResult) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.

### HasSymbol

`func (o *MarginIsolatedRateAndLimitResult) HasSymbol() bool`

HasSymbol returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


