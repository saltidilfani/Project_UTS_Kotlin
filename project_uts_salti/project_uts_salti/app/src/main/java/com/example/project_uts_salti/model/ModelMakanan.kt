package com.example.project_uts_salti.model

import com.example.project_uts_salti.R

data class ModelMakanan(
    val image: Int,
    val nama: String
)

object MockList {
    fun getModel(): List<ModelMakanan> {
        val item1 = ModelMakanan(
            R.drawable.img1,
            "Makanan 1"
        )
        val item2 = ModelMakanan(
            R.drawable.img2,
            "Makanan 2"
        )

        val itemList: ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        return itemList
    }
}
