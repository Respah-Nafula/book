package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book_C : AppCompatActivity() {
    lateinit var btnm:Button
    lateinit var btnp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_c)

        btnm=findViewById(R.id.btnma)
        btnm.setOnClickListener {
            var intent= Intent(this,Book_D::class.java)
            startActivity(intent)
        }
        btnp=findViewById(R.id.btnpa)
        btnp.setOnClickListener {
            var intent= Intent(this,Book_B::class.java)
            startActivity(intent)
        }
    }
}