package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edinput:EditText
    private lateinit var btnSend:Button
    private lateinit var tvOutput:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edinput = findViewById(R.id.edInput)
        btnSend = findViewById(R.id.btnSend)
        tvOutput = findViewById(R.id.tvOutput)

        btnSend.setOnClickListener {
            var str = edinput.text
            tvOutput.text = str

        }

    }
}