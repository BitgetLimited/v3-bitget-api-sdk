package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract account service
 */
public interface MixAccountService {

    /**
     * Get account  information
     * @param symbol
     * @param marginCoin
     * @return ResponseResult
     */
    ResponseResult getAccount(String symbol, String marginCoin) throws IOException;

    /**
     * Get account  information list
     * @param productType
     * @return ResponseResult
     */
    ResponseResult getAccounts(String productType) throws IOException;

    /**
     * set lever
     * @param mixChangeLeverageReq
     * @return ResponseResult
     */
    ResponseResult leverage(MixChangeLeverageReq mixChangeLeverageReq) throws IOException;

    /**
     * Adjustment margin
     * @param mixAdjustMarginFixReq
     * @return ResponseResult
     */
    ResponseResult margin(MixAdjustMarginFixReq mixAdjustMarginFixReq) throws IOException;

    /**
     * Adjust margin mode
     * @param adjustMarginModeReq
     * @return ResponseResult
     */
    ResponseResult marginMode(AdjustMarginModeReq adjustMarginModeReq) throws IOException;

    /**
     * Adjust hold mode
     * @param adjustHoldModeReq
     * @return ResponseResult
     */
    ResponseResult positionMode(AdjustHoldModeReq adjustHoldModeReq) throws IOException;

    /**
     * Get the openable quantity
     * @param mixOpenCountReq
     * @return ResponseResult
     */
    ResponseResult openCount(MixOpenCountReq mixOpenCountReq) throws IOException;
}
