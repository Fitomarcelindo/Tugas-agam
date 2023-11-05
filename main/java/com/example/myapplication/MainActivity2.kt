package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val pesan = findViewById<TextView>(R.id.tvpesan)
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        pesan.text = " Selamat Datang " + message

    }
}