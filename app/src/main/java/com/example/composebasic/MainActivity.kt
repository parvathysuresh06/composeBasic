package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)
                .width(300.dp)
                .border(5.dp, Color.Magenta)

            )
            {
                Text(text = "Hello")
                Spacer(modifier = Modifier.height(150.dp))
                Text(text = "WORLD")

            }
//            Column(modifier = Modifier,120.dp))
//                .fillMaxSize()
//                .background(Color.Green),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceBetween) {
//                Text(text = "Hello")
//                Text(text = "WORLD")
//                Text(text = "Hello")
//                Text(text = "WORLD")
//                Text(text = "Hello")
//                Text(text = "WORLD")
//            }

//            Row(modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Green),
//                horizontalArrangement = Arrangement.SpaceAround,
//                verticalAlignment = Alignment.CenterVertically) {
//                Text(text = "Hello")
//                Text(text = "WORLD")
//                Text(text = "Hello")
//                Text(text = "WORLD")
//                Text(text = "Hello")
//                Text(text = "WORLD")
//            }

//                    Greeting(name = "PARVATHI")

            }
        }
    }


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    Greeting(name = "PARVATI")

}