package com.example.greenkiosk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
//
//        fun getPosts(){
//            val retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
//            val request = retrofit.getPosts()
//            request.enqueue(object: Callback<List<PaymentRequest>> {
//                override fun onResponse(call: Call<List<Post>>, response:
//                Response<List<Post>>
//                ) {
//                    if (response.isSuccessful){
//                        var posts = response.body()
//                        Toast.makeText(baseContext, "${posts!!.size} posts", Toast.
//                        LENGTH_LONG).show()
//                    }
//                }
//                override fun onFailure(call: Call<List<Post>>, t: Throwable) {
//                }
//            })
//        }

//        var btnok= findViewById<Button>(R.id.btnok).setOnClickListener {
//            var intent = Intent(baseContext, DeliveryMethodActivity::class.java)
//            startActivity(intent)
        }

    }
