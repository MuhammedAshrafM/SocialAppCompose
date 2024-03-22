package com.codesroots.socialcompose.ui

sealed class Routes(val route: String){
    object Splash: Routes("Splash")
    object Intro: Routes("Intro")
    object Login: Routes("Login")
    object SignUp: Routes("SignUp")
    object ForgotPassword: Routes("Forgot Password")
    object ValidateOTPCode: Routes("Validate OTP Code")
    object ResetPassword: Routes("Reset Password")
}
