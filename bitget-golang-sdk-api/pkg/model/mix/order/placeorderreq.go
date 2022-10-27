package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place an order request
 */
type PlaceOrderReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Open more, open more, empty more, empty more
	 */
	Side string `json:"side"`
	/**
	 * Client ID
	 */
	ClientOid string `json:"clientOid"`
	/**
	 * Amount of currency placed
	 */
	Size string `json:"size"`
	/**
	 * Order Type Market Price Limit
	 */
	OrderType string `json:"orderType"`
	/**
	 * Entrusted price
	 */
	Price string `json:"price"`
	/**
	 * Order validity
	 */
	TimeInForceValue string `json:"timeInForceValue"`
	/**
	 * Default stop profit price
	 */
	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`
	/**
	 * Preset stop loss price
	 */
	PresetStopLossPrice string `json:"presetStopLossPrice"`
}
