package com.example.greenkiosk.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R
import com.squareup.picasso.Picasso


class CustomerCheckout : AppCompatActivity() {
    lateinit var btnCheckout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_checkout)
        var button = findViewById<Button>(R.id.btncheckout).setOnClickListener {
            var intent = Intent(baseContext, CustomerSignUp::class.java)
            startActivity(intent)
        }
        var etProductName= findViewById<TextView>(R.id.etProductName)
        val etKilogram = findViewById<TextView>(R.id.etKilogram)
        val etPrice = findViewById<TextView>(R.id.etPrice)
        val img = findViewById<ImageView>(R.id.img)

        var nameIntent = intent.getStringExtra("Name")
        var kilogramIntent = intent.getStringExtra("Kilograms")
        var priceIntent = intent.getStringExtra("Prices")
        var imageUrl = intent.getStringExtra("imageUrl")
        Picasso.get()
            .load(imageUrl).into(img)

        etProductName.text = nameIntent
        etKilogram.text  = kilogramIntent
        etPrice.text = priceIntent

    }
}