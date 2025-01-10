package com.example.mobileapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
fun PKN(navController: NavController, modifier: Modifier = Modifier) {
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
                .background(color = Color(0xffCA880D))
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
                    fontSize = 40.sp),
                modifier = Modifier
                    .offset(y = -35.dp)
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
                        var matpel = "pkn"
                        var materi = "UUD"
                        navController.navigate("materi/$matpel/$materi")
                    })
            Text(
                text = "Undang-Undang Dasar",
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
                        y = 327.dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 50.dp)
                    
                    .background(color = Color(0xffD9D9D9))
            ) {
                Text(
                    text = "Simak dan pahami berbagai Undang-Undang Dasar NKRI",
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
                        var matpel = "pkn"
                        var materi = "HAM"
                        navController.navigate("materi/$matpel/$materi")
                    })
            Text(
                text = "Hak Asasi Manusia",
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
                    text = "Pelajari lebih lanjut apa itu Hak Asasi Manusia",
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
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                        shape = RoundedCornerShape(10.dp))
                    .clickable {
                        var matpel = "pkn"
                        var materi = "norma"
                        navController.navigate("materi/$matpel/$materi")
                    })
            Image(
                painter = painterResource(id = R.drawable.logo_pkn),
                contentDescription = "Logo PKN",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 46.dp,
                        y = 68.dp)
                    .requiredWidth(width = 75.dp)
                    .requiredHeight(height = 80.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_pkn),
                contentDescription = "Logo PKN",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 46.dp,
                        y = 197.dp)
                    .requiredWidth(width = 75.dp)
                    .requiredHeight(height = 80.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_pkn),
                contentDescription = "Logo PKN",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 46.dp,
                        y = 320.dp)
                    .requiredWidth(width = 75.dp)
                    .requiredHeight(height = 80.dp))
            Text(
                text = "Norma",
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
                    text = "Memahami apa itu norma dan penerapannya",
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
                    text = "Home > Materi > PKN",
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
                        y = 20.dp)
                    .requiredWidth(width = 105.dp)
                    .requiredHeight(height = 104.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xff828282).copy(alpha = 0.92f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 58.5.dp,
                        y = 22.5.dp)
                    .requiredWidth(width = 100.dp)
                    .requiredHeight(height = 100.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xffCA880D).copy(alpha = 0.92f)))
            Image(
                painter = painterResource(id = R.drawable.logo_pkn),
                contentDescription = "Logo PKN",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 65.dp,
                        y = 21.dp)
                    .requiredWidth(width = 90.dp)
                    .requiredHeight(height = 105.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 1.dp,
                        y = 132.dp)
                    .requiredWidth(width = 225.dp)
                    .requiredHeight(height = 73.dp)
            ) {
                Text(
                    text = "PKN",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = -2.dp,
                            y = 11.dp)
                        .requiredWidth(width = 223.dp)
                        .requiredHeight(height = 71.dp))
                Text(
                    text = "PKN",
                    color = Color(0xffCA880D),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 30.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = -2.dp,
                            y = 12.dp)
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

