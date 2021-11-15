package com.example.greenkiosk.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import com.example.greenkiosk.R

class DeliveryMethodActivity : AppCompatActivity() {
    lateinit var chDelivery:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_method)
    }
    var button = findViewById<CheckBox>(R.id.chDelivery).setOnClickListener {
        val intent = Intent(baseContext, PaymentMethodActivity::class.java)
        startActivity(intent)
    }
    var button2 = findViewById<CheckBox>(R.id.chPickup).setOnClickListener {
        val intent = Intent(baseContext, PaymentMethodActivity::class.java)
        startActivity(intent)
    }

}