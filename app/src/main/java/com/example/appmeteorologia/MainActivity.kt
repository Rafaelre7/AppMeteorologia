package com.example.appmeteorologia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appmeteorologia.ui.theme.AppMeteorologiaTheme
import com.example.appmeteorologia.ui.theme.feature.WeatherRoute
import dagger.hilt.android.AndroidEntryPoint

//Falando que vamos usar injecao de dependencias
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMeteorologiaTheme {
                WeatherRoute()
            }
        }
    }
}