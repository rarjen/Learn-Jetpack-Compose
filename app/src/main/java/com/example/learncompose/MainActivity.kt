package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            LearnComposeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    LearnAlignmentArrangement()
                }
            }
        }
    }
}

@Composable
fun LearnAlignmentArrangement() {

//   Row
//    Row(verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center
//    ) {
//        Text("Row Alignment Arrangement")
//    }

//    Column
//    Column(horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//        Text("Row Alignment Arrangement")
//    }

//    BOX
    Box(contentAlignment = Alignment.BottomCenter) {
        Text("TopStart", modifier = Modifier.align(Alignment.TopStart))
        Text("TopCenter", modifier = Modifier.align(Alignment.TopCenter))
        Text("TopEnd", modifier = Modifier.align(Alignment.TopEnd))
        Text("BottomStart", modifier = Modifier.align(Alignment.BottomStart))
        Text("BottomCenter", modifier = Modifier.align(Alignment.BottomCenter))
        Text("BottomEnd", modifier = Modifier.align(Alignment.BottomEnd))
        Text("Center", modifier = Modifier.align(Alignment.Center))
        Text("CenterStart", modifier = Modifier.align(Alignment.CenterStart))
        Text("CenterEnd", modifier = Modifier.align(Alignment.CenterEnd))

    }
}
