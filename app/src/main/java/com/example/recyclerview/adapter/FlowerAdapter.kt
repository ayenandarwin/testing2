package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Flower
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.item_flower.view.*

class FlowerAdapter(var flowerList: ArrayList<Flower>) :RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(flower: Flower) {
            itemView.txtName.text = flower.name
            itemView.txtPrice.text = flower.price.toString()
            itemView.imgFlower.setImageResource(flower.image)


        }

    }

    override fun getItemCount(): Int = flowerList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_flower, parent, false)
        return FlowerViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {

        holder.bind(flowerList[position])

    }

}

