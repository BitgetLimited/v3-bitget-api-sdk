package com.bitget.openapi.common.enums.spot;

public enum AccountTypeEnum {

    EXCHANGE("EXCHANGE","现货账户"),
    OTC_SGD("OTC_SGD","OTC账户"),
    USD_MIX("USD_MIX","混合合约账户"),
    USDT_MIX("USDT_MIX","USDT专业合约账户"),
    CONTRACT("CONTRACT","合约账户");


    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    AccountTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
