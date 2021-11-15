package com.example.greenkiosk.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R

class MamaMbogaVerificationCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_verification_code)

        var verify = findViewById<Button>(R.id.btnverify).setOnClickListener {
            var intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}