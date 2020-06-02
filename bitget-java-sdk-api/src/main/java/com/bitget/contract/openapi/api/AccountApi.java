package com.bitget.contract.openapi.api;

import com.bitget.contract.openapi.dto.request.AdjustMarginReq;
import com.bitget.contract.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.contract.openapi.dto.request.ChangeLeverageReq;
import com.bitget.contract.openapi.dto.request.LedgerReq;
import com.bitget.contract.openapi.dto.response.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2020-05-25
 */
public interface AccountApi {
    /**
     * 查询所有合约账户信息
     *
     * @return
     */
    @GET("account/accounts")
    Call<List<AccountInfo>> accounts();

    /**
     * 单个合约账户信息
     *
     * @return
     */
    @GET("account/{instrumentId}")
    Call<AccountInfo> getAccount(@Path("instrument_id") String instrumentId);

    /**
     * 获取单个合约的用户配置
     *
     * @param instrumentId
     * @return
     */
    @GET("account/{instrument_id}/settings")
    Call<AccountSetting> settings(@Path("instrument_id") String instrumentId);

    /**
     * 调整杠杆
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @POST("account/{instrument_id}/leverage")
    Call<ChangeLeverageResult> leverage(@Path("instrument_id") String instrumentId, @Body ChangeLeverageReq body);

    /**
     * 列出主账户资产流水
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @GET("account/{instrument_id}/ledger")
    Call<List<LedgerResult>> getLedger(@Path("instrument_id") String instrumentId, @Body LedgerReq body);

    /**
     * 列出保证金账户资产流水
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @GET("account/{instrument_id}/ledgerMargin")
    Call<List<LedgerResult>> ledgerMargin(@Path("instrument_id") String instrumentId, @Body LedgerReq body);


    /**
     * 调整保证金
     * @param instrumentId
     * @param body
     * @return
     */
    @POST("account/{instrument_id}/adjustMargin")
    Call<AdjustMarginResult> adjustMargin(@Path("instrument_id")String instrumentId, @Body AdjustMarginReq body);
    /**
     * 自动追加保证金
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @POST("account/{instrument_id}/modifyAutoAppendMargin")
    Call<AutoAppendMarginResult> modifyAutoAppendMargin(@Path("instrument_id") String instrumentId, @Body AutoAppendMarginReq body);


}
