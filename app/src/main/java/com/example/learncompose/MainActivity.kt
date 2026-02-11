package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
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
                    LearnConstraintLayout()
                }
            }
        }
    }
}

@Composable
fun LearnConstraintLayout() {
    ConstraintLayout() {
        val (redButton, greenButton, blueButton, blackButton) = createRefs()

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.constrainAs(redButton) {
                top.linkTo(parent.top)
                width = Dimension.matchParent
                height = Dimension.value(100.dp)
            }
        ) {
            Text(text = "Red")
        }

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.constrainAs(greenButton) {
                top.linkTo(redButton.bottom)
            }
        ) {
            Text(text = "Green")
        }

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.constrainAs(blueButton) {
                top.linkTo(redButton.bottom)
            }
        ) {
            Text(text = "Blue")
        }

        createHorizontalChain(greenButton, blueButton, chainStyle = ChainStyle.Packed)

        val guideLine = createGuidelineFromBottom(0.01f)

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.constrainAs(blackButton) {
//                top.linkTo(blueButton.bottom)
                bottom.linkTo(guideLine)
            }
        ) {
            Text(text = "Black")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ConstraintPreview() {
    LearnComposeTheme {
        LearnConstraintLayout()
    }
}