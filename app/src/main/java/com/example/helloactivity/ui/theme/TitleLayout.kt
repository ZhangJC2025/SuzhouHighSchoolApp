package com.example.helloactivity.ui.theme

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.example.helloactivity.R

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs){
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        findViewById<Button>(R.id.titleBack).apply {
            setOnClickListener {
                val activity = context as Activity
                activity.finish()
            }
        }
        findViewById<Button>(R.id.titleEdit).apply {
            setOnClickListener {
                Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_LONG).show()
            }
        }
    }
}