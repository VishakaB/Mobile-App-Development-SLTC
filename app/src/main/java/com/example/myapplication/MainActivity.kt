package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button_1: Button = findViewById(R.id.bvbutton1)
        val Button_2: Button = findViewById(R.id.bvbutton2)
        val customText: TextView = findViewById(R.id.tvtext)

        Button_1.setOnClickListener {
            customText.text = "You clicked button 1"

            customText.postDelayed({customText.text = "Back to Hello There 1!"}, 1000)

        }
        Button_2.setOnClickListener {
            customText.text = "You clicked button 2"
            customText.postDelayed({customText.text = "Back to Hello There 2!"}, 1000)
        }
    }
}