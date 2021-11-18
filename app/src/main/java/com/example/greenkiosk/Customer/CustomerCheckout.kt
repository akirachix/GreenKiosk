package com.example.greenkiosk.Customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.greenkiosk.R
import com.example.greenkiosk.databinding.ActivityCustomerCartBinding
import com.example.greenkiosk.databinding.ActivityCustomerCheckoutBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_customer_checkout.*
import kotlinx.android.synthetic.main.products_item_list.*

class CustomerCheckout :AppCompatActivity(){
    lateinit var binding: ActivityCustomerCheckoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityCustomerCheckoutBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            var intent1 = Intent(baseContext, CustomerLogIn::class.java)
            startActivity(intent1)
        }

        var selectedProductsStr = intent.getStringExtra("SELECTED_PRODUCTS")
        var gson = Gson()
        val productListType = object : TypeToken<List<Product>>() {}.type
        var products: List<Product> = gson.fromJson(selectedProductsStr, productListType)

//
//
//        print(products)

//        val imgUrl = findViewById<ImageView>(R.id.img)
//
//
//        var imageUrl=intent.getStringExtra("imageUrl")
//      Picasso.get().load(imageUrl).into(imgUrl)

        var etName = findViewById<TextView>(R.id.etProductName)
        val etQuantity = findViewById<TextView>(R.id.etQuantity)
        val etPrice = findViewById<TextView>(R.id.etPrice)
        val imgUrl = findViewById<ImageView>(R.id.img)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)


        var nameIntent=intent.getStringExtra("ProductName")
        var quantityIntent=intent.getIntExtra("Quantity",0)
        var priceIntent=intent.getIntExtra("Price",0)
        var imageUrl=intent.getStringExtra("imageUrl")
        Picasso.get().load(imageUrl).into(imgUrl)

        etName.text = nameIntent
        etQuantity.text = quantityIntent.toString()
        etPrice.text = priceIntent.toString()
        var totalPrice = quantityIntent * priceIntent

        tvTotal.text = totalPrice.toString()

    }

}