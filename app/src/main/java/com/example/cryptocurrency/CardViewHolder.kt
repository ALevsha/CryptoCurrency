package com.example.cryptocurrency

import android.content.res.Resources
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(result: List<ResponseItem>, position: Int, resources: Resources){
        val responseItem: ResponseItem = result.get(position)

//        val image = itemView.findViewById<ImageView>(R.id.imageView)
//        image.setImageURI(responseItem.)

        val symbol = itemView.findViewById<TextView>(R.id.symbol)
        symbol.text = responseItem.symbol

        val name = itemView.findViewById<TextView>(R.id.name)
        name.text = responseItem.name

        val money = itemView.findViewById<TextView>(R.id.money)
        money.text = responseItem.priceUsd

        val hours = itemView.findViewById<TextView>(R.id.hours)
        hours.text = responseItem.percentChange24h

        val days = itemView.findViewById<TextView>(R.id.days)
        days.text = responseItem.percentChange7d

    }

}
