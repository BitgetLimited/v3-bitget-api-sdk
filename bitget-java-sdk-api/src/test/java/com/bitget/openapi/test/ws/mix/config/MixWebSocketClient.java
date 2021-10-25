package com.bitget.openapi.test.ws.mix.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.common.utils.DateUtil;
import com.bitget.openapi.common.utils.SignatureUtils;
import com.bitget.openapi.dto.request.other.*;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import lombok.Data;
import okhttp3.*;
import okio.ByteString;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MixWebSocketClient {
    private static WebSocket webSocket = null;
    private static Boolean flag = false;
    private static Boolean isConnect = false;
    private static String sign;
    private final static HashFunction crc32 = Hashing.crc32();
    private static Map<String, Optional<SpotOrderBook>> bookMap = new HashMap<>();

    public MixWebSocketClient() {
    }

    //与服务器建立连接，参数为服务器的URL
    public static WebSocket connection(final String url) {

        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .build();

        webSocket = client.newWebSocket(request, new WebSocketListener() {
            ScheduledExecutorService service;

            @Override
            public void onOpen(final WebSocket webSocket, final Response response) {
                //连接成功后，设置定时器，每隔25s，自动向服务器发送心跳，保持与服务器连接
                isConnect = true;
                System.out.println(Instant.now().toString() + " Connected to the server success!");
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        // task to run goes here
                        sendMessage("ping");
                    }
                };
                service = Executors.newSingleThreadScheduledExecutor();
                // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
                service.scheduleAtFixedRate(runnable, 25, 25, TimeUnit.SECONDS);
            }

            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                System.out.println("Connection is about to disconnect！");
                webSocket.close(1000, "Long time no message was sent or received！");
                webSocket = null;
            }

            @Override
            public void onClosed(final WebSocket webSocket, final int code, final String reason) {
                System.out.println("Connection dropped！");
            }

            @Override
            public void onFailure(final WebSocket webSocket, final Throwable t, final Response response) {
                System.out.println("Connection failed,Please reconnect!");
                if (Objects.nonNull(service)) {

                    service.shutdown();
                }
            }

            @Override
            public void onMessage(final WebSocket webSocket, final ByteString bytes) {
                final String s = uncompress(bytes.toByteArray());
                System.out.println(DateFormatUtils.format(new Date(), DateUtil.TIME_STYLE_S4) + " Receive: " + s);

                isLogin(s);
            }

            @Override
            public void onMessage(final WebSocket webSocket, final String message) {
                System.out.println(DateFormatUtils.format(new Date(), DateUtil.TIME_STYLE_S4) + " Receive: " + message);
                String s = message;
                if (s.contains("\"channel\":\"books\",")) {// 是深度接口
                    if (s.contains("\"action\":\"snapshot\",")) {// 是第一次的200档，记录下第一次的200档
                        // System.out.println(DateFormatUtils.format(new Date(), DateUtils.TIME_STYLE_S4) + " Receive: " + s);
                        JSONObject rst = JSONObject.parseObject(s);
                        JSONArray dataArr = JSONArray.parseArray(rst.get("data").toString());
                        JSONObject params = JSONObject.parseObject(rst.get("arg").toString());
                        JSONObject data = JSONObject.parseObject(dataArr.get(0).toString());
                        String dataStr = data.toString();
                        Optional<SpotOrderBook> oldBook = parse(dataStr);
                        String instrumentId = params.get("instId").toString();
                        bookMap.put(instrumentId, oldBook);
                    } else if (s.contains("\"action\":\"update\",")) {// 是后续的增量，则需要进行深度合并
                        JSONObject rst = JSONObject.parseObject(s);
                        JSONArray dataArr = JSONArray.parseArray(rst.get("data").toString());
                        JSONObject data = JSONObject.parseObject(dataArr.get(0).toString());
                        JSONObject params = JSONObject.parseObject(rst.get("arg").toString());
                        String dataStr = data.toString();
                        String instId = params.get("instId").toString();
                        Optional<SpotOrderBook> oldBook = bookMap.get(instId);
                        Optional<SpotOrderBook> newBook = parse(dataStr);
                        System.out.println("oldBook.get--------------" + oldBook.get());
                        // oldBook.get()拿到全量的数据
                        SpotOrderBookDiff bookdiff = oldBook.get().diff(newBook.get());
                        System.out.println("名称：" + instId + ",深度合并成功！checknum值为：" + bookdiff.getChecksum() + ",合并后的数据为：" + bookdiff.toString());
                        String str = getStr(bookdiff.getAsks(), bookdiff.getBids());
                        System.out.println("名称：" + instId + ",拆分要校验的字符串：" + str);
                        int checksum = checksum(bookdiff.getAsks(), bookdiff.getBids());
                        System.out.println("名称：" + instId + ",校验的checksum:" + checksum);
                        boolean flag = checksum == bookdiff.getChecksum() ? true : false;
                        if (flag) {
                            System.out.println("名称：" + instId + ",深度校验结果为：" + flag);
                            oldBook = parse(bookdiff.toString());
                            bookMap.put(instId, oldBook);
                        } else {
                            System.out.println("名称：" + instId + ",深度校验结果为：" + flag + "数据有误！请重连！");
                            // 获取订阅的频道和币对
                            String channel = rst.get("channel").toString();
                            String instType = rst.get("instType").toString();
                            String unSubStr = "{\"op\": \"unsubscribe\",\"args\":[{\"channel\":\"" + channel + "\",\"instType\":\"" + instType + "\",\"instId\":\"" + instId + "\"}]}";
                            System.out.println(DateFormatUtils.format(new Date(), DateUtil.TIME_STYLE_S4) + " Send: " + unSubStr);
                            webSocket.send(unSubStr);
                            String subStr = "{\"op\": \"subscribe\",\"args\":[{\"channel\":\"" + channel + "\",\"instType\":\"" + instType + "\",\"instId\":\"" + instId + "\"}]}";
                            System.out.println(DateFormatUtils.format(new Date(), DateUtil.TIME_STYLE_S4) + " Send: " + subStr);
                            webSocket.send(subStr);
                            System.out.println("名称：" + instId + ",正在重新订阅！");
                        }
                    }
                } else {
                    isLogin(message);
                }
            }
        });
        return webSocket;
    }

    // 解压函数
    private static String uncompress(final byte[] bytes) {
        try (final ByteArrayOutputStream out = new ByteArrayOutputStream();
             final ByteArrayInputStream in = new ByteArrayInputStream(bytes);
             final Deflate64CompressorInputStream zin = new Deflate64CompressorInputStream(in)) {
            final byte[] buffer = new byte[1024];
            int offset;
            while (-1 != (offset = zin.read(buffer))) {
                out.write(buffer, 0, offset);
            }
            return out.toString();
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void isLogin(String s) {
        if (null != s && s.contains("login")) {
            JSONObject jsonObject = JSON.parseObject(s);
            if ("0".equalsIgnoreCase(jsonObject.getString("code"))) {
                flag = true;
            }
        }
    }

    //获得sign
    private static String sha256_HMAC(String timeStamp, String secret) {
        String hash = "";
        try {
            hash = SignatureUtils.wsGenerateSign(timeStamp, secret);
        } catch (Exception e) {
            System.out.println("Error HmacSHA256 ===========" + e.getMessage());
        }
        return hash;
    }


    //登录
    public static void login(String apiKey, String passPhrase, String secretKey) {
        String timestamp = Long.valueOf(Instant.now().getEpochSecond()).toString();
        sign = sha256_HMAC(timestamp, secretKey);
        String msgId = String.valueOf(System.currentTimeMillis());
        LoginArgs loginArgs = new LoginArgs(apiKey, passPhrase, timestamp, sign);
        String str = "{\"msgId\"" + ":" + "\"" + msgId + "\"" + "," + "\"op\"" + ":" + "\"login\"" + "," + "\"args\"" + ":" + "[" + JSON.toJSONString(loginArgs) + "]}";
        sendMessage(str);
    }


    //订阅，参数为频道组成的集合
    public static void subscribe(String s) {
        String msgId = String.valueOf(System.currentTimeMillis());
        String str = "{\"msgId\"" + ":" + "\"" + msgId + "\"" + "," + "\"op\": \"subscribe\"" + "," + "\"args\"" + ":" + "[" + s + "]}";
        if (null != webSocket)
            sendMessage(str);
    }

    //取消订阅，参数为频道组成的集合
    public static void unsubscribe(String s) {
        String msgId = String.valueOf(System.currentTimeMillis());
        String str = "{\"msgId\"" + ":" + "\"" + msgId + "\"" + "," + "\"op\": \"unsubscribe\"" + "," + "\"args\"" + ":" + "[" + s + "]}";
        if (null != webSocket)
            sendMessage(str);
    }

    private static void sendMessage(String str) {
        if (null != webSocket) {
            try {
                Thread.sleep(1300);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (str.contains("account") || str.contains("orders")) {
                if (!flag) {
                    System.out.println("Channels contain channels that require login privileges to operate. Please login and operate again！");
                    return;
                }
            }
            System.out.println("Send a message to the server:" + str);
            webSocket.send(str);
        } else {
            System.out.println("Please establish the connection before you operate it！");
        }
    }

    //断开连接
    public static void closeConnection() {
        if (null != webSocket) {
            webSocket.close(1000, "User actively closes the connection");
        } else {
            System.out.println("Please establish the connection before you operate it！");
        }
    }

    public boolean getIsLogin() {
        return flag;
    }

    public boolean getIsConnect() {
        return isConnect;
    }

    public static <T extends OrderBookItem> int checksum(List<T> asks, List<T> bids) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            if (i < bids.size()) {
                s.append(bids.get(i).getPrice().toString());
                s.append(":");
                s.append(bids.get(i).getSize());
                s.append(":");
            }
            if (i < asks.size()) {
                s.append(asks.get(i).getPrice().toString());
                s.append(":");
                s.append(asks.get(i).getSize());
                s.append(":");
            }
        }
        final String str;
        if (s.length() > 0) {
            str = s.substring(0, s.length() - 1);
        } else {
            str = "";
        }
        return crc32.hashString(str, StandardCharsets.UTF_8).asInt();
    }

    private static <T extends OrderBookItem> String getStr(List<T> asks, List<T> bids) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            if (i < bids.size()) {
                s.append(bids.get(i).getPrice().toString());
                s.append(":");
                s.append(bids.get(i).getSize());
                s.append(":");
            }
            if (i < asks.size()) {
                s.append(asks.get(i).getPrice().toString());
                s.append(":");
                s.append(asks.get(i).getSize());
                s.append(":");
            }
        }
        final String str;
        if (s.length() > 0) {
            str = s.substring(0, s.length() - 1);
        } else {
            str = "";
        }
        return str;
    }

    public static Optional<SpotOrderBook> parse(String json) {

        try {
            OrderBookData data = JSON.parseObject(json, OrderBookData.class);
            List<SpotOrderBookItem> asks = data.getAsks().stream().map(x -> new SpotOrderBookItem(new String(x.get(0)), x.get(1))).collect(Collectors.toList());

            List<SpotOrderBookItem> bids = data.getBids().stream().map(x -> new SpotOrderBookItem(new String(x.get(0)), x.get(1))).collect(Collectors.toList());

            return Optional.of(new SpotOrderBook(asks, bids, data.getTimestamp(), data.getChecksum()));
        } catch (Exception e) {
            return Optional.empty();
        }


    }

    @Data
    static class OrderBookData {
        private List<List<String>> asks;
        private List<List<String>> bids;
        private String timestamp;
        private int checksum;


        public List<List<String>> getAsks() {
            return asks;
        }

        public void setAsks(List<List<String>> asks) {
            this.asks = asks;
        }

        public List<List<String>> getBids() {
            return bids;
        }

        public void setBids(List<List<String>> bids) {
            this.bids = bids;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public int getChecksum() {
            return checksum;
        }

        public void setChecksum(int checksum) {
            this.checksum = checksum;
        }
    }
}
