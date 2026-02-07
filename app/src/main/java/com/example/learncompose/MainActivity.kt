package com.example.learncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            LearnComposeTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    LearnTextAndModifier()
                }
            }
        }
    }
}

@Composable
fun LearnTextAndModifier(){
    val context = LocalContext.current

    val clickOnText = {
        Toast.makeText(context, "Text clicked!", Toast.LENGTH_SHORT).show()
    }

    Text(
        text = "Hello World Data Modifier",
        color = Color.Red,
        fontSize = 32.sp,
        fontStyle = FontStyle.Italic,
        modifier = Modifier.padding(22.dp).
                    background(Color.Black).
                    clickable(onClick = clickOnText)
        )
}

// To preview without running the app
@Preview(showBackground = true)
@Composable
fun ShowPreview(){
    LearnComposeTheme {
        LearnTextAndModifier()
    }
}