package com.example.prac30

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prac30.ui.theme.Prac30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac30Theme {
                Greeting()
            }
        }
    }





    @Composable
    fun Greeting() {
        Box(
            modifier = Modifier
                .background(color = colorResource(R.color.background))
                .fillMaxSize()
        ){
            Image(
                painter = painterResource(R.drawable.group1),
                contentDescription = "",
                modifier = Modifier.clickable(onClick = {
                    val intent = Intent(applicationContext,SecondScreen::class.java)
                    startActivity(intent)
                }).fillMaxSize().offset(0.dp, -250.dp)
            )
            Image(
                painter = painterResource(R.drawable.group2),
                contentDescription = "",
                modifier = Modifier.fillMaxSize().offset(0.dp, -150.dp)
            )
            Image(
                painter = painterResource(R.drawable.group3),
                contentDescription = "",
                modifier = Modifier.fillMaxSize().offset(0.dp, -50.dp)
            )
            Image(
                painter = painterResource(R.drawable.group4),
                contentDescription = "",
                modifier = Modifier.fillMaxSize().offset(0.dp, 50.dp)
            )
            Image(
                painter = painterResource(R.drawable.group5),
                contentDescription = "",
                modifier = Modifier.fillMaxSize().offset(0.dp, 150.dp)
            )
            Image(
                painter = painterResource(R.drawable.group6),
                contentDescription = "",
                modifier = Modifier.fillMaxSize().offset(0.dp, 300.dp)
            )

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Prac30Theme {
            Greeting()
        }
    }



}

