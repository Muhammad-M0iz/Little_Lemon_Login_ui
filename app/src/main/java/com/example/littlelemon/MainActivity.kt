package com.example.littlelemon

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    MaterialTheme{
                        Surface(
                            modifier= Modifier.fillMaxSize(),
                            color= MaterialTheme.colors.background
                        )
                        {
                            loginScreen()
                        }
                    }
            }
        }
    }

@Composable
fun loginScreen(){
    val context=LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription
        = "Logo Image")
        TextField(
            value = "",
            onValueChange = {},

            label = { Text(text = "Username") },
        )
        TextField(value = "", onValueChange = {}, label = { Text(text = "password") })
        Button(onClick = { Toast.makeText(context,"login Failed!!", Toast.LENGTH_SHORT).show()}, colors = ButtonDefaults.buttonColors(Color(0xFF495E57))) {
            Text(text = "Login", color = Color(0xFFEDEFEE))

        }
    }
    }
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    loginScreen()
}

