package com.example.mobileapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.geometry.Offset
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HasilQuiz(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color(0xffC6CBE0))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (4).dp,
                    y = 85.dp)
                .requiredWidth(width = 504.dp)
                .requiredHeight(height = 909.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_hasil_quiz_indo),
                contentDescription = "Rectangle 39372",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 0.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 876.dp))


            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 122.dp,
                        y = 244.dp)
                    .requiredSize(size = 85.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White.copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 246.dp,
                        y = 191.dp)
                    .requiredSize(size = 53.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White.copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 419.dp,
                        y = 55.dp)
                    .requiredSize(size = 85.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White.copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 148.dp)
                    .requiredSize(size = 85.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xfffffefe).copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 85.dp,
                        y = 98.dp)
                    .requiredSize(size = 53.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xfffffefe).copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 230.dp,
                        y = 636.dp)
                    .requiredSize(size = 85.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White.copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 336.dp,
                        y = 133.dp)
                    .requiredSize(size = 13.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White.copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 57.dp,
                        y = 90.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 589.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(380.dp)
                        .requiredHeight(100.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .background(color = Color(0xfff6f2f2))
                        .offset(x = -505.dp)
                )

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = -6.dp, y = 197.dp)
                        .requiredWidth(width = 393.dp)
                        .requiredHeight(height = 392.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .background(color = Color(0xfff6f2f2))
                )

                Text(
                    text = "60%",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 40.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 154.dp,
                            y = 220.dp)
                        .requiredWidth(width = 75.dp)
                        .requiredHeight(height = 38.dp))
                Text(
                    text = "Lakukan review dan pelajari lagi materi bersangkutan!",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 2.dp,
                            y = 348.dp)
                        .requiredWidth(width = 375.dp)
                        .requiredHeight(height = 112.dp))
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 10.dp, y = 277.dp)
                        .requiredWidth(357.dp)
                        .requiredHeight(37.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color(0xff22ff00),
                                    Color(0xffff0004)
                                ),
                                start = Offset(0f, 18.5f),
                                end = Offset(957f, 18.5f)
                            )
                        )
                )

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 121.dp,
                            y = 493.dp)
                        .requiredWidth(width = 187.dp)
                        .requiredHeight(height = 41.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.tombol_abu),
                        contentDescription = "Rectangle 39396",
                        modifier = Modifier
                            .requiredWidth(width = 187.dp)
                            .requiredHeight(height = 41.dp)
                            .offset(x = -15.dp,)
                            .clip(shape = RoundedCornerShape(30.dp))
                            .clickable {
                                navController.navigate("review")
                            })
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 79.dp,
                        y = 98.dp)
                    .requiredWidth(width = 335.dp)
                    .requiredHeight(height = 86.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 99.dp)
                        .requiredHeight(height = 86.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = -2.dp)
                            .requiredWidth(width = 90.dp)
                            .requiredHeight(height = 90.dp)
                            .clip(CircleShape)
                            .background(color = Color(0xff828282).copy(alpha = 0.92f)))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 6.dp,
                                y = -2.dp)
                            .requiredWidth(width = 86.dp)
                            .requiredHeight(height = 86.dp)
                            .clip(CircleShape)
                            .background(color = Color(0xffE82441).copy(alpha = 0.92f)))
                    Image(
                        painter = painterResource(id = R.drawable.logo_ind),
                        contentDescription = "Rectangle 39384",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 4.138671875.dp)
                            .requiredWidth(width = 99.dp)
                            .requiredHeight(height = 79.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 105.dp,
                            y = 16.dp)
                        .requiredWidth(width = 230.dp)
                        .requiredHeight(height = 54.dp)
                ) {
                    Text(
                        text = "Quiz Pantun",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 40.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 1.dp)
                            .requiredWidth(width = 225.dp)
                            .requiredHeight(height = 52.dp))
                    Text(
                        text = "Quiz Pantun",
                        color = Color(0xffe82441),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 40.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 2.dp,
                                y = 0.dp)
                            .requiredWidth(width = 228.dp)
                            .requiredHeight(height = 54.dp))
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 0.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 55.dp)
                    .background(color = Color.Black.copy(alpha = 0.1f))
                    .clickable {
                        navController.navigate("materi")
                    })
            Text(
                text = "Home > Materi > Bahasa Indonesia > Pantun > Quiz > Hasil",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 37.dp,
                        y = 10.dp)
                    .requiredWidth(width = 410.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 5.dp,
                    y = 5.dp)
                .requiredSize(size = 100.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_educare),
                contentDescription = "Logo Educare",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.425048828125.dp,
                        y = 40.0751953125.dp)
                    .requiredWidth(width = 30.dp)
                    .requiredHeight(height = 33.dp))


        }
    }
}

