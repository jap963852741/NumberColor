package com.jap.numbercolor.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jap.numbercolor.MyButtonView
import com.jap.numbercolor.databinding.ItemButtonsBinding


class ButtonsViewAdapter(
    private val allDataList: ArrayList<String>,
    private val redDataList: ArrayList<String>,
    private val blueDataList: ArrayList<String>,
    private val greenDataList: ArrayList<String>
) : RecyclerView.Adapter<VH>() {
    val TAG = "ButtonsViewAdapter"

    private lateinit var binding : ItemButtonsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        binding = ItemButtonsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        setUpButton(holder.button1,5 * position )
        setUpButton(holder.button2,5 * position + 1)
        setUpButton(holder.button3,5 * position + 2)
        setUpButton(holder.button4,5 * position + 3)
        setUpButton(holder.button5,5 * position + 4)
    }
    override fun getItemCount(): Int {
        if(allDataList.size % 5 == 0){
            return allDataList.size/5
        }
        return allDataList.size/5 + 1
    }

    private fun setUpButton(button :MyButtonView, text_idx :Int){
        if(text_idx < allDataList.size) {
            button.setText(allDataList[text_idx])
            Log.e(TAG,text_idx.toString())
            when {
                allDataList[text_idx] in redDataList -> {
                    Log.e(TAG,"redDataList")
                    button.setColor(button.RED)
                }
                allDataList[text_idx] in blueDataList -> {
                    Log.e(TAG,"blueDataList")
                    button.setColor(button.BLUE)
                }
                allDataList[text_idx] in greenDataList -> {
                    Log.e(TAG,"greenDataList")
                    button.setColor(button.GREEN)
                }
            }
        }else{
            button.visibility = View.INVISIBLE
        }
    }

}


class VH(binding: ItemButtonsBinding) : RecyclerView.ViewHolder(binding.root) {
    var button1 : MyButtonView = binding.button1
    var button2 : MyButtonView = binding.button2
    var button3 : MyButtonView = binding.button3
    var button4 : MyButtonView = binding.button4
    var button5 : MyButtonView = binding.button5
}