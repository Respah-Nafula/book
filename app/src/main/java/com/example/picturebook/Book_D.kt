package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book_D : AppCompatActivity() {
    lateinit var btnma: Button
    lateinit var btnpa: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_d)
        btnma=findViewById(R.id.btnma)
        btnma.setOnClickListener {
            var intent= Intent(this,Book_E::class.java)
            startActivity(intent)
        }
        btnpa=findViewById(R.id.btnpa)
        btnpa.setOnClickListener {
            var intent= Intent(this,Book_D::class.java)
            startActivity(intent)
        }
    }
}