package com.sarim.kombinator_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sarim.kombinator.Kombine
import com.sarim.kombinator_app.ui.theme.KombinatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KombinatorAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KombinatorAppTheme {
        Greeting("Android")
    }
}

@Kombine(
    allPossibleStringParams = ["abc", "cde"]
)
data class SampleDataClassBooleanAndString(
    val property1: Boolean,
    val property2: Boolean,
    val property3: String,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"]
)
data class SampleDataClassBoolean(
    val property1: Boolean,
    val property2: Boolean
)

@Kombine
data class SampleDataClassBooleanNoStringParams(
    val property1: Boolean,
    val property2: Boolean
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"]
)
data class SampleDataClassString(
    val property1: String,
    val property2: String
)