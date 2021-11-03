package com.example.greenkiosk.Customer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R

class CustomerCart:AppCompatActivity() {
    lateinit var rvOrders: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_cart)
        getProductDetails()
    }

    fun getProductDetails() {

        val rvOrders = findViewById<RecyclerView>(R.id.rvOrders)
        val cardTitle: Array<String> = resources.getStringArray(R.array.cardTitles)
        val cardImages: Array<String> = resources.getStringArray(R.array.cardImages)
        val cardKilograms: Array<String> = resources.getStringArray(R.array.cardKilograms)
        val cardPrices: Array<String> = resources.getStringArray(R.array.cardPrices)
        val adapter =
            RvProduct_OrderAdapter(cardTitle, cardImages, cardKilograms, cardPrices, baseContext)
        val gridLayout = GridLayoutManager(this, 2)
        rvOrders.layoutManager = gridLayout
        rvOrders.adapter = adapter

    }
}




