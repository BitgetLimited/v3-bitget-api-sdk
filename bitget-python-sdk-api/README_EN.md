
# bitget-python-sdk-api
A Python sdk for bitget exchange API

<p align="center">
<a href="https://github.com/BitgetLimited/v3-bitget-api-sdk/blob/master/bitget-python-sdk-api/README.md">中文</a>
</p>

1. api documents： https://bitgetlimited.github.io/apidoc/zh/mix/#25e54147de


2. Download code and version requirements
- python verion 3.6+
- Dependency: requests


3.
- Passphrase is set by the user. It should be noted that after the Passphrase is forgotten, it cannot be retrieved, and the APIKey needs to be recreated
- API Key application please refer to: https://bitgetlimited.github.io/apidoc/zh/swap/#c1ae0a8486
- param use_server_time's value is False if is True will use server timestamp
- param first's value is False if is True will print (url,method,body,headers,status）


PS：The SDK is only for reference, to lower the development threshold, and the related client program code issues need to be debugged locally.