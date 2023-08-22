package com.javed.math_it_up.components


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javed.math_it_up.R
import com.javed.math_it_up.ui.theme.Gray
import com.javed.math_it_up.ui.theme.Purple80

@Composable
fun normalTextComponent(value: String) {

    Text(
        text = value,

        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),

        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),

        color = Color.Black,

        textAlign = TextAlign.Center

    )

}

@Composable
fun headingTextComponent(value: String) {

    Text(
        text = value,

        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),

        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),

        color = Color.Black,

        textAlign = TextAlign.Center

    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun outlinedTextFieldComponent(labelValue: String, painterResId: String) {
    val textValue = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple80,
            focusedLabelColor = Purple80,
            cursorColor = Purple80,
            containerColor = Gray
        ),
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
        leadingIcon = {
            Icon(
                painter = painterResource(id = painterResId.toInt()),
                contentDescription = "Name"
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun outlinedPasswordTextFieldComponent(labelValue: String, painterResId: String) {
    val password = remember {
        mutableStateOf("")
    }

    val passwordVisible = remember {
        mutableStateOf(false)
    }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple80,
            focusedLabelColor = Purple80,
            cursorColor = Purple80,
            containerColor = Gray
        ),
        value = password.value,
        onValueChange = {
            password.value = it
        },

        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

        leadingIcon = {
            Icon(
                painter = painterResource(id = painterResId.toInt()),
                contentDescription = "Name"
            )
        },

        trailingIcon = {
            val iconImage = if (passwordVisible.value) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }

            var description = if (passwordVisible.value) {
                "Hide password"
            } else {
                "Show password"
            }

            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(
                    imageVector = iconImage,
                    contentDescription = description
                )
            }

        },
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()

    )
}


@Composable
fun checkBoxComponent(value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val checkedState = remember {
            mutableStateOf(false)
        }

        Checkbox(checked = checkedState.value,
            onCheckedChange = {
                checkedState.value = !checkedState.value
            })

        normalTextComponent(value)
    }
}
