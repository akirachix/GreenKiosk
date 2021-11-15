package com.example.greenkiosk.ui

import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

//    lateinit var binding: ActivityLoginBinding
//    lateinit var auth: FirebaseAuth
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityAccountMamambogaBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        auth = FirebaseAuth.getInstance()
//
//        binding.btnnext.setOnClickListener{
//            castViews()
//            startActivity(Intent(this, MamaMbogaVerificationCode::class.java))
//        }
//    }
//    fun castViews(){
//        if(binding.etemail.text.toString().isNotEmpty() || binding.etPassword.text.toString().isNotEmpty()){
//            createUser(binding.etemail.text.toString(),binding.etPassword.text.toString())
//            val intent = Intent(this, MamaMbogaVerificationCode::class.java)
//            startActivity(intent)
//        }
//        else{
//            binding.etemail.setError("Please Enter Email")
//            binding.etPassword.setError("Please Enter Password")
//        }
//    }
//    fun createUser(email:String,password:String){
//        auth.createUserWithEmailAndPassword(email,password)
//            .addOnCompleteListener(this){task ->
//                if (task.isSuccessful){
//                    Toast.makeText(baseContext,"Successfuly SignedUp" , Toast.LENGTH_LONG).show()
//                }
//                else{
//                    Log.e("Task Message","Failed "+ task.exception)
//                }
//            }
//    }
//}
//



//        var tvSignUp = findViewById<TextView>(R.id.tvSignup).setOnClickListener {
//            val intent = Intent(this, MamaMbogaSignUp::class.java)
//            startActivity(intent)
//        }


        }

