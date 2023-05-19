package com.techmania.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnintent = findViewById<Button>(R.id.button)
        val txtvw = findViewById<TextView>(R.id.textview)

        btnintent.setOnClickListener {
            //opening second activity

            intent=Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
        }
    }
}