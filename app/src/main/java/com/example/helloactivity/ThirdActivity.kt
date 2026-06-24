package com.example.helloactivity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)
        val button2 : Button = findViewById(R.id.button3)
        button2.setOnClickListener {
            finish()
        }
    }
}