package broker

/*
* @Author: bitget-sdk-team
* @Date: 2022-09-30 10:46
* @DES: place an order request
 */
type SubWithdrawalReq struct {
	/**
	 * subName
	 */
	SubUid string `json:"subUid"`
	/**
	 * remark
	 */
	Coin string `json:"coin"`

	Chain string `json:"chain"`

	Address string `json:"address"`

	Amount string `json:"amount"`

	Tag string `json:"tag"`

	ClientOid string `json:"clientOid"`
}
