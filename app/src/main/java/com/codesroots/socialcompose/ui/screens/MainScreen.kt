package com.codesroots.socialcompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codesroots.socialcompose.ui.Routes
import com.codesroots.socialcompose.ui.screens.auth.ForgotPasswordScreen
import com.codesroots.socialcompose.ui.screens.auth.LoginScreen
import com.codesroots.socialcompose.ui.screens.auth.ResetPasswordScreen
import com.codesroots.socialcompose.ui.screens.auth.SignUpScreen
import com.codesroots.socialcompose.ui.screens.auth.ValidateOTPCodeScreen
import com.codesroots.socialcompose.ui.screens.splash.IntroScreen
import com.codesroots.socialcompose.ui.screens.splash.SplashScreen

@Composable
fun MainScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Splash.route){
        composable(Routes.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(Routes.Intro.route){
            IntroScreen(navController = navController)
        }
        composable(Routes.Login.route){
            LoginScreen(navController = navController)
        }
        composable(Routes.SignUp.route){
            SignUpScreen(navController = navController)
        }
        composable(Routes.ForgotPassword.route){
            ForgotPasswordScreen(navController = navController)
        }
        composable(Routes.ValidateOTPCode.route){
            ValidateOTPCodeScreen(navController = navController)
        }
        composable(Routes.ResetPassword.route){
            ResetPasswordScreen(navController = navController)
        }
    }

}