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

        var signup = findViewById<Button>(R.id.btnCustomerSignUp).setOnClickListener {
            val intent = Intent(baseContext, CustomerVerification::class.java)
            startActivity(intent)
        }
        var tvCustomerLogin = findViewById<TextView>(R.id.tvCustomerLogin).setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
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
    }
    fun validateDetails(): Any {
        if (CustomerFirstName.text.toString().equals("")) {
            CustomerFirstName.setError("Please Enter First Name")
            return false
        }
        if (CustomerSecondName.text.toString().equals("")) {
            CustomerSecondName.setError("Please Enter Second Name")
            return false
        }
        if (CustomerEmail.text.toString().equals("")) {
            CustomerEmail.setError("Please Enter Email Name")
            return false
        }
        if (CustomerPassword.text.toString().equals("")) {
            CustomerPassword.setError("Please Enter Password")
            return false
        }
        if (CustomerConfirmPassword.text.toString().equals("")) {
            CustomerConfirmPassword.setError("Please Confirm Password")
            return false
        }
        // checking minimum password Length
        if (CustomerPassword.text.length < 8) {
            CustomerPassword.setError("Password Length must be more than " + 8 + "characters")
            return false
        }
        // Checking if repeat password is same
        if (!CustomerPassword.text.toString().equals(CustomerConfirmPassword.text.toString())) {
            CustomerConfirmPassword.setError("Password does not match")
            return false
        }
        return if (checkBoxCustomer.isChecked()) {
            checkBoxCustomer.setChecked(false);
        } else btnCustomerSignUp.setOnClickListener {
            Toast.makeText(this, "Account Created Successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CustomerPassword::class.java)
        }
    }
}
// Here you can call you API