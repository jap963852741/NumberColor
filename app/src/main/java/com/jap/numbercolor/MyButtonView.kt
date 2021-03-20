package com.jap.numbercolor

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.jap.numbercolor.R.drawable.*

class MyButtonView : ConstraintLayout, View.OnClickListener{
    val TAG ="MyButtonView"
    var txtString = ""
    private lateinit var myButton : Button
    var wrappedOnClickListener: OnClickListener ? = null
    val RED = 1
    val GREEN = 2
    val BLUE = 3

    constructor(context: Context): super(context){
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
        myButton = findViewById(R.id.myButton)
        myButton.text = txtString
        val txtLayoutParams = LayoutParams(LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        myButton.layoutParams = txtLayoutParams
        myButton.setOnClickListener(this)
    }

    @SuppressLint("ResourceType", "UseCompatLoadingForDrawables")
    fun setColor(color : Int){
        when (color){
            RED -> {
                myButton.background = context.getDrawable(red_button)
                myButton.setTextColor(resources.getColorStateList(red_btn_text_color,null))
            }
            GREEN -> {
                myButton.background = context.getDrawable(green_button)
                myButton.setTextColor(resources.getColorStateList(green_btn_text_color,null))
            }
            BLUE -> {
                myButton.background = context.getDrawable(blue_button)
                myButton.setTextColor(resources.getColorStateList(blue_btn_text_color,null))
            }
        }
    }
    fun setText(text : String){
        myButton.text = text
    }
    override fun onClick(view: View?) {
//        Log.e(TAG, "This has been clicked")
        myButton.isSelected = !myButton.isSelected
        wrappedOnClickListener?.onClick(view)
    }

    override fun setOnClickListener(l: OnClickListener?) {
//        Log.e(TAG, "setOnClickListener")
        wrappedOnClickListener = l
    }
}