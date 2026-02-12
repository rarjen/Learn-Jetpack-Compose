package com.example.learncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
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
                    LearnCheckboxes()
                }
            }
        }
    }
}

@Composable
fun LearnCheckboxes() {
    val todoList: List<String> = listOf("Gym", "Sleep", "Cook", "Shower", "Dishes", "Cleaning", "Coding", "Trading")
    val context = LocalContext.current.applicationContext

    Column(
        modifier = Modifier.fillMaxWidth().background(Color.DarkGray),
    ) {
        Column(
            modifier = Modifier.padding(start = 40.dp, top = 180.dp)
        ) {
            todoList.forEach {
                todoItem ->
                var checkedItem by remember {
                    mutableStateOf(false)
                }

                Row() {
                    Checkbox(
                        checked = checkedItem,
                        onCheckedChange = {
                            checkedStatus -> checkedItem = checkedStatus
                            Toast.makeText(context, "$todoItem is $checkedItem", Toast.LENGTH_SHORT).show()
                        }
                    )
                    Text(text = todoItem, fontSize = 22.sp)
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CheckboxPreview() {
    LearnComposeTheme() {
        LearnCheckboxes()
    }
}