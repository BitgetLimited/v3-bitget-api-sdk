import {stringify} from 'querystring'
import {createHmac} from 'crypto'
import * as Console from 'console';
import {LOCAL} from './config';

export interface BitgetApiHeader {
    'ACCESS-SIGN': string
    'ACCESS-TIMESTAMP': number | string
    'ACCESS-KEY': string
    'ACCESS-PASSPHRASE': string
    'Content-Type': string
    Cookie: string
    locale: string
}

/**
 * 获取签名器
 * @param apiKey
 * @param secretKey
 * @param passphrase
 * @param locale
 */
export default function getSigner(
    apiKey: string = '',
    secretKey: string = '',
    passphrase: string = '',
    locale: string = LOCAL.EN_US
) {

    return (httpMethod: string, url: string, qsOrBody: NodeJS.Dict<any> | null) => {
        const timestamp = Date.now();
        const signString = encrypt(httpMethod, url, qsOrBody, timestamp,secretKey)

        return {
            'ACCESS-SIGN': signString,
            'ACCESS-TIMESTAMP': timestamp,
            'ACCESS-KEY': apiKey,
            'ACCESS-PASSPHRASE': passphrase,
            'Content-Type': 'application/json',
            Cookie: 'locale=' + locale,
            locale
        }
    }
}

/**
 * 加密算法
 * @param httpMethod
 * @param url
 * @param qsOrBody
 * @param timestamp
 * @param secretKey
 */
export function encrypt(httpMethod: string, url: string, qsOrBody: NodeJS.Dict<string | number> | null, timestamp: number,secretKey:string) {
    httpMethod = httpMethod.toUpperCase()
    const qsOrBodyStr = qsOrBody ? httpMethod === 'GET' ? '?' + stringify(qsOrBody) : toJsonString(qsOrBody) : ''

    const preHash = String(timestamp) + httpMethod + url + qsOrBodyStr

    const mac = createHmac('sha256', secretKey)
    const preHashToMacBuffer = mac.update(preHash).digest()
    return preHashToMacBuffer.toString('base64')
}

export function toJsonString(obj: object): string | null {
    if (obj == null) {
        return null;
    }

    let json = JSON.stringify(obj);
    Object.keys(obj).filter(key => key[0] === '_').forEach(key => {
        json = json.replace(key, key.substring(1));
    });
    const reg = new RegExp('"_', 'g')
    return json.replace(reg, '"');
}
