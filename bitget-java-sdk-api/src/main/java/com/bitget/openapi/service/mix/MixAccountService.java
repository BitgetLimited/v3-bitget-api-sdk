package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;

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
