# MerchantInfoResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinId** | Pointer to **string** |  | [optional] 
**ResultList** | Pointer to [**[]MerchantInfo**](MerchantInfo.md) |  | [optional] 

## Methods

### NewMerchantInfoResult

`func NewMerchantInfoResult() *MerchantInfoResult`

NewMerchantInfoResult instantiates a new MerchantInfoResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMerchantInfoResultWithDefaults

`func NewMerchantInfoResultWithDefaults() *MerchantInfoResult`

NewMerchantInfoResultWithDefaults instantiates a new MerchantInfoResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinId

`func (o *MerchantInfoResult) GetMinId() string`

GetMinId returns the MinId field if non-nil, zero value otherwise.

### GetMinIdOk

`func (o *MerchantInfoResult) GetMinIdOk() (*string, bool)`

GetMinIdOk returns a tuple with the MinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinId

`func (o *MerchantInfoResult) SetMinId(v string)`

SetMinId sets MinId field to given value.

### HasMinId

`func (o *MerchantInfoResult) HasMinId() bool`

HasMinId returns a boolean if a field has been set.

### GetResultList

`func (o *MerchantInfoResult) GetResultList() []MerchantInfo`

GetResultList returns the ResultList field if non-nil, zero value otherwise.

### GetResultListOk

`func (o *MerchantInfoResult) GetResultListOk() (*[]MerchantInfo, bool)`

GetResultListOk returns a tuple with the ResultList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultList

`func (o *MerchantInfoResult) SetResultList(v []MerchantInfo)`

SetResultList sets ResultList field to given value.

### HasResultList

`func (o *MerchantInfoResult) HasResultList() bool`

HasResultList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


