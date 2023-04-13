package com.example.takes.ui.stateholders

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.takes.data.models.None
import com.example.takes.data.models.User
import com.example.takes.data.models.UserAuthEvent
import kotlinx.coroutines.flow.MutableStateFlow

class UserAuthViewModel : ViewModel() {
    val user = mutableStateOf(User("", "", ""))
    val userEmail = mutableStateOf("")
    val userName = mutableStateOf("")
    val userPassword = mutableStateOf("")
    val verifyPassword = mutableStateOf("")
    val passwordConfirmed = userPassword == verifyPassword
    val userAuthEventFlow = MutableStateFlow<UserAuthEvent>(None)
}