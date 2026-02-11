package com.example.learncompose

import android.os.Bundle
import android.view.Display
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            LearnComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val fruitList = listOf<String>("Papaya", "Watermelon", "Banana", "Strawberry", "Apple", "Papaya", "Watermelon", "Banana",
                        "Strawberry", "Apple", "Papaya", "Watermelon", "Banana", "Strawberry", "Apple", "Papaya", "Watermelon", "Banana", "Strawberry", "Apple", "Papaya", "Watermelon", "Banana", "Strawberry", "Apple")

                    DisplayList(fruitList)
                }
            }
        }
    }
}


@Composable
fun DisplayList(fruitList: List<String>) {
//  Normal List
//    Column() {
//        fruitList.forEach {
//            Text(text = " $it", fontSize = 30.sp, color = Color.Red)
//        }
//    }

//    LazyColumn() {
//        items(fruitList){
//            Text(text = " $it", fontSize = 30.sp, color = Color.Red)
//        }
//    }

    LazyRow() {
        items(fruitList){
            Text(text = " $it", fontSize = 30.sp, color = Color.Red)
        }
    }
}