package com.example.greenkiosk.Customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.greenkiosk.R
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class CustomerLogIn:AppCompatActivity() {
    lateinit var btncheck: Button
    lateinit var tvPassword: Button
    lateinit var etPhoneNumber: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_log_in)
        var button = findViewById<Button>(R.id.btncheck).setOnClickListener {
//            var intent = Intent(baseContext, PaymentMethodActivity::class.java)
//            startActivity(intent)
            Firebase.auth.signOut()


            fun castView() {
                var etMobileNumber = findViewById<EditText>(R.id.etphoneNumber)
                var etPassword = findViewById<EditText>(R.id.etpassword)
                var btncheck = findViewById<Button>(R.id.btncheck)
            }

        }
    }
}

