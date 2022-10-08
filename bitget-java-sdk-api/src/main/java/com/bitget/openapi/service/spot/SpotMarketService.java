package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

public interface SpotMarketService {

    ResponseResult fills(String symbol,Integer limit) throws IOException;

    ResponseResult depth(String symbol,Integer limit,String type) throws IOException;

    ResponseResult ticker(String symbol) throws IOException;

    ResponseResult tickers() throws IOException;

    ResponseResult candles(String symbol,String period,String after,String before,Integer limit) throws IOException;
}
