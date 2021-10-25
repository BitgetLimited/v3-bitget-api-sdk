import {BaseApi} from '../BaseApi';
import {SPOT_URL} from '../config';

export class SpotPublicApi extends BaseApi{
    time(){
        const url = SPOT_URL.SPOT_PUBLIC + '/time';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    currencies(){
        const url = SPOT_URL.SPOT_PUBLIC + '/currencies';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    products(){
        const url = SPOT_URL.SPOT_PUBLIC + '/products';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    product(symbol:string){
        const url = SPOT_URL.SPOT_PUBLIC + '/product';
        const qsOrBody = {symbol};
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}