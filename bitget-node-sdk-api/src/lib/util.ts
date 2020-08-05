import { stringify } from 'querystring'
import { createHmac } from 'crypto'

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
 */
export default function getSigner(
  apiKey: string = '',
  secretKey: string = '',
  passphrase: string = ''
) {
  /**
   * 加密算法
   * @param timestamp
   * @param httpMethod
   * @param url
   * @param qsOrBody
   */
  function encrypt(
    timestamp: number,
    httpMethod: string,
    url: string,
    qsOrBody: NodeJS.Dict<string | number> | null
  ) {
    httpMethod = httpMethod.toUpperCase()
    const qsOrBodyStr = qsOrBody
      ? httpMethod === 'GET'
        ? '?' + stringify(qsOrBody)
        : JSON.stringify(qsOrBody)
      : ''

    const preHash = String(timestamp) + httpMethod + url + qsOrBodyStr

    const mac = createHmac('sha256', secretKey)
    const preHashToMacBuffer = mac.update(preHash).digest()
    return preHashToMacBuffer.toString('base64')
  }

  return (httpMethod: string, url: string, qsOrBody: NodeJS.Dict<any> | null, locale = 'zh-CN') => {
    const timestamp = Date.now()

    const signString = encrypt(timestamp, httpMethod, url, qsOrBody)

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
