package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var tvNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNext =findViewById(R.id.btnNext)
        tvNext.setOnClickListener {
            val intent = Intent(this,Memee::class.java)
            startActivity(intent)
        }
    }
}