package com.example.project_uts_salti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {

    private lateinit var txtSignUpUts: TextView
    private lateinit var btnLogIn1Uts: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtSignUpUts = findViewById(R.id.txtSignUpUts)
        btnLogIn1Uts = findViewById(R.id.btnLogIn1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtSignUpUts.setOnClickListener() {
            val intentPassingData = Intent(
                this@PageLogin,
                PageSignUp::class.java
            )
            startActivity(intentPassingData)
        }
        btnLogIn1Uts.setOnClickListener() {
            val intentPassingData = Intent(
                this@PageLogin,
                RecycleMakanan::class.java
            )
            startActivity(intentPassingData)
        }
    }
}