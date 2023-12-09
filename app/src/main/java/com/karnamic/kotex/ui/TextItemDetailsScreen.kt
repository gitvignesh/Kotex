package com.karnamic.kotex.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.karnamic.kotex.ui.theme.KotexTheme

@Composable
fun ItemDetailsScreen(item: String) {
    KotexTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "$item Details")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemDetailsScreenPreview() {
    KotexTheme {
        ItemDetailsScreen("Dummy Item")
    }
}


