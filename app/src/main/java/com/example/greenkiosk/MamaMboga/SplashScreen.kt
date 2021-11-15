package com.example.greenkiosk.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, StartActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }}