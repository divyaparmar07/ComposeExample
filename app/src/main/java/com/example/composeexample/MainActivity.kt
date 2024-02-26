package com.example.composeexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            PreviewItem()
//            PreviewFunction()
//            Pattern()
//            Greeting()
//            SpacerExample()
//            CircularImage()
//            BoxExample0()
//            boxExample()
            LoginExample()
//            PreviewItem()
//            TextInput()
//            sayHello("Divya")
//            TextInput()
        }
    }
}

//@Preview(showSystemUi = true)
@Composable
fun PaddingEg() {
//    Text(
//        text = "Hello World!",
//        color = Color.White,
//        modifier = Modifier
//            .padding(8.dp) // margin
//            .border(2.dp, Color.White) // outer border
//            .padding(8.dp) // space between the borders
//            .border(2.dp, Color.Green) // inner border
//            .padding(8.dp) // padding
//    )

//    Column(modifier = Modifier
//        .padding(all = 28.dp)
//        .background(color = Color.Yellow)
//        .padding(all = 30.dp)) {
//        Text(text = "Android")
//        Text(text = "11:00pm")
//    }

    Box(Modifier.padding()) {
        Surface(color = Color.LightGray) {
            Text(
                text = "Hello World!", color = Color.Blue,
                modifier = Modifier.padding(start = 8.dp, end = 10.dp, top = 20.dp, bottom = 15.dp)
            )
        }
    }
}

//@Preview(showSystemUi = true)
@Composable
fun MyUI1() {
    Text(
        text = "Text 1",
        modifier = Modifier
            .background(color = Color.Yellow)
    )

    Text(
        text = "Text 2",
        modifier = Modifier
            .padding(top = 72.dp, bottom = 45.dp, end = 10.dp) // margin
            .background(color = Color.Yellow)
            .padding(20.dp) // padding
    )
}

//@Preview(showSystemUi = true)
@Composable
fun MyUI2() {
    Text(
        text = "Text 1",
        modifier = Modifier
            .background(color = Color.Yellow)
    )

    Text(
        text = "Text 2",
        modifier = Modifier
            .padding(top = 52.dp, start = 20.dp, end = 20.dp) // margin
            .background(color = Color.Yellow)
            .padding(top = 16.dp) // padding
    )
}

//@Preview(showSystemUi = true)
@Composable
fun MyUI() {
    Row(
        modifier = Modifier
            .border(width = 3.dp, color = Color.Yellow)
    ) {
        Text(text = "Text 1")

        Spacer(modifier = Modifier.width(width = 50.dp))

        Text(text = "Text 2")
    }
}

//Text()
@Preview(showSystemUi = true)
@Composable
fun MyUI4() {
    Column() {
//        Text(TextStyle(Color(0xFFE91E63)),text = "Hello")
        Text("sdfgn",)
    }
    Column() {
        Text(text = "World")
    }

}

//@Preview(showSystemUi = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.Bottom
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello", style = TextStyle())

//        Text(name)
    }
    val padding = 16.dp
//    Column(
//        Modifier
//            .padding(padding)
//            .fillMaxWidth()
//    ) {
//        Text("Hello")
//    }
}

//@Preview
@Composable
fun Pattern() {
    Column() {
        Row() {
            Text(text = "1", fontSize = 24.sp)
        }
        Row() {
            Text(text = "2", fontSize = 24.sp)
        }
        Row() {
            Text(text = "3", fontSize = 24.sp)
            Text(text = "4", fontSize = 24.sp)
            Text(text = "5", fontSize = 24.sp)
        }
    }
}

fun sayHello(name: String) {
    print("Hello$name")
}

@Preview(showSystemUi = true)
@Composable
fun SpacerExample() {
    //vertical
    /*Column() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Yellow)
        ) {

        }
        
        Spacer(modifier = Modifier.height(50.dp))
        
        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Blue)
        ) {

        }
    }*/
    Row() {
        Box(modifier = Modifier
            .fillMaxHeight()
            .background(Color.Yellow)
            .width(100.dp)) {
        }

        Spacer(modifier = Modifier
            .weight(1f)
            .fillMaxWidth())

        Box(modifier = Modifier
            .fillMaxHeight()
            .background(Color.Blue)
            .width(100.dp)) {

        }

        Spacer(modifier = Modifier
            .weight(1f)
            .fillMaxWidth())

    }
}

//@Preview
@Composable
private fun PreviewFunction() {
    MaterialTheme {
        //TextField
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
//            .padding(25.dp)
                .fillMaxSize()
        ) {
            var text by remember {
                mutableStateOf("")
            }
            TextField(value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = { Text("Name") })

            // TextField(value = "", onValueChange = {}, placeholder = { Text("Enter Email") })
            Column() {
                var text1 by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = text1,
                    onValueChange = { newText ->
                        text1 = newText
                    },
                    Modifier.padding(10.dp),
                    label = {
                        Text("Email")
                    }
                )
            }
            Column() {
                var text1 by remember {
                    mutableStateOf("")
                }
                Button(onClick = {}) {
                    Text(text = "Login")
                }
            }
        }

    }

