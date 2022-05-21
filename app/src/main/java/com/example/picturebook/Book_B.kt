package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book_B : AppCompatActivity() {

    lateinit var btnnett: Button
    lateinit var btnprev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_b)

        btnnett=findViewById(R.id.btnma)
        btnnett.setOnClickListener {
            var intent= Intent(this,Book_C::class.java)
            startActivity(intent)
        }
        btnprev=findViewById(R.id.btnprev)
        btnprev.setOnClickListener {
            var intent= Intent(this,Book_B::class.java)
            startActivity(intent)
        }
    }
}