package account

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Adjustment margin request
 */
type SetMarginReq struct {
	/**
	 * Position direction (all positions are not transferred)
	 */
	HoldSide string `json:"holdSide"`
	/**
	 * Amount greater than 0 increases less than 0 decreases
	 */
	Amount string `json:"amount"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
}
