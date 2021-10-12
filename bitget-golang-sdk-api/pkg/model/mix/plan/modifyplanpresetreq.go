package plan

type ModifyPlanPresetReq struct {
	Symbol                string `json:"symbol"`
	MarginCoin            string `json:"marginCoin"`
	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`
	PresetStopLossPrice   string `json:"presetStopLossPrice"`
	OrderId               string `json:"orderId"`
}
