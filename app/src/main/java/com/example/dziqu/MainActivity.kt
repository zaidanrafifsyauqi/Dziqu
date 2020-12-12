package com.example.dziqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        d_pagi.setOnClickListener {
            val intent = Intent (this, DzikirPagi::class.java)

            startActivity(intent)

        }

        d_petang.setOnClickListener {
            val intent = Intent(this,DzikirSore::class.java)

            startActivity(intent)
        }
    }
}