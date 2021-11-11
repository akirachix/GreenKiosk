package com.example.greenkiosk.MamaMboga

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.Customer.StartActivity
import com.example.greenkiosk.R

class SplashScreen : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash_screen)
//        var btnbutton = findViewById<Button>(R.id.btnbutton).setOnClickListener {
//            var intent = Intent(baseContext, StartActivity::class.java)
//            startActivity(intent)
//        }
//
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent=Intent(this@SplashScreen, StartActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}