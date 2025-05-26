package com.aacm.parcial2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.aacm.parcial2.navigation.NavGraph
import com.aacm.parcial2.ui.theme.Parcial2Theme
import com.aacm.parcial2.viewModel.ProductViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Parcial2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductCatalogApp()
                }
            }
        }
    }
}

@Composable
fun ProductCatalogApp() {
    val navController = rememberNavController()
    val viewModel: ProductViewModel = viewModel()

    NavGraph(
        navController = navController,
        viewModel = viewModel
    )
}