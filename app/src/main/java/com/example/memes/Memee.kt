package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memee : AppCompatActivity() {
  lateinit var tvNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memee)
        tvNext = findViewById(R.id.btnNextt)
        tvNext.setOnClickListener {
            val  intent=Intent(this,Memethree::class.java)
            startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev =findViewById(R.id.btnPrevv)
        tvPrev.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        }


    }
