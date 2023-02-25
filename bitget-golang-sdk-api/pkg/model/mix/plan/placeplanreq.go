package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: placePlan request
 */
type PlacePlanReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Amount of currency placed
	 */
	Size string `json:"size"`
	/**
	 * Entrusted price
	 */
	ExecutePrice string `json:"executePrice"`
	/**
	 * Trigger Price
	 */
	TriggerPrice string `json:"triggerPrice"`
	/**
	 * Entrusting direction
	 */
	Side string `json:"side"`
	/**
	 * Transaction Type
	 */
	OrderType string `json:"orderType"`
	/**
	 * Trigger Type Transaction Price Trigger Flag Price Trigger
	 */
	TriggerType string `json:"triggerType"`
	/**
	 * Client ID
	 */
	ClientOid string `json:"clientOid"`
	/**
	 * Default stop profit price
	 */
	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`
	/**
	 * Preset stop loss price
	 */
	PresetStopLossPrice string `json:"presetStopLossPrice"`

	ReduceOnly bool `json:"reduceOnly"`
}
