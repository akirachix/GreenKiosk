package com.example.greenkiosk.Customer

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.greenkiosk.R

class CustomerVerification: AppCompatActivity() {
    lateinit var tvverify: TextView
    lateinit var tvcode: TextView
    lateinit var btna: Button
    lateinit var btnb: Button
    lateinit var btnc: Button
    lateinit var btnd: Button
    lateinit var btne: Button
    lateinit var tvresend: TextView
    lateinit var btnverify: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_verification)

        var button = findViewById<Button>(R.id.btnverify).setOnClickListener {
            var intent = Intent(baseContext, CustomerLogIn::class.java)
            startActivity(intent)
        }
        castView()

    }

    fun castView() {
//      var tvverify = findViewById<TextView>(R.id.etEmail)
        var tvcode = findViewById<TextView>(R.id.tvcode)
        var tvresend = findViewById<TextView>(R.id.tvresend)
        var btnverify = findViewById<TextView>(R.id.btnverify)
        var btna = findViewById<Button>(R.id.btna)
        var btnb = findViewById<Button>(R.id.btnb)
        var btnc = findViewById<Button>(R.id.btnc)
        var btnd = findViewById<Button>(R.id.btnd)
        var btne = findViewById<Button>(R.id.btne)
    }


}