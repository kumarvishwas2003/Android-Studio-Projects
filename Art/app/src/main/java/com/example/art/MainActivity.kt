package com.example.art

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.art.ui.theme.ArtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {

            ArtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Art()
                }
            }
        }
    }
}
@Composable
fun Art()
{
    Greeting(painter = painterResource(id = R.drawable.bridge), BigText = "Still Life of Blue Rose and Other Flowers", Author ="Alteroz Paul" , year ="(2021)" )

}

@Composable
fun Greeting( painter: Painter,BigText:String,Author:String,year:String,modifier: Modifier = Modifier) {


    Box(modifier =modifier.padding(top=80.dp, bottom = 15.dp,start=15.dp,end=15.dp) )
    {
        Column(modifier= Modifier.fillMaxSize()) {
            Surface(shadowElevation = 10.dp) {
                Box(modifier = Modifier)
                {
                    Image(
                        painter = painter,
                        contentDescription = null,
                        Modifier.padding(30.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(20.dp))

            Box(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.gry)))
            {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)) {
                    Text(text = BigText, fontWeight = FontWeight.Light, fontSize = 25.sp)
                    Row {
                        Text(text = Author, fontWeight = FontWeight.Bold)
                        Text(text = year)

                    }


                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row(verticalAlignment = Alignment.Bottom) {
                Button(onClick = { /*TODO*/ },modifier.padding(start=0.dp,end=50.dp) )
            {
                    Text(text = "Previous",modifier.padding(start = 20.dp,end=20.dp))

                }
                Spacer(modifier = Modifier.padding(8.dp))
                Button(onClick = { /*TODO*/ },modifier.padding(start=5.dp,end=0.dp)) {
                    Text(text = "Next",modifier.padding(start=35.dp,end=35.dp))

                }
            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtTheme {
        Art()
    }
}