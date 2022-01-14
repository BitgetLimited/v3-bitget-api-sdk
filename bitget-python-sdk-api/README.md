
# bitget-python-sdk-api
A Python sdk for bitget exchange API

<p align="center">
<a href="https://github.com/BitgetLimited/v3-bitget-api-sdk/blob/master/bitget-python-sdk-api/README_EN.md">English</a>
</p>

1. api文档地址： https://bitgetlimited.github.io/apidoc/zh/mix/

2. 下载代码及版本要求
- python版本3.6+
- 依赖: requests


3.
- Passphrase 口令，由用户自己设定,需要注意的是，Passphrase忘记之后是无法找回的，需要重新创建APIKey
- API Key的申请请参考网址: https://bitgetlimited.github.io/apidoc/zh/swap/#c1ae0a8486
- 参数 use_server_time 值默认为false, 如果为true 时, 将使用服务器的时间
- 参数 first 值默认为 false, 如果为true时, 每次请求将会打印 url, method, body, headers, status 等信息


PS：SDK仅为给予参考，降低开发门槛，相关客户端程序代码问题，还需本地调试解决，有帮助不到的地方，望多包涵。