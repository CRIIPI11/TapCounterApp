package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.counter)

        but.setOnClickListener{
            counter++
            text.text = counter.toString()
        }

    }
}