package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnwel:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnwel=findViewById(R.id.btnwel)
        btnwel.setOnClickListener {
            var intent=Intent(this,Book_A::class.java)
            startActivity(intent)
        }
    }
}