package com.bitget.contract.openapi.api;

import com.bitget.contract.openapi.dto.response.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface MarketApi {
    /**
     * 获取服务端时间
     *
     * @return
     */
    @GET("market/time")
    Call<ServerTime> getTime();

    /**
     * 获取合约信息
     *
     * @return
     */
    @GET("market/instruments")
    Call<List<ContractInfo>> getContractsApi();


    /**
     * 获取深度数据
     *
     * @param instrumentId
     * @param limit
     * @return
     */
    @GET("market/instruments/{instrument_id}/depth")
    Call<Depth> getDepthApi(@Path("instrument_id") String instrumentId, @Query("limit") String limit);

    /**
     * 获取全部ticker信息
     *
     * @return
     */
    @GET("market/instruments/ticker")
    Call<List<Ticker>> getTickersApi();

    /**
     * 获取某个ticker信息
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/ticker")
    Call<Ticker> getInstrumentTicker(@Path("instrument_id") String instrumentId);

    /**
     * 获取成交数据
     *
     * @param instrumentId
     * @param limit
     * @return
     */
    @GET("market/instruments/{instrument_id}/trades")
    Call<List<Trades>> getInstrumentTrades(@Path("instrument_id") String instrumentId, @Query("limit") String limit);


    /**
     * 获取K线数据
     *
     * @param instrumentId
     * @param start
     * @param end
     * @param granularity
     * @return
     */
    @GET("market/instruments/{instrument_id}/candles")
    Call<List<Object[]>> getInstrumentCandles(@Path("instrument_id") String instrumentId, @Query("start") String start,
                                              @Query("end") String end, @Query("granularity") String granularity);

    /**
     * 获取指数信息
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/index")
    Call<Index> getInstrumentIndex(@Path("instrument_id") String instrumentId);

    /**
     * 获取平台总持仓量
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/open_interest")
    Call<OpenInterest> getOpenInterestApi(@Path("instrument_id") String instrumentId);

    /**
     * 获取合约最高限价和最低限价
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/price_limit")
    Call<PriceLimit> getPriceLimitApi(@Path("instrument_id") String instrumentId);

    /**
     * 获取合约下一次结算时间
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/funding_time")
    Call<FundingTime> getFundingTimeApi(@Path("instrument_id") String instrumentId);

    /**
     * 获取合约历史资金费率
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/historical_funding_rate")
    Call<HistoricalFundingRate> getHistoricalFundingRateApi(@Path("instrument_id") String instrumentId);

    /**
     * 获取合约标记价格
     *
     * @param instrumentId
     * @return
     */
    @GET("market/instruments/{instrument_id}/mark_price")
    Call<MarkPrice> getMarkPriceApi(@Path("instrument_id") String instrumentId);

    /**
     * 可开张数
     *
     * @param instrumentId 合约code
     * @param amount       用于开仓的总的金额
     * @param leverage     杠杆，默认以20计算
     * @param openPrice    开仓价格
     * @return
     */
    @POST("market/open-count")
    Call<String> calOpenCount(@Query("instrumentId") String instrumentId, @Query("amount") String amount, @Query("leverage") String leverage, @Query("openPrice") String openPrice);

}
