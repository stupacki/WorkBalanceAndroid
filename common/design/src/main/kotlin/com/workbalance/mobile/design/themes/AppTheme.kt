package com.workbalance.mobile.design.themes

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.workbalance.mobile.design.colors.AppColors

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val context = LocalContext.current

    val useDynamicColor = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
    val colorScheme = when {
        useDynamicColor && useDarkTheme -> dynamicDarkColorScheme(context)
        useDynamicColor && !useDarkTheme -> dynamicLightColorScheme(context)
        useDarkTheme -> AppColors.DarkColorPalette
        else -> AppColors.LightColorPalette
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}
