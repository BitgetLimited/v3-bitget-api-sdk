package com.bitget.openapi.ws;

@FunctionalInterface
public interface SubscriptionListener {
    void onReceive(String data);
}
