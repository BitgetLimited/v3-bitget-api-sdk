import {createHmac} from 'crypto'

export function encrypt(httpMethod: string, path: string | null, query: string | null, body: NodeJS.Dict<string | number> | null, timestamp: number, secretKey: string) {
    httpMethod = httpMethod.toUpperCase()
    let preHash = String(timestamp) + httpMethod + path;
    if (query != "") {
        preHash = preHash + '?' + query;
    }
    if (body) {
        preHash += JSON.stringify(body, null);
    }

    const mac = createHmac('sha256', secretKey)
    const preHashToMacBuffer = mac.update(preHash).digest()
    return preHashToMacBuffer.toString('base64')
}
