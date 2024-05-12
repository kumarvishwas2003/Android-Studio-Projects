package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val buttonHot=findViewById<Button>(R.id.btnHot)
        val buttonCool=findViewById<Button>(R.id.btnCool)
        val linearLayout=findViewById<LinearLayout>(R.id.linearLayout)
        buttonHot.setOnClickListener {
            //Change Background Colour to Black
            linearLayout.setBackgroundColor(R.color.black)
        }
        buttonCool.setOnClickListener {
            //Change background colour to blue
            linearLayout.setBackgroundColor(com.google.android.material.R.color.material_blue_grey_800)
        }

    }
}