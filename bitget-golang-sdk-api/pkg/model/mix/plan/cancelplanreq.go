package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: cancel plan request
 */
type CancelPlanReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Order Id
	 */
	OrderId string `json:"orderId"`
	/**
	 * Plan type
	 */
	PlanType string `json:"planType"`
}
