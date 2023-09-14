package com.javed.math_it_up.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javed.math_it_up.R
import com.javed.math_it_up.components.headingTextComponent
import com.javed.math_it_up.components.normalTextComponent
import com.javed.math_it_up.components.outlinedPasswordTextFieldComponent
import com.javed.math_it_up.components.outlinedTextFieldComponent
import com.javed.math_it_up.components.signUpButton

@Composable
fun signUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            normalTextComponent(value = "Hey there,")
            headingTextComponent(value = "Create your account")

            Spacer(modifier = Modifier.height(40.dp))

            outlinedTextFieldComponent(
                labelValue = "First Name",
                painterResId = R.drawable.baseline_account_circle_24.toString()
            )

            outlinedTextFieldComponent(
                labelValue = "Last Name",
                painterResId = R.drawable.baseline_account_circle_24.toString()
            )

            outlinedTextFieldComponent(
                labelValue = "Email",
                painterResId = R.drawable.baseline_email_24.toString()
            )

            outlinedPasswordTextFieldComponent(
                labelValue = "Password",
                painterResId = R.drawable.baseline_password_24.toString()
            )

            signUpButton()

        }

    }
}


@Preview
@Composable
fun signUpScreenPreview() {
    signUpScreen()
}