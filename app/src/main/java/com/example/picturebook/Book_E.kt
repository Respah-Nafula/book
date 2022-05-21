package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book_E : AppCompatActivity() {
    lateinit var btnprio:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_e)
        btnprio=findViewById(R.id.btnprio)
        btnprio.setOnClickListener {
            var intent=Intent(this,Book_D::class.java)
            startActivity(intent)
        }
    }
}