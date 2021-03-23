package com.jap.numbercolor.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jap.numbercolor.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private val TAG = "MainActivity"
    private lateinit var buttonsViewModel: ButtonsViewModel
    private lateinit var buttonsViewAdapter: ButtonsViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        button.setOnClickListener(this)
//        button.setColor(button.BLUE)
        buttonsViewModel = ViewModelProvider(this,
            ButtonsViewModelFactory()
        ).get(ButtonsViewModel::class.java)
        buttonsViewAdapter = ButtonsViewAdapter(buttonsViewModel.allArrayList,buttonsViewModel.redArrayList,buttonsViewModel.blueArrayList,buttonsViewModel.greenArrayList)
        re_view_button.layoutManager = LinearLayoutManager(
            applicationContext,
            RecyclerView.VERTICAL,
            false
        )
        re_view_button.adapter = buttonsViewAdapter

        Log.e(TAG,buttonsViewModel.allArrayList.toString())

    }

}