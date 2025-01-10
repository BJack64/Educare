package com.example.mobileapplication

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun AdminScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    geminiAIClient: GeminiAIClient = viewModel(),
    matpel: String?,
    materi: String?
) {
    val context = LocalContext.current
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
    var result by remember { mutableStateOf("") }
    val uiState by geminiAIClient.uiState.collectAsState()
    val firestoreHelper = FirestoreHelper()
    val coroutineScope = rememberCoroutineScope()

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
    }

    fun CleanUp(input: String): String {
        val cleanedString = input.replace("*", "")

        return cleanedString
    }

    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ){
        Box(
            modifier = modifier
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 4200.dp)
                .background(color = Color(0xffC6CBE0))
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
                    .clickable{navController.navigate("admin")}
            )
            Text(
                text = "$materi",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 42.dp,
                        y = 25.dp)
                    .requiredWidth(width = 250.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 17.dp,
                        y = 132.dp)
                    .requiredWidth(width = 385.dp)
                    .requiredHeight(height = 43.dp)
            )
            // Materi
            TextField(
                value = link,
                onValueChange = { newValue: String -> link = newValue },
                label = {Text("Link Materi")},
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 15.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 90.dp,
                        y = 107.dp
                    )
                    .requiredWidth(width = 200.dp)
                    .requiredHeight(height = 50.dp)
                    .horizontalScroll(rememberScrollState())
            )
            Button(
                onClick = {
                    firestoreHelper.updateLinkMateri("$matpel", "$materi", "$link$materi") { success ->
                        if (success) {
                            Toast.makeText(context, "Link berhasil diubah", Toast.LENGTH_SHORT).show()
                        }
                    }
                },
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 300.dp,
                        y = 110.dp
                    )
            ) {
                Text(text = "Edit")
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 22.dp,
                        y = 180.dp)
                    .requiredWidth(width = 390.dp)
            ) {
                // Soal 1
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Soal 1",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 160.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = soal_1,
                        onValueChange = { newValue: String -> soal_1 = newValue },
                        label = {Text("Soal 1")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "soal", "1", "$soal_1") { success ->
                                if (success) {
                                    Toast.makeText(context, "Soal berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                    Button(
                        onClick = {
                            result = geminiAIClient.sendPrompt(link, "1", "$matpel", "$materi").toString()
                            coroutineScope.launch {
                                delay(3000)
                                navController.navigate("admin_screen/$matpel/$materi")
                            }
                        },
                        enabled = link.isNotEmpty(),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 200.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Buat Soal")
                    }
                }
                // Jawaban Benar
                Box(
                    modifier = Modifier
                        .offset(y = 160.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban Benar",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 130.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb1,
                        onValueChange = { newValue: String -> jwb1 = newValue },
                        label = {Text("Jawaban Benar")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "1", "$jwb1") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban benar berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 2
                Box(
                    modifier = Modifier
                        .offset(y = 320.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb1_2,
                        onValueChange = { newValue: String -> jwb1_2 = newValue },
                        label = {Text("Jawaban 2")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "1_2", "$jwb1_2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 2 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 3
                Box(
                    modifier = Modifier
                        .offset(y = 480.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb1_3,
                        onValueChange = { newValue: String -> jwb1_3 = newValue },
                        label = {Text("Jawaban 3")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "1_3", "$jwb1_3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 3 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 4
                Box(
                    modifier = Modifier
                        .offset(y = 640.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb1_4,
                        onValueChange = { newValue: String -> jwb1_4 = newValue },
                        label = {Text("Jawaban 4")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "1_4", "$jwb1_4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 4 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Soal 2
                Box(
                    modifier = Modifier
                        .offset(y = 800.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Soal 2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 160.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = soal_2,
                        onValueChange = { newValue: String -> soal_2 = newValue },
                        label = {Text("Soal 2")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "soal", "2", "$soal_2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Soal berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                    Button(
                        onClick = {
                            result = geminiAIClient.sendPrompt(link, "2", "$matpel", "$materi").toString()
                            coroutineScope.launch {
                                delay(3000)
                                navController.navigate("admin_screen/$matpel/$materi")
                            }
                        },
                        enabled = link.isNotEmpty(),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 200.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Buat Soal")
                    }
                }
                // Jawaban Benar
                Box(
                    modifier = Modifier
                        .offset(y = 960.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban Benar",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 130.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb2,
                        onValueChange = { newValue: String -> jwb2 = newValue },
                        label = {Text("Jawaban Benar")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "2", "$jwb2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban benar berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 2
                Box(
                    modifier = Modifier
                        .offset(y = 1120.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb2_2,
                        onValueChange = { newValue: String -> jwb2_2 = newValue },
                        label = {Text("Jawaban 2")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "2_2", "$jwb2_2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 2 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 3
                Box(
                    modifier = Modifier
                        .offset(y = 1280.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb2_3,
                        onValueChange = { newValue: String -> jwb2_3 = newValue },
                        label = {Text("Jawaban 3")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "2_3", "$jwb2_3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 3 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 4
                Box(
                    modifier = Modifier
                        .offset(y = 1440.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb2_4,
                        onValueChange = { newValue: String -> jwb2_4 = newValue },
                        label = {Text("Jawaban 4")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "2_4", "$jwb2_4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 4 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Soal 3
                Box(
                    modifier = Modifier
                        .offset(y = 1600.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Soal 3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 160.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = soal_3,
                        onValueChange = { newValue: String -> soal_3= newValue },
                        label = {Text("Soal 3")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "soal", "3", "$soal_3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Soal berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                    Button(
                        onClick = {
                            result = geminiAIClient.sendPrompt(link, "3", "$matpel", "$materi").toString()
                            coroutineScope.launch {
                                delay(3000)
                                navController.navigate("admin_screen/$matpel/$materi")
                            }
                        },
                        enabled = link.isNotEmpty(),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 200.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Buat Soal")
                    }
                }
                // Jawaban Benar
                Box(
                    modifier = Modifier
                        .offset(y = 1760.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban Benar",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 130.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb3,
                        onValueChange = { newValue: String -> jwb3 = newValue },
                        label = {Text("Jawaban Benar")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "3", "$jwb3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban benar berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 2
                Box(
                    modifier = Modifier
                        .offset(y = 1920.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb3_2,
                        onValueChange = { newValue: String -> jwb3_2 = newValue },
                        label = {Text("Jawaban 2")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "3_2", "$jwb3_2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 2 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 3
                Box(
                    modifier = Modifier
                        .offset(y = 2080.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb3_3,
                        onValueChange = { newValue: String -> jwb3_3 = newValue },
                        label = {Text("Jawaban 3")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "3_3", "$jwb3_3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 3 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 4
                Box(
                    modifier = Modifier
                        .offset(y = 2240.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb3_4,
                        onValueChange = { newValue: String -> jwb3_4 = newValue },
                        label = {Text("Jawaban 4")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "3_4", "$jwb3_4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 4 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Soal 4
                Box(
                    modifier = Modifier
                        .offset(y = 2400.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Soal 4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 160.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = soal_4,
                        onValueChange = { newValue: String -> soal_4 = newValue },
                        label = {Text("Soal 4")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "soal", "4", "$soal_4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Soal berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                    Button(
                        onClick = {
                            result = geminiAIClient.sendPrompt(link, "4", "$matpel", "$materi").toString()
                            coroutineScope.launch {
                                delay(3000)
                                navController.navigate("admin_screen/$matpel/$materi")
                            }
                        },
                        enabled = link.isNotEmpty(),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 200.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Buat Soal")
                    }
                }
                // Jawaban Benar
                Box(
                    modifier = Modifier
                        .offset(y = 2560.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban Benar",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 130.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb4,
                        onValueChange = { newValue: String -> jwb4 = newValue },
                        label = {Text("Jawaban Benar")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "4", "$jwb4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban benar berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 2
                Box(
                    modifier = Modifier
                        .offset(y = 2720.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb4_2,
                        onValueChange = { newValue: String -> jwb4_2 = newValue },
                        label = {Text("Jawaban 2")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "4_2", "$jwb4_2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 2 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 3
                Box(
                    modifier = Modifier
                        .offset(y = 2880.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb4_3,
                        onValueChange = { newValue: String -> jwb4_3 = newValue },
                        label = {Text("Jawaban 3")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "4_3", "$jwb4_3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 3 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 4
                Box(
                    modifier = Modifier
                        .offset(y = 3040.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb4_4,
                        onValueChange = { newValue: String -> jwb4_4 = newValue },
                        label = {Text("Jawaban 4")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "4_4", "$jwb4_4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 4 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Soal 5
                Box(
                    modifier = Modifier
                        .offset(y = 3200.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Soal 5",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 160.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = soal_5,
                        onValueChange = { newValue: String -> soal_5 = newValue },
                        label = {Text("Soal 5")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "soal", "5", "$soal_5") { success ->
                                if (success) {
                                    Toast.makeText(context, "Soal berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                    Button(
                        onClick = {
                            result = geminiAIClient.sendPrompt(link, "5", "$matpel", "$materi").toString()
                            coroutineScope.launch {
                                delay(3000)
                                navController.navigate("admin_screen/$matpel/$materi")
                            }
                        },
                        enabled = link.isNotEmpty(),
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 200.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Buat Soal")
                    }
                }
                // Jawaban Benar
                Box(
                    modifier = Modifier
                        .offset(y = 3360.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban Benar",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 130.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb5,
                        onValueChange = { newValue: String -> jwb5 = newValue },
                        label = {Text("Jawaban Benar")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "5", "$jwb5") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban benar berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 2
                Box(
                    modifier = Modifier
                        .offset(y = 3520.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 2",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb5_2,
                        onValueChange = { newValue: String -> jwb5_2 = newValue },
                        label = {Text("Jawaban 2")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "5_2", "$jwb5_2") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 2 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 3
                Box(
                    modifier = Modifier
                        .offset(y = 3680.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 3",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb5_3,
                        onValueChange = { newValue: String -> jwb5_3 = newValue },
                        label = {Text("Jawaban 3")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "5_3", "$jwb5_3") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 3 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
                // Jawaban 4
                Box(
                    modifier = Modifier
                        .offset(y = 3840.dp)
                        .requiredWidth(width = 390.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                ) {
                    Text (
                        text = "Jawaban 4",
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 140.dp,
                                y = 5.dp
                            ))
                    TextField(
                        value = jwb5_4,
                        onValueChange = { newValue: String -> jwb5_4 = newValue },
                        label = {Text("Jawaban 4")},
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 5.dp,
                                y = 30.dp
                            )
                            .requiredWidth(width = 380.dp)
                            .requiredHeight(height = 55.dp)
                            .horizontalScroll(rememberScrollState())
                    )
                    Button(
                        onClick = {
                            firestoreHelper.updateQuiz("$matpel", "$materi", "jawaban", "5_4", "$jwb5_4") { success ->
                                if (success) {
                                    Toast.makeText(context, "Jawaban 4 berhasil diubah", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .offset(
                                x = 315.dp,
                                y = -10.dp
                            )
                    ) {
                        Text(text = "Edit")
                    }
                }
            }
        }
    }
}