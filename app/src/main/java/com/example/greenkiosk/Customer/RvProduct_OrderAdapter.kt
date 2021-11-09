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

class RvProduct_OrderAdapter(
    var cardTitles: Array<String>,
    var cardImages: Array<String>,
    var cardKilograms: Array<String>,
    var cardPrices: Array<String>,
    var context: Context
    ): RecyclerView.Adapter<ProductOrdersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductOrdersViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.activity_customer_products_view,parent,false)
        return ProductOrdersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductOrdersViewHolder, position: Int) {
        holder.cardTitle.text=cardTitles[position]
        holder.cardKilograms.text=cardKilograms[position]
        holder.cardPrices.text=cardPrices[position]
        Picasso.get().load(cardImages[position]).into(holder.cardImages)

        holder.cvOrders.setOnClickListener {
            var intent = Intent(context, CustomerCheckout::class.java)
            intent.putExtra("Name", cardTitles)
            intent.putExtra("Kilograms",cardKilograms)
            intent.putExtra("Prices",cardPrices)
            intent.putExtra("imageUrl",cardImages)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK;
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return cardImages.size
    }
}
class ProductOrdersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var cardImages: ImageView =itemView.findViewById(R.id.imgProduct1)
    var cardTitle: TextView = itemView.findViewById(R.id.etProduct)
    var cardKilograms: TextView =itemView.findViewById(R.id.etKilograms)
    var cardPrices: TextView =itemView.findViewById(R.id.etPrices)
    var cvOrders: CardView =itemView.findViewById(R.id.cvOrders)
}


