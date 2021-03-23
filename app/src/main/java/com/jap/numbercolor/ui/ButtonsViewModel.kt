package com.jap.numbercolor.ui

import androidx.lifecycle.ViewModel
import com.jap.numbercolor.model.ButtonsNumberRepository

class ButtonsViewModel(private val buttonsNumberRepository: ButtonsNumberRepository) : ViewModel(){

    val redArrayList = buttonsNumberRepository.getDataSource().redArrayList
    val greenArrayList = buttonsNumberRepository.getDataSource().greenArrayList
    val blueArrayList = buttonsNumberRepository.getDataSource().blueArrayList
    val allArrayList = buttonsNumberRepository.getDataSource().allArrayList

}