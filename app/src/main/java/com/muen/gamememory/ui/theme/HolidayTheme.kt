package com.muen.gamememory.ui.theme

import androidx.compose.ui.graphics.Color
import com.muen.gamememory.R

interface HolidayTheme {
    val backgroundPortrait: Int
    val backgroundLandscape: Int
    val cardBack: Int
    val cardBaseColor: Color
    val textColor: Color
    val cardFrontBaseColor: Color
    val matchedOutlineColor: Color
    val iconColor: Color
    val imageMap: Map<Int, Int>

    fun getImageResourceForNumber(number: Int): Int?
    fun getNextTheme(): HolidayTheme
}

class ThanksgivingTheme(
    override val backgroundPortrait: Int = R.drawable.background_portrait_thanksgiving,
    override val backgroundLandscape: Int = R.drawable.background_landscape_thanksgiving,
    override val cardBack: Int = R.drawable.cardback_thanksgiving,
    override val cardBaseColor: Color = Colors.Tan,
    override val textColor: Color = Colors.Tan,
    override val cardFrontBaseColor: Color = Colors.Tan,
    override val matchedOutlineColor: Color = Colors.DarkGreen,
    override val iconColor: Color = Colors.Brown,
    override val imageMap: Map<Int, Int> = mapOf(
        1 to R.drawable.tg1,
        2 to R.drawable.tg2,
        3 to R.drawable.tg3,
        4 to R.drawable.tg4,
        5 to R.drawable.tg5,
        6 to R.drawable.tg6,
        7 to R.drawable.tg7,
        8 to R.drawable.tg8,
        9 to R.drawable.tg9,
    )
): HolidayTheme {
    override fun getImageResourceForNumber(number: Int): Int? {
        return imageMap[number]
    }
    override fun getNextTheme(): HolidayTheme {
        return HalloweenTheme()
    }
}

class HalloweenTheme(
    override val backgroundPortrait: Int = R.drawable.background_portrait_halloween,
    override val backgroundLandscape: Int = R.drawable.background_landscape_halloween,
    override val cardBaseColor: Color = Color.Black,
    override val cardBack: Int = R.drawable.cardback_halloween,
    override val textColor: Color = Colors.BlueWhite,
    override val cardFrontBaseColor: Color = Colors.BlueWhite,
    override val matchedOutlineColor: Color = Colors.DarkGreen,
    override val iconColor: Color = Colors.Orange,
    override val imageMap: Map<Int, Int> = mapOf(
        1 to R.drawable.hw1,
        2 to R.drawable.hw2,
        3 to R.drawable.hw3,
        4 to R.drawable.hw4,
        5 to R.drawable.hw5,
        6 to R.drawable.hw6,
        7 to R.drawable.hw7,
        8 to R.drawable.hw8,
        9 to R.drawable.hw9
    )
) : HolidayTheme {
    override fun getImageResourceForNumber(number: Int): Int? {
        return imageMap[number]
    }

    override fun getNextTheme(): HolidayTheme {
        return ChristmasTheme()
    }
}

class ChristmasTheme(
    override val backgroundPortrait: Int = R.drawable.background_portrait_christmas,
    override val backgroundLandscape: Int = R.drawable.background_landscape_christmas,
    override val cardBaseColor: Color = Colors.BlueGray,
    override val cardBack: Int = R.drawable.cardback_christmas,
    override val textColor: Color = Color.White,
    override val cardFrontBaseColor: Color = Colors.LightBlue,
    override val matchedOutlineColor: Color = Colors.DarkGreen,
    override val iconColor: Color = Color.White,
    override val imageMap: Map<Int, Int> = mapOf(
        1 to R.drawable.cm1,
        2 to R.drawable.cm2,
        3 to R.drawable.cm3,
        4 to R.drawable.cm4,
        5 to R.drawable.cm5,
        6 to R.drawable.cm6,
        7 to R.drawable.cm7,
        8 to R.drawable.cm8,
        9 to R.drawable.cm9
    )
) : HolidayTheme {
    override fun getImageResourceForNumber(number: Int): Int? {
        return imageMap[number]
    }

    override fun getNextTheme(): HolidayTheme {
        return ThanksgivingTheme()
    }
}