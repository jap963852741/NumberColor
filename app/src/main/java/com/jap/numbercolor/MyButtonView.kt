package com.jap.numbercolor

import android.annotation.TargetApi
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MyButtonView : ConstraintLayout {
    var txtString = ""
    lateinit var myButton : Button
    constructor(context: Context) : super(context){
        initView()
    }

    constructor(context: Context,attrs: AttributeSet?) : super(context, attrs) {
        val typedArray = context.obtainStyledAttributes(attrs,R.styleable.MyButtonView)
        getValue(typedArray)
        initView()
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) :  super(context, attrs, defStyleAttr){
        val typedArray = context.obtainStyledAttributes(attrs,R.styleable.MyButtonView,defStyleAttr,0)
        getValue(typedArray)
        initView()
    }


    @TargetApi(21)
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        val typedArray = context.obtainStyledAttributes(attrs,R.styleable.MyButtonView,defStyleAttr,0)
        getValue(typedArray)
        initView()
    }

    private fun getValue(typedArray : TypedArray) {
        txtString = typedArray.getString(R.styleable.MyButtonView_txtString) ?: ""
        typedArray.recycle()
    }

    private fun initView(){
        View.inflate(context,R.layout.component_numberbuttom,this)
        myButton = findViewById(R.id.Mybutton)
        myButton.text = txtString
        val txtLayoutParams = LayoutParams(LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        myButton.layoutParams = txtLayoutParams
    }



}