//    Text(text = "Hello")
//    Text(text = "Hi")
//    Hello()

//    Text(text = "Hello",
//        color = Color.White,
//        modifier = Modifier
//            .clickable { }
//            .background(Color.Blue)
//            .size(200.dp)
//            .border(4.dp, Color.Red)
//            .clip(CircleShape)
//            .background(Color.Yellow)
////            .fillMaxSize()
////            .clickable {  }
//    )

//    Column() {
//        ListViewItem(imgId = R.drawable.arrow, name = "Divya Parmar", occupation = "Software Engineering" )
//        ListViewItem(imgId = R.drawable.arrow, name = "Divya Parmar", occupation = "Software Engineering" )
//        ListViewItem(imgId = R.drawable.arrow, name = "Divya Parmar", occupation = "Software Engineering" )
//        ListViewItem(imgId = R.drawable.arrow, name = "Divya Parmar", occupation = "Software Engineering" )
//    }

    //Frame Layout
//    Box(
//        contentAlignment = Alignment.Center
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

//    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

    //Linear Layout
//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.Start
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

//    Text(text = "A", fontSize = 24.sp)
//    Text(text = "B", fontSize = 24.sp)
//    TextField(
//        value = "Hello Divya",
//        onValueChange = {},
//        label = {
//            Text(text = "Enter Name")
//        },
//        placeholder = {}
//    )
//    Button(onClick = { }, colors = ButtonDefaults.buttonColors(
//        contentColor = Color.White,
//        backgroundColor = Color.Black
//    ),
//        enabled = false
//    ) {
//        Text(text = "Hello")
//        Image(
//            painter = painterResource(id = R.drawable.arrow),
//            contentDescription ="Arrow"
//        )
//    }
//    Image(
//        painter = painterResource(id =R.drawable.lotus_flower ),
//        contentDescription ="Image",
//        colorFilter = ColorFilter.tint(Color.Cyan),
//        contentScale = ContentScale.Crop
//    )
    //SayHello(name = "Div")
//    Text(
//        text = "Hello",
//        fontStyle = FontStyle.Italic,
//        color = Color.Cyan,
//        fontWeight = FontWeight.Bold,
//        fontSize = 30.sp,
//        textAlign = TextAlign.Right
//    )
//    Row() {
//        Column() {
//            Text(text = "1", fontSize = 24.sp)
//            Text(text = "2", fontSize = 24.sp)
//            Row() {
//                Text(text = "3", fontSize = 24.sp)
//                Text(text = "4", fontSize = 24.sp)
//                Text(text = "5", fontSize = 24.sp)
//            }
//        }
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
////        Column() {
////            Text(text = "1", color = Color.Black)
////            Text(text = "2", color = Color.Black)
////
////        }
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            Text(text = "3", color = Color.Black)
//            Text(text = "4", color = Color.Black)
//            Text(text = "5", color = Color.Black)
//        }
//
//        Spacer(modifier = Modifier.height(16.dp)) // Spacer between Row and Column
//
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.spacedBy(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Row() {
//                Text(text = "6", color = Color.Black)
//            }
//
//            Text(text = "8", color = Color.Black)
//        }
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.spacedBy(8.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "6", color = Color.Blue)
//            Text(text = "8", color = Color.Blue)
////            Text(text = "", color = Color.Blue)
//        }

    //Spacer(modifier = Modifier.height(16.dp)) // Spacer between Row and Column
//        row(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "6", color = Color.Blue)
//            Text(text = "8", color = Color.Blue)
////            Text(text = "", color = Color.Blue)
//        }

//        }
//        Row() {
//            Text(text = "2", fontSize = 24.sp)
//        }
//        Row() {
//            Text(text = "3", fontSize = 24.sp)
//            Text(text = "4", fontSize = 24.sp)
//            Text(text = "5", fontSize = 24.sp)
//        }
//        Row(horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.Bottom) {
//            Text(text = "6", fontSize = 24.sp)
//            Text(text = "7", fontSize = 24.sp)
//            Text(text = "10", fontSize = 24.sp)
//        }
//        Row() {
//            Text(text = "8", fontSize = 24.sp)
//            Text(text = "9", fontSize = 24.sp)
//            Text(text = "11", fontSize = 24.sp)
//        }

}

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {
    Row(modifier.padding(8.dp)) {
        Image(
            painter =
            painterResource(id = imgId),
            contentDescription = "",
            modifier = Modifier.size(40.dp)
        )
        Column {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}

//@Preview
@Composable
fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.arrow),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
        contentDescription = ""
    )
}

//@Preview
@Composable
fun TextInput() {
//    val state = remember { mutableStateOf("") }
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            Log.d("MyName", it)
            state.value = it
        },
        label = { Text(text = "Enter Name") },
    )
}
