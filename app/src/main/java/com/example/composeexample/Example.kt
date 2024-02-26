package com.example.composeexample

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun boxExample() {
//    Box(Modifier.fillMaxSize()) {
//
//    Box() {

//        Spacer(
//            modifier = Modifier
//                .width(120.dp)
////                .height(120.dp)
//        )
    Box(
        modifier = Modifier
            .background(color = Color.Blue)
            .size(300.dp, 300.dp)
//                .padding(40.dp)
    ) {
    }
    Spacer(
        modifier = Modifier
            .width(220.dp)
            .height(20.dp)
    )
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .size(230.dp, 230.dp)
//                    .padding(30.dp)
    ) {
//                Spacer(
//                    modifier = Modifier
//                        .width(120.dp)
//                        .height(20.dp)
//                )
//                Box(
//                    modifier = Modifier
//                        .background(color = Color.Yellow)
//                        .size(160.dp, 160.dp)
//                )
//                {
//
//                }
    }
//        }
//        Text("Hello, How are you?", modifier = Modifier.align(Alignment.Center), color = Color.Black, fontSize = 33.sp)

//    }
}

@Composable
fun SpacerExample1() {
//    Box() {
////        Column() {
////            Text(text = "1")
////            Spacer(modifier = Modifier.height(10.dp))
////            Text(text = "2")
////        }
//        Row() {
//            Text(text = "1")
//            Spacer(modifier = Modifier.width(20.dp))
//            Text(text = "2")
//        }
//    }
//    Row() {
//        Box(modifier = Modifier
//            .fillMaxHeight()
//            .background(Color.Yellow)
//            .width(100.dp)) {
//        }
//
//        Spacer(modifier = Modifier
//            .weight(1f)
//            .fillMaxWidth())
//
//        Box(
//            Modifier
//                .fillMaxHeight()
//                .background(Color.Blue)
//                .width(100.dp)) {
//
//        }
//
//        Spacer(modifier = Modifier
//            .weight(1f)
//            .fillMaxWidth())
//
//    }
    Text(
        text = stringResource(id = R.string.app_name),
        fontSize = 16.sp,
        color = Color.Black
    )

    Spacer(modifier = Modifier.width(10.dp))

    Image(painter = painterResource(id = R.drawable.arrow), contentDescription = null)

}

@Composable
fun BoxExample0() {
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .size(180.dp, 300.dp)
    ) {

        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(125.dp, 100.dp)
        ) {
        }

        Text(
            text = "Hi",
            modifier = Modifier
                .background(color = Color.White)
                .size(90.dp, 50.dp)
        )
    }
}

@Composable
fun MarginPaddingExample() {
    Text(
        text = "text1",
    )
//    Text(
//        modifier = Modifier
//            .background(Color.Yellow),
//        text = "text2"
//    )

}

@Composable
fun BoxExample1() {
    Box(Modifier.fillMaxSize()) {
        Text("Hello World!", modifier = Modifier.align(Alignment.TopCenter))
        Box(
            Modifier
                .background(Color.Blue)
                .width(100.dp)
                .align(Alignment.TopCenter)
                .fillMaxHeight(),
//            contentAlignment = Alignment.TopCenter
        )
        Text(text = "Hello World!", modifier = Modifier.align(Alignment.Center))
        FloatingActionButton(
            onClick = {}, modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(12.dp)
        )
        {
            Text("+")
        }
    }
}

@Composable
fun BoxExample2() {
    Box(Modifier.fillMaxSize()) {
        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
        Box(
            Modifier
                .align(Alignment.TopCenter)
                .fillMaxHeight()
                .width(
                    50.dp
                )
                .background(Color.Blue)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(12.dp),
            onClick = {}
        ) {
            Text("+")
        }
    }
}

@Composable
fun BoxWithImg() {
    Column() {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "", Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.size(3.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "", Modifier.weight(2f)
            )
        }
    }
//    Column() {
//        Box() {
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_background),
//                contentDescription = ""
//            )
////        Spacer(modifier = Modifier.size(3.dp))
//            Box(Modifier.padding(10.dp)) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = ""
//                )
//            }
//        }
//    }
}

@Composable
fun BoxExample() {
//    Box(contentAlignment = Alignment.TopCenter) {
//        Text(text = "1")
//        Text("2")
//    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    )
    {
//        Text(text = "1")
//        Box( 
//            modifier = Modifier
//                .background(Color.Blue),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "2")
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color.Green)
        )
        {
            Text(text = "Hello World!", fontSize = 8.sp)
        }
//        }
    }
}

@Composable
fun Demo() {
//    Text(
//        text = "Test",
//        modifier = Modifier
//            .padding(16.dp)
//            .clickable { }
//    )

    Text(
        text = "Test",
        modifier = Modifier
            .clickable { }
            .padding(16.dp)
    )
}

@Composable
fun box() {
    Box() {
        Text(text = "text1")
        Text(text = "text2")
//        Box() {
//            Text(text = "text2")
//        }
    }
}

@Composable
fun MyUIExample() {
//    Text(
//        text = "Text 1",
//        modifier = Modifier
//            .padding(0.dp)
//            .background(color = Color.LightGray)
//            .padding(top = 25.dp)
//    )
//
//    Text(
//        text = "Text 2",
//        modifier = Modifier
//            .padding(top = 52.dp, start = 20.dp, end = 20.dp) // margin
//            .background(color = Color.Yellow)
//            .padding(top = 36.dp) // padding
    //   )
    Column() {
        Text(
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp),
            text = "Text 1"

        )

        Text(
            text = "Text 2",
            modifier = Modifier
                .padding(top = 15.dp)
//            .padding(top = 50.dp, start = 70.dp) // margin
                .background(color = Color.Green)
                .padding(10.dp) // padding
        )
    }

}

@Composable
fun SpacerDemo() {
    Column() {
        Text(text = "Hello")
        Spacer(modifier = Modifier.size(14.dp))
        Text(text = "World")
    }
}

@Composable
fun PaddingExample1() {
    Text(
        text = "Hello World!",
        color = Color.Blue,
        modifier = Modifier
            .padding(top = 28.dp) // margin
            .border(2.dp, Color.Black) // outer border
            .padding(45.dp) // space between the borders
            .border(2.dp, Color.Green) // inner border
            .padding(24.dp) // padding
    )
}



