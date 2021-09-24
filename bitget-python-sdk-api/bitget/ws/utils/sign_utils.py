#!/usr/bin/python
import hmac
import base64


def sign(message, secret_key):
    mac = hmac.new(bytes(secret_key, encoding='utf8'), bytes(message, encoding='utf-8'), digestmod='sha256')
    d = mac.digest()
    return str(base64.b64encode(d), 'utf8')


def pre_hash(timestamp, method, request_path):
    return str(timestamp) + str.upper(method) + str(request_path)


def check_none(value, msg=""):
    if not value:
        raise Exception(msg + " Invalid params!")
