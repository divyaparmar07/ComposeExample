package com.example.composeexample

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

import androidx.lifecycle.ViewModel

class TextChangeViewModel : ViewModel() {

    private var name : String = ""
    var nameChange : String = name
    fun textChanged(text: String){
        nameChange = text
    }

}