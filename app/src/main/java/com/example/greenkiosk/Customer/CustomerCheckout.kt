package com.example.greenkiosk.Customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.greenkiosk.Customer.listener.CartLoadListener
import com.example.greenkiosk.Customer.models.CartModel
import com.example.greenkiosk.R
import com.example.greenkiosk.eventBus.UpdateCartEvent
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import edmt.dev.GreenKioskcart.adapter.MyCartAdapter
import kotlinx.android.synthetic.main.activity_customer_checkout.*
import kotlinx.android.synthetic.main.activity_customer_checkout.rvOrders
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.ArrayList

class CustomerCheckout:AppCompatActivity(), CartLoadListener {
    lateinit var btnCheckout: Button
    var cartLoadListener: CartLoadListener? = null



    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        if (EventBus.getDefault().hasSubscriberForEvent(UpdateCartEvent::class.java))
            EventBus.getDefault().removeStickyEvent(UpdateCartEvent::class.java)
        EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    fun onUpdateCartEvent(event: UpdateCartEvent){


        loadCartFromFirebase()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_checkout)
        var button = findViewById<Button>(R.id.processedToCheckout).setOnClickListener {
            var intent = Intent(baseContext, CustomerSignUp::class.java)
            startActivity(intent)
        }

        init()
        loadCartFromFirebase()


    }

    private fun loadCartFromFirebase(){
        var cartModels : MutableList<CartModel> = ArrayList()
        FirebaseDatabase.getInstance()
            .getReference("Cart")
            .child("UNIQUE_USER_ID")
            .addListenerForSingleValueEvent(object: ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    for ( cartSnapshot in snapshot.children){
                        var cartModel = cartSnapshot.getValue(CartModel::class.java)
                        cartModel!!.image= cartSnapshot.key
                        cartModels.add(cartModel)
                    }
                    cartLoadListener!!.onLoadCartSuccess(cartModels)

                }

                override fun onCancelled(error: DatabaseError) {
//                    cartLoadListener!!.onLoadCartFailed(error.message)
                }

            })
    }
     private fun init(){
         cartLoadListener = this
         var layoutManager = LinearLayoutManager(this)
         rvOrders!!.layoutManager = layoutManager
         rvOrders!!.addItemDecoration(DividerItemDecoration(this, layoutManager.orientation))
         btnBack!!.setOnClickListener {  finish() }

     }


    override fun onLoadCartSuccess(cartModelList: List<CartModel>) {
        var sum = 0.0
        for (cartModel in cartModelList!!){
            sum += cartModel!! .totalPrice
        }
        txtTotal.text = StringBuilder("Ksh").append(sum)
        val  adapter = MyCartAdapter(this, cartModelList)
        rvOrders!!.adapter = adapter
    }

    override fun onLoadCartFailed(message: String?, mainLayout: View) {
        Snackbar.make(mainLayout,message!!, Snackbar.LENGTH_LONG).show()

    }
}