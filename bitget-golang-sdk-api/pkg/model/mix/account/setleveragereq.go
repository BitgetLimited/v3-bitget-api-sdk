package account

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: set lever request
 */
type SetLeveragerReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
	/**
	 * Leverage ratio
	 */
	Leverage string `json:"leverage"`
	/**
	 * The whole warehouse lever can not transfer this parameter
	 * Position direction: long multi position short short position,
	 * MixHoldSideEnum
	 */
	HoldSide string `json:"holdSide"`
}
