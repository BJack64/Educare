package com.example.mobileapplication

import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController

@Composable
fun WebPageViewer(url: String?, modifier: Modifier = Modifier) {
    if (!url.isNullOrEmpty()) {
        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    settings.javaScriptEnabled = true
                    settings.setSupportZoom(true)
                    settings.builtInZoomControls = true
                    settings.displayZoomControls = false
                    isVerticalScrollBarEnabled = true
                    isHorizontalScrollBarEnabled = true
                    webViewClient = WebViewClient()
                    loadUrl(url)
                }
            },
            modifier = modifier
        )
    } else {
        Log.e("WebPageViewer", "The URL is null or empty.")
    }
}

@Composable
fun Materi(navController: NavController, modifier: Modifier = Modifier, materi: String?, matpel: String?) {
    var link by remember { mutableStateOf("") }
    val firestoreHelper = FirestoreHelper()

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

    LaunchedEffect(Unit) {
        firestoreHelper.readLinkMateri("$matpel", "$materi") { linkMateri ->
            if (linkMateri != null) {
                link = linkMateri
            }
        }
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
                WebPageViewer(
                    url = link,
                    modifier = Modifier
                        .requiredWidth(400.dp)
                        .requiredHeight(700.dp)
                        .offset(x = -10.dp, y = 8.dp)
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
                        painter = painterResource(id = R.drawable.tombolquiz),
                        contentDescription = "Rectangle 39396",
                        modifier = Modifier
                            .requiredWidth(width = 187.dp)
                            .requiredHeight(height = 41.dp)
                            .offset(x = -15.dp,
                                y = 175.dp)
                            .clip(shape = RoundedCornerShape(30.dp))
                            .clickable {
                                navController.navigate("quiz/$matpel/$materi")
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
            )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 105.dp,
                            y = 16.dp)
                        .requiredWidth(width = 230.dp)
                        .requiredHeight(height = 54.dp)
                )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 38.dp,
                        y = 0.dp)
                    .requiredWidth(width = 430.dp)
                    .requiredHeight(height = 55.dp)
                    .background(color = Color.Black.copy(alpha = 0.1f))
                    .clickable {
                        if(matpel == "indonesia") {
                            navController.navigate("indonesia")
                        } else if (matpel == "matematika") {
                            navController.navigate("matematika")
                        } else if (matpel == "inggris") {
                            navController.navigate("inggris")
                        } else if (matpel == "ipa") {
                            navController.navigate("ipa")
                        } else if (matpel == "ips") {
                            navController.navigate("ips")
                        } else {
                            navController.navigate("pkn")
                        }
                    })
            Text(
                text = "Home > Materi > $matpel > $materi",
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