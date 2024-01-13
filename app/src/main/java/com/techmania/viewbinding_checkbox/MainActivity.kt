package com.techmania.viewbinding_checkbox

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.techmania.viewbinding_checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            if (binding.checkbox.isChecked) {
                //intent
            } else {
                binding.checkbox.backgroundTintList = ColorStateList.valueOf(Color.BLACK)
                Toast.makeText(this, "Please accept the T&C", Toast.LENGTH_SHORT).show()
            }
        }

    }
}