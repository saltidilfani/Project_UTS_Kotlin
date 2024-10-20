package com.example.project_uts_salti.model


import com.example.project_uts_salti.R

data class ModelMakanan(
    val imageMakanan: Int,
    val titleMakanan: String,
    val hargaMakanan : String,
    val jumlahRatingMakanan : String,
    val deskripsiMakanan : String,
    val namaToppingMakanan : String,
    val toppingMakanan : String
)

object MockList {
    fun getModel(): List<ModelMakanan> {
        val item1 = ModelMakanan(
            R.drawable.nasi_goreng,
            "Nasi Goreng",
            "15.000",
            "5.00",
            "Nasi goreng dengan topping ayam dan telur",
            "Toppings",
            "Kerupuk, Ayam Suwir"
        )

        val item2 = ModelMakanan(
            R.drawable.sate,
            "Sate Padang",
            "20.000",
            "4.00",
            "Sate padang memakai bahan daging sapi, lidah, biji atau jeroan (jantung, usus, dan tetelan) dengan bumbu kuah kacang kental",
            "Toppings",
            "Daging Ayam, Ceker"
        )

        val item3 = ModelMakanan(
            R.drawable.seblak,
            "Seblak",
            "15.000",
            "5.00",
            "Seblak adalah makanan khas Sunda yang bercita rasa pedas dan gurih.",
            "Toppings",
            "Telor, Bakso"
        )

        val item4 = ModelMakanan(
            R.drawable.gacoan,
            "Gacoan",
            "9.500",
            "5.00",
            "Mie Gacoan adalah restauran yang menyajikan menu mie pedas yang sedang begitu diminati, terutama oleh kaum muda.",
            "Toppings",
            "Udang Keju, Udang Rambutan"
        )

        val itemList: ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        return itemList
    }
}
