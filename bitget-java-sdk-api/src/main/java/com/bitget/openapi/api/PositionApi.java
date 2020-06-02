package com.bitget.openapi.api;

import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.Holds;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

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
    @GET("position/allPosition")
    Call<List<AllPosition>> getAllPosition();

    /**
     * 单个合约持仓信息
     *
     * @return
     */
    @GET("position/<instrument_id>")
    Call<AllPosition> getSinglePosition(@Path("instrument_id") String instrumentId);

    /**
     * 获取合约挂单冻结数量
     *
     * @param instrumentId
     * @return
     */
    @GET("position/<instrument_id>/holds")
    Call<Holds> getHolds(@Path("instrument_id") String instrumentId);
}
