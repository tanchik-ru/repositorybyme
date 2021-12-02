package com.example.mytankapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import  android.widget.TextView
import kotlin.random.Random

const val TAG = "MainActiviti"
private const val HELLO_KEY = "hello"

class MainActivity : AppCompatActivity() {

    lateinit var randomTextView: TextView
    lateinit var next_activity_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //randomTextView = findViewById(R.id.textbottom)
        next_activity_button = findViewById(R.id.next_activity_button)

        next_activity_button.setOnClickListener {
            val googleLink = Uri.parse("https://google.com")
           val openBrouserIntent = Intent(Intent.ACTION_VIEW, googleLink)
            startActivity(openBrouserIntent)
        }

    }







}