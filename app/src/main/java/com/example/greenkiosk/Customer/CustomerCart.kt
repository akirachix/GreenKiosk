package com.example.greenkiosk.Customer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.Customer.adapter.MyProductAdapter
import com.example.greenkiosk.Customer.listener.ProductLoadListener
import com.example.greenkiosk.Customer.models.ProductModel
import com.example.greenkiosk.Customer.utils.SpaceItemDecoration
import com.example.greenkiosk.R
import com.example.greenkiosk.databinding.ActivityCustomerCartBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_customer_products_recyclerview.*
import java.util.ArrayList

class CustomerCart(val mainLayout: View) :AppCompatActivity(), ProductLoadListener {
    lateinit var productLoadListener: ProductLoadListener
    lateinit var binding: ActivityCustomerCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCustomerCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getProductDetails()

    }

    private fun getProductDetails() {

        val rvOrders = findViewById<RecyclerView>(R.id.rvOrders)
        val cardTitle: Array<String> = resources.getStringArray(R.array.cardTitles)
        val cardImages: Array<String> = resources.getStringArray(R.array.cardImages)
        val cardKilograms: Array<String> = resources.getStringArray(R.array.cardKilograms)
        val cardPrices: Array<String> = resources.getStringArray(R.array.cardPrices)
        val adapter= RvProductOrderAdapter(cardTitle, cardImages, cardKilograms, cardPrices, baseContext)
        val gridLayout = GridLayoutManager(this, 2)
        binding.rvOrders.layoutManager = gridLayout
        binding.rvOrders.adapter = adapter


        init()
        LoadProductFromFirebase()
    }
    private fun LoadProductFromFirebase(){}
    private fun init(){
        productLoadListener= this
        var gridLayout= GridLayoutManager(this,2)
        rvOrders.layoutManager= gridLayout
        rvOrders.addItemDecoration(SpaceItemDecoration())

        val productModels: MutableList<ProductModel> = ArrayList()
        FirebaseDatabase.getInstance()
            .getReference("Product")
            .addListenerForSingleValueEvent(object: ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()){
                        for (productSnapshot in snapshot.children){
                            val productModel = productSnapshot.getValue(ProductModel::class.java)
                            productModel!!.image= productSnapshot.key
                            productModels.add(productModel)

                        }
                        productLoadListener.onProductLoadSuccess(productModels)

                    }
                    else
                        productLoadListener.onProductLoadFailed("Product items not exists")


                }

                override fun onCancelled(error: DatabaseError) {
                    productLoadListener.onProductLoadFailed(error.message)
                }

            })

    }

    override fun onProductLoadSuccess(productModelList: List<ProductModel>?) {
        val adapter = MyProductAdapter(this, productModelList!!)
        rvOrders.adapter = adapter
    }

    override fun onProductLoadFailed(message: String?) {
        Snackbar.make(mainLayout,message!!,Snackbar.LENGTH_LONG).show()
    }

}




