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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun ReviewQuiz(navController: NavController, modifier: Modifier = Modifier, matpel: String?, materi: String?) {
    var link by remember { mutableStateOf("") }
    var soal_1 by remember {mutableStateOf("")}
    var jwb1 by remember {mutableStateOf("")}
    var jwb1_2 by remember {mutableStateOf("")}
    var jwb1_3 by remember {mutableStateOf("")}
    var jwb1_4 by remember {mutableStateOf("")}
    var soal_2 by remember {mutableStateOf("")}
    var jwb2 by remember {mutableStateOf("")}
    var jwb2_2 by remember {mutableStateOf("")}
    var jwb2_3 by remember {mutableStateOf("")}
    var jwb2_4 by remember {mutableStateOf("")}
    var soal_3 by remember {mutableStateOf("")}
    var jwb3 by remember {mutableStateOf("")}
    var jwb3_2 by remember {mutableStateOf("")}
    var jwb3_3 by remember {mutableStateOf("")}
    var jwb3_4 by remember {mutableStateOf("")}
    var soal_4 by remember {mutableStateOf("")}
    var jwb4 by remember {mutableStateOf("")}
    var jwb4_2 by remember {mutableStateOf("")}
    var jwb4_3 by remember {mutableStateOf("")}
    var jwb4_4 by remember {mutableStateOf("")}
    var soal_5 by remember {mutableStateOf("")}
    var jwb5 by remember {mutableStateOf("")}
    var jwb5_2 by remember {mutableStateOf("")}
    var jwb5_3 by remember {mutableStateOf("")}
    var jwb5_4 by remember {mutableStateOf("")}
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

    val randomizedAnswers1 = remember { mutableStateListOf<String>() }
    var jawabanTerpilih1 by remember { mutableStateOf("") }

    val randomizedAnswers2 = remember { mutableStateListOf<String>() }
    var jawabanTerpilih2 by remember { mutableStateOf("") }

    val randomizedAnswers3 = remember { mutableStateListOf<String>() }
    var jawabanTerpilih3 by remember { mutableStateOf("") }

    val randomizedAnswers4 = remember { mutableStateListOf<String>() }
    var jawabanTerpilih4 by remember { mutableStateOf("") }

    val randomizedAnswers5 = remember { mutableStateListOf<String>() }
    var jawabanTerpilih5 by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        // Link
        firestoreHelper.readLinkMateri("$matpel", "$materi") { linkMateri ->
            if (linkMateri != null) {
                link = linkMateri
            }
        }
        // Soal 1
        firestoreHelper.readQuiz("$matpel", "$materi", "soal", "1") { string ->
            if (string != null) {
                soal_1 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "1") { string ->
            if (string != null) {
                jwb1 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "1_2") { string ->
            if (string != null) {
                jwb1_2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "1_3") { string ->
            if (string != null) {
                jwb1_3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "1_4") { string ->
            if (string != null) {
                jwb1_4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "terpilih1") { string ->
            if (string != null) {
                jawabanTerpilih1 = string
            }
        }
        // Soal 2
        firestoreHelper.readQuiz("$matpel", "$materi", "soal", "2") { string ->
            if (string != null) {
                soal_2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "2") { string ->
            if (string != null) {
                jwb2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "2_2") { string ->
            if (string != null) {
                jwb2_2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "2_3") { string ->
            if (string != null) {
                jwb2_3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "2_4") { string ->
            if (string != null) {
                jwb2_4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "terpilih2") { string ->
            if (string != null) {
                jawabanTerpilih2 = string
            }
        }
        // Soal 3
        firestoreHelper.readQuiz("$matpel", "$materi", "soal", "3") { string ->
            if (string != null) {
                soal_3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "3") { string ->
            if (string != null) {
                jwb3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "3_2") { string ->
            if (string != null) {
                jwb3_2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "3_3") { string ->
            if (string != null) {
                jwb3_3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "3_4") { string ->
            if (string != null) {
                jwb3_4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "terpilih3") { string ->
            if (string != null) {
                jawabanTerpilih3 = string
            }
        }
        // Soal 4
        firestoreHelper.readQuiz("$matpel", "$materi", "soal", "4") { string ->
            if (string != null) {
                soal_4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "4") { string ->
            if (string != null) {
                jwb4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "4_2") { string ->
            if (string != null) {
                jwb4_2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "4_3") { string ->
            if (string != null) {
                jwb4_3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "4_4") { string ->
            if (string != null) {
                jwb4_4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "terpilih4") { string ->
            if (string != null) {
                jawabanTerpilih4 = string
            }
        }
        // Soal 5
        firestoreHelper.readQuiz("$matpel", "$materi", "soal", "5") { string ->
            if (string != null) {
                soal_5 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "5") { string ->
            if (string != null) {
                jwb5 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "5_2") { string ->
            if (string != null) {
                jwb5_2 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "5_3") { string ->
            if (string != null) {
                jwb5_3 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "5_4") { string ->
            if (string != null) {
                jwb5_4 = string
            }
        }
        firestoreHelper.readQuiz("$matpel", "$materi", "jawaban", "terpilih5") { string ->
            if (string != null) {
                jawabanTerpilih5 = string
            }
        }
    }

    LaunchedEffect(jwb1, jwb1_2, jwb1_3, jwb1_4) {
        if (jwb1.isNotEmpty() && jwb1_2.isNotEmpty() && jwb1_3.isNotEmpty() && jwb1_4.isNotEmpty()) {
            randomizedAnswers1.clear()
            randomizedAnswers1.addAll(listOf(jwb1, jwb1_2, jwb1_3, jwb1_4))
            randomizedAnswers1.shuffle()
        }
    }

    LaunchedEffect(jwb2, jwb2_2, jwb2_3, jwb2_4) {
        if (jwb2.isNotEmpty() && jwb2_2.isNotEmpty() && jwb2_3.isNotEmpty() && jwb2_4.isNotEmpty()) {
            randomizedAnswers2.clear()
            randomizedAnswers2.addAll(listOf(jwb2, jwb2_2, jwb2_3, jwb2_4))
            randomizedAnswers2.shuffle()
        }
    }

    LaunchedEffect(jwb3, jwb3_2, jwb3_3, jwb3_4) {
        if (jwb3.isNotEmpty() && jwb3_2.isNotEmpty() && jwb3_3.isNotEmpty() && jwb3_4.isNotEmpty()) {
            randomizedAnswers3.clear()
            randomizedAnswers3.addAll(listOf(jwb3, jwb3_2, jwb3_3, jwb3_4))
            randomizedAnswers3.shuffle()
        }
    }

    LaunchedEffect(jwb4, jwb4_2, jwb4_3, jwb4_4) {
        if (jwb4.isNotEmpty() && jwb4_2.isNotEmpty() && jwb4_3.isNotEmpty() && jwb4_4.isNotEmpty()) {
            randomizedAnswers4.clear()
            randomizedAnswers4.addAll(listOf(jwb4, jwb4_2, jwb4_3, jwb4_4))
            randomizedAnswers4.shuffle()
        }
    }

    LaunchedEffect(jwb5, jwb5_2, jwb5_3, jwb5_4) {
        if (jwb5.isNotEmpty() && jwb5_2.isNotEmpty() && jwb5_3.isNotEmpty() && jwb5_4.isNotEmpty()) {
            randomizedAnswers5.clear()
            randomizedAnswers5.addAll(listOf(jwb5, jwb5_2, jwb5_3, jwb5_4))
            randomizedAnswers5.shuffle()
        }
    }

    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 852.dp)
            .background(color = Color(0xffc6cbe0))
    ) {
        Image(
            painter = painterResource(id = backgroundImg),
            contentDescription = "Rectangle 39372",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(y = 70.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 876.dp)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 50.dp,
                    y = 160.dp
                )
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 740.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_putih_soal_quiz),
                contentDescription = "Bg_putih Soal",
                modifier = Modifier
                    .requiredWidth(width = 351.dp)
                    .requiredHeight(height = 740.dp)
                    .offset(x = -10.dp, y = -70.dp)
            )
            Column(
                modifier = Modifier
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 600.dp)
                    .offset(x = -14.dp, y = -10.dp)
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
            ) {
                // Soal 1
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Text(
                        text = "1. $soal_1",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier
                            .padding(8.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                // Jawaban
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                ) {
                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers1.forEachIndexed { index, jawaban ->
                            // Jawaban A & C
                            if (index % 2 == 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb1 -> Color.Green
                                                jawaban == jawabanTerpilih1 && jawaban != jwb1 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers1.forEachIndexed { index, jawaban ->
                            // Jawaban B & D
                            if (index % 2 != 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb1 -> Color.Green
                                                jawaban == jawabanTerpilih1 && jawaban != jwb1 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                // Soal 2
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Text(
                        text = "2. $soal_2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier
                            .padding(8.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                // Jawaban
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                ) {
                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers2.forEachIndexed { index, jawaban ->
                            // Jawaban A & C
                            if (index % 2 == 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb2 -> Color.Green
                                                jawaban == jawabanTerpilih2 && jawaban != jwb2 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers2.forEachIndexed { index, jawaban ->
                            // Jawaban B & D
                            if (index % 2 != 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb2 -> Color.Green
                                                jawaban == jawabanTerpilih2 && jawaban != jwb2 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                // Soal 3
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Text(
                        text = "3. $soal_3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier
                            .padding(8.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                // Jawaban
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                ) {
                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers3.forEachIndexed { index, jawaban ->
                            // Jawaban A & C
                            if (index % 2 == 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb3 -> Color.Green
                                                jawaban == jawabanTerpilih3 && jawaban != jwb3 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers3.forEachIndexed { index, jawaban ->
                            // Jawaban B & D
                            if (index % 2 != 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb3 -> Color.Green
                                                jawaban == jawabanTerpilih3 && jawaban != jwb3 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                // Soal 4
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Text(
                        text = "4. $soal_4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier
                            .padding(8.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                // Jawaban
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                ) {
                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers4.forEachIndexed { index, jawaban ->
                            // Jawaban A & C
                            if (index % 2 == 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb4 -> Color.Green
                                                jawaban == jawabanTerpilih4 && jawaban != jwb4 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers4.forEachIndexed { index, jawaban ->
                            // Jawaban B & D
                            if (index % 2 != 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb4 -> Color.Green
                                                jawaban == jawabanTerpilih4 && jawaban != jwb4 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                // Soal 5
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xfff6f2f2))
                        .border(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.05f)),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Text(
                        text = "5. $soal_5",
                        color = Color.Black,
                        style = TextStyle(fontSize = 15.sp),
                        modifier = Modifier
                            .padding(8.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                // Jawaban
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                ) {
                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers5.forEachIndexed { index, jawaban ->
                            // Jawaban A & C
                            if (index % 2 == 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb5 -> Color.Green
                                                jawaban == jawabanTerpilih5 && jawaban != jwb5 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        randomizedAnswers5.forEachIndexed { index, jawaban ->
                            // Jawaban B & D
                            if (index % 2 != 0) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 160.dp)
                                        .wrapContentHeight()
                                        .background(
                                            color = when {
                                                jawaban == jwb5 -> Color.Green
                                                jawaban == jawabanTerpilih5 && jawaban != jwb5 -> Color.Red
                                                else -> Color.Gray
                                            }
                                        )
                                        .clip(shape = RoundedCornerShape(30.dp))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "${'a' + index}. $jawaban",
                                        color = Color.Black,
                                        style = TextStyle(fontSize = 15.sp),
                                        modifier = Modifier
                                            .wrapContentWidth()
                                            .wrapContentHeight()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 5.dp
                )
                .requiredSize(size = 45.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 45.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
            )
            Image(
                painter = painterResource(id = R.drawable.logo_educare),
                contentDescription = "Gambar Logo",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .requiredWidth(width = 45.dp)
                    .requiredHeight(height = 48.dp)
            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(y = 60.dp)
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 55.dp)
                .background(color = Color.Black.copy(alpha = 0.1f))
                .clickable {
                    navController.navigate("materi/$matpel/$materi")
                })
        Text(
            text = "Home > Materi > $matpel > $materi > Quiz > Hasil > Review",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 10.dp,
                    y = 70.dp)
                .requiredWidth(width = 410.dp)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 57.dp,
                    y = 190.dp
                )
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 589.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.tomboldone),
                contentDescription = "Tombol Done",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 75.dp,
                        y = 535.dp
                    )
                    .requiredWidth(width = 172.dp)
                    .requiredHeight(height = 175.dp)
                    .clickable {
                        navController.navigate("materi/$matpel/$materi")
                    })
        }
    }
}