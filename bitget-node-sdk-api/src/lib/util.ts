import {stringify} from 'querystring'
import {createHmac} from 'crypto'
import * as Console from 'console';
import {API_CONFIG} from './config';
import {BIZ_CONSTANT} from './contant';

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
 * @param timestamp
 * @param passphrase
 */
export default function getSigner(
    apiKey: string = '',
    secretKey: string = '',
    passphrase: string = ''
) {

    return (httpMethod: string, url: string, qsOrBody: NodeJS.Dict<any> | null, locale = 'zh-CN') => {
        const timestamp = Date.now();
        let signString = encrypt(httpMethod, url, qsOrBody, timestamp, secretKey);
        if (API_CONFIG.SIGN_TYPE === BIZ_CONSTANT.RSA) {
            signString = encryptRSA(httpMethod, url, qsOrBody, timestamp,secretKey)
        }

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
    if (qsOrBody && httpMethod === 'GET') {
        qsOrBody = sortByKey(qsOrBody);
    }
    if (qsOrBody && Object.keys(qsOrBody).length === 0) {
        qsOrBody = null;
    }
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

/**
 * RSA加密算法
 * @param httpMethod
 * @param url
 * @param qsOrBody
 * @param timestamp
 * @param secretKey
 */
export function encryptRSA(httpMethod: string, url: string, qsOrBody: NodeJS.Dict<string | number> | null, timestamp: number,secretKey:string) {
    httpMethod = httpMethod.toUpperCase()
    const qsOrBodyStr = qsOrBody ? httpMethod === 'GET' ? '?' + stringify(qsOrBody) : toJsonString(qsOrBody) : ''
    const preHash = String(timestamp) + httpMethod + url + qsOrBodyStr
    const NodeRSA = require('node-rsa')
    const priKey = new NodeRSA(secretKey)
    const sign = priKey.sign(preHash, 'base64', 'UTF-8')
    return sign
}

export function sortByKey(dict:NodeJS.Dict<string | number>) {
    const sorted = [];
    for(const key of Object.keys(dict)) {
        sorted[sorted.length] = key;
    }
    sorted.sort();

    const tempDict:any = {};
    // for(let i = 0; i < sorted.length; i++) {
    //     tempDict[sorted[i]] = dict[sorted[i]];
    // }
    for(const item of sorted) {
        tempDict[item] = dict[item];
    }
    return tempDict;
}