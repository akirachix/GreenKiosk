package com.example.greenkiosk.Customer

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R
import com.google.android.material.textfield.TextInputEditText

class CustomerLogIn:AppCompatActivity(){
    lateinit var btncheck:Button
    lateinit var tvPassword:Button
    lateinit var etPhoneNumber: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_log_in)

        fun castView(){

            var btncheck=findViewById<Button>(R.id.btncheck)
        }

        }
    }

