package com.example.project_uts_salti.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_uts_salti.DetailMakanan
import com.example.project_uts_salti.R
import com.example.project_uts_salti.RecycleMakanan
import com.example.project_uts_salti.model.ModelMakanan

class MakananAdapter (
    val itemList: ArrayList<ModelMakanan>,
    private val getActivity : RecycleMakanan
) :
    RecyclerView.Adapter<MakananAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImageMakanan: ImageView
        var itemTextMakanan: TextView
        var itemPriceMakan : TextView
        var itemJumlahRating :TextView

        init {
            itemImageMakanan = itemView.findViewById(R.id.imgItemMakanan)
            itemTextMakanan = itemView.findViewById(R.id.txtNamaMakanan)
            itemPriceMakan = itemView.findViewById(R.id.txtHargaMakanan)
            itemJumlahRating = itemView.findViewById(R.id.txtRatingMakanan)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_makanan, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImageMakanan.setImageResource(itemList[position].imageMakanan)
        holder.itemTextMakanan.setText(itemList[position].titleMakanan)
        holder.itemPriceMakan.setText(itemList[position].hargaMakanan)
        holder.itemJumlahRating.setText(itemList[position].jumlahRatingMakanan)

        holder.itemView.setOnClickListener(){

            val intent = Intent(getActivity, DetailMakanan::class.java)

            intent.putExtra("image", itemList[position].imageMakanan)
            intent.putExtra("harga", itemList[position].hargaMakanan)
            intent.putExtra("nama", itemList[position].titleMakanan)
            intent.putExtra("deskripsi", itemList[position].deskripsiMakanan)
            intent.putExtra("namaTopping", itemList[position].namaToppingMakanan)
            intent.putExtra("topping", itemList[position].toppingMakanan)
            getActivity.startActivity(intent)
        }
    }
}