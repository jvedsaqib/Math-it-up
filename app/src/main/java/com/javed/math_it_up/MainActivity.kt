package com.javed.math_it_up

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.javed.math_it_up.screens.signUpScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            signUpScreen()
        }
    }
}

@Preview
@Composable
fun DefaultPreview(){
    signUpScreen()
}