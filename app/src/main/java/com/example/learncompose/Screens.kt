package com.example.learncompose

sealed class Screens(val screens: String) {
    data object Home: Screens("home")
    data object Search: Screens("search")
    data object Notification: Screens("notification")
    data object Profile: Screens("profile")
    data object Post: Screens("post")
}