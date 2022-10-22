package account

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot bill request
 */
type BillsReq struct {
	/**
	 * Currency ID
	 */
	CoinId string `json:"coinId"`
	/**
	 * Group Type
	 */
	GroupType string `json:"groupType"`
	/**
	 * Business Type
	 */
	BizType string `json:"bizType"`
	/**
	 * Pass in billId to query previous data
	 */
	After string `json:"after"`
	/**
	 * Pass in billId to check the subsequent data
	 */
	Before string `json:"before"`
	/**
	 * Default 100, maximum 500
	 */
	Limit string `json:"limit"`
}
