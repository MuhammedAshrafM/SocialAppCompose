package com.codesroots.socialcompose.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.codesroots.socialcompose.ui.theme.FaceBook
import com.codesroots.socialcompose.ui.theme.PrimaryColor


@Composable
fun SignUpScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.network_img3),
                contentDescription = "Signup Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "Backward",
                modifier = Modifier.padding(start = 24.dp, top = 48.dp).width(28.dp).height(28.dp),
            )
        }


        Text(
            text = "Sign Up",
            style = TextStyle(
                color = PrimaryColor,
                fontSize = 28.sp,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 22.dp, end = 22.dp)
        )
    }


}