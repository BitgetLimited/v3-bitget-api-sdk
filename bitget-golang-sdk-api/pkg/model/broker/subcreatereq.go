package broker

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place an order request
 */
type SubCreateReq struct {
	/**
	 * subName
	 */
	SubName string `json:"subName"`
	/**
	 * remark
	 */
	Remark string `json:"remark"`
}
