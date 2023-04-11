import localVarRequest from 'request';

export * from './apiResponseResultOfListOfMarginCrossAssetsPopulationResult';
export * from './apiResponseResultOfListOfMarginCrossLevelResult';
export * from './apiResponseResultOfListOfMarginCrossRateAndLimitResult';
export * from './apiResponseResultOfListOfMarginIsolatedAssetsPopulationResult';
export * from './apiResponseResultOfListOfMarginIsolatedAssetsRiskResult';
export * from './apiResponseResultOfListOfMarginIsolatedLevelResult';
export * from './apiResponseResultOfListOfMarginIsolatedRateAndLimitResult';
export * from './apiResponseResultOfListOfMarginSystemResult';
export * from './apiResponseResultOfMarginBatchCancelOrderResult';
export * from './apiResponseResultOfMarginBatchPlaceOrderResult';
export * from './apiResponseResultOfMarginCrossAssetsResult';
export * from './apiResponseResultOfMarginCrossAssetsRiskResult';
export * from './apiResponseResultOfMarginCrossBorrowLimitResult';
export * from './apiResponseResultOfMarginCrossFinFlowResult';
export * from './apiResponseResultOfMarginCrossMaxBorrowResult';
export * from './apiResponseResultOfMarginCrossRepayResult';
export * from './apiResponseResultOfMarginInterestInfoResult';
export * from './apiResponseResultOfMarginIsolatedAssetsResult';
export * from './apiResponseResultOfMarginIsolatedBorrowLimitResult';
export * from './apiResponseResultOfMarginIsolatedFinFlowResult';
export * from './apiResponseResultOfMarginIsolatedInterestInfoResult';
export * from './apiResponseResultOfMarginIsolatedLiquidationInfoResult';
export * from './apiResponseResultOfMarginIsolatedLoanInfoResult';
export * from './apiResponseResultOfMarginIsolatedMaxBorrowResult';
export * from './apiResponseResultOfMarginIsolatedRepayInfoResult';
export * from './apiResponseResultOfMarginIsolatedRepayResult';
export * from './apiResponseResultOfMarginLiquidationInfoResult';
export * from './apiResponseResultOfMarginLoanInfoResult';
export * from './apiResponseResultOfMarginOpenOrderInfoResult';
export * from './apiResponseResultOfMarginPlaceOrderResult';
export * from './apiResponseResultOfMarginRepayInfoResult';
export * from './apiResponseResultOfMarginTradeDetailInfoResult';
export * from './apiResponseResultOfVoid';
export * from './marginBatchCancelOrderRequest';
export * from './marginBatchCancelOrderResult';
export * from './marginBatchOrdersRequest';
export * from './marginBatchPlaceOrderFailureResult';
export * from './marginBatchPlaceOrderResult';
export * from './marginCancelOrderFailureResult';
export * from './marginCancelOrderRequest';
export * from './marginCancelOrderResult';
export * from './marginCrossAssetsPopulationResult';
export * from './marginCrossAssetsResult';
export * from './marginCrossAssetsRiskResult';
export * from './marginCrossBorrowLimitResult';
export * from './marginCrossFinFlowInfo';
export * from './marginCrossFinFlowResult';
export * from './marginCrossLevelResult';
export * from './marginCrossLimitRequest';
export * from './marginCrossMaxBorrowRequest';
export * from './marginCrossMaxBorrowResult';
export * from './marginCrossRateAndLimitResult';
export * from './marginCrossRepayRequest';
export * from './marginCrossRepayResult';
export * from './marginCrossVipResult';
export * from './marginInterestInfo';
export * from './marginInterestInfoResult';
export * from './marginIsolatedAssetsPopulationResult';
export * from './marginIsolatedAssetsResult';
export * from './marginIsolatedAssetsRiskRequest';
export * from './marginIsolatedAssetsRiskResult';
export * from './marginIsolatedBorrowLimitResult';
export * from './marginIsolatedFinFlowInfo';
export * from './marginIsolatedFinFlowResult';
export * from './marginIsolatedInterestInfo';
export * from './marginIsolatedInterestInfoResult';
export * from './marginIsolatedLevelResult';
export * from './marginIsolatedLimitRequest';
export * from './marginIsolatedLiquidationInfo';
export * from './marginIsolatedLiquidationInfoResult';
export * from './marginIsolatedLoanInfo';
export * from './marginIsolatedLoanInfoResult';
export * from './marginIsolatedMaxBorrowRequest';
export * from './marginIsolatedMaxBorrowResult';
export * from './marginIsolatedRateAndLimitResult';
export * from './marginIsolatedRepayInfo';
export * from './marginIsolatedRepayInfoResult';
export * from './marginIsolatedRepayRequest';
export * from './marginIsolatedRepayResult';
export * from './marginIsolatedVipResult';
export * from './marginLiquidationInfo';
export * from './marginLiquidationInfoResult';
export * from './marginLoanInfo';
export * from './marginLoanInfoResult';
export * from './marginOpenOrderInfoResult';
export * from './marginOrderInfo';
export * from './marginOrderRequest';
export * from './marginPlaceOrderResult';
export * from './marginRepayInfo';
export * from './marginRepayInfoResult';
export * from './marginSystemResult';
export * from './marginTradeDetailInfo';
export * from './marginTradeDetailInfoResult';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { ApiResponseResultOfListOfMarginCrossAssetsPopulationResult } from './apiResponseResultOfListOfMarginCrossAssetsPopulationResult';
import { ApiResponseResultOfListOfMarginCrossLevelResult } from './apiResponseResultOfListOfMarginCrossLevelResult';
import { ApiResponseResultOfListOfMarginCrossRateAndLimitResult } from './apiResponseResultOfListOfMarginCrossRateAndLimitResult';
import { ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult } from './apiResponseResultOfListOfMarginIsolatedAssetsPopulationResult';
import { ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult } from './apiResponseResultOfListOfMarginIsolatedAssetsRiskResult';
import { ApiResponseResultOfListOfMarginIsolatedLevelResult } from './apiResponseResultOfListOfMarginIsolatedLevelResult';
import { ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult } from './apiResponseResultOfListOfMarginIsolatedRateAndLimitResult';
import { ApiResponseResultOfListOfMarginSystemResult } from './apiResponseResultOfListOfMarginSystemResult';
import { ApiResponseResultOfMarginBatchCancelOrderResult } from './apiResponseResultOfMarginBatchCancelOrderResult';
import { ApiResponseResultOfMarginBatchPlaceOrderResult } from './apiResponseResultOfMarginBatchPlaceOrderResult';
import { ApiResponseResultOfMarginCrossAssetsResult } from './apiResponseResultOfMarginCrossAssetsResult';
import { ApiResponseResultOfMarginCrossAssetsRiskResult } from './apiResponseResultOfMarginCrossAssetsRiskResult';
import { ApiResponseResultOfMarginCrossBorrowLimitResult } from './apiResponseResultOfMarginCrossBorrowLimitResult';
import { ApiResponseResultOfMarginCrossFinFlowResult } from './apiResponseResultOfMarginCrossFinFlowResult';
import { ApiResponseResultOfMarginCrossMaxBorrowResult } from './apiResponseResultOfMarginCrossMaxBorrowResult';
import { ApiResponseResultOfMarginCrossRepayResult } from './apiResponseResultOfMarginCrossRepayResult';
import { ApiResponseResultOfMarginInterestInfoResult } from './apiResponseResultOfMarginInterestInfoResult';
import { ApiResponseResultOfMarginIsolatedAssetsResult } from './apiResponseResultOfMarginIsolatedAssetsResult';
import { ApiResponseResultOfMarginIsolatedBorrowLimitResult } from './apiResponseResultOfMarginIsolatedBorrowLimitResult';
import { ApiResponseResultOfMarginIsolatedFinFlowResult } from './apiResponseResultOfMarginIsolatedFinFlowResult';
import { ApiResponseResultOfMarginIsolatedInterestInfoResult } from './apiResponseResultOfMarginIsolatedInterestInfoResult';
import { ApiResponseResultOfMarginIsolatedLiquidationInfoResult } from './apiResponseResultOfMarginIsolatedLiquidationInfoResult';
import { ApiResponseResultOfMarginIsolatedLoanInfoResult } from './apiResponseResultOfMarginIsolatedLoanInfoResult';
import { ApiResponseResultOfMarginIsolatedMaxBorrowResult } from './apiResponseResultOfMarginIsolatedMaxBorrowResult';
import { ApiResponseResultOfMarginIsolatedRepayInfoResult } from './apiResponseResultOfMarginIsolatedRepayInfoResult';
import { ApiResponseResultOfMarginIsolatedRepayResult } from './apiResponseResultOfMarginIsolatedRepayResult';
import { ApiResponseResultOfMarginLiquidationInfoResult } from './apiResponseResultOfMarginLiquidationInfoResult';
import { ApiResponseResultOfMarginLoanInfoResult } from './apiResponseResultOfMarginLoanInfoResult';
import { ApiResponseResultOfMarginOpenOrderInfoResult } from './apiResponseResultOfMarginOpenOrderInfoResult';
import { ApiResponseResultOfMarginPlaceOrderResult } from './apiResponseResultOfMarginPlaceOrderResult';
import { ApiResponseResultOfMarginRepayInfoResult } from './apiResponseResultOfMarginRepayInfoResult';
import { ApiResponseResultOfMarginTradeDetailInfoResult } from './apiResponseResultOfMarginTradeDetailInfoResult';
import { ApiResponseResultOfVoid } from './apiResponseResultOfVoid';
import { MarginBatchCancelOrderRequest } from './marginBatchCancelOrderRequest';
import { MarginBatchCancelOrderResult } from './marginBatchCancelOrderResult';
import { MarginBatchOrdersRequest } from './marginBatchOrdersRequest';
import { MarginBatchPlaceOrderFailureResult } from './marginBatchPlaceOrderFailureResult';
import { MarginBatchPlaceOrderResult } from './marginBatchPlaceOrderResult';
import { MarginCancelOrderFailureResult } from './marginCancelOrderFailureResult';
import { MarginCancelOrderRequest } from './marginCancelOrderRequest';
import { MarginCancelOrderResult } from './marginCancelOrderResult';
import { MarginCrossAssetsPopulationResult } from './marginCrossAssetsPopulationResult';
import { MarginCrossAssetsResult } from './marginCrossAssetsResult';
import { MarginCrossAssetsRiskResult } from './marginCrossAssetsRiskResult';
import { MarginCrossBorrowLimitResult } from './marginCrossBorrowLimitResult';
import { MarginCrossFinFlowInfo } from './marginCrossFinFlowInfo';
import { MarginCrossFinFlowResult } from './marginCrossFinFlowResult';
import { MarginCrossLevelResult } from './marginCrossLevelResult';
import { MarginCrossLimitRequest } from './marginCrossLimitRequest';
import { MarginCrossMaxBorrowRequest } from './marginCrossMaxBorrowRequest';
import { MarginCrossMaxBorrowResult } from './marginCrossMaxBorrowResult';
import { MarginCrossRateAndLimitResult } from './marginCrossRateAndLimitResult';
import { MarginCrossRepayRequest } from './marginCrossRepayRequest';
import { MarginCrossRepayResult } from './marginCrossRepayResult';
import { MarginCrossVipResult } from './marginCrossVipResult';
import { MarginInterestInfo } from './marginInterestInfo';
import { MarginInterestInfoResult } from './marginInterestInfoResult';
import { MarginIsolatedAssetsPopulationResult } from './marginIsolatedAssetsPopulationResult';
import { MarginIsolatedAssetsResult } from './marginIsolatedAssetsResult';
import { MarginIsolatedAssetsRiskRequest } from './marginIsolatedAssetsRiskRequest';
import { MarginIsolatedAssetsRiskResult } from './marginIsolatedAssetsRiskResult';
import { MarginIsolatedBorrowLimitResult } from './marginIsolatedBorrowLimitResult';
import { MarginIsolatedFinFlowInfo } from './marginIsolatedFinFlowInfo';
import { MarginIsolatedFinFlowResult } from './marginIsolatedFinFlowResult';
import { MarginIsolatedInterestInfo } from './marginIsolatedInterestInfo';
import { MarginIsolatedInterestInfoResult } from './marginIsolatedInterestInfoResult';
import { MarginIsolatedLevelResult } from './marginIsolatedLevelResult';
import { MarginIsolatedLimitRequest } from './marginIsolatedLimitRequest';
import { MarginIsolatedLiquidationInfo } from './marginIsolatedLiquidationInfo';
import { MarginIsolatedLiquidationInfoResult } from './marginIsolatedLiquidationInfoResult';
import { MarginIsolatedLoanInfo } from './marginIsolatedLoanInfo';
import { MarginIsolatedLoanInfoResult } from './marginIsolatedLoanInfoResult';
import { MarginIsolatedMaxBorrowRequest } from './marginIsolatedMaxBorrowRequest';
import { MarginIsolatedMaxBorrowResult } from './marginIsolatedMaxBorrowResult';
import { MarginIsolatedRateAndLimitResult } from './marginIsolatedRateAndLimitResult';
import { MarginIsolatedRepayInfo } from './marginIsolatedRepayInfo';
import { MarginIsolatedRepayInfoResult } from './marginIsolatedRepayInfoResult';
import { MarginIsolatedRepayRequest } from './marginIsolatedRepayRequest';
import { MarginIsolatedRepayResult } from './marginIsolatedRepayResult';
import { MarginIsolatedVipResult } from './marginIsolatedVipResult';
import { MarginLiquidationInfo } from './marginLiquidationInfo';
import { MarginLiquidationInfoResult } from './marginLiquidationInfoResult';
import { MarginLoanInfo } from './marginLoanInfo';
import { MarginLoanInfoResult } from './marginLoanInfoResult';
import { MarginOpenOrderInfoResult } from './marginOpenOrderInfoResult';
import { MarginOrderInfo } from './marginOrderInfo';
import { MarginOrderRequest } from './marginOrderRequest';
import { MarginPlaceOrderResult } from './marginPlaceOrderResult';
import { MarginRepayInfo } from './marginRepayInfo';
import { MarginRepayInfoResult } from './marginRepayInfoResult';
import { MarginSystemResult } from './marginSystemResult';
import { MarginTradeDetailInfo } from './marginTradeDetailInfo';
import { MarginTradeDetailInfoResult } from './marginTradeDetailInfoResult';
import {encrypt} from "./util";
import * as querystring from "querystring";
import * as url from "url";

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
}

