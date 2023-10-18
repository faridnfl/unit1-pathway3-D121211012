package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background)
                {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main()
{
    val image = painterResource(R.drawable.android_logo)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFDDECD6))
    )

    Column ( modifier = Modifier
        .fillMaxSize()
        .padding(top = 150.dp)) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .background(color = Color(0xFF2242534))
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Farid Naufal Afiq",
            fontSize = 35.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 15.sp,
            color = Color(0xFF2F6019),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)

        )
    }

    Column ( modifier = Modifier
        .fillMaxSize()
        .padding(top = 450.dp, start = 100.dp)
    ) {
        Text(
            text = "+62 82292039360",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(top = 10.dp)

        )
        Text(
            text = "@faridnfl",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(top = 10.dp)

        )
        Text(
            text = "faridnaufal34@gmail.com",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(top = 10.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Main()
    }
}