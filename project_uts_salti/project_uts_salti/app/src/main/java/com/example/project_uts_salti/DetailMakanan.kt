package com.example.project_uts_salti

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakanan : AppCompatActivity() {

    private lateinit var txtDetailMakanan: TextView
    private lateinit var imgDetailMakanan: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

        txtDetailMakanan = findViewById(R.id.txtDNmakanan)
        imgDetailMakanan = findViewById(R.id.imgDNmakanan)

        val detailText = intent.getStringExtra("nama")
        val detailImg = intent.getIntExtra("image", 0)

        txtDetailMakanan.setText(detailText)
        imgDetailMakanan.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}