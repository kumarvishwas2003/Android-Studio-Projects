package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.light(android.graphics.Color.TRANSPARENT,android.graphics.Color.TRANSPARENT))
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonApp() {
    var currentStep by remember { mutableStateOf(1) }
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentStep) {
            1 -> {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .fillMaxHeight(1f)
                        .fillMaxWidth(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    TopAppBar(title = { Text(text = "Lemonade", color = colorResource(id = R.color.black), modifier = Modifier.fillMaxWidth(1f), textAlign = TextAlign.Center)}, colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(
                        id = R.color.yelo
                    )))
                    Spacer(modifier = Modifier.height(225.dp))



                    Image(painter = painterResource(id = R.drawable.lemon_tree),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 2 }
                            .background(color = colorResource(id = R.color.grn))
                            .size(200.dp)
                            .padding(20.dp))
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "Tap the lemon tree to select lemon.", Modifier.align(Alignment.CenterHorizontally))


                }
            }

            2 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TopAppBar(title = { Text(text = "Lemonade", color = colorResource(id = R.color.black), modifier = Modifier.fillMaxWidth(1f), textAlign = TextAlign.Center)}, colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(
                        id = R.color.yelo
                    )))
                    Spacer(modifier = Modifier.height(225.dp))


                    Image(painter = painterResource(id = R.drawable.lemon_squeeze),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 3 }
                            .background(color = colorResource(id = R.color.grn))
                            .size(200.dp)
                            .padding(20.dp))
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "Keep tapping the lemon to squeeze it.")


                }


            }
            3 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    TopAppBar(title = { Text(text = "Lemonade", color = colorResource(id = R.color.black), modifier = Modifier.fillMaxWidth(1f), textAlign = TextAlign.Center)}, colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(
                        id = R.color.yelo
                    )))
                    Spacer(modifier = Modifier.height(225.dp))


                    Image(painter = painterResource(id = R.drawable.lemon_drink),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 4 }
                            .background(color = colorResource(id = R.color.grn))
                            .size(200.dp)
                            .padding(20.dp))
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "Tap Lemonade to drink it.")

                }


            }
            4 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TopAppBar(title = { Text(text = "Lemonade", color = colorResource(id = R.color.black), modifier = Modifier.fillMaxWidth(1f), textAlign = TextAlign.Center)}, colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(
                        id = R.color.yelo
                    )))
                    Spacer(modifier = Modifier.height(225.dp))



                    Image(painter = painterResource(id = R.drawable.lemon_restart),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 1 }
                            .background(color = colorResource(id = R.color.grn))
                            .size(200.dp)
                            .padding(20.dp))
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "Tap the empty glass to start again.",
                        modifier = Modifier.padding(25.dp))

                }


            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme {
        LemonApp()
    }
}