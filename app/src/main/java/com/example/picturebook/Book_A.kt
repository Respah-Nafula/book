package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book_A : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnprevious:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        btnNext=findViewById(R.id.btnma)
        btnNext.setOnClickListener {
            var intent=Intent(this,Book_B::class.java)
            startActivity(intent)
        }
        btnprevious=findViewById(R.id.btnpa)
        btnprevious.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}