package com.example.greenkiosk.MamaMboga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R

class AccountMamambogaActivity : AppCompatActivity() {
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_mamamboga)

        var next= findViewById<Button>(R.id.btnnext).setOnClickListener {
            var intent = Intent(baseContext,WorkinghoursActivity::class.java)
            startActivity(intent)
        }

    }
}