export * from './marginCrossAccountApi';
import { MarginCrossAccountApi } from './marginCrossAccountApi';
export * from './marginCrossBorrowApi';
import { MarginCrossBorrowApi } from './marginCrossBorrowApi';
export * from './marginCrossFinflowApi';
import { MarginCrossFinflowApi } from './marginCrossFinflowApi';
export * from './marginCrossInterestApi';
import { MarginCrossInterestApi } from './marginCrossInterestApi';
export * from './marginCrossLiquidationApi';
import { MarginCrossLiquidationApi } from './marginCrossLiquidationApi';
export * from './marginCrossOrderApi';
import { MarginCrossOrderApi } from './marginCrossOrderApi';
export * from './marginCrossPublicApi';
import { MarginCrossPublicApi } from './marginCrossPublicApi';
export * from './marginCrossRepayApi';
import { MarginCrossRepayApi } from './marginCrossRepayApi';
export * from './marginIsolatedAccountApi';
import { MarginIsolatedAccountApi } from './marginIsolatedAccountApi';
export * from './marginIsolatedBorrowApi';
import { MarginIsolatedBorrowApi } from './marginIsolatedBorrowApi';
export * from './marginIsolatedFinflowApi';
import { MarginIsolatedFinflowApi } from './marginIsolatedFinflowApi';
export * from './marginIsolatedInterestApi';
import { MarginIsolatedInterestApi } from './marginIsolatedInterestApi';
export * from './marginIsolatedLiquidationApi';
import { MarginIsolatedLiquidationApi } from './marginIsolatedLiquidationApi';
export * from './marginIsolatedOrderApi';
import { MarginIsolatedOrderApi } from './marginIsolatedOrderApi';
export * from './marginIsolatedPublicApi';
import { MarginIsolatedPublicApi } from './marginIsolatedPublicApi';
export * from './marginIsolatedRepayApi';
import { MarginIsolatedRepayApi } from './marginIsolatedRepayApi';
export * from './marginPublicApi';
import { MarginPublicApi } from './marginPublicApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [MarginCrossAccountApi, MarginCrossBorrowApi, MarginCrossFinflowApi, MarginCrossInterestApi, MarginCrossLiquidationApi, MarginCrossOrderApi, MarginCrossPublicApi, MarginCrossRepayApi, MarginIsolatedAccountApi, MarginIsolatedBorrowApi, MarginIsolatedFinflowApi, MarginIsolatedInterestApi, MarginIsolatedLiquidationApi, MarginIsolatedOrderApi, MarginIsolatedPublicApi, MarginIsolatedRepayApi, MarginPublicApi];
