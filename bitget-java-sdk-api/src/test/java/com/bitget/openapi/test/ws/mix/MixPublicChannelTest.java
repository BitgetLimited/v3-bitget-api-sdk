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
 * 公共频道 public channel
 */
public class MixPublicChannelTest {

    private static final MixWebSocketClient webSocketClient = new MixWebSocketClient();

    @Before
    public void connect() {
        MixWebSocketConfig.publicConnect(webSocketClient);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void close() {
        System.out.println(DateFormatUtils.format(new Date(), DateUtil.TIME_STYLE_S4) + " close connect!");
        webSocketClient.closeConnection();
    }

    /**
     * 行情频道 Ticker Channel
     */
    @Test
    public void tickerChannel() {
        ParamArgs paramArgs = new ParamArgs("ticker", "mc", "btcusdt");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * k线频道 Kline Channel
     */
    @Test
    public void klineChannel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("candle1m", "mc", "btcusdt");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 成交频道 Trade Channel
     */
    @Test
    public void tradeChannel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("trade", "mc", "BTCUSDT");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 5档深度 books5 Channel
     */
    @Test
    public void books5Channel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("books5", "mc", "BTCUSDT");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 15档深度 books15 Channel
     */
    @Test
    public void books15Channel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("books15", "mc", "BTCUSDT");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 全量深度频道 books Channel
     */
    @Test
    public void allBooksChannel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("books", "mc", "BTCUSDT");
        String s = JSON.toJSONString(paramArgs);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
