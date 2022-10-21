package account

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Adjust margin mode request
 */
type SetMarginModeReq struct {
	/**
	 * Margin mode
	 */
	MarginMode string `json:"marginMode"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
}
