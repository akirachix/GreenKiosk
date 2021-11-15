package com.example.greenkiosk.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.greenkiosk.databinding.ActivityAccountMamambogaBinding
import com.google.firebase.auth.FirebaseAuth


class AccountMamambogaActivity : AppCompatActivity() {
    lateinit var binding: ActivityAccountMamambogaBinding
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountMamambogaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnnext.setOnClickListener{
            castViews()
            startActivity(Intent(this, MamaMbogaVerificationCode::class.java))
        }
    }
    fun castViews(){
        if(binding.etEmaill.text.toString().isNotEmpty() || binding.etPassword.text.toString().isNotEmpty()){
            createUser(binding.etEmaill.text.toString(),binding.etPassword.text.toString())
            val intent = Intent(this, MamaMbogaVerificationCode::class.java)
            startActivity(intent)
        }
        else{
            binding.etEmaill.setError("Please Enter Email")
            binding.etPassword.setError("Please Enter Password")
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


