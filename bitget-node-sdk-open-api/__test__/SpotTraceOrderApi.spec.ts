import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {SpotTraceOrderApi, SpotTraceOrderApiApiKeys} from "../api/SpotTraceOrderApi";
import {Config} from "../api/Config";
import {CurrentOrderListRequest} from "../model/currentOrderListRequest";
import {CloseTrackingOrderRequest} from "../model/closeTrackingOrderRequest";
import {UpdateTpslRequest} from "../model/updateTpslRequest";
import {EndOrderRequest} from "../model/endOrderRequest";
import {TraceSettingsRequest} from "../model/traceSettingsRequest";
import {ProductCodeRequest} from "../model/productCodeRequest";
import {RemoveTraderRequest} from "../model/removeTraderRequest";
import {TraceConfigRequest} from "../model/traceConfigRequest";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new SpotTraceOrderApi(Config.BASE_PATH);
    apiInstance.setApiKey(SpotTraceOrderApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(SpotTraceOrderApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(SpotTraceOrderApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('spotTraceOrderCurrentList', () => {
        let body: CurrentOrderListRequest = {}
        return apiInstance.spotTraceOrderCurrentList(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.buyDelegateCount).not.toBeNull();
                expect(item.buyPrice).not.toBeNull();
                expect(item.profit).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceOrderHistoryList', () => {
        return apiInstance.spotTraceOrderHistoryList({}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.buyLeftTokenId).not.toBeNull();
                expect(item.buyPrice).not.toBeNull();
                expect(item.trackingNo).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceCloseTrackingOrder', () => {
        let body: CloseTrackingOrderRequest = {
            symbolId: "BTCUSDT_SPBL",
            trackingOrderNos: ["1032884851114008576"]
        }
        return apiInstance.spotTraceCloseTrackingOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceUpdateTpsl', () => {
        let body: UpdateTpslRequest = {
            stopProfitPrice: "32600",
            stopLossPrice: "32600",
            trackingNo: "1032830954928365568"
        }
        return apiInstance.spotTraceUpdateTpsl(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceEndOrder', () => {
        let body: EndOrderRequest = {
            trackingOrderNos: ["1032830954928365568"]
        }
        return apiInstance.spotTraceEndOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceSpotInfoList', () => {
        return apiInstance.spotTraceSpotInfoList().then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.maxCount).not.toBeNull();
                expect(item.symbolId).not.toBeNull();
                expect(item.surplusCount).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceGetTraderSettings', () => {
        return apiInstance.spotTraceGetTraderSettings().then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.supportProductCodes) {
                console.log(item);
                expect(item.openCopyTrace).not.toBeNull();
                expect(item.productCode).not.toBeNull();
                expect(item.productName).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceGetTraceSettings', () => {
        let body: TraceSettingsRequest = {
            traderUserId: "2856507104"
        }
        return apiInstance.spotTraceGetTraceSettings(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.traceProductConfigs) {
                console.log(item);
                expect(item.businessLine).not.toBeNull();
                expect(item.maxTraceCount).not.toBeNull();
                expect(item.symbolId).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceMyTraders', () => {
        return apiInstance.spotTraceMyTraders({}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceMyTracers', () => {
        return apiInstance.spotTraceMyTracers({}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.tracerUserId).not.toBeNull();
                expect(item.accountEquity).not.toBeNull();
                expect(item.canRemoveTraceUser).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceSetProductCode', () => {
        let body: ProductCodeRequest = {
            symbolIds: ["BTCUSDT_SPBL", "ETHUSDT_SPBL", "BGBUSDT_SPBL"]
        }
        return apiInstance.spotTraceSetProductCode(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceRemoveTrader', () => {
        let body: RemoveTraderRequest = {
            traderUserId: "10"
        }
        return apiInstance.spotTraceRemoveTrader(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceSetTraceConfig', () => {
        let body: TraceConfigRequest = {
            settingType: "0",
            traderUserId: "2856507104",
            setting: [{
                stopLossRation: "10",
                stopProfitRation: "10",
                maxHoldCount: "50000",
                traceType: "2",
                traceValue: "1000",
                symbolId: "ETHUSDT_SPBL"
            }]

        }
        return apiInstance.spotTraceSetTraceConfig(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});