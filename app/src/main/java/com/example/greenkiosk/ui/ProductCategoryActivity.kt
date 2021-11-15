package com.example.greenkiosk.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isNotEmpty
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R
class ProductCategoryActivity : AppCompatActivity() {
    lateinit var rvproducts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_category)
        displayProducts()

    }

    fun displayProducts() {
        rvproducts =   findViewById(R.id.rvproducts)
        val products = listOf(
            Products(
                "Fruits",
                "https://1stnews.com/wp-content/uploads/2020/07/benefits-of-orange.jpg"
            ),
            Products(
                "Vegetables",
                "https://farmiken.com/wp-content/uploads/2020/10/spinach3.jpg"
            ),
            Products(
                "Kienyeji",
                "https://mamakienyeji.com/wp-content/uploads/2019/07/Mama-Kienyeji-Product-Image-Seveve-1-1-600x600.png"
            ),


            Products(
                "Cereals",
                "https://cdn-prod.medicalnewstoday.com/content/images/articles/285/285753/beans.jpg"
            )
        )

        var productAdapter = RvProductActivity(products, baseContext)
        rvproducts.adapter = productAdapter
        rvproducts.layoutManager = LinearLayoutManager(baseContext)
        if (rvproducts.isNotEmpty()) {
            rvproducts.layoutManager = LinearLayoutManager(baseContext)
            rvproducts.adapter = productAdapter
        }
        else{
//            Toast.makeText(baseContext,"" , Toast.LENGTH_LONG).show()
        }
    }
}
