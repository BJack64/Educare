package com.example.mobileapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun Admin(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(16.dp)
    ){
        Box(
            modifier = modifier
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 1270.dp)
        ) {
            Box(
                modifier = modifier
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(RoundedCornerShape(32.dp))
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF0094FE),
                                Color(0xFF61B2FF),
                                Color(0xFFABCDFF)
                            )
                        )
                    )
                    .clickable{navController.navigate("home")}
            )
            Text(
                text = "Halaman Admin",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 42.dp,
                        y = 25.dp
                    )
                    .requiredWidth(width = 220.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 17.dp,
                        y = 50.dp
                    )
                    .requiredWidth(width = 385.dp)
                    .requiredHeight(height = 350.dp)
            ) {
                // Bahasa Indonesia - Pantun
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = -25.dp,
                            y = 69.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 155.dp)
                        .clickable {
                            val matpel = "indonesia"
                            val materi = "pantun"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ind),
                        contentDescription = "Logo Bahasa Indonesia",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Pantun",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Bahasa Indonesia - Drama
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 120.dp,
                            y = 69.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "indonesia"
                            val materi = "drama"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ind),
                        contentDescription = "Logo Bahasa Indonesia",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Drama",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 12.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Bahasa Indonesia - Surat Kerja
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 265.dp,
                            y = 69.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "indonesia"
                            val materi = "surat_kerja"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ind),
                        contentDescription = "Logo Bahasa Indonesia",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Surat Kerja",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Matematika - Perkalian
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = -25.dp,
                            y = 261.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 155.dp)
                        .clickable {
                            val matpel = "matematika"
                            val materi = "perkalian"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_mtk),
                        contentDescription = "Logo Matematika",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Perkalian",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Matematika - Aljabar
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 120.dp,
                            y = 261.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "matematika"
                            val materi = "aljabar"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_mtk),
                        contentDescription = "Logo Matematika",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 24.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Aljabar",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 12.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Matematika- Trigonometri
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 265.dp,
                            y = 261.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "matematika"
                            val materi = "trigonometri"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_mtk),
                        contentDescription = "Logo Matematika",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Trigonometri",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Bahasa Inggris - Grammar
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = -25.dp,
                            y = 453.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 155.dp)
                        .clickable {
                            val matpel = "inggris"
                            val materi = "grammar"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ing),
                        contentDescription = "Logo Inggris",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 31.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 95.dp)
                            .requiredHeight(height = 80.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Grammar",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Bahasa Inggris - Simple Past Tense
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 120.dp,
                            y = 453.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "inggris"
                            val materi = "simple_past"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ing),
                        contentDescription = "Logo Inggris",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 33.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 95.dp)
                            .requiredHeight(height = 80.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Simple Past Tense",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 12.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Bahasa Inggris - Future Perfect Tense
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 265.dp,
                            y = 453.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "inggris"
                            val materi = "future_perfect"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ing),
                        contentDescription = "Logo Inggris",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 30.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 95.dp)
                            .requiredHeight(height = 80.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Future Perfect Tense",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPA - Ekosistem
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = -25.dp,
                            y = 645.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 155.dp)
                        .clickable {
                            val matpel = "ipa"
                            val materi = "ekosistem"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ipa),
                        contentDescription = "Logo IPA",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Ekosistem",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPA - Organ Manusia
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 120.dp,
                            y = 645.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "ipa"
                            val materi = "organ_manusia"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ipa),
                        contentDescription = "Logo IPA",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 24.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Organ Manusia",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 12.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPA - Klasifikasi
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 265.dp,
                            y = 645.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "ipa"
                            val materi = "klasifikasi"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ipa),
                        contentDescription = "Logo IPA",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Klasifikasi",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPS - Lapisan Bumi
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = -25.dp,
                            y = 837.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 155.dp)
                        .clickable {
                            val matpel = "ips"
                            val materi = "lapisan_bumi"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ips),
                        contentDescription = "Logo IPS",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Lapisan Bumi",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPS - Geografi
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 120.dp,
                            y = 837.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "ips"
                            val materi = "geografi"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ips),
                        contentDescription = "Logo IPS",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Geografi",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 12.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPS - Prasejarah
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 265.dp,
                            y = 837.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "ips"
                            val materi = "prasejarah"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_ips),
                        contentDescription = "Logo IPS",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 24.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Prasejarah",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // PKN - Norma
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = -25.dp,
                            y = 1029.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 155.dp)
                        .clickable {
                            val matpel = "pkn"
                            val materi = "norma"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_pkn),
                        contentDescription = "Logo PKN",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Norma",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // PKN - HAM
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 120.dp,
                            y = 1029.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "pkn"
                            val materi = "HAM"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_pkn),
                        contentDescription = "Logo PKN",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "HAM",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 12.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // PKN - UUD
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 265.dp,
                            y = 1029.dp
                        )
                        .requiredWidth(width = 140.dp)
                        .requiredHeight(height = 165.dp)
                        .clickable {
                            val matpel = "pkn"
                            val materi = "UUD"
                            navController.navigate("admin_screen/$matpel/$materi")
                        }
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 165.dp)
                            .requiredHeight(height = 181.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_pkn),
                        contentDescription = "Logo PKN",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 23.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "UUD",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 10.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
            }
        }
        }
}