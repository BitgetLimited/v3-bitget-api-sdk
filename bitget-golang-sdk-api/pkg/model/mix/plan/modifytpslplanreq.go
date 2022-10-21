package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: modify plan request
 */
type ModifyTPSLPlanReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Order id
	 */
	OrderId string `json:"orderId"`
	/**
	 * Trigger price
	 */
	TriggerPrice string `json:"triggerPrice"`
	/**
	 * plan type
	 */
	PlanType string `json:"planType"`
}
