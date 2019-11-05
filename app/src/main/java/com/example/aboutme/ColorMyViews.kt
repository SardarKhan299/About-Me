package com.example.aboutme

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_color_my_views.*

class ColorMyViews : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)
        val clickAbleViews :List<View> = listOf(boxOne_text,boxTwo_text,boxThree_text,boxFour_text,boxFive_text,constraint_layout,btn_green,btn_red,btn_red)
        for(item in clickAbleViews){
            item.setOnClickListener {
                makeColored(it)
            }
        }

    }

    private fun makeColored(it: View?) {
        Log.d(this@ColorMyViews.javaClass.simpleName, "makeColored: ")
        when (it?.id) {

            // Boxes using Color class colors for background
            R.id.boxOne_text -> it?.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwo_text -> it?.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.boxThree_text -> it?.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFour_text -> it?.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFive_text -> it?.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.btn_red -> it.setBackgroundResource(R.color.my_red)
            R.id.btn_red -> it.setBackgroundResource(R.color.my_yellow)
            R.id.btn_green -> it.setBackgroundResource(R.color.my_green)

            else -> it?.setBackgroundColor(Color.LTGRAY)
        }
    }
}
