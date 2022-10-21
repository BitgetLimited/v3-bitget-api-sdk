package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: modify plan request
 */
type ModifyPlanPresetReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * If the profit stop price is blank, cancel the profit stop
	 */
	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`
	/**
	 * If the stop loss price is blank, cancel the stop loss
	 */
	PresetStopLossPrice string `json:"presetStopLossPrice"`
	/**
	 * order id
	 */
	OrderId string `json:"orderId"`
	/**
	 * plan type
	 */
	PlanType string `json:"planType"`
}
