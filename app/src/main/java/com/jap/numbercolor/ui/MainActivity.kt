package com.jap.numbercolor.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.jap.numbercolor.R

class MainActivity : AppCompatActivity(){
    private val TAG = "MainActivity"
    private lateinit var buttonsViewModel: ButtonsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        button.setOnClickListener(this)
//        button.setColor(button.BLUE)
        buttonsViewModel = ViewModelProvider(this,
            ButtonsViewModelFactory()
        )
            .get(ButtonsViewModel::class.java)


        Log.e(TAG,buttonsViewModel.allArrayList.toString())

    }

//    override fun onClick(v: View?) {
//        Log.e(TAG,"ButtonClick")
//    }

}