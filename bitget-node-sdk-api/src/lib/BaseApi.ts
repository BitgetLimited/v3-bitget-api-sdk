import getSigner, {BitgetApiHeader, toJsonString} from './util';
import {API_CONFIG} from './config';
import axios, {AxiosInstance, AxiosRequestConfig} from 'axios';
import * as Console from 'console';

export class BaseApi {
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
        locale?: string,
        httpConfig: AxiosRequestConfig = {timeout: 10000}
    ) {
        this.axiosInstance = axios.create({
            baseURL: API_CONFIG.API_URL,
            ...httpConfig
        })
        this.axiosInstance.interceptors.request.use((data) => {
            if (data.data) {
                data.data = toJsonString(data.data);
            }
            Console.log('request:', data.data || data.params)
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
        this.signer = getSigner(apiKey, secretKey, passphrase, locale)
    }

    axiosInstance: AxiosInstance
}