package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Obtain transaction details request
 */
type FillsReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Order Id
	 */
	OrderId string `json:"orderId"`
	/**
	 * The orderId is passed in. The data before the orderId desc
	 */
	After string `json:"after"`
	/**
	 * Pass in the data after the orderId asc
	 */
	Before string `json:"before"`
	/**
	 * Number of returned results Default 100, maximum 500
	 */
	Limit string `json:"limit"`
}
