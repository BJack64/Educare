package com.example.mobileapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.navigation.NavController

@Composable
fun Matematika(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color(0xffC6CBE0))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 4.dp,
                    y = 55.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 200.dp)
                .background(color = Color(0xff66B3B8))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 4.dp,
                    y = 473.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 436.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 17.dp,
                        y = 40.5.dp)
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 396.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffF6F2F2)))
            Text(
                text = "Semua Materi",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 27.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 303.dp)
                    .requiredWidth(width = 352.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffF6F2F2))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                        shape = RoundedCornerShape(10.dp)))
            Text(
                text = "Nama Materi",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 148.dp,
                        y = 336.56005859375.dp)
                    .requiredWidth(width = 162.dp)
                    .requiredHeight(height = 16.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 148.dp,
                        y = 367.06982421875.dp)
                    .requiredWidth(width = 160.dp)
                    .requiredHeight(height = 17.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = Color(0xffD9D9D9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 177.22998046875.dp)
                    .requiredWidth(width = 352.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffF6F2F2))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                        shape = RoundedCornerShape(10.dp)))
            Text(
                text = "Nama Materi",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 148.dp,
                        y = 205.47998046875.dp)
                    .requiredWidth(width = 162.dp)
                    .requiredHeight(height = 16.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 148.dp,
                        y = 235.990234375.dp)
                    .requiredWidth(width = 160.dp)
                    .requiredHeight(height = 17.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = Color(0xffD9D9D9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 51.7998046875.dp)
                    .requiredWidth(width = 352.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xfff6f2f2))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                        shape = RoundedCornerShape(10.dp)))
            Image(
                painter = painterResource(id = R.drawable.logo_mtk),
                contentDescription = "Logo Matematika",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 68.dp)
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 77.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_mtk),
                contentDescription = "Logo Matematika",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 197.dp)
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 77.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_mtk),
                contentDescription = "Logo Matematika",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 320.dp)
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 77.dp))
            Text(
                text = "Perkalian",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 148.dp,
                        y = 80.dp)
                    .requiredWidth(width = 162.dp)
                    .requiredHeight(height = 16.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 148.dp,
                        y = 110.56005859375.dp)
                    .requiredWidth(width = 160.dp)
                    .requiredHeight(height = 17.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = Color(0xffD9D9D9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-38).dp,
                    y = 56.dp)
                .requiredWidth(width = 504.dp)
                .requiredHeight(height = 342.dp)
        ) {
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
                        y = 37.dp)
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
                    .background(color = Color(0xffFFFEFE).copy(alpha = 0.25f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 102.dp,
                        y = 92.dp)
                    .requiredSize(size = 53.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffFFFEFE).copy(alpha = 0.25f)))
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
                    .offset(x = 37.dp,
                        y = 191.dp)
                    .requiredWidth(width = 431.dp)
                    .requiredHeight(height = 121.dp)
                    .background(color = Color(0xffF6F2F2)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 75.dp,
                        y = 133.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 209.dp)
                    .clip(shape = RoundedCornerShape(35.dp))
                    .background(color = Color(0xffF6F2F2)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 65.dp,
                        y = 0.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 38.dp)
                    .background(color = Color.Black.copy(alpha = 0.1f))
                    .clickable {
                        navController.navigate("home")
                    })
            {
                Text(
                    text = "Home > Materi > Matematika",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 10.dp)
                        .requiredWidth(width = 429.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 47.dp)
                    .requiredWidth(width = 395.dp)
                    .requiredHeight(height = 43.dp)
            ) {
                Box(
                    modifier = Modifier
                        .offset(x = 37.dp)
                        .requiredWidth(width = 395.dp)
                        .requiredHeight(height = 43.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xffF6F2F2)))
                {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 5.dp,
                                y = 4.dp)
                            .requiredWidth(width = 383.dp)
                            .requiredHeight(height = 34.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color(0xffF6F2F2))
                            .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                                shape = RoundedCornerShape(10.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.logo_search),
                        contentDescription = "Logo Search",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 10.dp,
                                y = 7.dp)
                            .requiredWidth(width = 30.dp)
                            .requiredHeight(height = 29.dp))
                    Text(
                        text = "Cari Materi disini",
                        color = Color(0xff828282),
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 127.dp,
                                y = 13.dp))
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 107.dp,
                    y = 200.dp)
                .requiredWidth(width = 225.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 56.dp,
                        y = 0.dp)
                    .requiredWidth(width = 105.dp)
                    .requiredHeight(height = 104.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xff828282).copy(alpha = 0.92f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 58.731689453125.dp,
                        y = 2.7705078125.dp)
                    .requiredWidth(width = 100.dp)
                    .requiredHeight(height = 98.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xff66B3B8).copy(alpha = 0.92f)))
            Image(
                painter = painterResource(id = R.drawable.logo_mtk),
                contentDescription = "Logo Matematika",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 53.dp,
                        y = 7.dp)
                    .requiredWidth(width = 110.dp)
                    .requiredHeight(height = 87.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 112.dp)
                    .requiredWidth(width = 225.dp)
                    .requiredHeight(height = 73.dp)
            ) {
                Text(
                    text = "Matematika",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 1.dp)
                        .requiredWidth(width = 223.dp)
                        .requiredHeight(height = 71.dp))
                Text(
                    text = "Matematika",
                    color = Color(0xff66B3B8),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 2.dp,
                            y = 0.dp)
                        .requiredWidth(width = 223.dp)
                        .requiredHeight(height = 73.dp))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 298.dp,
                    y = 418.dp)
                .requiredWidth(width = 65.dp)
                .requiredHeight(height = 38.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 65.dp)
                    .requiredHeight(height = 38.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 65.dp)
                        .requiredHeight(height = 38.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xff898686))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.7f)),
                            shape = RoundedCornerShape(10.dp)))
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 4.0625.dp,
                            y = 4.10791015625.dp)
                        .requiredWidth(width = 57.dp)
                        .requiredHeight(height = 27.dp)
                ) {
                    Text(
                        text = "SMA",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 1.2587890625.dp)
                            .requiredWidth(width = 57.dp)
                            .requiredHeight(height = 26.dp))
                    Text(
                        text = "SMA",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 3.89697265625.dp,
                                y = 0.dp)
                            .requiredWidth(width = 53.dp)
                            .requiredHeight(height = 26.dp))
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 182.dp,
                    y = 417.dp)
                .requiredWidth(width = 65.dp)
                .requiredHeight(height = 39.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 65.dp)
                    .requiredHeight(height = 39.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 65.dp)
                        .requiredHeight(height = 39.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xff898686))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.7f)),
                            shape = RoundedCornerShape(10.dp)))
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.dp,
                            y = 4.dp)
                        .requiredWidth(width = 55.dp)
                        .requiredHeight(height = 29.dp)
                ) {
                    Text(
                        text = "SMP",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 1.9677734375.dp)
                            .requiredWidth(width = 53.dp)
                            .requiredHeight(height = 27.dp))
                    Text(
                        text = "SMP",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 1.959228515625.dp,
                                y = 0.dp)
                            .requiredWidth(width = 53.dp)
                            .requiredHeight(height = 26.dp))
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 71.dp,
                    y = 417.dp)
                .requiredWidth(width = 56.dp)
                .requiredHeight(height = 39.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 56.dp)
                    .requiredHeight(height = 39.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 56.dp)
                        .requiredHeight(height = 39.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xff898686))
                        .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.7f)),
                            shape = RoundedCornerShape(10.dp)))
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 5.dp)
                        .requiredWidth(width = 35.dp)
                        .requiredHeight(height = 28.dp)
                ) {
                    Text(
                        text = "SD",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 1.39990234375.dp)
                            .requiredWidth(width = 32.dp)
                            .requiredHeight(height = 27.dp))
                    Text(
                        text = "SD",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .requiredWidth(width = 35.dp)
                            .requiredHeight(height = 27.dp))
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 6.dp,
                    y = 6.dp)
                .requiredSize(size = 45.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 45.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White))
            Image(
                painter = painterResource(id = R.drawable.logo_educare),
                contentDescription = "Logo Educare",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 7.425048828125.dp,
                        y = 6.0751953125.dp)
                    .requiredWidth(width = 30.dp)
                    .requiredHeight(height = 33.dp))
        }
    }
}

