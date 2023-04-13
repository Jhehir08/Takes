package com.example.takes.data.models

sealed class UserAuthEvent
object None : UserAuthEvent()
object Submit : UserAuthEvent()
object Error : UserAuthEvent()
