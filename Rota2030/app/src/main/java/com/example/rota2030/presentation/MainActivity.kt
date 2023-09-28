package com.example.rota2030.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.rota2030.R
import com.example.rota2030.presentation.theme.Rota2030Theme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.ButtonDefaults

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WearApp()
        }
    }
}

@Composable
fun WearApp() {
    Rota2030Theme {
        val customColor = Color(android.graphics.Color.parseColor("#1976D2"))
        val buttonColors = ButtonDefaults.buttonColors(backgroundColor = customColor)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Add a button in the middle of the screen
            Button(
                onClick = {
                    // Handle button click here
                },
                colors = buttonColors, // Use the custom colors here

            ) {
                Text(text = "Send Notifications",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )

            }
        }
    }
}

// @Composable
// fun Greeting(greetingName: String) {
//     Text(
//         modifier = Modifier.fillMaxWidth(),
//         textAlign = TextAlign.Center,
//         color =  MaterialTheme.colors.primary,
//         text = stringResource(R.string.hello_world, greetingName)
//     )
// }

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp()
}
