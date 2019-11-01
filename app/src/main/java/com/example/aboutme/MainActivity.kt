package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_done.setOnClickListener {
            Log.d(this@MainActivity.javaClass.simpleName, "onCreate: Button Clicked...");
            addNickname(it)
        }

    }

    private fun addNickname(view: View){
        tv_nickname.text = edt_nickname.text
        tv_nickname.visibility = View.VISIBLE
        edt_nickname.visibility = View.GONE
        view.visibility = View.GONE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
