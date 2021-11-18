package com.example.greenkiosk.Customer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.UI.MamaMboga.AccountMamambogaActivity
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
            var intent = Intent(baseContext, AccountMamambogaActivity::class.java)
            startActivity(intent)
        }
    }
}