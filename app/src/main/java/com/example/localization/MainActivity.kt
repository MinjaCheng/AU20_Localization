package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextView: TextView
    var name = "David"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetingTextView = findViewById(R.id.textView)
    }


    fun button_pressed(view: View){
        greetingTextView.text =getString(R.string.great, name)
    }

    // eng - Great David!
    // sv - Toppen David!!!


}

// Anpassa appen till svenska och engelska
// 1. Anpassa xml - Layout
// 2. Anpassa kotlin-fil
// 3. Anpassa bilder