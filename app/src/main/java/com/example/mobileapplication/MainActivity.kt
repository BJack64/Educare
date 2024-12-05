package com.example.mobileapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Navigation()
            }
        }
    }
}

@Composable
fun Opening(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color(0xffc6cbe0))
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile_placeholder),
            contentDescription = "Rectangle 39372",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 16.dp)
                .requiredWidth(width = 400.dp)
                .requiredHeight(height = 900.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        Image(
            painter = painterResource(id = R.drawable.ic_profile_placeholder),
            contentDescription = "Rectangle 39373",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 30.dp,
                    y = 31.dp)
                .requiredWidth(width = 370.dp)
                .requiredHeight(height = 870.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 35.dp,
                    y = 36.dp)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 860.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xfff6f2f2))
                .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.1f)),
                    shape = RoundedCornerShape(20.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 65.dp,
                    y = 316.dp)
                .requiredSize(size = 300.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 300.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White))
            Image(
                painter = painterResource(id = R.drawable.ic_profile_placeholder),
                contentDescription = "WhatsApp Image 2024-10-28 at 15.17.37 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 49.5.dp,
                        y = 40.5.dp)
                    .requiredWidth(width = 201.dp)
                    .requiredHeight(height = 219.dp))
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { Home(navController) }
        composable("indonesia") { Indonesia(navController) }
        composable("matematika") { Matematika(navController) }
        composable("inggris") { Inggris(navController) }
        composable("ipa") { IPA(navController) }
        composable("ips") { IPS(navController) }
        composable("pkn") { PKN(navController) }
    }
}

@Preview
@Composable
private fun OpeningPreview() {
    Opening(Modifier)
}

@Preview()
@Composable
private fun HomePreview() {
    Home(navController = rememberNavController(), Modifier)
}