package com.bitget.openapi.ws;

import com.bitget.openapi.dto.request.ws.SubscribeReq;
import com.bitget.openapi.dto.request.ws.WsBaseReq;

import java.util.List;

public interface BitgetWsClient {

    void sendMessage(WsBaseReq<?> req);

    void sendMessage(String message);

    void unsubscribe(List<SubscribeReq> str);

    void subscribe(List<SubscribeReq> list);

    void subscribe(List<SubscribeReq> list, SubscriptionListener listener);

    void login();
}
