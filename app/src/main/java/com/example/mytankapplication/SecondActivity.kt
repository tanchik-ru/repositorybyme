package com.example.mytankapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val HELLO_KEY = "hello"

class SecondActivity : AppCompatActivity() {
    lateinit var hellotextview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        hellotextview = findViewById(R.id.hello_text)
        val hellovalue:String? = intent.extras?.getString(HELLO_KEY, "hello")
        hellotextview.text = hellovalue
    }
}