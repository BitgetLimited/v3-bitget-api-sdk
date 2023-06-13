import typing_extensions

from bitget.apis.tags import TagValues
from bitget.apis.tags.margin_cross_account_api import MarginCrossAccountApi
from bitget.apis.tags.margin_cross_borrow_api import MarginCrossBorrowApi
from bitget.apis.tags.margin_cross_finflow_api import MarginCrossFinflowApi
from bitget.apis.tags.margin_cross_interest_api import MarginCrossInterestApi
from bitget.apis.tags.margin_cross_liquidation_api import MarginCrossLiquidationApi
from bitget.apis.tags.margin_cross_order_api import MarginCrossOrderApi
from bitget.apis.tags.margin_cross_public_api import MarginCrossPublicApi
from bitget.apis.tags.margin_cross_repay_api import MarginCrossRepayApi
from bitget.apis.tags.margin_isolated_account_api import MarginIsolatedAccountApi
from bitget.apis.tags.margin_isolated_borrow_api import MarginIsolatedBorrowApi
from bitget.apis.tags.margin_isolated_finflow_api import MarginIsolatedFinflowApi
from bitget.apis.tags.margin_isolated_interest_api import MarginIsolatedInterestApi
from bitget.apis.tags.margin_isolated_liquidation_api import MarginIsolatedLiquidationApi
from bitget.apis.tags.margin_isolated_order_api import MarginIsolatedOrderApi
from bitget.apis.tags.margin_isolated_public_api import MarginIsolatedPublicApi
from bitget.apis.tags.margin_isolated_repay_api import MarginIsolatedRepayApi
from bitget.apis.tags.margin_public_api import MarginPublicApi
from bitget.apis.tags.p2p_merchant_api import P2pMerchantApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.MARGIN_CROSS_ACCOUNT: MarginCrossAccountApi,
        TagValues.MARGIN_CROSS_BORROW: MarginCrossBorrowApi,
        TagValues.MARGIN_CROSS_FINFLOW: MarginCrossFinflowApi,
        TagValues.MARGIN_CROSS_INTEREST: MarginCrossInterestApi,
        TagValues.MARGIN_CROSS_LIQUIDATION: MarginCrossLiquidationApi,
        TagValues.MARGIN_CROSS_ORDER: MarginCrossOrderApi,
        TagValues.MARGIN_CROSS_PUBLIC: MarginCrossPublicApi,
        TagValues.MARGIN_CROSS_REPAY: MarginCrossRepayApi,
        TagValues.MARGIN_ISOLATED_ACCOUNT: MarginIsolatedAccountApi,
        TagValues.MARGIN_ISOLATED_BORROW: MarginIsolatedBorrowApi,
        TagValues.MARGIN_ISOLATED_FINFLOW: MarginIsolatedFinflowApi,
        TagValues.MARGIN_ISOLATED_INTEREST: MarginIsolatedInterestApi,
        TagValues.MARGIN_ISOLATED_LIQUIDATION: MarginIsolatedLiquidationApi,
        TagValues.MARGIN_ISOLATED_ORDER: MarginIsolatedOrderApi,
        TagValues.MARGIN_ISOLATED_PUBLIC: MarginIsolatedPublicApi,
        TagValues.MARGIN_ISOLATED_REPAY: MarginIsolatedRepayApi,
        TagValues.MARGIN_PUBLIC: MarginPublicApi,
        TagValues.P2P_MERCHANT: P2pMerchantApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.MARGIN_CROSS_ACCOUNT: MarginCrossAccountApi,
        TagValues.MARGIN_CROSS_BORROW: MarginCrossBorrowApi,
        TagValues.MARGIN_CROSS_FINFLOW: MarginCrossFinflowApi,
        TagValues.MARGIN_CROSS_INTEREST: MarginCrossInterestApi,
        TagValues.MARGIN_CROSS_LIQUIDATION: MarginCrossLiquidationApi,
        TagValues.MARGIN_CROSS_ORDER: MarginCrossOrderApi,
        TagValues.MARGIN_CROSS_PUBLIC: MarginCrossPublicApi,
        TagValues.MARGIN_CROSS_REPAY: MarginCrossRepayApi,
        TagValues.MARGIN_ISOLATED_ACCOUNT: MarginIsolatedAccountApi,
        TagValues.MARGIN_ISOLATED_BORROW: MarginIsolatedBorrowApi,
        TagValues.MARGIN_ISOLATED_FINFLOW: MarginIsolatedFinflowApi,
        TagValues.MARGIN_ISOLATED_INTEREST: MarginIsolatedInterestApi,
        TagValues.MARGIN_ISOLATED_LIQUIDATION: MarginIsolatedLiquidationApi,
        TagValues.MARGIN_ISOLATED_ORDER: MarginIsolatedOrderApi,
        TagValues.MARGIN_ISOLATED_PUBLIC: MarginIsolatedPublicApi,
        TagValues.MARGIN_ISOLATED_REPAY: MarginIsolatedRepayApi,
        TagValues.MARGIN_PUBLIC: MarginPublicApi,
        TagValues.P2P_MERCHANT: P2pMerchantApi,
    }
)
