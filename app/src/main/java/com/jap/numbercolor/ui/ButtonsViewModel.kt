package com.jap.numbercolor.ui


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jap.numbercolor.model.ButtonsNumberDataSource
import com.jap.numbercolor.model.ButtonsNumberRepository

class ButtonsViewModel(private val buttonsNumberRepository: ButtonsNumberRepository) : ViewModel(){

    val redArrayList = buttonsNumberRepository.getDatasource().redArrayList
    val greenArrayList = buttonsNumberRepository.getDatasource().greenArrayList
    val blueArrayList = buttonsNumberRepository.getDatasource().blueArrayList
    val allArrayList = buttonsNumberRepository.getDatasource().allArrayList

}