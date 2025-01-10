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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

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
        composable(
            route = "materi/{matpel}/{materi}",
            arguments = listOf(
                navArgument("matpel") { type = NavType.StringType },
                navArgument("materi") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val matpel = backStackEntry.arguments?.getString("matpel")
            val materi = backStackEntry.arguments?.getString("materi")
            Materi(navController, matpel = matpel, materi = materi)
        }
        composable(
            route = "quiz/{matpel}/{materi}",
            arguments = listOf(
                navArgument("matpel") { type = NavType.StringType },
                navArgument("materi") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val matpel = backStackEntry.arguments?.getString("matpel")
            val materi = backStackEntry.arguments?.getString("materi")
            Quiz(navController, matpel = matpel, materi = materi)
        }
        composable(
            route = "hasil/{matpel}/{materi}/{hasil}",
            arguments = listOf(
                navArgument("matpel") { type = NavType.StringType },
                navArgument("materi") { type = NavType.StringType },
                navArgument("hasil") { type = NavType.IntType; defaultValue = 0 }
            )
        ) { backStackEntry ->
            val matpel = backStackEntry.arguments?.getString("matpel")
            val materi = backStackEntry.arguments?.getString("materi")
            val hasil = backStackEntry.arguments?.getInt("hasil") ?: 0

            HasilQuiz(navController, matpel = matpel, materi = materi, hasil = hasil)
        }
        composable(
            route = "review/{matpel}/{materi}",
            arguments = listOf(
                navArgument("matpel") { type = NavType.StringType },
                navArgument("materi") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val matpel = backStackEntry.arguments?.getString("matpel")
            val materi = backStackEntry.arguments?.getString("materi")
            ReviewQuiz(navController, matpel = matpel, materi = materi)
        }
        composable("admin_login") { AdminLogin(navController) }
        composable("admin") { Admin(navController) }
        composable("about") { About(navController) }
        composable(
            route = "admin_screen/{matpel}/{materi}",
            arguments = listOf(
                navArgument("matpel") { type = NavType.StringType },
                navArgument("materi") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val matpel = backStackEntry.arguments?.getString("matpel")
            val materi = backStackEntry.arguments?.getString("materi")
            AdminScreen(navController, matpel = matpel, materi = materi)
        }
    }
}

@Preview()
@Composable
private fun HomePreview() {
    Home(navController = rememberNavController(), Modifier)
}