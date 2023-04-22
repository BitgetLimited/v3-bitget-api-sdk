import typing_extensions

from bitget.paths import PathValues
from bitget.apis.paths.api_margin_v1_cross_account_assets import ApiMarginV1CrossAccountAssets
from bitget.apis.paths.api_margin_v1_cross_account_borrow import ApiMarginV1CrossAccountBorrow
from bitget.apis.paths.api_margin_v1_cross_account_max_borrowable_amount import ApiMarginV1CrossAccountMaxBorrowableAmount
from bitget.apis.paths.api_margin_v1_cross_account_max_transfer_out_amount import ApiMarginV1CrossAccountMaxTransferOutAmount
from bitget.apis.paths.api_margin_v1_cross_account_repay import ApiMarginV1CrossAccountRepay
from bitget.apis.paths.api_margin_v1_cross_account_risk_rate import ApiMarginV1CrossAccountRiskRate
from bitget.apis.paths.api_margin_v1_cross_account_void import ApiMarginV1CrossAccountVoid
from bitget.apis.paths.api_margin_v1_cross_fin_list import ApiMarginV1CrossFinList
from bitget.apis.paths.api_margin_v1_cross_interest_list import ApiMarginV1CrossInterestList
from bitget.apis.paths.api_margin_v1_cross_liquidation_list import ApiMarginV1CrossLiquidationList
from bitget.apis.paths.api_margin_v1_cross_loan_list import ApiMarginV1CrossLoanList
from bitget.apis.paths.api_margin_v1_cross_order_batch_cancel_order import ApiMarginV1CrossOrderBatchCancelOrder
from bitget.apis.paths.api_margin_v1_cross_order_batch_place_order import ApiMarginV1CrossOrderBatchPlaceOrder
from bitget.apis.paths.api_margin_v1_cross_order_cancel_order import ApiMarginV1CrossOrderCancelOrder
from bitget.apis.paths.api_margin_v1_cross_order_fills import ApiMarginV1CrossOrderFills
from bitget.apis.paths.api_margin_v1_cross_order_history import ApiMarginV1CrossOrderHistory
from bitget.apis.paths.api_margin_v1_cross_order_open_orders import ApiMarginV1CrossOrderOpenOrders
from bitget.apis.paths.api_margin_v1_cross_order_place_order import ApiMarginV1CrossOrderPlaceOrder
from bitget.apis.paths.api_margin_v1_cross_public_interest_rate_and_limit import ApiMarginV1CrossPublicInterestRateAndLimit
from bitget.apis.paths.api_margin_v1_cross_public_tier_data import ApiMarginV1CrossPublicTierData
from bitget.apis.paths.api_margin_v1_cross_repay_list import ApiMarginV1CrossRepayList
from bitget.apis.paths.api_margin_v1_isolated_account_assets import ApiMarginV1IsolatedAccountAssets
from bitget.apis.paths.api_margin_v1_isolated_account_borrow import ApiMarginV1IsolatedAccountBorrow
from bitget.apis.paths.api_margin_v1_isolated_account_max_borrowable_amount import ApiMarginV1IsolatedAccountMaxBorrowableAmount
from bitget.apis.paths.api_margin_v1_isolated_account_max_transfer_out_amount import ApiMarginV1IsolatedAccountMaxTransferOutAmount
from bitget.apis.paths.api_margin_v1_isolated_account_repay import ApiMarginV1IsolatedAccountRepay
from bitget.apis.paths.api_margin_v1_isolated_account_risk_rate import ApiMarginV1IsolatedAccountRiskRate
from bitget.apis.paths.api_margin_v1_isolated_fin_list import ApiMarginV1IsolatedFinList
from bitget.apis.paths.api_margin_v1_isolated_interest_list import ApiMarginV1IsolatedInterestList
from bitget.apis.paths.api_margin_v1_isolated_liquidation_list import ApiMarginV1IsolatedLiquidationList
from bitget.apis.paths.api_margin_v1_isolated_loan_list import ApiMarginV1IsolatedLoanList
from bitget.apis.paths.api_margin_v1_isolated_order_batch_cancel_order import ApiMarginV1IsolatedOrderBatchCancelOrder
from bitget.apis.paths.api_margin_v1_isolated_order_batch_place_order import ApiMarginV1IsolatedOrderBatchPlaceOrder
from bitget.apis.paths.api_margin_v1_isolated_order_cancel_order import ApiMarginV1IsolatedOrderCancelOrder
from bitget.apis.paths.api_margin_v1_isolated_order_fills import ApiMarginV1IsolatedOrderFills
from bitget.apis.paths.api_margin_v1_isolated_order_history import ApiMarginV1IsolatedOrderHistory
from bitget.apis.paths.api_margin_v1_isolated_order_open_orders import ApiMarginV1IsolatedOrderOpenOrders
from bitget.apis.paths.api_margin_v1_isolated_order_place_order import ApiMarginV1IsolatedOrderPlaceOrder
from bitget.apis.paths.api_margin_v1_isolated_public_interest_rate_and_limit import ApiMarginV1IsolatedPublicInterestRateAndLimit
from bitget.apis.paths.api_margin_v1_isolated_public_tier_data import ApiMarginV1IsolatedPublicTierData
from bitget.apis.paths.api_margin_v1_isolated_repay_list import ApiMarginV1IsolatedRepayList
from bitget.apis.paths.api_margin_v1_public_currencies import ApiMarginV1PublicCurrencies
from bitget.apis.paths.api_p2p_v1_merchant_adv_list import ApiP2pV1MerchantAdvList
from bitget.apis.paths.api_p2p_v1_merchant_merchant_info import ApiP2pV1MerchantMerchantInfo
from bitget.apis.paths.api_p2p_v1_merchant_merchant_list import ApiP2pV1MerchantMerchantList
from bitget.apis.paths.api_p2p_v1_merchant_order_list import ApiP2pV1MerchantOrderList

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_ASSETS: ApiMarginV1CrossAccountAssets,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_BORROW: ApiMarginV1CrossAccountBorrow,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_MAX_BORROWABLE_AMOUNT: ApiMarginV1CrossAccountMaxBorrowableAmount,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_MAX_TRANSFER_OUT_AMOUNT: ApiMarginV1CrossAccountMaxTransferOutAmount,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_REPAY: ApiMarginV1CrossAccountRepay,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_RISK_RATE: ApiMarginV1CrossAccountRiskRate,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_VOID: ApiMarginV1CrossAccountVoid,
        PathValues.API_MARGIN_V1_CROSS_FIN_LIST: ApiMarginV1CrossFinList,
        PathValues.API_MARGIN_V1_CROSS_INTEREST_LIST: ApiMarginV1CrossInterestList,
        PathValues.API_MARGIN_V1_CROSS_LIQUIDATION_LIST: ApiMarginV1CrossLiquidationList,
        PathValues.API_MARGIN_V1_CROSS_LOAN_LIST: ApiMarginV1CrossLoanList,
        PathValues.API_MARGIN_V1_CROSS_ORDER_BATCH_CANCEL_ORDER: ApiMarginV1CrossOrderBatchCancelOrder,
        PathValues.API_MARGIN_V1_CROSS_ORDER_BATCH_PLACE_ORDER: ApiMarginV1CrossOrderBatchPlaceOrder,
        PathValues.API_MARGIN_V1_CROSS_ORDER_CANCEL_ORDER: ApiMarginV1CrossOrderCancelOrder,
        PathValues.API_MARGIN_V1_CROSS_ORDER_FILLS: ApiMarginV1CrossOrderFills,
        PathValues.API_MARGIN_V1_CROSS_ORDER_HISTORY: ApiMarginV1CrossOrderHistory,
        PathValues.API_MARGIN_V1_CROSS_ORDER_OPEN_ORDERS: ApiMarginV1CrossOrderOpenOrders,
        PathValues.API_MARGIN_V1_CROSS_ORDER_PLACE_ORDER: ApiMarginV1CrossOrderPlaceOrder,
        PathValues.API_MARGIN_V1_CROSS_PUBLIC_INTEREST_RATE_AND_LIMIT: ApiMarginV1CrossPublicInterestRateAndLimit,
        PathValues.API_MARGIN_V1_CROSS_PUBLIC_TIER_DATA: ApiMarginV1CrossPublicTierData,
        PathValues.API_MARGIN_V1_CROSS_REPAY_LIST: ApiMarginV1CrossRepayList,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_ASSETS: ApiMarginV1IsolatedAccountAssets,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_BORROW: ApiMarginV1IsolatedAccountBorrow,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_MAX_BORROWABLE_AMOUNT: ApiMarginV1IsolatedAccountMaxBorrowableAmount,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_MAX_TRANSFER_OUT_AMOUNT: ApiMarginV1IsolatedAccountMaxTransferOutAmount,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_REPAY: ApiMarginV1IsolatedAccountRepay,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_RISK_RATE: ApiMarginV1IsolatedAccountRiskRate,
        PathValues.API_MARGIN_V1_ISOLATED_FIN_LIST: ApiMarginV1IsolatedFinList,
        PathValues.API_MARGIN_V1_ISOLATED_INTEREST_LIST: ApiMarginV1IsolatedInterestList,
        PathValues.API_MARGIN_V1_ISOLATED_LIQUIDATION_LIST: ApiMarginV1IsolatedLiquidationList,
        PathValues.API_MARGIN_V1_ISOLATED_LOAN_LIST: ApiMarginV1IsolatedLoanList,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_BATCH_CANCEL_ORDER: ApiMarginV1IsolatedOrderBatchCancelOrder,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_BATCH_PLACE_ORDER: ApiMarginV1IsolatedOrderBatchPlaceOrder,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_CANCEL_ORDER: ApiMarginV1IsolatedOrderCancelOrder,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_FILLS: ApiMarginV1IsolatedOrderFills,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_HISTORY: ApiMarginV1IsolatedOrderHistory,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_OPEN_ORDERS: ApiMarginV1IsolatedOrderOpenOrders,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_PLACE_ORDER: ApiMarginV1IsolatedOrderPlaceOrder,
        PathValues.API_MARGIN_V1_ISOLATED_PUBLIC_INTEREST_RATE_AND_LIMIT: ApiMarginV1IsolatedPublicInterestRateAndLimit,
        PathValues.API_MARGIN_V1_ISOLATED_PUBLIC_TIER_DATA: ApiMarginV1IsolatedPublicTierData,
        PathValues.API_MARGIN_V1_ISOLATED_REPAY_LIST: ApiMarginV1IsolatedRepayList,
        PathValues.API_MARGIN_V1_PUBLIC_CURRENCIES: ApiMarginV1PublicCurrencies,
        PathValues.API_P2P_V1_MERCHANT_ADV_LIST: ApiP2pV1MerchantAdvList,
        PathValues.API_P2P_V1_MERCHANT_MERCHANT_INFO: ApiP2pV1MerchantMerchantInfo,
        PathValues.API_P2P_V1_MERCHANT_MERCHANT_LIST: ApiP2pV1MerchantMerchantList,
        PathValues.API_P2P_V1_MERCHANT_ORDER_LIST: ApiP2pV1MerchantOrderList,
    }
)

