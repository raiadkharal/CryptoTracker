package com.adrai.cryptotracker.crypto.presentation.coin_list

import com.adrai.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}