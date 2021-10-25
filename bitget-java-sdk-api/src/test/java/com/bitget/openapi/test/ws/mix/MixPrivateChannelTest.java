package com.bitget.openapi.test.ws.mix;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.common.utils.DateUtil;
import com.bitget.openapi.dto.request.other.ParamArgs;
import com.bitget.openapi.test.ws.mix.config.MixWebSocketClient;
import com.bitget.openapi.test.ws.mix.config.MixWebSocketConfig;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * 需要登录的频道
 * private channel
 *
 * @author hupf
 * @create 2021-08-30 14:44
 **/
public class MixPrivateChannelTest {
    private static final MixWebSocketClient webSocketClient = new MixWebSocketClient();

    @Before
    public void connect() {
        MixWebSocketConfig.loginConnect(webSocketClient);
        while (true) {
            if (webSocketClient.getIsLogin()) {
                return;
            } else {
                try {
                    Thread.sleep(200);
                } catch (final Exception e) {
                    e.printStackTrace();
                }
                if (!webSocketClient.getIsConnect()) {
                    return;
                }
            }
        }

    }

    @After
    public void close() {
        System.out.println(DateFormatUtils.format(new Date(), DateUtil.TIME_STYLE_S4) + " close connect!");
        webSocketClient.closeConnection();
    }


    /**
     * 混合合约资产
     * Account Channel
     */
    @Test
    public void accountChannel() {
        if (!webSocketClient.getIsConnect()) {
            return;
        }
        //创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("account", "umcbl", "default");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(1000 * 60 * 2);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 混合合约仓位
     * positions Channel
     */
    @Test
    public void positionsChannel() {
        if (!webSocketClient.getIsConnect()) {
            return;
        }
        ParamArgs paramArgs = new ParamArgs("positions", "umcbl", "default");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(1000 * 10000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 订单
     * Order Channel
     */
    @Test
    public void orderChannel() {
        //创建一个list集合，添加要订阅的频道名称
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ParamArgs paramArgs = new ParamArgs("orders", "umcbl", "btcusdt_dmcbl");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
