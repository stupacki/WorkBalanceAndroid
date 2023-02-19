package com.workbalance.mobile.design.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

object AppColors {
    private val Purple200 = Color(0xFFBB86FC)
    private val Purple500 = Color(0xFF6200EE)
    private val Purple700 = Color(0xFF3700B3)
    private val Teal200 = Color(0xFF03DAC5)

    val COLOR_PRIMARY_LIGHT = Purple200
    val COLOR_ON_PRIMARY_LIGHT = Purple700
    val COLOR_SECONDARY_LIGHT = Teal200

    val COLOR_PRIMARY_NIGHT = Purple500
    val COLOR_ON_PRIMARY_NIGHT = Purple700
    val COLOR_SECONDARY_NIGHT = Teal200

    internal val DarkColorPalette = darkColorScheme(
        primary = COLOR_PRIMARY_LIGHT,
        onPrimary = COLOR_ON_PRIMARY_LIGHT,
        secondary = COLOR_SECONDARY_LIGHT,
    )

    internal val LightColorPalette = lightColorScheme(
        primary = COLOR_PRIMARY_NIGHT,
        onPrimary = COLOR_ON_PRIMARY_NIGHT,
        secondary = COLOR_SECONDARY_NIGHT,
    )
}
