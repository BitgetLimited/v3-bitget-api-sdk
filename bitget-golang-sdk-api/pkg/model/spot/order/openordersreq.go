package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Obtain orders that have not been closed or partially closed but not cancelled request
 */
type OpenOrdersReq struct {

	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
}
