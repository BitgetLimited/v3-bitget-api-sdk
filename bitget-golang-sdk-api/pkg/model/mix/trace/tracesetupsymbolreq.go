package trace

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Dealer closing request
 */
type TraceSetUpSymbolReq struct {
	/**
	 * add/del
	 */
	Operation string `json:"operation"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
}
