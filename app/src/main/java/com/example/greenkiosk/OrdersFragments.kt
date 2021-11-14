package com.example.greenkiosk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.orderfragments.*

class OrdersFragments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.orderfragments)

        val firstFragment = PendingOrdersFragment()
        val secondFragment = CompletedOrdersFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragments,firstFragment)
            commit()
        }

        btnPending.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragments,firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btnCompleted.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragments,secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}