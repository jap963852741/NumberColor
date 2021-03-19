package com.jap.numbercolor


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jap.numbercolor.model.ButtonsNumberDataSource

class ButtonsViewModel(private val buttonsNumberDataSource : ButtonsNumberDataSource) : ViewModel(){

    private val _photosResult = MutableLiveData<GetPhotoResult>()

    val photosResult: LiveData<GetPhotoResult> = _photosResult


    fun Get_api(){

    }






}