package com.example.greenkiosk.Customer

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.R

class CustomerSignUp: AppCompatActivity() {
    lateinit var CustomerFirstName: EditText
    lateinit var CustomerSecondName: EditText
    lateinit var CustomerEmail: EditText
    lateinit var CustomerPassword: EditText
    lateinit var CustomerConfirmPassword: EditText
    lateinit var checkBoxCustomer: CheckBox
    lateinit var btnCustomerSignUp: Button
    lateinit var tvCustomerLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_sign_up)
        details()
    }
    fun details() {
        CustomerFirstName = findViewById(R.id.etCustomerFirstName)
        CustomerSecondName = findViewById(R.id.etCustomerSecondName)
        CustomerEmail = findViewById(R.id.etCustomerEmail)
        CustomerPassword = findViewById(R.id.etCustomerPassword)
        CustomerConfirmPassword = findViewById(R.id.etCustomerConfirmPassword)
        checkBoxCustomer = findViewById(R.id.checkBoxCustomer)
        btnCustomerSignUp = findViewById(R.id.btnCustomerSignUp)
        tvCustomerLogin = findViewById(R.id.tvCustomerLogin)
        validateDetails()
    }

    fun validateDetails() {
        var signup = findViewById<Button>(R.id.btnCustomerSignUp).setOnClickListener {
            if (CustomerFirstName.text.toString().isEmpty() || CustomerSecondName.text.toString().isEmpty() || CustomerEmail.text.toString().isEmpty()
                || CustomerPassword.text.toString(). isEmpty() || CustomerConfirmPassword.text.toString().isEmpty() || CustomerConfirmPassword.text.toString().isEmpty()
                || CustomerPassword.text.length < 8 || CustomerPassword.text.toString() !== (CustomerConfirmPassword.text.toString()) || checkBoxCustomer.toString().isEmpty()
            ) {
                CustomerFirstName.error = "Please Enter First Name"
                CustomerSecondName.error = "Please Enter Second Name"
                CustomerEmail.error = "Please Enter Email"
                CustomerPassword.error = "Please Enter Password"
                CustomerConfirmPassword.error = "Please Confirm Password"
                CustomerPassword.error = "Password Length must be more than " + 8 + "characters"
                CustomerConfirmPassword.error = "Password does not match"
                checkBoxCustomer.error = "Click the Check Box"
            }
            else {
                val intent = Intent(baseContext, CustomerVerification::class.java)
                startActivity(intent)
            }
        }
        var tvCustomerLogin = findViewById<Button>(R.id.btnCustomerSignUp).setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
// Here you can call you API
