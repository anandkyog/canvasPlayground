package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {


        addButton.setOnClickListener {
            Toast.makeText(this,"ADD", Toast.LENGTH_SHORT).show()
            canvasPlaygroundView.AddRectangle()
        }
        deleteButton.setOnClickListener {
            Toast.makeText(this,"DELETE", Toast.LENGTH_SHORT).show()
            canvasPlaygroundView.RemoveRectangle()
        }
    }
}