package broker

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place an order request
 */
type SubModifyEmailReq struct {
	/**
	 * subName
	 */
	SubUid string `json:"subUid"`
	/**
	 */
	Email string `json:"email"`
}
