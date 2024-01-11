import base64
import hmac
import time

from Crypto.Hash import SHA256
from Crypto.PublicKey import RSA
from Crypto.Signature import PKCS1_v1_5 as pk

from . import consts as c


def sign(message, secret_key):
    mac = hmac.new(bytes(secret_key, encoding='utf8'), bytes(message, encoding='utf-8'), digestmod='sha256')
    d = mac.digest()
    return str(base64.b64encode(d), 'utf8')

def signByRSA(message, secret_key):
    privatekey = RSA.importKey(secret_key)
    h = SHA256.new(message.encode('utf-8'))
    signer = pk.new(privatekey)
    sign = signer.sign(h)
    return str(base64.b64encode(sign), 'utf8')


def pre_hash(timestamp, method, request_path, body = ""):
    return str(timestamp) + str.upper(method) + request_path + body


def get_header(api_key, sign, timestamp, passphrase):
    header = dict()
    header[c.CONTENT_TYPE] = c.APPLICATION_JSON
    header[c.OK_ACCESS_KEY] = api_key
    header[c.OK_ACCESS_SIGN] = sign
    header[c.OK_ACCESS_TIMESTAMP] = str(timestamp)
    header[c.OK_ACCESS_PASSPHRASE] = passphrase
    header[c.LOCALE] = 'zh-CN'

    return header


def parse_params_to_str(params):
    params = [(key, val) for key, val in params.items()]
    params.sort(key=lambda x: x[0])
    # from urllib.parse import urlencode
    # url = '?' +urlencode(params);
    url = '?' +toQueryWithNoEncode(params);
    if url == '?':
        return ''
    return url
    # url = '?'
    # for key, value in params.items():
    #     url = url + str(key) + '=' + str(value) + '&'
    #
    # return url[0:-1]

def toQueryWithNoEncode(params):
    url = ''
    for key, value in params:
        url = url + str(key) + '=' + str(value) + '&'
    return url[0:-1]


def get_timestamp():
    return int(time.time() * 1000)


def signature(timestamp, method, request_path, body, secret_key):
    if str(body) == '{}' or str(body) == 'None':
        body = ''
    message = str(timestamp) + str.upper(method) + request_path + str(body)
    mac = hmac.new(bytes(secret_key, encoding='utf8'), bytes(message, encoding='utf-8'), digestmod='sha256')
    d = mac.digest()
    return base64.b64encode(d)

def check_none(value, msg=""):
    if not value:
        raise Exception(msg + " Invalid params!")