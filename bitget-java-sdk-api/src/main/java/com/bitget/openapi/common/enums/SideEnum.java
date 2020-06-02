package com.bitget.openapi.common.enums;

import lombok.AllArgsConstructor;

/**
 * (下单方向： 1:开多 2:开空 3:平多 4:平空 )
 *
 * @author jian.li
 * @create 2020-06-02 10:46
 */
@AllArgsConstructor
public enum SideEnum {
    /**
     * 开多
     */
    OPEN_LONG("1"),
    /**
     * 开空
     */
    OPEN_SHORT("2"),
    /**
     * 平多
     */
    CLOSE_LONG("3"),
    /**
     * 平空
     */
    CLOSE_SHORT("4"),
    ;

    private final String side;

    /**
     * 判断是否为开仓
     *
     * @param side
     * @return
     */
    public static boolean isOpen(String side) {
        if (side.equals(SideEnum.OPEN_LONG.getSide())
                || side.equals(SideEnum.OPEN_SHORT.getSide())) {
            return true;
        }
        return false;

    }

    /**
     * 判断是否为平仓
     *
     * @param side
     * @return
     */
    public static boolean isClose(String side) {
        if (side.equals(SideEnum.CLOSE_LONG.getSide())
                || side.equals(SideEnum.CLOSE_SHORT.getSide())) {
            return true;
        }
        return false;
    }

    public String getSide() {
        return side;
    }
}
