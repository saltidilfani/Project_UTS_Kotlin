package com.example.project_uts_salti

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakanan : AppCompatActivity() {

    private lateinit var imgDetailMakanan: ImageView
    private lateinit var txtDetailNamaMakanan: TextView
    private lateinit var txtDetailHargaMakanan: TextView
    private lateinit var txtDetailDeskripsiMakanan: TextView
    private lateinit var txtDetailNamaToppingMakanan: TextView
    private lateinit var txtDetailToppingMakanan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

        txtDetailNamaMakanan = findViewById(R.id.txtNamaMakananD)
        imgDetailMakanan = findViewById(R.id.imgDNMakanan)
        txtDetailHargaMakanan = findViewById(R.id.txtHargaMakananD)
        txtDetailDeskripsiMakanan = findViewById(R.id.txtDeksMakananDUts)
        txtDetailNamaToppingMakanan = findViewById(R.id.txtNamaToppingDUts)
        txtDetailToppingMakanan = findViewById(R.id.txtToppingDUts)


        //get data
        val detailText = intent .getStringExtra("nama")
        val detailImg = intent.getIntExtra("image", 0)
        val detailHarga = intent.getStringExtra("harga")
        val detailDeskripsi = intent.getStringExtra("deskripsi")
        val detailNamaTopping = intent.getStringExtra("namaTopping")
        val detailTopping = intent.getStringExtra("topping")

        //set data ke widget
        txtDetailNamaMakanan.text = detailText
        imgDetailMakanan.setImageResource(detailImg)
        txtDetailHargaMakanan.text = detailHarga
        txtDetailDeskripsiMakanan.text = detailDeskripsi
        txtDetailNamaToppingMakanan.text = detailNamaTopping
        txtDetailToppingMakanan.text = detailTopping

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}