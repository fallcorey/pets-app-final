package com.petsapp.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val textTitle = findViewById<TextView>(R.id.text_title)
        val textSubtitle = findViewById<TextView>(R.id.text_subtitle)
        
        textTitle.text = "🐾 Pets App"
        textSubtitle.text = "Добро пожаловать!\nВаши питомцы под присмотром"
    }
}
