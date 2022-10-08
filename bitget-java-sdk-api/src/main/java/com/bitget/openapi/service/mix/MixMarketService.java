package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;
import java.util.List;

public interface MixMarketService {

    ResponseResult contracts(String productType) throws IOException;

    ResponseResult depth(String symbol,int limit) throws IOException;

    ResponseResult ticker(String symbol) throws IOException;

    ResponseResult tickers(String productType) throws IOException;

    ResponseResult fills(String symbol,int limit) throws IOException;

    List<Object[]> candles(String symbol, String granularity, String startTime, String endTime) throws IOException;

    ResponseResult index(String symbol) throws IOException;

    ResponseResult fundingTime(String symbol) throws IOException;

    ResponseResult historyFundRate(String symbol, int pageSize, int pageNo, boolean nextPage) throws IOException;

    ResponseResult currentFundRate(String symbol) throws IOException;

    ResponseResult openInterest(String symbol) throws IOException;

    ResponseResult markPrice(String symbol) throws IOException;


}
