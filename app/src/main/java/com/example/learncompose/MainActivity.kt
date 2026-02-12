package com.example.learncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.learncompose.ui.theme.GreenLearn
import com.example.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            LearnComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    LearnFAB()
                    LearnExtendedFAB()
                }
            }
        }
    }
}

//@Composable
//fun LearnFAB() {
//
//    val context = LocalContext.current.applicationContext
//
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        FloatingActionButton(
//            modifier = Modifier.padding(16.dp).align(Alignment.BottomEnd),
//            containerColor = GreenLearn,
//            onClick = {
//                Toast.makeText(context, "FAB clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Icon(imageVector = Icons.Filled.Add, contentDescription = null)
//        }
//    }
//}

@Composable
fun LearnExtendedFAB() {
    val context = LocalContext.current.applicationContext

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        ExtendedFloatingActionButton(
            modifier = Modifier.padding(16.dp).align(Alignment.BottomEnd),
            containerColor = GreenLearn,
            onClick = {
                Toast.makeText(context, "Extended FAB clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
            Text(
                "Menu",
                modifier = Modifier.padding(4.dp),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnComposeTheme() {
        LearnExtendedFAB()
    }
}