package broker

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place an order request
 */
type SubAddressReq struct {
	/**
	 * subName
	 */
	SubUid string `json:"subUid"`
	/**
	 * remark
	 */
	Coin string `json:"coin"`

	Chain string `json:"chain"`
}
