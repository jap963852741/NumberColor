package com.jap.numbercolor.model

class ButtonsNumberRepository (private val dataSource: ButtonsNumberDataSource) {
    fun getDataSource(): ButtonsNumberDataSource {
        return dataSource
    }
}