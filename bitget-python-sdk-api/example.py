import bitget.swap_api as swap
import bitget.option_api as option
import json


if __name__ == '__main__':
    api_key = ""
    secret_key = ""
    passphrase = ""  #口令


    ##合约行情接口
    # swapAPI = swap.SwapAPI(api_key, secret_key, passphrase,use_server_time=True,first= False)
    #  HTTP请求 获取所有合约的信息 20/s
    # result = swapAPI.get_contracts_info()
    # print(result)

    # # 获取深度数据 （20次/2s）
    # #  cmt_btcsusdt ethusd
    # result = swapAPI.get_depth('cmt_btcsusdt', '8', '')
    # print(result)


    # #  获取全部tickers信息 （20次/2s）
    # result = swapAPI.get_tickers()
    # print(result)

    #  获取某个ticker信息 （20次/2s）
    # result = swapAPI.get_specific_ticker('cmt_bchusdt')
    # print(result)


    #  获取成交数据 （20次/2s）
    # result = swapAPI.get_trades('cmt_bchusdt','2')
    # print(result)


    # 获取K线数据 （20次/2s）
    # result = swapAPI.get_kline(symbol='cmt_btcusdt', start='2020-07-24T14:24:44.614Z',end='2020-07-24T14:49:44.614Z',granularity='60')
    # print(result)

    ##  获取（币种）指数信息 （20次/2s）
    # result = swapAPI.get_index('cmt_bchusdt')
    # print(result)



    #  获取平台总持仓量 （20次/2s）
    # result = swapAPI.get_holds('cmt_bchusdt')
    # print(result)


    ##   获取合约最高限价和最低限价 （20次/2s）
    # result = swapAPI.get_limit('cmt_bchusdt')
    # print(result)


    ##  获取合约下一次结算时间
    # result = swapAPI.get_funding_time('cmt_btcusdt')
    # print(result)

    #  获取合约历史资金费率 （20次/2s）
    # result = swapAPI.get_historical_funding_rate('cmt_btcusdt','1','5','20')
    # print(result)


    #  获取合约标记价格 （20次/2s）
    # result = swapAPI.get_mark_price('cmt_btcusdt')
    # print(result)

    ##  获取可开张数
    ## symbol amount openPrice leverage
    # result = swapAPI.get_open_count('cmt_btcusdt',123456783.123,22338.12,20)
    # print(result)





    ##  合约账户接口 ##

    #   查询所有合约账户信息
    # result = swapAPI.get_accounts()
    # print(result)

    #  单个合约账户信息
    # result = swapAPI.get_account('cmt_btcusdt')
    # print(result)


    # 获取某个合约的用户配置 （5次/2s）
    # result = swapAPI.get_settings('cmt_btcusdt')
    # print(result)

    #  调整杠杆 （5次/1s）
    # result = swapAPI.set_leverage(symbol='cmt_btcusdt',leverage=2,side=1)
    # print(result)


    # 调整保证金 20次/2s
    # result = swapAPI.adjust_margin(symbol='cmt_btcusdt',amount="6",positionType=1,type=1)
    # print(result)

    #  自动追加保证金 5次/s
    # result = swapAPI.modify_autoappend_margin(symbol="cmt_btcusdt",side=1,append_type=1)
    # print(result)

    #  获取全部合约仓位信息 10次/s
    # result = swapAPI.get_all_position()
    # print(result)


    #  获取单个合约仓位信息 10次/s
    # result = swapAPI.get_single_position("cmt_btcusdt")
    # print(result)


    #  获取合约挂单冻结数量 10次/s
    # result = swapAPI.get_frozen_contract("cmt_btcusdt")
    # print(result)




    # 合约交易API
    optionAPI = option.OptionAPI(api_key, secret_key, passphrase,use_server_time=True,first=True)
    # 下单 （20次/s）
    # result = optionAPI.take_order('cmt_btcusdt', '20200721113332232334422', '1', '2','0','0','8888.99')
    # print(result)

    # 批量下单 （20次/2s）
    # result = optionAPI.take_orders(symbol='cmt_btcusdt',order_data='[{"price":5,"size":2,"type":1,"match_price":1,"order_type":1,"client_oid":"abc"}]')
    # print(result)


    #  撤单 （20次/s）
    # result = optionAPI.revoke_order('cmt_btcusdt', 'xxxxyyyx20200721')
    # print(result)

    # 批量撤单 （20次/2s）
    # result = optionAPI.revoke_orders('cmt_btcusdt', ids=["525946425993854915","525946425993854916"])
    # print(result)

    # 获取单个订单状态 （40次/2s）
    # result = optionAPI.get_order_info('cmt_btcusdt', 'xxxxyyyx20200721')
    # print(result)


    #获取订单列表 （10次/2s）
    # result = optionAPI.get_order_list('cmt_btcusd', 1,10,100,1)
    # print(result)



    #  获取成交明细 （10次/2s）
    # result = optionAPI.get_fills(symbol='cmt_btcusdt',orderId="525946425993854915")
    # print(result)


    # 计划委托下单  size,type,side,match_type,execute_price,trigger_price
    # result = optionAPI.take_plan_order(type=1,symbol='cmt_btcusdt',size=10,side=1,match_type=1,execute_price='10000',trigger_price='10001')
    # print(result)



    # #  计划委托撤单
    # result = optionAPI.take_cancel_plan(symbol='cmt_btcusdt',orderId='670504923107950528')
    # print(result)


    #  查询当前计划委托
    # result = optionAPI.get_currentPlan(symbol="cmt_btcusdt",side=1,pageIndex=1,pageSize=5)
    # print(result)


    # 查询计划历史委托
    # result = optionAPI.get_historyPlan(symbol="cmt_btcusdt",side=1,pageIndex=1,pageSize=5)
    # print(result)



