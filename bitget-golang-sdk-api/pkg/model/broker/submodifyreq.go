package broker

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place an order request
 */
type SubModifyReq struct {
	/**
	 * subName
	 */
	SubUid string `json:"subUid"`
	/**
	 *
		withdraw 提币权限
		transfer 划转
		spot_trade 只能现货交易
		contract_trade 只能合约交易
		readonly 只读权限

		eg：
	     readonly,spot_trade,withdraw
	*/
	Perm string `json:"perm"`

	/**
	status
	normal 正常
	freeze 冻结
	del 删除
	*/
	Status string `json:"status"`
}
