package wallet

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot withdrawal request
 */
type WithdrawalReq struct {
	/**
	 * coin
	 */
	Coin string `json:"coin"`
	/**
	 * address
	 */
	Address string `json:"address"`
	/**
	 * chain
	 */
	Chain string `json:"chain"`
	/**
	 * tag
	 */
	Tag string `json:"tag"`
	/**
	 * amount
	 */
	Amount string `json:"amount"`
	/**
	 * remark
	 */
	Remark string `json:"remark"`
	/**
	 * clientOid
	 */
	ClientOid string `json:"clientOid"`
}
