package com.adrai.cryptotracker.crypto.presentation.coin_list

import com.adrai.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}