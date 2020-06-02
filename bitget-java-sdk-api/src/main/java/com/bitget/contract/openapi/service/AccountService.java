package com.bitget.contract.openapi.service;


import com.bitget.contract.openapi.dto.request.AdjustMarginReq;
import com.bitget.contract.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.contract.openapi.dto.request.ChangeLeverageReq;
import com.bitget.contract.openapi.dto.request.LedgerReq;
import com.bitget.contract.openapi.dto.response.*;

import java.io.IOException;
import java.util.List;

/**
 * 持仓服务
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface AccountService {
    /**
     * 查询所有合约账户信息
     * @return
     * @throws IOException
     */
     List<AccountInfo> accounts() throws IOException;

    /**
     * 单个合约账户信息
     * @param instrumentId
     * @return
     * @throws IOException
     */
    AccountInfo getAccount(String instrumentId) throws IOException;

    /**
     * 获取单个合约的用户配置
     * @param instrumentId
     * @return
     * @throws IOException
     */
    AccountSetting settings(String instrumentId) throws IOException;

    /**
     * 调整杠杆
     * @param instrumentId
     * @param changeLeverageReq
     * @return
     * @throws IOException
     */
    ChangeLeverageResult leverage(String instrumentId, ChangeLeverageReq changeLeverageReq) throws IOException;

    /**
     * 列出主账户资产流水
     * @param instrumentId
     * @param ledgerReq
     * @return
     * @throws IOException
     */
    List<LedgerResult> getLedger(String instrumentId, LedgerReq ledgerReq) throws IOException;

    /**
     * 列出保证金账户资产流水
     * @param instrumentId
     * @param ledgerReq
     * @return
     * @throws IOException
     */
    List<LedgerResult> ledgerMargin(String instrumentId, LedgerReq ledgerReq) throws IOException;

    /**
     * 调整保证金
     * @param instrumentId
     * @param adjustMarginReq
     * @return
     * @throws IOException
     */
    AdjustMarginResult  adjustMargin(String instrumentId, AdjustMarginReq adjustMarginReq)throws  IOException;
    /**
     * 列出保证金账户资产流水
     * @param instrumentId
     * @param autoAppendMarginReq
     * @return
     * @throws IOException
     */
    AutoAppendMarginResult modifyAutoAppendMargin(String instrumentId, AutoAppendMarginReq autoAppendMarginReq) throws IOException;
}
