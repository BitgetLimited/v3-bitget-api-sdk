package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: modify plan request
 */
type PlaceTPSLReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Plan type
	 */
	PlanType string `json:"planType"`
	/**
	 * Trigger price
	 */
	TriggerPrice string `json:"triggerPrice"`
	/**
	 * Is this position long or short
	 */
	HoldSide string `json:"holdSide"`
}
