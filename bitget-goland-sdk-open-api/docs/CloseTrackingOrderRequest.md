# CloseTrackingOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SymbolId** | **string** | symbolId | 
**TrackingOrderNos** | **[]string** | trackingOrderNos | 

## Methods

### NewCloseTrackingOrderRequest

`func NewCloseTrackingOrderRequest(symbolId string, trackingOrderNos []string, ) *CloseTrackingOrderRequest`

NewCloseTrackingOrderRequest instantiates a new CloseTrackingOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCloseTrackingOrderRequestWithDefaults

`func NewCloseTrackingOrderRequestWithDefaults() *CloseTrackingOrderRequest`

NewCloseTrackingOrderRequestWithDefaults instantiates a new CloseTrackingOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSymbolId

`func (o *CloseTrackingOrderRequest) GetSymbolId() string`

GetSymbolId returns the SymbolId field if non-nil, zero value otherwise.

### GetSymbolIdOk

`func (o *CloseTrackingOrderRequest) GetSymbolIdOk() (*string, bool)`

GetSymbolIdOk returns a tuple with the SymbolId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbolId

`func (o *CloseTrackingOrderRequest) SetSymbolId(v string)`

SetSymbolId sets SymbolId field to given value.


### GetTrackingOrderNos

`func (o *CloseTrackingOrderRequest) GetTrackingOrderNos() []string`

GetTrackingOrderNos returns the TrackingOrderNos field if non-nil, zero value otherwise.

### GetTrackingOrderNosOk

`func (o *CloseTrackingOrderRequest) GetTrackingOrderNosOk() (*[]string, bool)`

GetTrackingOrderNosOk returns a tuple with the TrackingOrderNos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingOrderNos

`func (o *CloseTrackingOrderRequest) SetTrackingOrderNos(v []string)`

SetTrackingOrderNos sets TrackingOrderNos field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


