package com.example.helloactivity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThirdActivity", this.toString())
        setContentView(R.layout.third_activity)
        val button2 : Button = findViewById(R.id.button3)
        button2.setOnClickListener {
            ActivityCollector.finishAll()
//            finish()
        }
    }
}