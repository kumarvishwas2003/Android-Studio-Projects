package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val res=findViewById<TextView>(R.id.tvr)
        val Plus=findViewById<Button>(R.id.btnPlus)
        val Minus=findViewById<Button>(R.id.btnMinus)
        val Div=findViewById<Button>(R.id.btnDivivde)
        val Mtp=findViewById<Button>(R.id.btnMul)
        val In1=findViewById<TextInputEditText>(R.id.edt1)
        val In2=findViewById<TextInputEditText>(R.id.edt2)
        Plus.setOnClickListener{
            val Input1=In1.text.toString().toInt()
            val Input2=In2.text.toString().toInt()
            res.text=(Input1+Input2).toString()


        }




    }
}