package com.example.greenkiosk.UI.MamaMboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.greenkiosk.R

class WorkinghoursActivity : AppCompatActivity() {
    lateinit var submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workinghours)
        var submit = findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            var intent = Intent(baseContext,Mamamboga_Location::class.java)
            startActivity(intent)
        }


    }
}