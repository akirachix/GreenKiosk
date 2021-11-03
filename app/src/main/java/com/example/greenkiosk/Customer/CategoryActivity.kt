package com.example.greenkiosk.Customer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R

class CategoryActivity : AppCompatActivity() {
    lateinit var rvCategories: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        rvCategories = findViewById(R.id.rvCategories)
        val categories = listOf(
            Categories(
                "Kiosk1",
                "https://media.gettyimages.com/photos/fresh-organic-homegrown-herbs-and-leaf-vegetables-background-picture-id962568356?s=612x612"
            ),
            Categories(
                "Kiosk2",
                "https://media.istockphoto.com/photos/healthy-fresh-rainbow-colored-fruits-and-vegetables-background-picture-id1208790371?k=20&m=1208790371&s=612x612&w=0&h=6BngNrl8TColGkvSGJUKFKIM5bv31Nc8MvQhmmC2LlM="
            ),
            Categories(
                "Kiosk3",
                "https://www.unlockfood.ca/EatRightOntario/media/Website-images-resized/How-to-store-fruit-to-keep-it-fresh-resized.jpg"
            )
        )

        var categoriesAdapter = RvCategoriesActivity(categories, baseContext)
        rvCategories.adapter = categoriesAdapter
        rvCategories.layoutManager = LinearLayoutManager(baseContext)
    }
}


