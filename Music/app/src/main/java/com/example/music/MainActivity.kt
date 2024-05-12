package com.example.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitBuilder= Retrofit.Builder()
            .baseUrl("https://deezerdevs-deezer.p.rapidapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Interface::class.java)
        val retrofitData=retrofitBuilder.getData("eminem")
        retrofitData.enqueue(object : Callback<MyData?> {
            override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
                //If the API Call is success
                val dataList=response.body()
                val textView=findViewById<TextView>(R.id.helloText)
                textView.text=dataList.toString()
                Log.d("TAG:onResponse","onResponse"+response.body())
            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
               //If the API call is failure
                Log.d("onFailure","onFailure"+t.message)

            }
        })

    }
}