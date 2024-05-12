package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card(Modifier.background(color = colorResource(id = R.color.teal_2)))
                }

            }
        }
    }
}


@Composable
fun Card(modifier: Modifier)
{
    Row(modifier = Modifier
        .fillMaxSize(1f)
        .fillMaxHeight(1f)
        .background(color = colorResource(id = R.color.hy)), horizontalArrangement = Arrangement.Center)
    {
        Column(
            modifier = Modifier
                .padding(top = 150.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(painter = painterResource(id = R.drawable.android_logo__1_) , contentDescription =null ,
                modifier
                    .size(150.dp)
                    .padding(start = 20.dp, top = 50.dp, end = 20.dp)
                    .background(
                        Color.DarkGray
                    ))
            Text(text = "Jennifer Doe", fontWeight = FontWeight.Light, fontSize = 45.sp,)
            Text(text = "Android Enthusiast", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = colorResource(id = R.color.teal_700))
            Box(Modifier.size(300.dp))
            Spacer(Modifier.width(20.dp))
            Box(modifier = Modifier)
            {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(painter = painterResource(id = R.drawable.icons8_phone_96), contentDescription =null,Modifier.size(34.dp), tint = colorResource(
                            id = R.color.teal_700))
                        Text(text = "+91 63224 55231", fontSize = 22.sp)

                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(painter = painterResource(id = R.drawable.icons8_email_100), contentDescription =null,
                            Modifier
                                .padding(end = 5.dp)
                                .size(30.dp),tint = colorResource(
                                id = R.color.teal_700))
                        Text(text = "jenny@android.com", fontSize = 20.sp)

                    }
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Icon(painter = painterResource(id = R.drawable.instagram__1_), contentDescription =null,
                            Modifier
                                .padding(end = 5.dp)
                                .size(30.dp),tint = colorResource(
                                id = R.color.teal_700),

                            )
                        Text(text = "jennie_android", fontSize = 20.sp)

                    }

                }


            }




        }




    }


}




@Preview(showBackground =true)
@Composable
fun Card() {
    BusinessCardTheme {
        Card(modifier = Modifier)

    }
}