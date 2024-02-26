package com.example.composeexample

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample.ui.theme.*

//@Preview(widthDp = 300, heightDp = 400)
@Composable
fun PaddingExample() {
    Text(
        text = "Hello World!",
        color = Color.White,
        modifier = Modifier
            .padding(8.dp) // margin
            .border(2.dp, Color.White) // outer border
            .padding(8.dp) // space between the borders
            .border(2.dp, Color.Green) // inner border
            .padding(8.dp) // padding
    )
}

//@Preview(widthDp = 300, heightDp = 400)
@Composable
fun RowExample(){
    Row{
        Text(text = "1")
        Text(text = "2")
        Text("3")
    }
}

//@Preview(widthDp = 300, heightDp = 400)
@Composable
fun ColumnExample(){
    Column{
        Text(text = "1")
        Text(text = "2")
        Text("3")
    }
}
@Composable
fun Design(){
    Column(Modifier.padding(5.dp)) {
        Row {
            Text(text = "Name: ",color = Color1,style = Typography5.body1)
            Text(text = "Name of Person1", style = Typography.body1, color = Color.Cyan)
        }
        Row {
            Text(text = "Designation: ",color = Color2,style = Typography5.body2)
            Text(text = "Designation of Person1", style = Typography.body2, color = Color.Green)
        }
        Row {
            Text(text = "Name: ",color = Color3,style = Typography6.body1)
            Text(text = "Name of Person2", style = Typography1.body1, color = Color.Yellow)
        }
        Row {
            Text(text = "Designation: ",color = Color4,style = Typography6.body2)
            Text(text = "Designation of Person2", style = Typography1.body2, color = Color.Black)
        }
        Row {
            Text(text = "Name: ",color = Color5,style = Typography7.body2)
            Text(text = "Name of Person3", style = Typography2.body1, color = Color.White)
        }
        Row {
            Text(text = "Designation: ",color = Color.Blue,style = Typography7.body1)
            Text(text = "Designation of Person3", style = Typography2.body2, color = Color.Red)
        }
        Row {
            Text(text = "Name: ",color = Color6, style = Typography8.body1)
            Text(text = "Name of Person4", style = Typography3.body1, color = Color8)
        }
        Row {
            Text(text = "Designation: ", color = Color7, style = Typography8.body2)
            Text(text = "Designation of Person4", style = Typography3.body2, color = Color.Magenta)
        }
        Row {
            Text(text = "Name: ",color = Pink1, style = Typography9.body1)
            Text(text = "Name of Person5", style = Typography4.body1, color = Color.Gray)
        }
        Row {
            Text(text = "Designation: ",color = Purple1, style = Typography9.body2)
            Text(text = "Designation of Person5", style = Typography4.body2, color = Color.LightGray)
        }
    }


}

@Preview
@Composable
fun Pattern2(){
        Column() {
        Text(text = "1 ")
        Text(text = "2 ")
        Row() {
            Text(text = "3 ")
            Column() {
                Row() {
                    Text(text = "4 ")
                    Text(text = "5 ")
                }
                Row() {
                    Text(text = "6 ")
                    Text(text = "7 ")
                    Text(text = "10")
                }
                Row() {
                   // Column() {
                        Row() {
                            Text(text = "8 ")
                            Text(text = "9 ")
                            Column() {
                                Text(text = "11")
                                Row() {
                                    Text(text = "12")
                                    Text(text = "13")
                                    Column() {
                                        Text(text = "14")
                                        Text(text = "15")
                                        Text(text = "19")
                                    }

                                }

                            }

                        }
//                        Column() {
//                            Row() {
//                                Text(text = "     12")
//                                Text(text = "13")
//                                Text(text = "14")
//                                Text(text = "15")
//                            }
//                        }
                   // }
//                    Column() {
//                        Row(modifier = Modifier.fillMaxSize(),
//                            verticalAlignment = Alignment.CenterVertically,
//                            horizontalArrangement = Arrangement.Center){
//                            Text(modifier = Modifier.weight(0.1F,true), text = "16")
//                            Text(modifier = Modifier.weight(0.1F,true), text ="17")
//                            Text(modifier = Modifier.weight(0.1F,true),text = "18")
//                            Text(modifier = Modifier.weight(0.1F,true),text = "19")
//                            Text(modifier = Modifier.weight(0.6F,true),text = "")
//                        }
//                    }
                }
            }
//            Text(text = "5")
        }
//        Row() {
//            Column() {
//                Text(text = "6")
//            }
//            Text(text = "7")
//            Text(text = "10")
//        }
//        Row() {
//            Text(text = "8")
//            Text(text = "9")
//            Text(text = "11")
//        }
    }
}

