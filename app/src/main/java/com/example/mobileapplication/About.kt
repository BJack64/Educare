package com.example.mobileapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun About(
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
                .requiredHeight(height = 200.dp)
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
                text = "About",
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
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            // Giovanni Daniel Setiadi
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.offset(x = -10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.daniel),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Giovanni Daniel Setiadi",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "2602088361",
                    color = Color.Black,
                    style = TextStyle(fontSize = 16.sp)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Full Stack Developer",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )
            }

            Spacer(modifier = Modifier.width(32.dp))

            // Nicholas Emmanuel Kara
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.offset(x = -15.dp, y = 3.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.nicholas),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Nicholas Emmanuel Kara",
                    color = Color.Black,
                    style = TextStyle(fontSize = 14.sp)
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "2602112360",
                    color = Color.Black,
                    style = TextStyle(fontSize = 16.sp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Back End Developer",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Fawzil Adhin
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.offset(x = -10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.adhin),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Fawzil Adhin",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "2602205420",
                    color = Color.Black,
                    style = TextStyle(fontSize = 16.sp)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Front End Developer",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )
            }

            Spacer(modifier = Modifier.width(32.dp))

            // Nirel Raynard Lumbaa
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.offset(x = -15.dp, y = 3.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.nirel),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Nirel Raynard Lumbaa",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "2602173910",
                    color = Color.Black,
                    style = TextStyle(fontSize = 16.sp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Back End Developer",
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp)
                )
            }
        }
    }
}