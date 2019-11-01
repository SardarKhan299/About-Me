package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    data class MyName(var name:String="",var nickName:String = "")

    private lateinit var binding: ActivityMainBinding
    private val myNmae = MyName("Sardar Khan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myVariable = myNmae

        //setContentView(R.layout.activity_main)
        binding?.btnDone.setOnClickListener {
            Log.d(this@MainActivity.javaClass.simpleName, "onCreate: Button Clicked...");
            addNickname(it)
        }

    }

    private fun addNickname(view: View){
        binding.apply {
            //tvNickname.text = binding.edtNickname.text
            myNmae?.nickName = binding.edtNickname.text.toString()
            invalidateAll()
            tvNickname.visibility = View.VISIBLE
            edtNickname.visibility = View.GONE
            btnDone.visibility = View.GONE
        }
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
