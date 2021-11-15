package com.example.greenkiosk.Customer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.greenkiosk.Customer.adapter.MyProductAdapter
import com.example.greenkiosk.Customer.listener.CartLoadListener
import com.example.greenkiosk.Customer.listener.ProductLoadListener
import com.example.greenkiosk.Customer.models.CartModel
import com.example.greenkiosk.Customer.models.ProductModel
import com.example.greenkiosk.Customer.utils.SpaceItemDecoration
import com.example.greenkiosk.R
import com.example.greenkiosk.eventBus.UpdateCartEvent
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_customer_cart.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.ArrayList

class CustomerCart :AppCompatActivity(), ProductLoadListener, CartLoadListener {

    lateinit var productLoadListener: ProductLoadListener
    lateinit var cartLoadListener: CartLoadListener

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        if (EventBus.getDefault().hasSubscriberForEvent(UpdateCartEvent::class.java))
            EventBus.getDefault().removeStickyEvent((UpdateCartEvent::class.java))
        EventBus.getDefault().unregister(this)

    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public fun OnUpdateCartEvent(event: UpdateCartEvent){

        countCartfromFireBase()
    }


//    lateinit var binding: ActivityCustomerCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding= ActivityCustomerCartBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_customer_cart)
        getProductDetails()

    }

    private fun getProductDetails() {

//        val rvOrders = findViewById<RecyclerView>(R.id.rvOrders)
//        val cardTitle: Array<String> = resources.getStringArray(R.array.cardTitles)
//        val cardImages: Array<String> = resources.getStringArray(R.array.cardImages)
//        val cardKilograms: Array<String> = resources.getStringArray(R.array.cardKilograms)
//        val cardPrices: Array<String> = resources.getStringArray(R.array.cardPrices)
//        val adapter= RvProductOrderAdapter(cardTitle, cardImages, cardKilograms, cardPrices, baseContext)
//        val gridLayout = GridLayoutManager(this, 2)
//        binding.rvOrders.layoutManager = gridLayout
//        binding.rvOrders.adapter = adapter

        init()
        LoadProductFromFirebase()
        countCartfromFireBase()

    }

    private fun countCartfromFireBase(){
        var cartModels : MutableList<CartModel> = ArrayList()
        FirebaseDatabase.getInstance()
            .getReference("products")
//            .child("UNIQUE_USER_ID")
            .addListenerForSingleValueEvent(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    for (cartSnapshot in snapshot.children){
                        var cartModel = cartSnapshot.getValue(CartModel::class.java)
                        cartModel!!.image= cartSnapshot.key
                        cartModels.add(cartModel)
                    }
                    cartLoadListener.onLoadCartSuccess(cartModels)
                }

                override fun onCancelled(error: DatabaseError) {
//                    cartLoadListener.onLoadCartFailed(error.message)

                }

            })
    }


    private fun LoadProductFromFirebase(){}
    private fun init(){

        productLoadListener= this
        cartLoadListener =this

        var gridLayout= GridLayoutManager(this,2)
        rvProduct.layoutManager= gridLayout
        rvProduct.addItemDecoration(SpaceItemDecoration())

        val productModels: MutableList<ProductModel> = ArrayList()
        FirebaseDatabase.getInstance()
            .getReference("products")
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
        val adapter = MyProductAdapter(this, productModelList!!, cartLoadListener)
        rvProduct.adapter = adapter
    }


    override fun onProductLoadFailed(message: String?) {
//        Snackbar.make(mainLayout,message!!, Snackbar.LENGTH_LONG).show()
    }

    override fun onLoadCartSuccess(cartModelList: List<CartModel>) {
        var cartSum = 0
        for (cartModel in cartModelList!!) cartSum+= cartModel!!.quantity
        badge!!.setNumber(cartSum)
    }

    override fun onLoadCartFailed(message: String?, mainLayout: View) {
        Snackbar.make(mainLayout,message!!,Snackbar.LENGTH_LONG).show()

    }

}




