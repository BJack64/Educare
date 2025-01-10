package com.example.mobileapplication

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.navigation.NavHostController

@Composable
fun Indonesia(navController: NavController, modifier: Modifier = Modifier) {
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
                    y = 75.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 200.dp)
                .background(color = Color(0xffE82441))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 4.dp,
                    y = 443.dp)
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
                    fontSize = 40.sp),
                modifier = Modifier
                    .offset(y = -20.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 40.dp))
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
                        shape = RoundedCornerShape(10.dp))
                    .clickable {
                        var matpel = "indonesia"
                        var materi = "surat_kerja"
                        navController.navigate("materi/$matpel/$materi")
                    })
            Text(
                text = "Surat Kerja",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp),
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
                        y = 357.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    .background(color = Color(0xffD9D9D9))
            ) {
                Text(
                    text = "Pelajari lebih lanjut cara membuat surat lamaran kerja",
                    color = Color.Black,
                    style = TextStyle(fontSize = 12.sp),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
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
                        shape = RoundedCornerShape(10.dp))
                    .clickable {
                        var matpel = "indonesia"
                        var materi = "drama"
                        navController.navigate("materi/$matpel/$materi")
                    })
            Text(
                text = "Drama",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp),
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
                        y = 225.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    .background(color = Color(0xffD9D9D9))
            ) {
                Text(
                    text = "Melalui materi ini anda akan mempelajari dasar dari seni drama",
                    color = Color.Black,
                    style = TextStyle(fontSize = 12.sp),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 51.7998046875.dp)
                    .requiredWidth(width = 352.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xfff6f2f2))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)), shape = RoundedCornerShape(10.dp))
                    .clickable {
                        var matpel = "indonesia"
                        var materi = "pantun"
                        navController.navigate("materi/$matpel/$materi")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.logo_ind),
                contentDescription = "Logo Bahasa Indonesia",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 68.dp)
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 77.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_ind),
                contentDescription = "Logo Bahasa Indonesia",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 197.dp)
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 77.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_ind),
                contentDescription = "Logo Bahasa Indonesia",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 320.dp)
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 77.dp))
            Text(
                text = "Pantun",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp),
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
                        y = 100.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    .background(color = Color(0xffD9D9D9))
            ) {
                Text(
                    text = "Materi ini akan mengajarkan anda cara membuat pantun",
                    color = Color.Black,
                    style = TextStyle(fontSize = 12.sp),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
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
                        y = 20.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 38.dp)
                    .background(color = Color.Black.copy(alpha = 0.1f))
                    .clickable {
                        navController.navigate("home")
                    })
            {
                Text(
                    text = "Home > Materi > Bahasa Indonesia",
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
            )
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
                        y = 10.dp)
                    .requiredWidth(width = 105.dp)
                    .requiredHeight(height = 104.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xff828282).copy(alpha = 0.92f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 58.731689453125.dp,
                        y = 12.7705078125.dp)
                    .requiredWidth(width = 100.dp)
                    .requiredHeight(height = 98.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xffE82441).copy(alpha = 0.92f)))
            Image(
                painter = painterResource(id = R.drawable.logo_ind),
                contentDescription = "Logo Bahasa Indonesia",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 15.dp)
                    .requiredWidth(width = 119.dp)
                    .requiredHeight(height = 96.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 122.dp)
                    .requiredWidth(width = 225.dp)
                    .requiredHeight(height = 73.dp)
            ) {
                Text(
                    text = "Bahasa Indonesia",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = -2.dp,
                            y = -1.dp)
                        .requiredWidth(width = 223.dp)
                        .requiredHeight(height = 71.dp))
                Text(
                    text = "Bahasa Indonesia",
                    color = Color(0xffE82441),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
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
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 182.dp,
                    y = 417.dp)
                .requiredWidth(width = 65.dp)
                .requiredHeight(height = 39.dp)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 71.dp,
                    y = 417.dp)
                .requiredWidth(width = 56.dp)
                .requiredHeight(height = 39.dp)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 30.dp)
                .requiredSize(size = 100.dp)
        ) {
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