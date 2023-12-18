package com.example.myzooanimalslab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val args = intent.extras

        val textName = findViewById<TextView>(R.id.dogName)
        val textDesc = findViewById<TextView>(R.id.dogDescription)

        textName.text = args?.getString("dogName")
        textDesc.text = args?.getString("dogDescription")
    }
}