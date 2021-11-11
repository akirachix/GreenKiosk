package com.example.greenkiosk.MamaMboga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R

class AccountMamambogaActivity : AppCompatActivity() {
    lateinit var btnnext:Button
    lateinit var login : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_mamamboga)

        var next= findViewById<Button>(R.id.btnnext).setOnClickListener {
            val intent = Intent(baseContext,WorkinghoursActivity::class.java)
            startActivity(intent)
        }

        var login = findViewById<TextView>(R.id.tvconfirm).setOnClickListener{
            val intent = Intent(baseContext,loginActivity::class.java)
            startActivity(intent)

        }
    }
}