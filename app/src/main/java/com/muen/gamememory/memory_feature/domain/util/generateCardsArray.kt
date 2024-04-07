package com.muen.gamememory.memory_feature.domain.util

import com.muen.gamememory.memory_feature.domain.model.MemoryCard

fun generateCardsArray(matches: Int): Array<MemoryCard> {
    val singles = 1..matches
    val doubles = singles + singles
    return doubles.shuffled().map { MemoryCard(it) }.toTypedArray()
}