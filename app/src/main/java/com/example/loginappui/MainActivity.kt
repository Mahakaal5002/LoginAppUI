package com.example.loginappui

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val  btn:Button=findViewById(R.id.createbtn)
        var fName:EditText=findViewById(R.id.fname)
        var lname:EditText=findViewById(R.id.lname)

        btn.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java)
                .putExtra("fname",fName.text.toString())
                .putExtra("lname",lname.text.toString()))

        }
    }
}