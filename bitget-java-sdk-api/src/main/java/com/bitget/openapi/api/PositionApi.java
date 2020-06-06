package com.bitget.openapi.api;

import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.Holds;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 *
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface PositionApi {
    /**
     * 所有合约持仓信息
     *
     * @return
     */
    @GET("/api/swap/v3/position/allPosition")
    Call<List<AllPosition>> getAllPosition();

    /**
     * 单个合约持仓信息
     * @param symbol 合约code
     * @return
     */
    @GET("/api/swap/v3/position/singlePosition")
    Call<AllPosition> getSinglePosition(@Query("symbol") String symbol);

    /**
     * 获取合约挂单冻结数量
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/position/holds")
    Call<Holds> getHolds(@Query("symbol") String symbol);
}
