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
 * 公共频道 public channel
 *
 * @author hupf
 * @create 2019-06-12 14:45
 **/
public class SpotPublicChannelTest {

    private static final SpotWebSocketClient webSocketClient = new SpotWebSocketClient();

    @Before
    public void connect() {
        SpotWebSocketConfig.publicConnect(webSocketClient);
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
    public void tickerChannel() throws InterruptedException {
        ParamArgs paramArgs = new ParamArgs("ticker", "sp", "btcusdt");
        ParamArgs paramArgs1 = new ParamArgs("ticker", "sp", "ethusdt");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String param = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(param);
        Thread.sleep(10);
        List<ParamArgs> paramArgsList1 = Lists.newArrayList(paramArgs1);
        String param1 = JSON.toJSONString(paramArgsList1);
        webSocketClient.subscribe(param1);
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
        ParamArgs paramArgs = new ParamArgs("candle1m", "sp", "btcusdt");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
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
        ParamArgs paramArgs = new ParamArgs("trade", "sp", "BTCUSDT");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        webSocketClient.unsubscribe(s);
    }

    /**
     * 5档深度 books5 Channel
     */
    @Test
    public void Books5Channel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("books5", "sp", "BTCUSDT");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        webSocketClient.unsubscribe(s);
    }

    /**
     * 15档深度 books15 Channel
     */
    @Test
    public void books15Channel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("books15", "sp", "BTCUSDT");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        webSocketClient.unsubscribe(s);
    }

    /**
     * 全量深度频道 books Channel
     */
    @Test
    public void allBooksChannel() {
        // 创建一个list集合，添加要订阅的频道名称
        ParamArgs paramArgs = new ParamArgs("books", "sp", "BTCUSDT");
        List<ParamArgs> paramArgsList = Lists.newArrayList(paramArgs);
        String s = JSON.toJSONString(paramArgsList);
        webSocketClient.subscribe(s);
        // 为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        webSocketClient.unsubscribe(s);
    }

}
