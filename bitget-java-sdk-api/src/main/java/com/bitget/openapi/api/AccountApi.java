package com.bitget.openapi.api;

import com.bitget.openapi.dto.request.AdjustMarginReq;
import com.bitget.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.openapi.dto.request.ChangeLeverageReq;
import com.bitget.openapi.dto.request.LedgerReq;
import com.bitget.openapi.dto.response.*;
import retrofit2.Call;
import retrofit2.http.*;

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
    @GET("account")
    Call<AccountInfo> getAccount(@Query("symbol") String symbol);

    /**
     * 获取单个合约的用户配置
     *
     * @param symbol
     * @return
     */
    @GET("account/settings")
    Call<AccountSetting> settings(@Query("symbol") String symbol);

    /**
     * 调整杠杆
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("account/leverage")
    Call<ChangeLeverageResult> leverage(@Query("symbol") String symbol, @Body ChangeLeverageReq body);

    /**
     * 列出主账户资产流水
     *
     * @param symbol
     * @param body
     * @return
     */
    @GET("account/ledger")
    Call<List<LedgerResult>> getLedger(@Query("symbol") String symbol, @Body LedgerReq body);

    /**
     * 列出保证金账户资产流水
     *
     * @param symbol
     * @param body
     * @return
     */
    @GET("account/ledgerMargin")
    Call<List<LedgerResult>> ledgerMargin(@Query("symbol") String symbol, @Body LedgerReq body);


    /**
     * 调整保证金
     * @param symbol
     * @param body
     * @return
     */
    @POST("account/adjustMargin")
    Call<AdjustMarginResult> adjustMargin(@Query("symbol")String symbol, @Body AdjustMarginReq body);
    /**
     * 自动追加保证金
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("account/modifyAutoAppendMargin")
    Call<AutoAppendMarginResult> modifyAutoAppendMargin(@Query("symbol") String symbol, @Body AutoAppendMarginReq body);


}
