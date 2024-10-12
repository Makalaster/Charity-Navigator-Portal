package com.makalaster.charitynavigatorportal.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.makalaster.charitynavigatorportal.navigation.CharityNavigatorPortalNavHost
import com.makalaster.charitynavigatorportal.ui.theme.CharityNavigatorPortalTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CharityNavigatorContent()
        }
    }
}

@Composable
fun CharityNavigatorContent(

) {
    val navController = rememberNavController()

    CharityNavigatorPortalTheme {
        Scaffold { paddingValues ->
            CharityNavigatorPortalNavHost(
                navController = navController,
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}