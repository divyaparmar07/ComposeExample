package com.example.composeexample

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun PreviewHere() {
    LoginExample()
}
@Composable
fun LoginExample() {

    var text1 by remember { mutableStateOf("") }
//    var result by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            Text(text = "Name:", modifier = Modifier.padding(top = 10.dp), fontSize = 22.sp)
            TextField(value = text1,
                onValueChange = { text1 = it })
        }
        Text(
            text = text1,
            modifier = Modifier.padding(10.dp),
            fontSize = 22.sp,

            )
        Button(
            onClick = {  }) {
            Text(text = "Submit")
        }
        Button(onClick = {  }) {
            Text(text = "Clear")
        }
    }
}

//@Composable
//fun LoginExample() {
//
//    var text1 by remember { mutableStateOf("") }
//    var result by remember { mutableStateOf("") }
//
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Row() {
//            Text(text = "Name:", modifier = Modifier.padding(top = 10.dp), fontSize = 22.sp)
//            TextField(value = text1,
//                onValueChange = { text1 = it })
//        }
//        Text(
//            text = result,
//            modifier = Modifier.padding(10.dp),
//            fontSize = 22.sp,
//
//            )
//        Button(
//            onClick = { result = text1 }) {
//            Text(text = "Submit")
//        }
//        Button(onClick = { result = "" }) {
//            Text(text = "Clear")
//        }
//    }
//}
