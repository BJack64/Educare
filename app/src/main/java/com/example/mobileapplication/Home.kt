package com.example.mobileapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color(0xffC6CBE0))
    ) {
        Box(
            modifier = modifier
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 160.dp)
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
        )
        Text(
            text = "Hi, mau belajar apa nich?",
            color = Color.White,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 42.dp,
                    y = 36.dp)
                .requiredWidth(width = 220.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 17.dp,
                    y = 132.dp)
                .requiredWidth(width = 385.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 385.dp)
                    .requiredHeight(height = 43.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 5.dp,
                        y = 4.dp)
                    .requiredWidth(width = 376.dp)
                    .requiredHeight(height = 34.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White)
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Text(
                text = "Cari Materi disini",
                color = Color(0xff828282),
                style = TextStyle(
                    fontSize = 18.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 48.dp,
                        y = 11.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_search),
                contentDescription = "Logo Search",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 10.dp,
                        y = 7.dp)
                    .requiredWidth(width = 30.dp)
                    .requiredHeight(height = 29.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 22.dp,
                    y = 208.dp)
                .requiredWidth(width = 390.dp)
                .requiredHeight(height = 703.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 703.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White)
            ) {
                // Bahasa Indonesia
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 19.dp,
                            y = 69.dp
                        )
                        .requiredWidth(width = 165.dp)
                        .requiredHeight(height = 181.dp)
                        .clickable {
                            navController.navigate("indonesia")
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
                        text = "Bahasa Indonesia",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Matematika
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 206.dp,
                            y = 69.dp
                        )
                        .requiredWidth(width = 165.dp)
                        .requiredHeight(height = 181.dp)
                        .clickable {
                            navController.navigate("matematika")
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
                        text = "Matematika",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // Bahasa Inggris
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 19.dp,
                            y = 261.dp
                        )
                        .requiredWidth(width = 165.dp)
                        .requiredHeight(height = 181.dp)
                        .clickable {
                            navController.navigate("inggris")
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
                        contentDescription = "Logo Bahasa Inggris",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 34.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 95.dp)
                            .requiredHeight(height = 90.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "Bahasa Inggris",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPA
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 206.dp,
                            y = 261.dp
                        )
                        .requiredWidth(width = 165.dp)
                        .requiredHeight(height = 181.dp)
                        .clickable {
                            navController.navigate("ipa")
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
                        text = "IPA",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // IPS
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 19.dp,
                            y = 453.dp
                        )
                        .requiredWidth(width = 165.dp)
                        .requiredHeight(height = 181.dp)
                        .clickable {
                            navController.navigate("ips")
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
                                x = 19.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 125.dp)
                            .requiredHeight(height = 120.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "IPS",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
                // PKN
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 206.dp,
                            y = 453.dp
                        )
                        .requiredWidth(width = 165.dp)
                        .requiredHeight(height = 181.dp)
                        .clickable {
                            navController.navigate("pkn")
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
                                x = 24.dp,
                                y = 40.dp
                            )
                            .requiredWidth(width = 115.dp)
                            .requiredHeight(height = 110.dp)
                            .clip(shape = RoundedCornerShape(22.dp))
                    )
                    Text(
                        text = "PKN",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 144.234375.dp
                            )
                            .requiredWidth(width = 162.dp)
                            .requiredHeight(height = 20.dp)
                    )
                }
            }
            Text(
                text = "Daftar Mata Pelajaran",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 20.dp,
                        y = 18.dp
                    )
                    .requiredWidth(width = 220.dp)
            )
        }

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 247.dp,
                    y = 138.dp)
                .requiredWidth(width = 151.dp)
                .requiredHeight(height = 35.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 142.dp)
                    .requiredHeight(height = 31.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White)
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.3f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Text(
                text = "Pilih Jenjang",
                color = Color(0xff828282),
                style = TextStyle(
                    fontSize = 18.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 9.dp,
                        y = 4.dp)
                    .requiredWidth(width = 112.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 113.dp,
                        y = 9.dp)
                    .requiredWidth(width = 38.dp)
                    .requiredHeight(height = 26.dp)
            ) {
                Text(
                    text = ">",
                    color = Color(0xff828282),
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = (-0.00004588105457514757).dp,
                            y = (-0.0001743901766531053).dp)
                        .requiredWidth(width = 26.dp)
                        .requiredHeight(height = 38.dp)
                        .rotate(degrees = 90f))
            }
        }

        Image(
            painter = painterResource(id = R.drawable.logo_educare),
            contentDescription = "Logo Educare",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 325.dp,
                    y = 33.dp)
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 80.dp))

    }
}