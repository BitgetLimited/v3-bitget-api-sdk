package com.bitget.openapi.dto.request.other;

import lombok.Data;

@Data
public class SpotOrderBookItem implements OrderBookItem<String> {
    private final String price;
    private final String size;

    public SpotOrderBookItem(String price, String size) {
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "[\"" + price.toString() + "\",\"" + size + "\"]";
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public String getSize() {
        return size;
    }

}
