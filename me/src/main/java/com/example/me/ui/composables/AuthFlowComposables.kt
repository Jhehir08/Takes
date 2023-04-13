package com.example.me.ui.composables

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.takes.data.models.Submit
import com.example.takes.ui.stateholders.UserAuthViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(viewModel: UserAuthViewModel) {
    val userEmail = remember { viewModel.userEmail }
    val userName = remember { viewModel.userName }
    val userPassword = remember { viewModel.userPassword }
    val verifyPassword = remember { viewModel.verifyPassword }
    val passwordConfirmed = remember { viewModel.passwordConfirmed }
    Column {
        Text(text = "Email")
        TextField(value = userEmail.value, onValueChange = {
            viewModel.userEmail.value = it
        })
        Text(text = "Username")
        TextField(value = userName.value, onValueChange = {
            viewModel.userName.value = it
        })
        Text(text = "Password")
        TextField(value = userPassword.value, onValueChange = {
            viewModel.userPassword.value = it
        })
        Text(text = "Verify Password")
        TextField(value = verifyPassword.value, onValueChange = {
            viewModel.verifyPassword.value = it
        })
        Button(onClick = {
            viewModel.userAuthEventFlow.value = Submit
        }, enabled = passwordConfirmed) {
            Text("Submit")
        }
    }
}

@Preview
@Composable
fun SignupPreview() {
    MaterialTheme {
        SignUp(viewModel = UserAuthViewModel())
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignIn(viewModel: UserAuthViewModel) {
    val userEmail = remember { viewModel.userEmail }
    val userName = remember { viewModel.userName }
    val userPassword = remember { viewModel.userPassword }
    Column() {
        Text(text = "Email")
        TextField(value = userEmail.value, onValueChange = {
            viewModel.userEmail.value = it
        })
        Text(text = "Username")
        TextField(value = userName.value, onValueChange = {
            viewModel.userName.value = it
        })
        Text(text = "Password")
        TextField(value = userPassword.value, onValueChange = {
            viewModel.userPassword.value = it
        })
        Button(onClick = {
            viewModel.userAuthEventFlow.value = Submit
        }, enabled = true) {
            Text("Submit")
        }
        Button(onClick = {
            Log.d("AuthFlow", "Password Reset Clicked")
        }, enabled = true) {
            Text("Forgot Password")
        }
    }
}

@Preview
@Composable
fun SignInPreview() {
    MaterialTheme {
        SignIn(viewModel = UserAuthViewModel())
    }
}

@Composable
fun CreatePassword() {

}

@Composable
fun ResetPassword() {

}