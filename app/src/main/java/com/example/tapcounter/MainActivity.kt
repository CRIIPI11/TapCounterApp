package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {
    var counter = 0
    var openLayout = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "Kill All The Zombies!", Toast.LENGTH_SHORT).show()


        val but = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.counter)

        but.setOnClickListener{
            counter++
            text.text = counter.toString()
        }

    }




}