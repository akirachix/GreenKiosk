package com.example.greenkiosk.UI.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.R

class MamaMbogaPending : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_pending)
        var Completed = findViewById<Button>(R.id.btnCompleted).setOnClickListener {
            var intent = Intent(baseContext, CompleteOrdersActivity::class.java)
            startActivity(intent)
        }
    }
}