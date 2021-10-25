package com.bitget.openapi.dto.request.other;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

//原有的深度数据200档
@Data
public class SpotOrderBook {
    /*public static final SpotOrderBook EMPTY =
        new SpotOrderBook("", Collections.emptyList(), Collections.emptyList(), Instant.EPOCH.toString());*/

    private String contract;
    private List<SpotOrderBookItem> asks;
    private List<SpotOrderBookItem> bids;
    private String timestamp;
    private int checksum;
    private OrderBookDiffer differ = new OrderBookDiffer();
    private OrderBookChecksumer checksumer = new OrderBookChecksumer();

    private HashFunction crc32 = Hashing.crc32();

    public SpotOrderBook(List<SpotOrderBookItem> asks, List<SpotOrderBookItem> bids, String timestamp, int checksum) {
        this.asks = asks;
        this.bids = bids;
        this.timestamp = timestamp;
        this.checksum = checksum;
    }

    /*private int checksum() {
        return checksumer.checksum(this.asks, this.bids);
    }*/

    /**
     * 检查合法性 asks 应该不递减，bids 应该不递增
     */
    public boolean check() {
        if (this.bids == null || this.asks == null) {
            return false;
        }

        if (this.bids.size() > 1) {
            final SpotOrderBookItem p = this.bids.get(0);
            for (int i = 1; i < this.bids.size(); i++) {
                if (this.bids.get(i).getPrice().compareTo(p.getPrice()) > 0) {
                    return false;
                }
            }
        }

        if (this.asks.size() > 1) {
            final SpotOrderBookItem p = this.asks.get(0);
            for (int i = 1; i < this.asks.size(); i++) {
                if (this.asks.get(i).getPrice().compareTo(p.getPrice()) < 0) {
                    return false;
                }
            }
        }

        return true;
    }

    //调用这个方法，that为增量的数据，this为老的数据
    public SpotOrderBookDiff diff(SpotOrderBook that) {
        System.out.println("全量数据：" + this.toString());
        System.out.println("增量数据：" + that.toString());
        //深度合并ask
        final List<SpotOrderBookItem> askDiff = this.diff(this.getAsks(), that.getAsks(), Comparator.naturalOrder());
        //深度合并bid
        final List<SpotOrderBookItem> bidDiff = this.diff(this.getBids(), that.getBids(), Comparator.reverseOrder());
        //根据ask和bid创建合并后的对象
        return new SpotOrderBookDiff(askDiff, bidDiff, that.timestamp, that.checksum);
    }

    //深度合并，返回深度合并后的内容current为现有的数据，snapshot为快照增量的数据
    private List<SpotOrderBookItem> diff(final List<SpotOrderBookItem> current, final List<SpotOrderBookItem> snapshot,
                                         final Comparator<String> comparator) {
        return differ.diff(current, snapshot, comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\"instrument_id\":\"");
        sb.append(contract);
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

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public List<SpotOrderBookItem> getAsks() {
        return asks;
    }

    public void setAsks(List<SpotOrderBookItem> asks) {
        this.asks = asks;
    }

    public List<SpotOrderBookItem> getBids() {
        return bids;
    }

    public void setBids(List<SpotOrderBookItem> bids) {
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

    public OrderBookDiffer getDiffer() {
        return differ;
    }

    public void setDiffer(OrderBookDiffer differ) {
        this.differ = differ;
    }

    public OrderBookChecksumer getChecksumer() {
        return checksumer;
    }

    public void setChecksumer(OrderBookChecksumer checksumer) {
        this.checksumer = checksumer;
    }

    public HashFunction getCrc32() {
        return crc32;
    }

    public void setCrc32(HashFunction crc32) {
        this.crc32 = crc32;
    }
}
