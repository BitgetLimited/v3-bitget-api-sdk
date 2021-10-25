package com.bitget.openapi.dto.request.other;

public interface OrderBookItem<T> {
    String getPrice();

    T getSize();
}
