package com.example.greenkiosk.Customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.MamaMboga.MamaMbogaSignUp
import com.example.greenkiosk.MamaMboga.WorkinghoursActivity

import com.example.greenkiosk.R

class StartActivity : AppCompatActivity() {
    lateinit var customer: Button
    lateinit var mama_mboga:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        var customer = findViewById<Button>(R.id.btncustomer).setOnClickListener {
            var intent = Intent(baseContext,CategoryActivity::class.java)
            startActivity(intent)
        }

        var mamamboga= findViewById<Button>(R.id.btnmama_mboga).setOnClickListener {
            var intent = Intent(baseContext,WorkinghoursActivity::class.java)
            startActivity(intent)
        }
    }
}