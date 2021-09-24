package com.bitget.openapi.ws;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BitgetWsListener extends WebSocketListener {

    ScheduledExecutorService service;
    private BitgetWsClient bitgetWsClient;

    public BitgetWsListener(BitgetWsClient bitgetWsClient) {
        this.bitgetWsClient = bitgetWsClient;
    }

    @Override
    public void onOpen(final WebSocket webSocket, final Response response) {
        //连接成功后，设置定时器，每隔25s，自动向服务器发送心跳，保持与服务器连接
        Runnable runnable = new Runnable() {
            public void run() {
                // task to run goes here
                bitgetWsClient.sendMessage("ping");
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
        onMessage(webSocket, s);
    }

    @Override
    public void onMessage(final WebSocket webSocket, final String message) {

    }

    // 解压函数
    private String uncompress(final byte[] bytes) {
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
}

