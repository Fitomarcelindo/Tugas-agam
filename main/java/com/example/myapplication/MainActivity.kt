package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textweb : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textweb = findViewById(R.id.textaja)

        var helper = DBHelper(applicationContext)
        var db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM Pengguna", null)

        val email = findViewById<EditText>(R.id.editEmail)
        val password = findViewById<EditText>(R.id.editPassword)
        val btn_login = findViewById<Button>(R.id.btnlogin)

        btn_login.setOnClickListener {

            val pesan = email.text.toString()
            val intent = Intent(this, MainActivity2::class.java).apply{
                putExtra(EXTRA_MESSAGE, pesan)
            }
            startActivity(intent)
        }

        textweb.setOnClickListener{
            val intent = Intent (Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://itpln.ac.id")
            startActivity(intent)
        }
    }
}