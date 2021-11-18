package com.example.greenkiosk.Customer

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R
import com.squareup.picasso.Picasso

class ProductDetailsRecycleView(
    var productList: List<Product>,
    var context: Context,
    var productClickListener: CustomerCart.ProductClickListener
): RecyclerView.Adapter<CartProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartProductViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.layout_product_item,parent,false)
        return CartProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartProductViewHolder, position: Int) {
      var currentProduct = productList.get(position)
      holder.etProductName.text= currentProduct.productName
      holder.etQuantity.text=StringBuilder("kgs").append(currentProduct.quantity.toString())
      holder.etPrices.text=StringBuilder("ksh").append(currentProduct.prices.toString())
        Picasso.get()
            .load(currentProduct.imageUrl)
            .resize(100, 100)
            .into(holder.imgProduct)
//
//        holder.cvOrders.setOnClickListener {
//            var intent= Intent(context, CustomerCheckout::class.java)
//            intent.putExtra("ProductName",currentProduct.productName)
//            intent.putExtra("Quantity",currentProduct.quantity)
//            intent.putExtra("Price",currentProduct.prices)
//            intent.putExtra("ImageUrl",currentProduct.imageUrl)
//            context.startActivity(intent)
//        }


        holder.btnAdd.setOnClickListener {
            productClickListener.onSelectedProduct(currentProduct)
        }


        holder.btnRemove.setOnClickListener {
            productClickListener.onDeleteProduct(currentProduct)
        }


    }
    override fun getItemCount(): Int {
        return productList.size
    }
}

class CartProductViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
    var imgProduct=itemView.findViewById<ImageView>(R.id.imgProduct)
    var etProductName=itemView.findViewById<TextView>(R.id.etProductName)
    var etQuantity=itemView.findViewById<TextView>(R.id.etKilograms)
    var etPrices=itemView.findViewById<TextView>(R.id.etPrices)
    var btnAdd= itemView.findViewById<Button>(R.id.btnAdd)
    var btnRemove= itemView.findViewById<Button>(R.id.btnRemove)
    var etNumber=itemView.findViewById<TextView>(R.id.etNumber)
    var cvOrders= itemView.findViewById<CardView>(R.id.cvOrders)

}
