package com.bitget.openapi.test.ws.spot;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.common.utils.DateUtil;
import com.bitget.openapi.dto.request.other.ParamArgs;
import com.bitget.openapi.test.ws.spot.config.SpotWebSocketClient;
import com.bitget.openapi.test.ws.spot.config.SpotWebSocketConfig;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * 需要登录的频道
 * private channel
 *
 * @author hupf
 * @create 2021-08-17 14:44
 **/
public class SpotPrivateChannelTest {
    private static final SpotWebSocketClient webSocketClient = new SpotWebSocketClient();

    @Before
    public void connect() {
        SpotWebSocketConfig.loginConnect(webSocketClient);
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
     * 币币资产
     * Account Channel
     */
    @Test
    public void spotAccountChannel() {
        if (!webSocketClient.getIsConnect()) {
            return;
        }
        //创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("account", "spbl", "default");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(s);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        webSocketClient.unsubscribe(s);
    }

    /**
     * 订单
     * Order Channel
     */
    @Test
    public void orderChannel() {
        //创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("orders", "spbl", "btcusdt_spbl");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(s);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        webSocketClient.unsubscribe(s);
    }

}
