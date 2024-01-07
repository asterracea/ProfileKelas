package com.example.myapplicationk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val foto = intent.getParcelableExtra<fotokls>("foto")
        if (foto != null) {
            val textView : TextView = findViewById(R.id.tvnama)
            val imageView : ImageView = findViewById(R.id.ivdetail)

            textView.text = foto.name
            imageView.setImageResource(foto.image)
        }

    }
}