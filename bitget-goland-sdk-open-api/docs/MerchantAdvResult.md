# MerchantAdvResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvList** | Pointer to [**[]MerchantAdvInfo**](MerchantAdvInfo.md) |  | [optional] 
**MinId** | Pointer to **string** |  | [optional] 

## Methods

### NewMerchantAdvResult

`func NewMerchantAdvResult() *MerchantAdvResult`

NewMerchantAdvResult instantiates a new MerchantAdvResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMerchantAdvResultWithDefaults

`func NewMerchantAdvResultWithDefaults() *MerchantAdvResult`

NewMerchantAdvResultWithDefaults instantiates a new MerchantAdvResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvList

`func (o *MerchantAdvResult) GetAdvList() []MerchantAdvInfo`

GetAdvList returns the AdvList field if non-nil, zero value otherwise.

### GetAdvListOk

`func (o *MerchantAdvResult) GetAdvListOk() (*[]MerchantAdvInfo, bool)`

GetAdvListOk returns a tuple with the AdvList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvList

`func (o *MerchantAdvResult) SetAdvList(v []MerchantAdvInfo)`

SetAdvList sets AdvList field to given value.

### HasAdvList

`func (o *MerchantAdvResult) HasAdvList() bool`

HasAdvList returns a boolean if a field has been set.

### GetMinId

`func (o *MerchantAdvResult) GetMinId() string`

GetMinId returns the MinId field if non-nil, zero value otherwise.

### GetMinIdOk

`func (o *MerchantAdvResult) GetMinIdOk() (*string, bool)`

GetMinIdOk returns a tuple with the MinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinId

`func (o *MerchantAdvResult) SetMinId(v string)`

SetMinId sets MinId field to given value.

### HasMinId

`func (o *MerchantAdvResult) HasMinId() bool`

HasMinId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