//@Preview()
@Composable
fun PreviewItem() {
    Text("1")
    Text("2")
    Row{
        Text("3")
        Text("4")
        Column{
            Text("5")
            Text("6")
            Row{
                Text("7")
            }
            Text("8")
            Column{
                Text("9")
            }
            Column{
                Text("10")
                Row{
                    Text("11")
                    Text("12")
                }
                Text("13")
                Column{
                    Text("000000")
                }
                Text("14")
            }
            Text("15")
            Row{
                Text("16")
                Text("17")
            }
            Text("18")
            Text("19")
        }
        Column{
            Text("20")
            Text("21")
            Row{
                Text("22")
                Column{
                    Text("23")
                    Text("24")
                }
                Column{
                    Text("25")
                    Text("26")
                }
                Text("27")
            }
            Text("28")
            Column{
                Text("29")
            }
            Text("30")
        }
        Row{
            Column{
                Row{
                    Text("31")
                    Text("32")
                }
                Text("33")
            }
            Text("34")
        }
        Row{
            Text("35")
        }
    }
//    Column() {
//        Text(text = "1 ")
//        Text(text = "2 ")
//        Row() {
//            Text(text = "3 ")
//            Column() {
//                Row() {
//                    Text(text = "4 ")
//                    Text(text = "5 ")
//                }
//                Row() {
//                    Text(text = "6 ")
//                    Text(text = "7 ")
//                    Text(text = "10")
//                }
//                Row() {
//                   // Column() {
//                        Row() {
//                            Text(text = "8 ")
//                            Text(text = "9 ")
//                            Column() {
//                                Text(text = "11")
//                                Row() {
//                                    Text(text = "12")
//                                    Text(text = "13")
//                                    Column() {
//                                        Text(text = "14")
//                                        Text(text = "15")
//                                        Text(text = "19")
//                                    }
//
//                                }
//
//                            }
//
//                        }
////                        Column() {
////                            Row() {
////                                Text(text = "     12")
////                                Text(text = "13")
////                                Text(text = "14")
////                                Text(text = "15")
////                            }
////                        }
//                   // }
////                    Column() {
////                        Row(modifier = Modifier.fillMaxSize(),
////                            verticalAlignment = Alignment.CenterVertically,
////                            horizontalArrangement = Arrangement.Center){
////                            Text(modifier = Modifier.weight(0.1F,true), text = "16")
////                            Text(modifier = Modifier.weight(0.1F,true), text ="17")
////                            Text(modifier = Modifier.weight(0.1F,true),text = "18")
////                            Text(modifier = Modifier.weight(0.1F,true),text = "19")
////                            Text(modifier = Modifier.weight(0.6F,true),text = "")
////                        }
////                    }
//                }
//            }
////            Text(text = "5")
//        }
////        Row() {
////            Column() {
////                Text(text = "6")
////            }
////            Text(text = "7")
////            Text(text = "10")
////        }
////        Row() {
////            Text(text = "8")
////            Text(text = "9")
////            Text(text = "11")
////        }
//    }

//    LazyColumn(content = {
//
//        items(getCategoryList()){item ->
//            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
//        }
//
////        items(getCategoryList()){ item ->
////            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
////        }
//    })
    
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map { item ->
//            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
//        }
//    }

//    BlogCategory(
//        img = R.drawable.arrow,
//        title = "Programming",
//        subtitle = "Learn Different Languages"
//    )
}

//@Preview
@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle,Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.subtitle1
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.arrow,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.arrow,"Technology","News about new Tech"))
    list.add(Category(R.drawable.arrow,"Full Stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.arrow,"DevOps","Deployment, CI, CD etc,"))
    list.add(Category(R.drawable.arrow,"AI & ML","Basic Artificial Intelligence"))
    list.add(Category(R.drawable.arrow,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.arrow,"Technology","News about new Tech"))
    list.add(Category(R.drawable.arrow,"Full Stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.arrow,"DevOps","Deployment, CI, CD etc,"))
    list.add(Category(R.drawable.arrow,"AI & ML","Basic Artificial Intelligence"))
    list.add(Category(R.drawable.arrow,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.arrow,"Technology","News about new Tech"))
    list.add(Category(R.drawable.arrow,"Full Stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.arrow,"DevOps","Deployment, CI, CD etc,"))
    list.add(Category(R.drawable.arrow,"AI & ML","Basic Artificial Intelligence"))
    list.add(Category(R.drawable.arrow,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.arrow,"Technology","News about new Tech"))
    list.add(Category(R.drawable.arrow,"Full Stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.arrow,"DevOps","Deployment, CI, CD etc,"))
    list.add(Category(R.drawable.arrow,"AI & ML","Basic Artificial Intelligence"))

    return list
}