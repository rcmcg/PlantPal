package com.example.plantpal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plantpal.ui.theme.AppTypography
import com.example.plantpal.ui.theme.PlantPalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantPalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlantMain()
                }
            }
        }
    }
}

@Composable
fun PlantMain(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.plantpal),
        fontSize = 48.sp,
        fontFamily = AppTypography.displayLarge.fontFamily,
        modifier = modifier.padding(start = 8.dp, top = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlantPalTheme {
        PlantMain()
    }
}