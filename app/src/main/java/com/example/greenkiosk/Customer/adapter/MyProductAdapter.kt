package com.example.greenkiosk.Customer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.greenkiosk.Customer.listener.CartLoadListener
import com.example.greenkiosk.Customer.listener.RecyclerViewClickListener
import com.example.greenkiosk.Customer.models.CartModel
import com.example.greenkiosk.Customer.models.ProductModel
import com.example.greenkiosk.R
import com.example.greenkiosk.eventBus.UpdateCartEvent
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import org.greenrobot.eventbus.EventBus
class MyProductAdapter(
    private val context: Context,
    private val list: List<ProductModel>,
    private val cartListener: CartLoadListener
)

:RecyclerView.Adapter<MyProductAdapter.MyProductViewHolder>(){

    class MyProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
      var productImageView: ImageView?= null
      var txtName: TextView?=null
      var txtKilogram: TextView?=null
      var txtPrice: TextView?=null

      private var clickListener: RecyclerViewClickListener? = null


      fun setClickListener(clickListener: RecyclerViewClickListener){
          this.clickListener = clickListener;
      }

     init {
         productImageView= itemView.findViewById(R.id.productImageView) as ImageView
         txtName= itemView.findViewById(R.id.txtName) as TextView
         txtKilogram= itemView.findViewById(R.id.txtKilogram) as TextView
         txtPrice=itemView.findViewById(R.id.txtPrice) as TextView

         itemView.setOnClickListener(this)
     }

        override fun onClick(v: View?) {
            clickListener!!.onItemClickListener(v,adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyProductViewHolder {
        return MyProductViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_product_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyProductViewHolder, position: Int) {
        Glide.with(context)
            .load(list[position].image)
            .into(holder.productImageView!!)
        holder.txtName!!.text=StringBuilder().append(list[position].productName)
        holder.txtKilogram!!.text=StringBuilder("kgs").append(list[position].kilogram)
        holder.txtPrice!!.text=StringBuilder("Ksh").append(list[position].price)

        holder.setClickListener(object: RecyclerViewClickListener{
            override fun onItemClickListener(view: View?, position: Int) {
                addToCart(list[position])
            }

            private fun addToCart(productModel: ProductModel) {
                val  userCart= FirebaseDatabase.getInstance()
                    .getReference("Cart")
                    .child("UNIQUE_USER_ID")

                userCart.child(productModel.productName!!)
                    .addListenerForSingleValueEvent(object :ValueEventListener{
                        override fun onDataChange(snapshot: DataSnapshot) {
                            if (snapshot.exists()){
                                val cartModel=snapshot.getValue(CartModel::class.java)
                                val updateData: MutableMap<String,Any> = HashMap()
                                cartModel!!.quantity= cartModel.quantity+ 1;
                                updateData["quantity"] = cartModel!!.quantity
                                updateData["totalPrice"]= cartModel!!.quantity * cartModel.price!!.toFloat()

                                userCart.child(productModel.image!!)
                                    .updateChildren(updateData)
                                    .addOnSuccessListener {
                                        EventBus.getDefault().postSticky(UpdateCartEvent())

//                                        cartListener.onLoadCartFailed
                                        ("Success add to cart") }
//                                    .addOnFailureListener
//                                { e -> cartListener.onLoadCartFailed(e.message)}
                            }

                            else{
                                var cartModel = CartModel()  //add to cart if item is not added
                                cartModel.image= productModel.image
                                cartModel.productName=productModel.productName
                                cartModel.kilogram=productModel.kilogram
                                cartModel.price= productModel.price
                                cartModel.quantity=1
                                cartModel.totalPrice=productModel.price!!.toFloat()


                                userCart.child(productModel.image!!)
                                    .setValue(cartModel)
                                    .addOnSuccessListener {
                                        EventBus.getDefault().postSticky(UpdateCartEvent())

                                    }

                            }
                        }
                        override fun onCancelled(error: DatabaseError) {
//                            cartListener.onLoadCartFailed(error.message)
                        }
                    })
            }
        })
    }
    override fun getItemCount(): Int {
        return list.size
    }

}


