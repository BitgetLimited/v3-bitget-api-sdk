package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: placePlan request
 */
type ModifyPlanReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Planned entrusted order No
	 */
	OrderId string `json:"orderId"`
	/**
	 * Execution price
	 */
	ExecutePrice string `json:"executePrice"`
	/**
	 * Trigger Price
	 */
	TriggerPrice string `json:"triggerPrice"`
	/**
	 * Trigger Type
	 */
	TriggerType string `json:"triggerType"`
	/**
	 * Order Type
	 */
	OrderType string `json:"orderType"`
}
