package com.example.greenkiosk.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.R

class MamaMbogaPendingOrders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_pending)
        var login = findViewById<Button>(R.id.btnLoginToPassword).setOnClickListener {
            var intent = Intent(baseContext, MamaMboga_Resetpassword::class.java)
            startActivity(intent)
        }
    }
}