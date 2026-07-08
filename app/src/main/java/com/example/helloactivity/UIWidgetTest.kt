package com.example.helloactivity

import android.os.Bundle
import android.util.Log
//import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

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
//                val editText = findViewById<EditText>(R.id.editText)
//                val inputText = editText.text.toString()
//                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
//                val imageView = findViewById<ImageView>(R.id.imageView)
//                imageView.setImageResource(R.drawable.ic_launcher_foreground)
//                val progressBar = findViewById<ProgressBar>(R.id.progressBar)
//                if (progressBar.isVisible)
//                    progressBar.visibility = View.GONE
//                else
//                    progressBar.visibility = View.VISIBLE
//                val progressBar = findViewById<ProgressBar>(R.id.progressBar)
//                progressBar.progress += 10;
                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, which ->
                        Log.d("UIWidgetTest", "You clicked OK.")
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                        Log.d("UIWidgetTest", "You clicked Cancel.")
                    }
                    show()
                }
            }
        }
    }
}