path_to_api = PathToApi(
    {
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_ASSETS: ApiMarginV1CrossAccountAssets,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_BORROW: ApiMarginV1CrossAccountBorrow,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_MAX_BORROWABLE_AMOUNT: ApiMarginV1CrossAccountMaxBorrowableAmount,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_MAX_TRANSFER_OUT_AMOUNT: ApiMarginV1CrossAccountMaxTransferOutAmount,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_REPAY: ApiMarginV1CrossAccountRepay,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_RISK_RATE: ApiMarginV1CrossAccountRiskRate,
        PathValues.API_MARGIN_V1_CROSS_ACCOUNT_VOID: ApiMarginV1CrossAccountVoid,
        PathValues.API_MARGIN_V1_CROSS_FIN_LIST: ApiMarginV1CrossFinList,
        PathValues.API_MARGIN_V1_CROSS_INTEREST_LIST: ApiMarginV1CrossInterestList,
        PathValues.API_MARGIN_V1_CROSS_LIQUIDATION_LIST: ApiMarginV1CrossLiquidationList,
        PathValues.API_MARGIN_V1_CROSS_LOAN_LIST: ApiMarginV1CrossLoanList,
        PathValues.API_MARGIN_V1_CROSS_ORDER_BATCH_CANCEL_ORDER: ApiMarginV1CrossOrderBatchCancelOrder,
        PathValues.API_MARGIN_V1_CROSS_ORDER_BATCH_PLACE_ORDER: ApiMarginV1CrossOrderBatchPlaceOrder,
        PathValues.API_MARGIN_V1_CROSS_ORDER_CANCEL_ORDER: ApiMarginV1CrossOrderCancelOrder,
        PathValues.API_MARGIN_V1_CROSS_ORDER_FILLS: ApiMarginV1CrossOrderFills,
        PathValues.API_MARGIN_V1_CROSS_ORDER_HISTORY: ApiMarginV1CrossOrderHistory,
        PathValues.API_MARGIN_V1_CROSS_ORDER_OPEN_ORDERS: ApiMarginV1CrossOrderOpenOrders,
        PathValues.API_MARGIN_V1_CROSS_ORDER_PLACE_ORDER: ApiMarginV1CrossOrderPlaceOrder,
        PathValues.API_MARGIN_V1_CROSS_PUBLIC_INTEREST_RATE_AND_LIMIT: ApiMarginV1CrossPublicInterestRateAndLimit,
        PathValues.API_MARGIN_V1_CROSS_PUBLIC_TIER_DATA: ApiMarginV1CrossPublicTierData,
        PathValues.API_MARGIN_V1_CROSS_REPAY_LIST: ApiMarginV1CrossRepayList,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_ASSETS: ApiMarginV1IsolatedAccountAssets,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_BORROW: ApiMarginV1IsolatedAccountBorrow,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_MAX_BORROWABLE_AMOUNT: ApiMarginV1IsolatedAccountMaxBorrowableAmount,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_MAX_TRANSFER_OUT_AMOUNT: ApiMarginV1IsolatedAccountMaxTransferOutAmount,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_REPAY: ApiMarginV1IsolatedAccountRepay,
        PathValues.API_MARGIN_V1_ISOLATED_ACCOUNT_RISK_RATE: ApiMarginV1IsolatedAccountRiskRate,
        PathValues.API_MARGIN_V1_ISOLATED_FIN_LIST: ApiMarginV1IsolatedFinList,
        PathValues.API_MARGIN_V1_ISOLATED_INTEREST_LIST: ApiMarginV1IsolatedInterestList,
        PathValues.API_MARGIN_V1_ISOLATED_LIQUIDATION_LIST: ApiMarginV1IsolatedLiquidationList,
        PathValues.API_MARGIN_V1_ISOLATED_LOAN_LIST: ApiMarginV1IsolatedLoanList,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_BATCH_CANCEL_ORDER: ApiMarginV1IsolatedOrderBatchCancelOrder,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_BATCH_PLACE_ORDER: ApiMarginV1IsolatedOrderBatchPlaceOrder,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_CANCEL_ORDER: ApiMarginV1IsolatedOrderCancelOrder,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_FILLS: ApiMarginV1IsolatedOrderFills,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_HISTORY: ApiMarginV1IsolatedOrderHistory,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_OPEN_ORDERS: ApiMarginV1IsolatedOrderOpenOrders,
        PathValues.API_MARGIN_V1_ISOLATED_ORDER_PLACE_ORDER: ApiMarginV1IsolatedOrderPlaceOrder,
        PathValues.API_MARGIN_V1_ISOLATED_PUBLIC_INTEREST_RATE_AND_LIMIT: ApiMarginV1IsolatedPublicInterestRateAndLimit,
        PathValues.API_MARGIN_V1_ISOLATED_PUBLIC_TIER_DATA: ApiMarginV1IsolatedPublicTierData,
        PathValues.API_MARGIN_V1_ISOLATED_REPAY_LIST: ApiMarginV1IsolatedRepayList,
        PathValues.API_MARGIN_V1_PUBLIC_CURRENCIES: ApiMarginV1PublicCurrencies,
        PathValues.API_P2P_V1_MERCHANT_ADV_LIST: ApiP2pV1MerchantAdvList,
        PathValues.API_P2P_V1_MERCHANT_MERCHANT_INFO: ApiP2pV1MerchantMerchantInfo,
        PathValues.API_P2P_V1_MERCHANT_MERCHANT_LIST: ApiP2pV1MerchantMerchantList,
        PathValues.API_P2P_V1_MERCHANT_ORDER_LIST: ApiP2pV1MerchantOrderList,
    }
)
