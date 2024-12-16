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
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mobileapplication.R

@Composable
fun ReviewQuiz(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 330.dp)
            .requiredHeight(height = 852.dp)
            .background(color = Color(0xffc6cbe0))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (50).dp,
                    y = 289.dp)
                .requiredWidth(width = 431.dp)
                .requiredHeight(height = 559.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_putih_soal_quiz),
                contentDescription = "Bg_putih Soal",
                modifier = Modifier
                    .requiredWidth(width = 351.dp)
                    .requiredHeight(height = 759.dp)
                    .offset(x = (-20).dp, y = -20.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 610.dp)
                    .requiredWidth(width = 407.dp)
                    .requiredHeight(height = 138.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 407.dp)
                        .requiredHeight(height = 138.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)))
                Text(
                    text = "",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.99560546875.dp,
                            y = 290.dp)
                        .requiredWidth(width = 329.dp)
                        .requiredHeight(height = 16.dp))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsiijo),
                    contentDescription = "A",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 16.0556640625.dp,
                            y = 35.dp)
                        .requiredWidth(width = 166.dp)
                        .requiredHeight(height = 37.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "B",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 222.888916015625.dp,
                            y = 35.dp)
                        .requiredWidth(width = 166.dp)
                        .requiredHeight(height = 37.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "C",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 16.0556640625.dp,
                            y = 89.dp)
                        .requiredWidth(width = 166.dp)
                        .requiredHeight(height = 37.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "D",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 222.888916015625.dp,
                            y = 89.dp)
                        .requiredWidth(width = 166.dp)
                        .requiredHeight(height = 37.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 5.dp,
                        y = 390.dp)
                    .requiredWidth(width = 407.dp)
                    .requiredHeight(height = 138.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 138.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)))
                Text(
                    text = "",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.99560546875.dp,
                            y = 7.dp)
                        .requiredWidth(width = 329.dp)
                        .requiredHeight(height = 16.dp))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "A",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsiijo),
                    contentDescription = "B",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "C",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "D",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 5.dp,
                        y = 245.dp)
                    .requiredWidth(width = 407.dp)
                    .requiredHeight(height = 138.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 138.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)))
                Text(
                    text = "",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.99560546875.dp,
                            y = 7.dp)
                        .requiredWidth(width = 329.dp)
                        .requiredHeight(height = 16.dp))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsiijo),
                    contentDescription = "A",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "B",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "C",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "D",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 5.dp,
                        y = 100.dp)
                    .requiredWidth(width = 407.dp)
                    .requiredHeight(height = 138.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 138.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp))
                )
                Text(
                    text = "2. Apa saja dibawah ini yang menjadi komponen pantun?",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 10.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.0556640625.dp,
                            y = 9.dp)
                        .requiredWidth(width = 329.dp)
                        .requiredHeight(height = 16.dp))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsimerah),
                    contentDescription = "A",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "B",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsiijo),
                    contentDescription = "C",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "D",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 5.dp,
                        y = -45.dp)
                    .requiredWidth(width = 407.dp)
                    .requiredHeight(height = 138.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 138.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp))
                )
                Text(
                    text = "1. Apakah yang dimaksud dengan pantun?",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 10.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 8.dp,
                            y = 8.dp)
                        .requiredWidth(width = 247.dp)
                        .requiredHeight(height = 16.dp))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "A",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsiijo),
                    contentDescription = "B",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 35.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.tombolopsimerah),
                    contentDescription = "C",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
                Image(
                    painter = painterResource(id = R.drawable.abu2),
                    contentDescription = "D",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 165.dp,
                            y = 89.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(30.dp)))
            }
        }
        Image(
            painter = painterResource(id = R.drawable.bg_bawah_quiz),
            contentDescription = "bg_bawah_quiz",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp, y = 730.dp)
                .size(width = 550.dp, height = 194.dp)
                .clip(RectangleShape)
        )
        Image(
            painter = painterResource(id = R.drawable.bg_atas_quiz),
            contentDescription = "bg_atas_quiz",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp, y = 56.dp)
                .size(width = 550.dp, height = 194.dp)
                .clip(RectangleShape)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 5.dp,
                    y = 5.dp)
                .requiredSize(size = 45.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 45.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White))
            Image(
                painter = painterResource(id = R.drawable.logo_educare),
                contentDescription = "Gambar Logo",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 7.425048828125.dp,
                        y = 6.0751953125.dp)
                    .requiredWidth(width = 30.dp)
                    .requiredHeight(height = 33.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 60.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 55.dp)
                .background(color = Color.Black.copy(alpha = 0.1f))
                .clickable {
                    navController.navigate("materi")
                })
        Text(
            text = "Home > Materi > Bahasa Indonesia > Pantun > Quiz > Hasil > Review",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 70.dp)
                .requiredWidth(width = 350.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 57.dp,
                    y = 190.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 589.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.quizpantun),
                contentDescription = "Gambar Logo",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = -8.dp,
                        y = -180.dp)
                    .requiredWidth(width = 332.dp)
                    .requiredHeight(height = 335.dp))

            Image(
                painter = painterResource(id = R.drawable.tomboldone),
                contentDescription = "Gambar Logo",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 75.dp,
                        y = 550.dp)
                    .requiredWidth(width = 172.dp)
                    .requiredHeight(height = 175.dp)
                    .clickable {
                        navController.navigate("materi")
                    })
        }

    }
}