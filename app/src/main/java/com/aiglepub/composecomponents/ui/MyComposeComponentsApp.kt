package com.aiglepub.composecomponents.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aiglepub.composecomponents.ui.theme.ComposeComponentsTheme

@Composable
fun MyComposeComponentsApp(content: @Composable () -> Unit) {
    ComposeComponentsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}