import bitget.spot.wallet_api as wallet
import json

if __name__ == '__main__':
    api_key = ""
    secret_key = ""
    passphrase = ""  # Password

    walletApi = wallet.WalletApi(api_key, secret_key, passphrase, use_server_time=False, first=False)

#    result = walletApi.transfer(fromType='spot', toType='mix_usdt', amount='20', coin='USDT')
#    print(result)

#    result = walletApi.depositAddress(coin='USDT', chain='TRC20')
#    print(result)

#    result = walletApi.withdrawal(coin='USDT', address='xx', chain='TRC20', amount='20', remark='', clientOid='abc123',tag='tag or memo')
#    print(result)

#    result = walletApi.withdrawalInner(coin='USDT', toUid='another uid', amount='20', clientOid='abc123')
#    print(result)

#    result = walletApi.withdrawalList(coin='USDT', startTime='1', endTime='2', pageNo='1', pageSize='20')
#    print(result)

    result = walletApi.depositList(coin='USDT', startTime='1653998947000', endTime='1685534947908', pageNo='1', pageSize='20')
    print(result)