let typeMap: {[index: string]: any} = {
    "ApiResponseResultOfListOfMarginCrossAssetsPopulationResult": ApiResponseResultOfListOfMarginCrossAssetsPopulationResult,
    "ApiResponseResultOfListOfMarginCrossLevelResult": ApiResponseResultOfListOfMarginCrossLevelResult,
    "ApiResponseResultOfListOfMarginCrossRateAndLimitResult": ApiResponseResultOfListOfMarginCrossRateAndLimitResult,
    "ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult": ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult,
    "ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult": ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult,
    "ApiResponseResultOfListOfMarginIsolatedLevelResult": ApiResponseResultOfListOfMarginIsolatedLevelResult,
    "ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult": ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult,
    "ApiResponseResultOfListOfMarginSystemResult": ApiResponseResultOfListOfMarginSystemResult,
    "ApiResponseResultOfMarginBatchCancelOrderResult": ApiResponseResultOfMarginBatchCancelOrderResult,
    "ApiResponseResultOfMarginBatchPlaceOrderResult": ApiResponseResultOfMarginBatchPlaceOrderResult,
    "ApiResponseResultOfMarginCrossAssetsResult": ApiResponseResultOfMarginCrossAssetsResult,
    "ApiResponseResultOfMarginCrossAssetsRiskResult": ApiResponseResultOfMarginCrossAssetsRiskResult,
    "ApiResponseResultOfMarginCrossBorrowLimitResult": ApiResponseResultOfMarginCrossBorrowLimitResult,
    "ApiResponseResultOfMarginCrossFinFlowResult": ApiResponseResultOfMarginCrossFinFlowResult,
    "ApiResponseResultOfMarginCrossMaxBorrowResult": ApiResponseResultOfMarginCrossMaxBorrowResult,
    "ApiResponseResultOfMarginCrossRepayResult": ApiResponseResultOfMarginCrossRepayResult,
    "ApiResponseResultOfMarginInterestInfoResult": ApiResponseResultOfMarginInterestInfoResult,
    "ApiResponseResultOfMarginIsolatedAssetsResult": ApiResponseResultOfMarginIsolatedAssetsResult,
    "ApiResponseResultOfMarginIsolatedBorrowLimitResult": ApiResponseResultOfMarginIsolatedBorrowLimitResult,
    "ApiResponseResultOfMarginIsolatedFinFlowResult": ApiResponseResultOfMarginIsolatedFinFlowResult,
    "ApiResponseResultOfMarginIsolatedInterestInfoResult": ApiResponseResultOfMarginIsolatedInterestInfoResult,
    "ApiResponseResultOfMarginIsolatedLiquidationInfoResult": ApiResponseResultOfMarginIsolatedLiquidationInfoResult,
    "ApiResponseResultOfMarginIsolatedLoanInfoResult": ApiResponseResultOfMarginIsolatedLoanInfoResult,
    "ApiResponseResultOfMarginIsolatedMaxBorrowResult": ApiResponseResultOfMarginIsolatedMaxBorrowResult,
    "ApiResponseResultOfMarginIsolatedRepayInfoResult": ApiResponseResultOfMarginIsolatedRepayInfoResult,
    "ApiResponseResultOfMarginIsolatedRepayResult": ApiResponseResultOfMarginIsolatedRepayResult,
    "ApiResponseResultOfMarginLiquidationInfoResult": ApiResponseResultOfMarginLiquidationInfoResult,
    "ApiResponseResultOfMarginLoanInfoResult": ApiResponseResultOfMarginLoanInfoResult,
    "ApiResponseResultOfMarginOpenOrderInfoResult": ApiResponseResultOfMarginOpenOrderInfoResult,
    "ApiResponseResultOfMarginPlaceOrderResult": ApiResponseResultOfMarginPlaceOrderResult,
    "ApiResponseResultOfMarginRepayInfoResult": ApiResponseResultOfMarginRepayInfoResult,
    "ApiResponseResultOfMarginTradeDetailInfoResult": ApiResponseResultOfMarginTradeDetailInfoResult,
    "ApiResponseResultOfVoid": ApiResponseResultOfVoid,
    "MarginBatchCancelOrderRequest": MarginBatchCancelOrderRequest,
    "MarginBatchCancelOrderResult": MarginBatchCancelOrderResult,
    "MarginBatchOrdersRequest": MarginBatchOrdersRequest,
    "MarginBatchPlaceOrderFailureResult": MarginBatchPlaceOrderFailureResult,
    "MarginBatchPlaceOrderResult": MarginBatchPlaceOrderResult,
    "MarginCancelOrderFailureResult": MarginCancelOrderFailureResult,
    "MarginCancelOrderRequest": MarginCancelOrderRequest,
    "MarginCancelOrderResult": MarginCancelOrderResult,
    "MarginCrossAssetsPopulationResult": MarginCrossAssetsPopulationResult,
    "MarginCrossAssetsResult": MarginCrossAssetsResult,
    "MarginCrossAssetsRiskResult": MarginCrossAssetsRiskResult,
    "MarginCrossBorrowLimitResult": MarginCrossBorrowLimitResult,
    "MarginCrossFinFlowInfo": MarginCrossFinFlowInfo,
    "MarginCrossFinFlowResult": MarginCrossFinFlowResult,
    "MarginCrossLevelResult": MarginCrossLevelResult,
    "MarginCrossLimitRequest": MarginCrossLimitRequest,
    "MarginCrossMaxBorrowRequest": MarginCrossMaxBorrowRequest,
    "MarginCrossMaxBorrowResult": MarginCrossMaxBorrowResult,
    "MarginCrossRateAndLimitResult": MarginCrossRateAndLimitResult,
    "MarginCrossRepayRequest": MarginCrossRepayRequest,
    "MarginCrossRepayResult": MarginCrossRepayResult,
    "MarginCrossVipResult": MarginCrossVipResult,
    "MarginInterestInfo": MarginInterestInfo,
    "MarginInterestInfoResult": MarginInterestInfoResult,
    "MarginIsolatedAssetsPopulationResult": MarginIsolatedAssetsPopulationResult,
    "MarginIsolatedAssetsResult": MarginIsolatedAssetsResult,
    "MarginIsolatedAssetsRiskRequest": MarginIsolatedAssetsRiskRequest,
    "MarginIsolatedAssetsRiskResult": MarginIsolatedAssetsRiskResult,
    "MarginIsolatedBorrowLimitResult": MarginIsolatedBorrowLimitResult,
    "MarginIsolatedFinFlowInfo": MarginIsolatedFinFlowInfo,
    "MarginIsolatedFinFlowResult": MarginIsolatedFinFlowResult,
    "MarginIsolatedInterestInfo": MarginIsolatedInterestInfo,
    "MarginIsolatedInterestInfoResult": MarginIsolatedInterestInfoResult,
    "MarginIsolatedLevelResult": MarginIsolatedLevelResult,
    "MarginIsolatedLimitRequest": MarginIsolatedLimitRequest,
    "MarginIsolatedLiquidationInfo": MarginIsolatedLiquidationInfo,
    "MarginIsolatedLiquidationInfoResult": MarginIsolatedLiquidationInfoResult,
    "MarginIsolatedLoanInfo": MarginIsolatedLoanInfo,
    "MarginIsolatedLoanInfoResult": MarginIsolatedLoanInfoResult,
    "MarginIsolatedMaxBorrowRequest": MarginIsolatedMaxBorrowRequest,
    "MarginIsolatedMaxBorrowResult": MarginIsolatedMaxBorrowResult,
    "MarginIsolatedRateAndLimitResult": MarginIsolatedRateAndLimitResult,
    "MarginIsolatedRepayInfo": MarginIsolatedRepayInfo,
    "MarginIsolatedRepayInfoResult": MarginIsolatedRepayInfoResult,
    "MarginIsolatedRepayRequest": MarginIsolatedRepayRequest,
    "MarginIsolatedRepayResult": MarginIsolatedRepayResult,
    "MarginIsolatedVipResult": MarginIsolatedVipResult,
    "MarginLiquidationInfo": MarginLiquidationInfo,
    "MarginLiquidationInfoResult": MarginLiquidationInfoResult,
    "MarginLoanInfo": MarginLoanInfo,
    "MarginLoanInfoResult": MarginLoanInfoResult,
    "MarginOpenOrderInfoResult": MarginOpenOrderInfoResult,
    "MarginOrderInfo": MarginOrderInfo,
    "MarginOrderRequest": MarginOrderRequest,
    "MarginPlaceOrderResult": MarginPlaceOrderResult,
    "MarginRepayInfo": MarginRepayInfo,
    "MarginRepayInfoResult": MarginRepayInfoResult,
    "MarginSystemResult": MarginSystemResult,
    "MarginTradeDetailInfo": MarginTradeDetailInfo,
    "MarginTradeDetailInfoResult": MarginTradeDetailInfoResult,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }

        // auto sign
        if (this.paramName == "SECRET-KEY" && requestOptions.headers) {
            const timestamp = Date.now();
            const uri = JSON.parse(JSON.stringify(requestOptions))['uri']
            let query = "";
            if (requestOptions.qs) {
                query = querystring.stringify(requestOptions.qs);
            }
            let sign = encrypt(String(requestOptions.method), url.parse(uri).path, query, requestOptions.body, timestamp, this.apiKey)
            requestOptions.headers['ACCESS-SIGN'] = sign;
            requestOptions.headers['ACCESS-TIMESTAMP'] = timestamp;
            requestOptions.headers['SECRET-KEY'] = '';
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
