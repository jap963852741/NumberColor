package com.jap.numbercolor.model


class ButtonsNumberDataSource {
    val redArrayList = arrayListOf(1,2,7,12,13,18,19,23,24,29,30,34,35,40,45,46)
    val greenArrayList = arrayListOf(5,6,11,16,17,21,22,27,28,32,33,38,39,43,44,49)
    val blueArrayList = arrayListOf(3,4,9,10,14,15,20,25,26,31,36,37,41,42,47,48)
    val allArrayList = getMyAllArrayList()

    private fun getMyAllArrayList() : ArrayList<String>{
        var tempArrayList = arrayListOf<String>()
        for (i in 1..49) {
            println(i)
            tempArrayList.add(String.format("%02d", i))
        }
        return tempArrayList
    }
}