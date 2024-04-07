package com.muen.gamememory.memory_feature.presentation.memory_screen

import com.muen.gamememory.memory_feature.domain.model.MemoryCard
import com.muen.gamememory.memory_feature.domain.util.generateCardsArray
import com.muen.gamememory.memory_feature.presentation.util.NumericValues.STARTING_PAIRS
import com.muen.gamememory.ui.theme.HolidayTheme
import com.muen.gamememory.ui.theme.ThanksgivingTheme

data class MemoryState (
    val cards: Array<MemoryCard> = generateCardsArray(STARTING_PAIRS),
    val card1: Int? = null,
    val card2: Int? = null,
    val pairCount: Int = STARTING_PAIRS,
    val pairsMatched: Int = 0,
    val clickCount: Int = 0,
    val currentTheme: HolidayTheme = ThanksgivingTheme(),
)