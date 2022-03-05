package com.nexus.walletus.features.utils

sealed class WalletUsScreen(val route: String) {
    object OnboardingScreen : WalletUsScreen(route = "onboarding_screen")

    // auth routes
    object LoginScreen : WalletUsScreen(route = "login_screen")
    object RegistrationScreen : WalletUsScreen(route = "registration")

    // main app routes
    object DashboardScreen : WalletUsScreen(route = "dashboard_screen")

}
