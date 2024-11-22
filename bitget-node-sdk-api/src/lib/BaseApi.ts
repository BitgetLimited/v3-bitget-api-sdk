import getSigner, {BitgetApiHeader, toJsonString, sortByKey} from './util';
import {API_CONFIG} from './config';
import axios, {AxiosInstance, AxiosRequestConfig} from 'axios';
import * as Console from 'console';

export class BaseApi{
    protected signer: (
        httpMethod: string,
        url: string,
        qsOrBody: NodeJS.Dict<any> | null,
        locale?: string
    ) => BitgetApiHeader


    constructor(
        apiKey: string,
        secretKey: string,
        passphrase: string,
        httpConfig: AxiosRequestConfig = {timeout: 3000}
    ) {
        this.axiosInstance = axios.create({
            baseURL: API_CONFIG.API_URL,
            ...httpConfig
        })
        this.axiosInstance.interceptors.request.use((data) => {
            if(data.data){
                data.data = toJsonString(data.data);
            }
            if(data.params){
                data.params = sortByKey(data.params)
                // Console.log('sort_params:', data.params)
            }
            Console.log('request:',data.data || data.params)
            return data;
        })

        this.axiosInstance.interceptors.response.use(
            (data) => {
                return data.data;
            },
            (err) => {
                // Console.error(err.response.data)
                // throw err.response.data
                return err.response.data;
            }
        )
        this.signer = getSigner(apiKey, secretKey ,passphrase)
    }

    axiosInstance: AxiosInstance
}