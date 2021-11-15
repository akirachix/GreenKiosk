package com.example.greenkiosk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

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

//        btnPending.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragments,firstFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }
//        btnCompleted.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragments,secondFragment)
//                addToBackStack(null)
//                commit()
//            }
        }
    }
