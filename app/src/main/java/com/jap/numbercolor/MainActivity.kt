package com.jap.numbercolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonView = this.findViewById<MyButtonView>(R.id.button)

        buttonView.myButton.setOnClickListener {
            Log.e(TAG,"ButtonClick")
        }
    }
}