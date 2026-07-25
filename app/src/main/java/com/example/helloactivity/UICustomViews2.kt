package com.example.helloactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class UICustomViews2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uicustom_views)
        supportActionBar?.hide()
    }
}