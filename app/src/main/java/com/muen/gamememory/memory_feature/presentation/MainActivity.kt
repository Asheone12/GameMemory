package com.muen.gamememory.memory_feature.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.muen.gamememory.memory_feature.presentation.memory_screen.MemoryScreen
import com.muen.gamememory.memory_feature.presentation.memory_screen.MemoryViewModel
import com.muen.gamememory.ui.theme.MemoryGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MemoryGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: MemoryViewModel by viewModels()
                    MemoryScreen(viewModel = viewModel)
                }
            }
        }
    }
}