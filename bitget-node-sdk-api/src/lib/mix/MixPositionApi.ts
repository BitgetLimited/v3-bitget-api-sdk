import {BaseApi} from '../BaseApi';
import {MIX_URL} from '../config';

export class MixPositionApi extends BaseApi{

    singlePosition(symbol: string,marginCoin:string) {
        const url = MIX_URL.MIX_POSITION + '/singlePosition';
        const qsOrBody = {symbol,marginCoin};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    allPosition(productType: string,marginCoin:string) {
        const url = MIX_URL.MIX_POSITION + '/allPosition';
        const qsOrBody = {productType,marginCoin};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}