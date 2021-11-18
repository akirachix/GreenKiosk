package com.example.greenkiosk.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.R

class AccountMamambogaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_mamamboga)
        var next= findViewById<Button>(R.id.btnnext).setOnClickListener {
            var intent = Intent(baseContext,WorkinghoursActivity::class.java)
            startActivity(intent)
        }

    }
}
