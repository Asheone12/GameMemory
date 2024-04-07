package com.muen.gamememory.memory_feature.presentation.util

fun calculateRowRanges(pairCount: Int, isPortrait: Boolean): List<IntRange>{
    return when(isPortrait){
        true ->{
            when(pairCount){
                2 -> listOf(0..1,2..3)
                3 -> listOf(0..1,2..3,4..5)
                4 -> listOf(0..2,3..5,6..7)
                5 -> listOf(0..2,3..5,6..8, 9..9)
                6 -> listOf(0..2,3..5,6..8, 9..11)
                7 -> listOf(0..2,3..5,6..8, 9..11,12..13)
                8 -> listOf(0..2,3..5,6..8, 9..11,12..14,15..15)
                9 -> listOf(0..2,3..5,6..8, 9..11,12..14,15..17)
                else -> emptyList()
            }
        }
        false ->{
            when(pairCount){
                2 -> listOf(0..1,2..3)
                3 -> listOf(0..2,3..5)
                4 -> listOf(0..3,4..7)
                5 -> listOf(0..3,4..7,8..9)
                6 -> listOf(0..3,4..7,8..11)
                7 -> listOf(0..4,5..9,10..13)
                8 -> listOf(0..5,6..11,12..15)
                9 -> listOf(0..5,6..11,12..17)
                else -> emptyList()
            }
        }
    }
}