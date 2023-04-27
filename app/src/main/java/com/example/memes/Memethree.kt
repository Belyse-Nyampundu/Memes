package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memethree : AppCompatActivity() {
    lateinit var tvNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        tvNext=findViewById(R.id.btnNextx)
        tvNext.setOnClickListener {
            val intent=Intent(this,Memefour::class.java)
             startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev =findViewById(R.id.btnPrevvv)
        tvPrev.setOnClickListener {
            val intent = Intent(this, Memee::class.java)
            startActivity(intent)
        }
    }
}