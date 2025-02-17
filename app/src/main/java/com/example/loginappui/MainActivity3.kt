package com.example.loginappui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginappui.databinding.ActivityMain3Binding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding:ActivityMain3Binding

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMain3Binding.inflate(layoutInflater)

        auth=Firebase.auth
        setContentView(binding.root)


    }
}