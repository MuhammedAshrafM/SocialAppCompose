package com.codesroots.socialcompose.ui.screens.splash

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
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
fun IntroScreen(navController: NavHostController) {

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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(weight = 1f, fill = true)
                .padding(top = 22.dp, bottom = 54.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
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
                    .padding(top = 80.dp)
            )

            OutlinedButton(
                onClick = {
                    navController.navigate(Routes.Login.route)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(32.dp),
                border = BorderStroke(width = 1.dp, FaceBook),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = FaceBook
                )
            ) {
                Text(
                    text = "Login",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp)
                )
            }

            OutlinedButton(
                onClick = {
                    navController.navigate(Routes.SignUp.route)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(32.dp),
                border = BorderStroke(width = 1.dp, FaceBook),
                colors = ButtonDefaults.buttonColors(
                    containerColor = FaceBook,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Sign up",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp)
                )
            }
        }
    }

}