package com.example.lab_1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab_1.ui.theme.Lab_1Theme

@Composable
fun Screen1(
    navController: NavController,
    sharedViewModel: SharedViewModel,
) {
    Lab_1Theme {
        Surface(
            modifier = Modifier
                .wrapContentSize()
                .padding(10.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .background(Color.White)
            ) {
                Text(text = "To jest ekran 1 mojej aplikacji", fontWeight = FontWeight.Bold)
                Text(text = "to jest ekran wejściowy")
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp),
                    onClick = {
                        sharedViewModel.incrementCounter()
                        val counterValue = sharedViewModel.counter
                        navController.navigate("screen2/$counterValue")
                    }) {
                    Text("Navigate to Screen 2")
                }
            }

        }

    }
}

@Composable
fun Screen2(navController: NavController,
            sharedViewModel: SharedViewModel,
            counter: Int) {
    Lab_1Theme {
        Surface(
            modifier = Modifier
                .wrapContentSize()
                .padding(10.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .background(Color.LightGray)
            ) {

                Text(text = "To jest ekran 2 mojej aplikacji", fontWeight = FontWeight.Bold)
                Text(text = "jakaś wartość:$counter")
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp),
                    onClick = {
                        sharedViewModel.incrementCounter()
                        val counterValue = sharedViewModel.counter
                        navController.navigate("screen3/$counterValue")
                    }) {
                    Text("Navigate to Screen 3")
                }
            }

        }

    }
    // Your composable content for Screen2
}

@Composable
fun Screen3(
    navController: NavController,
    sharedViewModel: SharedViewModel,
    counter: Int
) {
    Lab_1Theme {
        Surface(
            modifier = Modifier
                .wrapContentSize()
                .padding(10.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .background(Color.DarkGray)
            ) {
                Text(text = "To jest ekran 3 mojej aplikacji", color = Color.White, fontWeight = FontWeight.Bold)
                Text(text = "jakaś wartość:$counter", color = Color.White)
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp),
                    onClick = { sharedViewModel.incrementCounter()
                        val counterValue = sharedViewModel.counter
                        navController.navigate("screen2/$counterValue")}) {
                    Text("Navigate to Screen 2")
                }
            }

        }

    }
    // Your composable content for Screen3
}

@Preview
@Composable
fun PreviewScreen1(){
    MaterialTheme {
        Surface {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Naviaget to screen 2")
            }
        }

    }
}
@Preview
@Composable
fun PreviewScreen2(){
    MaterialTheme {
        Surface {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Naviaget to screen 3")
            }
        }

    }
}

@Preview
@Composable
fun PreviewScreen3(){
    MaterialTheme {
        Surface {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Naviaget to screen 1")
            }
        }

    }
}