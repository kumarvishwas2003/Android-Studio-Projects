package com.example.travelphotoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentImage=0
    lateinit var image:ImageView
    var places= arrayOf("India Gate","AksharDham Temple","Qutub Minar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val next=findViewById<ImageButton>(R.id.btnNext)
        val prev=findViewById<ImageButton>(R.id.btnPrev)
        val PlaceName=findViewById<TextView>(R.id.tName)
        next.setOnClickListener {
            var idCurrentImageString="pic$currentImage"
            //integer address associated with the image
            var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f
            currentImage=(3+currentImage+1)%3
            var idImageToShowString="pic"+currentImage
            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            PlaceName.text=places[currentImage]

        }
        prev.setOnClickListener {
            var idCurrentImageString="pic$currentImage"
            //integer address associated with the image
            var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f
            currentImage=(3+currentImage-1)%3
            var idImageToShowString="pic"+currentImage
            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            PlaceName.text=places[currentImage]

        }
    }
}