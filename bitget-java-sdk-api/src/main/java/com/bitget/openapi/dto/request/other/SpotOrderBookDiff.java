package com.bitget.openapi.dto.request.other;

import lombok.Data;

import java.util.List;

@Data
//The deeply merged class can synthesize the deeply merged string through the toString method
public class SpotOrderBookDiff {
    private final List<SpotOrderBookItem> asks;
    private final List<SpotOrderBookItem> bids;
    private final String timestamp;
    private final int checksum;

    public SpotOrderBookDiff(List<SpotOrderBookItem> asks, List<SpotOrderBookItem> bids, String timestamp, int checksum) {
        this.asks = asks;
        this.bids = bids;
        this.timestamp = timestamp;
        this.checksum = checksum;
    }

    public boolean isEmpty() {
        return this.bids.isEmpty() && this.asks.isEmpty();
    }


    public List<SpotOrderBookItem> getAsks() {
        return asks;
    }

    public List<SpotOrderBookItem> getBids() {
        return bids;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getChecksum() {
        return checksum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\"instrument_id\":\"");
        sb.append("");
        sb.append("\",\"asks\":[");
        for (int i = 0; i < asks.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(asks.get(i).toString());
        }
        sb.append("],\"bids\":[");
        for (int i = 0; i < bids.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(bids.get(i).toString());
        }
        sb.append("],\"timestamp\":\"");
        sb.append(timestamp);
        sb.append("\",\"checksum\":");
        sb.append(this.checksum);
        sb.append("}");
        return sb.toString();
    }
}
