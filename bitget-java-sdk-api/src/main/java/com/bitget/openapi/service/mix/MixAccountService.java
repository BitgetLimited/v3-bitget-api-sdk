package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.mix.ApiBalanceResult;
import com.bitget.openapi.dto.response.mix.ChangeHoldModeResult;
import com.bitget.openapi.dto.response.mix.ChangeLeverageResult;
import com.bitget.openapi.dto.response.mix.MixCommonResult;

import java.io.IOException;

public interface MixAccountService {

    /**
     * 单个合约账户信息
     * @param symbol
     * @return
     * @throws IOException
     */
    ResponseResult getAccount(String symbol, String marginCoin) throws IOException;

    ResponseResult getAccounts(String productType) throws IOException;

    ResponseResult leverage(MixChangeLeverageRequest mixChangeLeverageRequest) throws IOException;

    ResponseResult margin(MixAdjustMarginFixRequest mixAdjustMarginFixRequest) throws IOException;

    ResponseResult marginMode(AdjustMarginModeRequest adjustMarginModeRequest) throws IOException;

    ResponseResult positionMode(AdjustHoldModeRequest adjustHoldModeRequest) throws IOException;

    ResponseResult openCount(MixOpenCountRequest mixOpenCountRequest) throws IOException;
}
