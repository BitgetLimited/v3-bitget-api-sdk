# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from bitget.apis.tag_to_api import tag_to_api

import enum


class TagValues(str, enum.Enum):
    MARGIN_CROSS_ACCOUNT = "margin_cross_account"
    MARGIN_CROSS_BORROW = "margin_cross_borrow"
    MARGIN_CROSS_FINFLOW = "margin_cross_finflow"
    MARGIN_CROSS_INTEREST = "margin_cross_interest"
    MARGIN_CROSS_LIQUIDATION = "margin_cross_liquidation"
    MARGIN_CROSS_ORDER = "margin_cross_order"
    MARGIN_CROSS_PUBLIC = "margin_cross_public"
    MARGIN_CROSS_REPAY = "margin_cross_repay"
    MARGIN_ISOLATED_ACCOUNT = "margin_isolated_account"
    MARGIN_ISOLATED_BORROW = "margin_isolated_borrow"
    MARGIN_ISOLATED_FINFLOW = "margin_isolated_finflow"
    MARGIN_ISOLATED_INTEREST = "margin_isolated_interest"
    MARGIN_ISOLATED_LIQUIDATION = "margin_isolated_liquidation"
    MARGIN_ISOLATED_ORDER = "margin_isolated_order"
    MARGIN_ISOLATED_PUBLIC = "margin_isolated_public"
    MARGIN_ISOLATED_REPAY = "margin_isolated_repay"
    MARGIN_PUBLIC = "margin_public"
    P2P_MERCHANT = "p2p_merchant"
