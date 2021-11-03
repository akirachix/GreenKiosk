package com.example.greenkiosk.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.R

class MamaMboga_Resetpassword : AppCompatActivity() {
    lateinit var password:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_resetpassword)



        var password= findViewById<Button>(R.id.btnSubmitPassword).setOnClickListener {
            var intent = Intent(baseContext,MamaMbogaPending::class.java)
            startActivity(intent)
        }
    }
}