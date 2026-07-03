package com.example.helloactivity

import android.os.Bundle
//import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UIWidgetTest : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uiwidget_test)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
//                Log.d("UIWidgetTest", "You clicked a button.")
                val editText = findViewById<EditText>(R.id.editText)
                val inputText = editText.text.toString()
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            }
        }
    }
}