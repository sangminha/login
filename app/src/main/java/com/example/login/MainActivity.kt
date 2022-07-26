package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  id = "asdf"

        var password = "1234"
        loginBtn.setOnClickListener {
          if(id == email.text.toString()){
              if (password==password_enT.text.toString())
              {   Toast.makeText(this, "맞습니다", Toast.LENGTH_SHORT).show()}
              else{
                  Toast.makeText(this, "아닙니다.", Toast.LENGTH_SHORT).show()
              }

        }
    }
}}