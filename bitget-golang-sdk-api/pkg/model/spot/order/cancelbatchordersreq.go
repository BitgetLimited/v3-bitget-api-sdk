package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Batch cancellation request
 */
type CancelBatchOrdersReq struct {

	/**
	 *  Order ids
	 */
	OrderIds []string `json:"orderIds"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
}
