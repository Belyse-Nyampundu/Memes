package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memefour : AppCompatActivity() {
   lateinit var tvNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour)
        tvNext = findViewById(R.id.btnNexxt)
        tvNext.setOnClickListener {
            val intent=Intent(this,Memefive::class.java)
            startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev =findViewById(R.id.btnPrevi)
        tvPrev.setOnClickListener {
            val intent = Intent(this, Memethree::class.java)
            startActivity(intent)
        }
    }
}