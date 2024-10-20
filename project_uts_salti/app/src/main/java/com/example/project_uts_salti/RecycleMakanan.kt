package com.example.project_uts_salti

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_uts_salti.adapter.MakananAdapter
import com.example.project_uts_salti.model.MockList
import com.example.project_uts_salti.model.ModelMakanan

class RecycleMakanan : AppCompatActivity() {
    private lateinit var recyclerViewMakanan : RecyclerView
    private lateinit var adapter: MakananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_makanan)

        recyclerViewMakanan= findViewById(R.id.rv_makanan)
        recyclerViewMakanan.layoutManager = LinearLayoutManager(this)

        val makananList = MockList.getModel()

        // Mengatur adapter
        adapter = MakananAdapter(makananList as ArrayList, this)
        recyclerViewMakanan.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}