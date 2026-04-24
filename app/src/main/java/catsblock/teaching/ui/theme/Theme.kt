package catsblock.teaching.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = PureWhite,
    secondary = LightGray,
    background = PureBlack,
    surface = PureBlack,
    onPrimary = PureBlack,
    onSecondary = PureWhite,
    onBackground = PureWhite,
    onSurface = PureWhite
)

@Composable
fun CatsblockTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}

