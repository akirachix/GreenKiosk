package com.example.greenkiosk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.greenkiosk.Customer.CategoryActivity
import com.example.greenkiosk.MamaMboga.CompleteOrdersActivity
import com.example.greenkiosk.MamaMboga.MamaMbogaPending
import com.example.greenkiosk.MamaMboga.Notifications
import com.example.greenkiosk.MamaMboga.Update_Orders_Activity

class MainOrders : AppCompatActivity() {
    lateinit var pending: Button
    lateinit var complete: Button
    lateinit var update: Button
    lateinit var notifications: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_orders)
        var pending = findViewById<Button>(R.id.btnpendingOrders).setOnClickListener {
            var intent = Intent(baseContext,MamaMbogaPending::class.java)
            startActivity(intent)
        }
        var complete = findViewById<Button>(R.id.btnCompletedOrder).setOnClickListener {
            var intent = Intent(baseContext,CompleteOrdersActivity::class.java)
            startActivity(intent)
        }
        var update = findViewById<Button>(R.id.btnupdateOrders).setOnClickListener {
            var intent = Intent(baseContext,Update_Orders_Activity::class.java)
            startActivity(intent)
        }
        var notifications = findViewById<Button>(R.id.btnNotifications).setOnClickListener {
            var intent = Intent(baseContext,Notifications::class.java)
            startActivity(intent)
        }

    }
}
