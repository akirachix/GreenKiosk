package com.example.greenkiosk.Customer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
            var etMobileNumber = findViewById<EditText>(R.id.etphoneNumber)
            var etPassword = findViewById<EditText>(R.id.etpassword)
            var btncheck=findViewById<Button>(R.id.btncheck)
        }

        }
    }

