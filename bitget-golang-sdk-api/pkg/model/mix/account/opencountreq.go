package account

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Get the openable request
 */
type OpenCountReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * open price
	 */
	OpenPrice string `json:"openPrice"`
	/**
	 * open amount
	 */
	OpenAmount string `json:"openAmount"`
	/**
	 * Default leverage 20
	 */
	Leverage string `json:"leverage"`
}
