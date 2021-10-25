package com.bitget.openapi.test.ws.swap;

import com.bitget.openapi.test.ws.swap.config.WebSocketClient;
import com.bitget.openapi.test.ws.swap.config.WebSocketConfig;
import org.apache.commons.compress.utils.Lists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.util.ArrayList;

/**
 * 需要登录的频道
 */
public class PrivateChannelTest {

    private static final WebSocketClient webSocketClient = new WebSocketClient();

    @Before
    public void connect() {
        WebSocketConfig.loginConnect(webSocketClient);
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
        System.out.println(Instant.now().toString() + " close connect!");
        WebSocketClient.closeConnection();
    }

    /**
     * 用户持仓频道
     * Position Channel
     */
    @Test
    public void positionChannel() {
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/position:btcusd");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //订阅
        WebSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用户账户频道
     * Account Channel
     */
    @Test
    public void accountChannel() {
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/account:btcusd");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //订阅
        WebSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用户交易频道
     * Order Channel
     */
    @Test
    public void orderChannel() {
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/order:btcusd");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //订阅
        WebSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用户当前计划委托频道
     */
    @Test
    public void currentPlanChannel() {
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/current_plans:btcusd");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //订阅
        WebSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用户历史计划委托频道
     */
    @Test
    public void historyPlanChannel() {
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/history_plans:btcusd");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //订阅
        WebSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //取消订阅
    @Test
    public void unsubscribeChannel() {
        ArrayList<String> channel = Lists.newArrayList();
        //比如用户持仓拼哒
        channel.add("swap/position:btcusd");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //取消订阅
        WebSocketClient.unsubscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
