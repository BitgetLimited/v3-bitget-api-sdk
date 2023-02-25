package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: modify plan request
 */
type PlaceTrailStopReq struct {
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
	 * Trigger price
	 */
	TriggerType string `json:"triggerType"`
	/**
	 * Is this position long or short
	 */
	Side string `json:"side"`

	Size string `json:"size"`

	RangeRate string `json:"rangeRate"`

	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`

	PresetStopLossPrice string `json:"presetStopLossPrice"`

	ReduceOnly string `json:"reduceOnly"`
}
