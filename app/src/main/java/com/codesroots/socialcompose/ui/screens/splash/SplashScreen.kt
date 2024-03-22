package com.codesroots.socialcompose.ui.screens.splash

import android.os.Handler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.codesroots.socialcompose.R
import com.codesroots.socialcompose.ui.Routes
import com.codesroots.socialcompose.ui.theme.FaceBook


@Composable
fun SplashScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 22.dp, end = 22.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.network_img),
            contentDescription = "Splash Image",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 22.dp, end = 22.dp)
        )

        Text(
            text = "Social App",
            style = TextStyle(
                color = FaceBook,
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp, top = 80.dp)
        )
    }

    val handler = Handler()
    handler.postDelayed({
        navController.navigate(Routes.Intro.route) {
            popUpTo(Routes.Splash.route) {
                inclusive = true
            }
            launchSingleTop = true
        }
        handler.removeCallbacksAndMessages(null)
    }, 4000)

}