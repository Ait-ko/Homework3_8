package com.example.homework3_8

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework3_8.databinding.FragmentMainBinding
import com.example.homework3_8.databinding.ItemCharactersBinding

class Unit_Adapter(private val UnitList: ArrayList<String>, val onItemClick:(position:Int) -> Unit): RecyclerView.Adapter<Unit_Adapter.ViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemUnitBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = UnitList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(UnitList[position])
    }

    inner class ViewHolder(private val binding: ItemUnitBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(unit : Unit) {
            binding.apply {
                unit.apply {
                    tvUnitName.text =name
                    tvIsTheyAlive.text = isHeAlive
                    Glide.with(ivUnitPicture).load(unit.picture).into(ivUnitPicture)
                }
            }
            itemView.setOnClickListener{
                onItemClick(adapterPosition)
            }
        }
    }
}