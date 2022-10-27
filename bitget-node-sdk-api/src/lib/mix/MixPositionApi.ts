import {BaseApi} from '../BaseApi';
import {MIX_URL} from '../config';

export class MixPositionApi extends BaseApi{
    /**
     * Obtain single contract position information
     * @param symbol
     * @param marginCoin
     */
    singlePosition(symbol: string,marginCoin:string) {
        const url = MIX_URL.MIX_POSITION + '/singlePosition';
        const qsOrBody = {symbol,marginCoin};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
    /**
     * Obtain all contract position information
     * @param productType
     * @param marginCoin
     */
    allPosition(productType: string,marginCoin:string) {
        const url = MIX_URL.MIX_POSITION + '/allPosition';
        const qsOrBody = {productType,marginCoin};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}