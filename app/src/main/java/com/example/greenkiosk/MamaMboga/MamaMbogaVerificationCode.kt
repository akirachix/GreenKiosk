package com.example.greenkiosk.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.R

class MamaMbogaVerificationCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_verification_code)

        var verify = findViewById<Button>(R.id.btnverify).setOnClickListener {
            var intent = Intent(baseContext, loginActivity::class.java)
            startActivity(intent)
        }
    }
}