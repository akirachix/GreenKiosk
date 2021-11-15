package com.example.greenkiosk.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.PaymentActivity
import com.example.greenkiosk.databinding.ActivityCustomerLogInBinding
import com.google.firebase.auth.FirebaseAuth

class CustomerLogIn:AppCompatActivity(){
    lateinit var binding: ActivityCustomerLogInBinding
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityCustomerLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btncheck.setOnClickListener{
            castViews()
            startActivity(Intent(this, PaymentActivity::class.java))
        }
    }
    fun castViews(){
        if(binding.etpassword.text.toString().isNotEmpty() || binding.etEMAIL.text.toString().isNotEmpty()){
            createUser(binding.etpassword.text.toString(),binding.etEMAIL.text.toString())
            val intent = Intent(this, MamaMbogaVerificationCode::class.java)
            startActivity(intent)
        }
        else{
            binding.etpassword.setError("Please Enter Email")
            binding.etEMAIL.setError("Please Enter Password")
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


