package com.example.mobileapplication

import android.util.Log
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HasilQuiz(navController: NavController, modifier: Modifier = Modifier, matpel: String?, materi: String?, hasil: Int?) {
    val score = hasil?.times(20) ?: 0
    val endPercentageX = (score / 100f).coerceIn(0f, 1f)
    val boxWidthDp = 357.dp
    val boxHeightDp = 37.dp
    val boxWidthPx = with(LocalDensity.current) { boxWidthDp.toPx() }
    val boxHeightPx = with(LocalDensity.current) { boxHeightDp.toPx() }


    val backgroundImg = if (matpel == "indonesia") {
        R.drawable.bg_ind
    } else if (matpel == "matematika") {
        R.drawable.bg_mat
    } else if (matpel == "inggris") {
        R.drawable.bg_ing
    } else if (matpel == "ipa") {
        R.drawable.bg_ipa
    } else if (matpel == "ips") {
        R.drawable.bg_ips
    } else {
        R.drawable.bg_pkn
    }

    val logoImg = if (matpel == "indonesia") {
        R.drawable.logo_ind
    } else if (matpel == "matematika") {
        R.drawable.logo_mtk
    } else if (matpel == "inggris") {
        R.drawable.logo_ing
    } else if (matpel == "ipa") {
        R.drawable.logo_ipa
    } else if (matpel == "ips") {
        R.drawable.logo_ips
    } else {
        R.drawable.logo_pkn
    }

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
                painter = painterResource(id = backgroundImg),
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
                    text = "$score%",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 40.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 154.dp,
                            y = 220.dp)
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 38.dp))
                Text(
                    text = when {
                        score == 100 -> "Score sempurna! Good job!"
                        score >= 80 -> "Score kamu hampir sempurna! Baca ulang materi!"
                        score >= 60 -> "Baca ulang materi dengan baik ya!"
                        score >= 40 -> "Score kamu kurang baik nih, perhatikan materi dengan seksama ya!"
                        score >= 20 -> "Wow skor kamu sangat kurang, perhatikan poin-poin penting dalam materi ya!"
                        else -> "Heh? Mata kamu beneran kebuka kah?"
                    },
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
                        .requiredWidth(boxWidthDp)
                        .requiredHeight(boxHeightDp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color(0xffff0004))
                ){
                    Box(
                        modifier = Modifier
                            .requiredHeight(boxHeightDp)
                            .requiredWidth((boxWidthDp * endPercentageX))
                            .clip(RoundedCornerShape(30.dp))
                            .background(Color(0xff22ff00))
                    )
                }

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
                                navController.navigate("review/$matpel/$materi")
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
                            .background(color = when {
                                matpel == "indonesia" -> Color(0xffE82441)
                                matpel == "matematika" -> Color(0xff82CBD0)
                                matpel == "inggris" -> Color(0xffDF7B64)
                                matpel == "ipa" -> Color(0xff3295A4)
                                matpel == "ips" -> Color(0xff36C354)
                                else -> Color(0xffCA880D)
                            }))
                    Image(
                        painter = painterResource(id = logoImg),
                        contentDescription = "Rectangle 39384",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x =
                                when {
                                    matpel == "inggris" -> 13.dp
                                    matpel == "pkn" -> 5.dp
                                    else -> 0.dp
                                },
                                y =
                                when {
                                    matpel == "inggris" -> 10.dp
                                    matpel == "pkn" -> 4.dp
                                    else -> 4.138671875.dp
                                },)
                            .requiredWidth(
                                when {
                                    matpel == "inggris" -> 70.dp
                                    matpel == "pkn" -> 95.dp
                                    else -> 99.dp
                                }
                            )
                            .requiredWidth(
                                when {
                                    matpel == "inggris" -> 50.dp
                                    matpel == "pkn" -> 75.dp
                                    else -> 79.dp
                                }
                            ))
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
                        text = "Hasil Quiz",
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
                        text = "Hasil Quiz",
                        color = when {
                            matpel == "indonesia" -> Color(0xffE82441)
                            matpel == "matematika" -> Color(0xff82CBD0)
                            matpel == "inggris" -> Color(0xffDF7B64)
                            matpel == "ipa" -> Color(0xff3295A4)
                            matpel == "ips" -> Color(0xff36C354)
                            else -> Color(0xffCA880D)
                        },
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
                        navController.navigate("materi/$matpel/$materi")
                    })
            Text(
                text = "Home > Materi > $matpel > $materi > Quiz > Hasil",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 37.dp,
                        y = 15.dp)
                    .requiredWidth(width = 410.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 10.dp,
                    y = 8.dp)
                .requiredSize(size = 200.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_educare),
                contentDescription = "Logo Educare",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 10.dp,
                        y = 25.dp)
                    .requiredWidth(width = 45.dp)
                    .requiredHeight(height = 48.dp))


        }
    }
}

