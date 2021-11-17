package com.example.greenkiosk.Customer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.greenkiosk.R
import com.example.greenkiosk.databinding.ActivityCustomerCartBinding
import com.google.gson.Gson
import kotlinx.android.synthetic.main.layout_product_item.*


class CustomerCart :AppCompatActivity() {

    var selectedProducts = mutableListOf<Product>()
    lateinit var binding: ActivityCustomerCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCustomerCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        selectProduct()

    }

    override fun onResume() {
        super.onResume()
        binding.btnCheckout.setOnClickListener{
            var intent = Intent(baseContext, CustomerCheckout::class.java)
            var gson = Gson()
            intent.putExtra("SELECTED_PRODUCTS", gson.toJson(selectedProducts))
            startActivity(intent)
        }
    }

    fun selectProduct(){
//        binding.recyclerCart
//        recycler_cart = findViewById(R.id.recycler_cart)
        var productList= listOf(

            Product("https://www.gardeningknowhow.com/wp-content/uploads/2021/05/whole-and-slices-watermelon.jpg","Watermelon",5.5,220),
            Product("https://aldprdproductimages.azureedge.net/media/resized/ALL_RESIZED3/56124_0_XL.png","Banana",5.5,120),
            Product("https://cdnprod.mafretailproxy.com/sys-master-root/h74/h68/15039637389342/1545702_main.jpg","Grapes",5.5,100),
            Product("https://www.naturespride.eu/media/4syh0q3p/mango-kent.jpg","Mango",5.5,300),
            Product("https://usapple.org/wp-content/uploads/2019/10/apple-gala.png","Apple",5.5,200),
            Product("https://pbs.twimg.com/profile_images/1479795532/greenlemon_400x400.png","Lemon",5.5,300)

        )
        val gridLayout = GridLayoutManager(this, 2)
        binding.recyclerCart.layoutManager = gridLayout
        var cartAdapter= ProductDetailsRecycleView(productList,baseContext,object :ProductClickListener{
            override fun onSelectedProduct(product: Product){
                selectedProducts.add(product)

            }

            override fun onDeleteProduct(product: Product) {
                selectedProducts.remove(product)
            }
        })
        binding.recyclerCart.adapter = cartAdapter

    }
//    val button: Button= findViewById(R.id.btnAdd)
//    button.setOnClickListener {
//
//    }



    interface
    ProductClickListener{
        fun onSelectedProduct(product: Product)
        fun onDeleteProduct(product: Product)

    }

}




