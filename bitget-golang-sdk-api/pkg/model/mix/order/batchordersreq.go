package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place batch order request
 */
type BatchOrdersReq struct {
	/**
	 * Order data list
	 */
	OrderDataList []PlaceOrderBaseParam `json:"orderDataList"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
}
type PlaceOrderBaseParam struct {
	/**
	 * Client ID
	 */
	ClientOid string `json:"clientOid"`
	/**
	 * Amount of currency placed
	 */
	Size string `json:"size"`
	/**
	 * 1: Kaiduo 2: Kaikong 3: Pingduo 4: Pingkong
	 */
	Side string `json:"side"`
	/**
	 * Order Type
	 */
	OrderType string `json:"orderType"`
	/**
	 * Entrusted price
	 */
	Price            string `json:"price"`
	TimeInForceValue string `json:"timeInForceValue"`
}
