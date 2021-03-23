package com.jap.numbercolor

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.jap.numbercolor.R.drawable.*
import com.jap.numbercolor.databinding.ComponentNumberbuttomBinding

class MyButtonView : ConstraintLayout, View.OnClickListener{
    val TAG ="MyButtonView"
    var txtString = ""
    private lateinit var binding : ComponentNumberbuttomBinding
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
        binding = ComponentNumberbuttomBinding.inflate(LayoutInflater.from(context), this)
        binding.myButton.text = txtString
        val txtLayoutParams = LayoutParams(LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        binding.myButton.layoutParams = txtLayoutParams
        binding.myButton.setOnClickListener(this)
    }

    @SuppressLint("ResourceType", "UseCompatLoadingForDrawables")
    fun setColor(color : Int){
        when (color){
            RED -> {
                binding.myButton.background = context.getDrawable(red_button)
                binding.myText.setTextColor(resources.getColorStateList(red_btn_text_color,null))
            }
            GREEN -> {
                binding.myButton.background = context.getDrawable(green_button)
                binding.myText.setTextColor(resources.getColorStateList(green_btn_text_color,null))
            }
            BLUE -> {
                binding.myButton.background = context.getDrawable(blue_button)
                binding.myText.setTextColor(resources.getColorStateList(blue_btn_text_color,null))
            }
        }
    }
    fun setText(text : String){
        binding.myText.text = text
    }
    override fun onClick(view: View?) {
        binding.myButton.isSelected = !binding.myButton.isSelected
        binding.myText.isSelected = !binding.myText.isSelected
        wrappedOnClickListener?.onClick(view)
    }

    override fun setOnClickListener(l: OnClickListener?) {
        wrappedOnClickListener = l
    }
}