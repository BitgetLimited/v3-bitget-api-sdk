package plan

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: cancel plan request
 */
type CancelAllPlanReq struct {
	/**
	 * Plan type
	 */
	PlanType string `json:"planType"`

	ProductType string `json:"productType"`
}
