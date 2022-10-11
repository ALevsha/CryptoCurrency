package com.example.cryptocurrency

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private val result: List<ResponseItem>,
    val resources: Resources
) : RecyclerView.Adapter<CardViewHolder>() {
    override fun getItemCount(): Int {
        return result.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) =
        holder.bind(result, position, resources)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            LayoutInflater.from(parent?.context)
                .inflate(R.layout.item, parent, false)
        ) //Говорим RecyclerView как должен выглядеть item
    }
}