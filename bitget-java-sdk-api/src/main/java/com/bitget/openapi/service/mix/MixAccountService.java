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

    ResponseResult leverage(MixChangeLeverageReq mixChangeLeverageReq) throws IOException;

    ResponseResult margin(MixAdjustMarginFixReq mixAdjustMarginFixReq) throws IOException;

    ResponseResult marginMode(AdjustMarginModeReq adjustMarginModeReq) throws IOException;

    ResponseResult positionMode(AdjustHoldModeReq adjustHoldModeReq) throws IOException;

    ResponseResult openCount(MixOpenCountReq mixOpenCountReq) throws IOException;
}
