package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memefive : AppCompatActivity() {
    lateinit var tvLast:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefive)
        tvLast = findViewById(R.id.btnLast)
        tvLast.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev =findViewById(R.id.btnLast)
        tvPrev.setOnClickListener {
            val intent = Intent(this, Memefour::class.java)
            startActivity(intent)
        }
    }
}