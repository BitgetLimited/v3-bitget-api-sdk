package com.bitget.openapi.enums;

/**
 * ( Match Type )
 *
 * @author jian.li
 * @create 2020-06-02 10:51
 */
public enum MatchTypeEnum {
    LIMIT("0", "限价"),
    MARKET("1", "市价"),
    ;


    private String code;

    private String value;

    private MatchTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static OrderTypeEnum toOrderTypeEnum(String match_price) {
        MatchTypeEnum matchType = MatchTypeEnum.toEnum(match_price);
        return matchType.equals(MatchTypeEnum.LIMIT) ? OrderTypeEnum.LIMIT : OrderTypeEnum.MARKET;
    }

    public static MatchTypeEnum toEnum(String code) {
        for (MatchTypeEnum ver : MatchTypeEnum.values()) {
            if (ver.getCode().equals(code)) {
                return ver;
            }
        }
        StringBuilder str = new StringBuilder();
        str.append("the argument of ").append(code).append(" have no correspondence MatchTypeEnum enum!");
        throw new IllegalArgumentException(str.toString());
    }

    public static MatchTypeEnum of(String value) {
        for (MatchTypeEnum ver : MatchTypeEnum.values()) {
            if (ver.getValue().equals(value)) {
                return ver;
            }
        }
        StringBuilder str = new StringBuilder();
        str.append("the argument of ").append(value).append(" have no correspondence MatchTypeEnum enum!");
        throw new IllegalArgumentException(str.toString());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
