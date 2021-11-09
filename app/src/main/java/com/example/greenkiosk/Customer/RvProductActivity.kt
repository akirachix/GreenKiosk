package com.example.greenkiosk.Customer

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R
import com.squareup.picasso.Picasso

class RvProductActivity(var productList: List<Products>,var context: Context): RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var productItem =
            LayoutInflater.from(parent.context).inflate(R.layout.products_item_list, parent, false)
        return ProductViewHolder(productItem)

    }
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentProducts = productList.get(position)
        holder.productTitle.text = currentProducts.name
        Picasso.get()
            .load(currentProducts.imgUrl)
            .into(holder.img)

        holder.card.setOnClickListener {
            var intent= Intent(context,CustomerCart::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {

        return productList.size
    }
}
class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var productTitle = itemView.findViewById<TextView>(R.id.productTitle)
    var img = itemView.findViewById<ImageView>(R.id.categoryimage)
    var card=itemView.findViewById<CardView>(R.id.cvCardProduct)
}