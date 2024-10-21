package com.example.mobileapplication

import android.app.Activity
import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import kotlinx.serialization.Serializable
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import java.io.File

@Serializable
object Home

@Serializable
object Profile

@Serializable
object Indonesia

@Serializable
object Matematika

@Serializable
object IPA

@Serializable
object IPS

@Serializable
object PKN

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val navController = rememberNavController()
                BottomNavBar(navHostController = navController)
            }
        }
    }
}

// Halaman Dashboard

@Composable
fun Home(navHostController: NavHostController) {
    var text by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    var selectedGrade by remember { mutableStateOf("SD") }
    val grades = listOf("SD", "SMP", "SMA")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {

        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { expanded = true },
                modifier = Modifier
                    .height(56.dp)
                    .width(80.dp)
            ) {
                Text(selectedGrade)
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                grades.forEach { grade ->
                    DropdownMenuItem(
                        text = { Text(grade) },
                        onClick = {
                            selectedGrade = grade
                            expanded = false
                        }
                    )
                }
            }
            TextField(
                value = text,
                onValueChange = { text = it },
                placeholder = { Text(text = "Cari Pelajaran") },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp),
                singleLine = true
            )
            Button(
                onClick = {
                },
                modifier = Modifier
                    .height(56.dp)
                    .width(75.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search"
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text("Materi Rekomendasi",
            fontSize = 25.sp)
        Spacer(modifier = Modifier.height(20.dp))

        LessonList(
            navHostController = navHostController,
            buttonItems = listOf(
                "Bahasa Indonesia",
                "Matematika",
                "Ilmu Pengetahuan Alam",
                "Ilmu Pengetahuan Sosial",
                "Pendidikan Kewarganegaraan"
            )
        )
    }
}

// Daftar Materi Rekomendasi

@Composable
fun LessonList(navHostController: NavHostController, buttonItems: List<String>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(buttonItems) { item ->
            Button(
                onClick = {
                    when (item) {
                        "Bahasa Indonesia" -> navHostController.navigate("Indonesia")
                        "Matematika" -> navHostController.navigate("Matematika")
                        "Ilmu Pengetahuan Alam" -> navHostController.navigate("IPA")
                        "Ilmu Pengetahuan Sosial" -> navHostController.navigate("IPS")
                        "Pendidikan Kewarganegaraan" -> navHostController.navigate("PKN")
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = item)
            }
        }
    }
}

@Composable
fun Indonesia() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Indonesia")
    }
}

@Composable
fun Matematika() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Matematika")
    }
}

@Composable
fun IPA() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("IPA")
    }
}

@Composable
fun IPS() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("IPS")
    }
}

@Composable
fun PKN() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("PKN")
    }
}

// Halaman Profile
// Test

@Composable
fun Profile(context: Context) {
    var imageUri by remember { mutableStateOf<Uri?>(null) }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        uri?.let {
            imageUri = it
            saveProfilePicture(it.toString(), context)
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (imageUri != null) {
            Image(
                painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current).data(imageUri).build()
                ),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(128.dp)
                    .clip(CircleShape)
            )
        } else {
            Image(
                painter = painterResource(id = R.drawable.ic_profile_placeholder),
                contentDescription = "Default Profile Picture",
                modifier = Modifier
                    .size(128.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { launcher.launch("image/*") }) {
            Text("Ubah Foto Profile")
        }
    }
}

fun saveProfilePicture(uri: String, context: Context) {
    val sharedPreferences = context.getSharedPreferences("UserProfile", Context.MODE_PRIVATE)
    val editor = sharedPreferences.edit()
    editor.putString("profile_picture_uri", uri)
    editor.apply()
}

// Bottom Navigation Bar

@Composable
fun BottomNavBar(navHostController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val navBackStackEntry by navHostController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        Scaffold(
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(
                        selected = currentRoute == "Home",
                        icon = {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = "Home"
                            )
                        },
                        onClick = {
                            navHostController.navigate("Home") {
                            }
                        },
                    )
                    NavigationBarItem(
                        selected = currentRoute == "Profile",
                        icon = {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Profile"
                            )
                        },
                        onClick = {
                            navHostController.navigate("Profile") {
                            }
                        },
                    )
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navHostController,
                startDestination = "Home",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("Home") {
                    Home(navHostController = navHostController)
                }

                composable("Profile") {
                    val context = LocalContext.current
                    Profile(context = context)
                }
                composable("Indonesia") {
                    Indonesia()
                }
                composable("Matematika") {
                    Matematika()
                }
                composable("IPA") {
                    IPA()
                }
                composable("IPS") {
                    IPS()
                }
                composable("PKN") {
                    PKN()
                }
            }
        }
    }
}
