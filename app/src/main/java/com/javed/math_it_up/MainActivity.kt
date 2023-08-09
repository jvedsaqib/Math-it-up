package com.javed.math_it_up

import android.R
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javed.math_it_up.ui.theme.MathitupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MathitupTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android", "Saqib")

                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String,name2: String, modifier: Modifier = Modifier) {
    var context = LocalContext.current
    Row() {
        Column(Modifier.padding(10.dp)) {
            Text(
                text = "Hi $name!",
                modifier = modifier
            )
            SelectionContainer() {
                Text(
                    text = "Hi $name2!",
                    modifier = modifier
                )
            }

            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Name")},
                placeholder = { Text("Enter your name")}
            )

            Button(onClick = { makeToast(context, text) }) {
                Text("Enter")
            }

        }

    }
}

private fun makeToast(context: Context, text: String){
    Toast.makeText(context, "Hello $text", Toast.LENGTH_LONG).show()
}

@Composable
fun MyName(name: String, modifier: Modifier = Modifier){
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MathitupTheme {
        Greeting("Android", "Saqib")
    }
}