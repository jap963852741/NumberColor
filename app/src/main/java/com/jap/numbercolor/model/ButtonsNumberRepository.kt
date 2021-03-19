package com.jap.numbercolor.model


class ButtonsNumberRepository (private val dataSource: ButtonsNumberDataSource) {
    fun getDatasource(): ButtonsNumberDataSource {
        return dataSource
    }
}