import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';

export class SpotPublicApi extends BaseApi{
    /**
     * Get server time
     */
    time(){
        const url = SPOT_URL.SPOT_PUBLIC + '/time';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }
    /**
     * Basic information of currency
     */
    currencies(){
        const url = SPOT_URL.SPOT_PUBLIC + '/currencies';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }
    /**
     * Get all product information
     */
    products(){
        const url = SPOT_URL.SPOT_PUBLIC + '/products';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }
    /**
     * Get single product information
     * @param symbol
     */
    product(symbol:string){
        const url = SPOT_URL.SPOT_PUBLIC + '/product';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}