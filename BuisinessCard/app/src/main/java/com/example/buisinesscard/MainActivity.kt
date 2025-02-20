package com.example.buisinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buisinesscard.ui.theme.BuisinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuisinessCardTheme {
                Surface(Modifier.fillMaxSize()) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Main()
}

@Composable
fun Main() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.user_placeholder)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Rafael Moreira Barbosa Baptista",
            modifier = Modifier.padding(top = 15.dp),
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 50.dp)
    ) {
        Contact("rafamtf.mail@gmail.com", painterResource(R.drawable.envelope_solid))
        Contact("(31) 99829-3293", painterResource(R.drawable.phone_solid))
    }
}

@Composable
fun Contact(text: String, icon: Painter) {
    Row(modifier = Modifier.width(250.dp).padding(top = 10.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Image(
            painter = icon,
            contentDescription = null,
            Modifier.size(25.dp),
        )
        Text(
            text = text,
            color = Color.Black,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuisinessCardTheme {
        Surface(Modifier.fillMaxSize()) {
            BusinessCardApp()
        }
    }
}