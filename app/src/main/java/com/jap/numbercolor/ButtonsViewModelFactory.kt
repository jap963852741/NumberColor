package com.jap.numbercolor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class ButtonsViewModelFactory() : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PhotosViewModel::class.java)) {
            return PhotosViewModel(
                photosRepository = PhotosRepository(
                    photosDataSource = PhotosDataSource()
            )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}