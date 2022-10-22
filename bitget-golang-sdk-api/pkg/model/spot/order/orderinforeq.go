package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Get order details request
 */
type OrderInfoReq struct {
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Order Id
	 */
	OrderId string `json:"orderId"`
	/**
	 * Client Order Id
	 */
	ClientOrderId string `json:"clientOrderId"`
}
