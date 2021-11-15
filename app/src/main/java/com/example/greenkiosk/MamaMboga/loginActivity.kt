package com.example.greenkiosk.MamaMboga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R

class loginActivity : AppCompatActivity() {
    lateinit var tvSignUp: TextView
    lateinit var login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var login = findViewById<Button>(R.id.btncheck).setOnClickListener {
            var intent = Intent(baseContext,MamaMbogaPending::class.java)
            startActivity(intent)
        }
        var tvSignUp = findViewById<TextView>(R.id.tvconfirm).setOnClickListener {
            val intent = Intent(this, AccountMamambogaActivity::class.java)
            startActivity(intent)
        }


        }
    }
