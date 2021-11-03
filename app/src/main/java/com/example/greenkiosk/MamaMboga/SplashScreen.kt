package com.example.greenkiosk.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.Customer.Categories
import com.example.greenkiosk.Customer.CategoryActivity
import com.example.greenkiosk.Customer.CustomerLocation
import com.example.greenkiosk.Customer.StartActivity
import com.example.greenkiosk.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        var btnbutton = findViewById<Button>(R.id.btnbutton).setOnClickListener {
            var intent = Intent(baseContext, StartActivity::class.java)
            startActivity(intent)
        }

    }
}