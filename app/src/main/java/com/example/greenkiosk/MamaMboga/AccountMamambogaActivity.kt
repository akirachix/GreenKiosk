package com.example.greenkiosk.MamaMboga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.greenkiosk.Models.SignupRequest
import com.example.greenkiosk.R
import com.example.greenkiosk.ViewModel.SignupViewModel

class AccountMamambogaActivity : AppCompatActivity() {
    val userViewModel: SignupViewModel by viewModels()
    lateinit var btnnext: Button
    lateinit var next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_mamamboga)
        btnnext.setOnClickListener {
            var regRequest = SignupRequest(
                "Emma Mutiso", "0700000221",
                "emmake@gmail.com", "1921-05-07", "KENYAN",
            )
            userViewModel.signupcustomer(regRequest)
        }
    }

    override fun onResume() {
        super.onResume()
        userViewModel.registrationLiveData.observe(this, Observer { response ->
            Toast.makeText(
                baseContext, "Registration Success", Toast.LENGTH_LONG
            ).show()
        })
        userViewModel.regError.observe(this, Observer { str ->
            Toast.makeText(baseContext, str, Toast.LENGTH_LONG).show()
        })

        var next = findViewById<Button>(R.id.btnnext).setOnClickListener {
            val intent = Intent(baseContext, WorkinghoursActivity::class.java)
            startActivity(intent)
        }

        var login = findViewById<TextView>(R.id.tvconfirm).setOnClickListener {
            val intent = Intent(baseContext, loginActivity::class.java)
            startActivity(intent)
            var next = findViewById<Button>(R.id.btnnext).setOnClickListener {
                var intent = Intent(baseContext, WorkinghoursActivity::class.java)
                startActivity(intent)
            }


//         fun signupcustomer(){
//               val retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
//                val request = retrofit.POST()
//                request.enqueue(object: Callback<List<SignupResponse>> {
//                   fun onResponse(
//                       call: Call<List<POST>>, response:
//
//                       Response<List<SignupRequest>>
//                   ) {
//                       if (response.isSuccessful){
//                            var posts = response.body()
//                          Toast.makeText(baseContext, "${posts!!.size} posts", Toast.
//                           LENGTH_LONG).show()
//                       }
//                   }
//                    fun onFailure(call: Call<List<SignupRequest>>, t: Throwable) {
//                }
//
//           })
//       }
        }
    }
}




