package com.jap.numbercolor.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jap.numbercolor.model.ButtonsNumberDataSource
import com.jap.numbercolor.model.ButtonsNumberRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class ButtonsViewModelFactory() : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ButtonsViewModel::class.java)) {
            return ButtonsViewModel(
                buttonsNumberRepository = ButtonsNumberRepository(
                    dataSource = ButtonsNumberDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}