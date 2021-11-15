package com.example.greenkiosk.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.databinding.ActivityCustomerSignUpBinding
import com.google.firebase.auth.FirebaseAuth

class CustomerSignUp: AppCompatActivity() {

    lateinit var binding: ActivityCustomerSignUpBinding
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnSign.setOnClickListener{
            castViews()
            startActivity(Intent(this,CustomerVerification ::class.java))
        }
    }
    fun castViews(){
        if(binding.etEmail.text.toString().isNotEmpty() || binding.etCustomerPassword.text.toString() .isNotEmpty() || binding.etCustomerConfirmPassword.text.toString() .isNotEmpty()){
            createUser(binding.etEmail.text.toString(),binding.etCustomerPassword.text.toString())
            val intent = Intent(this, CustomerVerification::class.java)
            startActivity(intent)
        }
        else{
            binding.etEmail.setError("Please Enter Email")
            binding.etCustomerPassword.setError("Please Enter Password")
        }
    }
    fun createUser(email:String,password:String){
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){task ->
                if (task.isSuccessful){
                    Toast.makeText(baseContext,"Successfuly SignedUp" , Toast.LENGTH_LONG).show()
                }
                else{
                    Log.e("Task Message","Failed "+ task.exception)
                }
            }
    }
}





// Here you can call you API
