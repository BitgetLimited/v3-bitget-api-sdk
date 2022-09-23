package com.bitget.openapi.common.enums;

import lombok.AllArgsConstructor;

/**
 * (Single direction: 1: open much 2: open empty 3: level much 4: level empty )
 *
 * @author jian.li
 * @create 2020-06-02 10:46
 */
@AllArgsConstructor
public enum SideEnum {
    /**
     * open much
     */
    OPEN_LONG("1"),
    /**
     * open empty
     */
    OPEN_SHORT("2"),
    /**
     * level much
     */
    CLOSE_LONG("3"),
    /**
     * level empty
     */
    CLOSE_SHORT("4"),
    ;

    private final String side;

    /**
     * Judge whether it is open position
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
     * Judge whether the position is closed
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
