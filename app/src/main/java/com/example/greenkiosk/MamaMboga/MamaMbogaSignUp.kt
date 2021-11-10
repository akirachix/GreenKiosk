package com.example.greenkiosk.MamaMboga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R

class MamaMbogaSignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_sign_up)
    }

    var btnbutton = findViewById<Button>(R.id.btnnext).setOnClickListener {
        var intent = Intent(baseContext, WorkinghoursActivity::class.java)
        startActivity(intent)

    }
}