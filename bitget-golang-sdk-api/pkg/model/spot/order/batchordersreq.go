package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot batch order request
 */
type BatchOrdersReq struct {

	/**
	 * order list
	 */
	OrderList []SpotOrdersReq `json:"orderList"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
}
type SpotOrdersReq struct {
	/**
	 * Order direction
	 */
	Side string `json:"side"`
	/**
	 * Order type
	 */
	OrderType string `json:"orderType"`
	/**
	 * Order Control Type
	 */
	Force string `json:"force"`
	/**
	 * Entrusted price, only applicable to price limit order
	 */
	Price string `json:"price"`
	/**
	 * quantity
	 */
	Quantity string `json:"quantity"`
	/**
	 * Client order ID
	 */
	ClientOrderId string `json:"clientOrderId"`
}
