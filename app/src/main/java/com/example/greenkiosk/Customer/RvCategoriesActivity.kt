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

class RvCategoriesActivity(var categoriesList: List<Categories>,var context: Context): RecyclerView.Adapter<CategoriesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder{
        var categoriesItem= LayoutInflater.from(parent.context).inflate(R.layout.categories_items_list,parent,false)
        return CategoriesViewHolder(categoriesItem)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val currentCategory = categoriesList.get(position)
        holder.categoryTitle.text = currentCategory.name


        Picasso.get()
            .load(currentCategory.imgUrl)
            .into(holder.img)
        holder.card.setOnClickListener {
            var intent= Intent(context,ProductCategoryActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}

class CategoriesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var categoryTitle = itemView.findViewById<TextView>(R.id.productTitle)
    var img=itemView.findViewById<ImageView>(R.id.categoryimage)
    var card=itemView.findViewById<CardView>(R.id.cvCardProduct)


}