package com.helinavci.recyclerviewsehirler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.helinavci.recyclerviewsehirler.databinding.CardviewBinding

class sehirlerAdapter(val mContext: Context, val sehirler : List<sehirler>) : RecyclerView.Adapter<sehirlerAdapter.cardViewHolder>() {
    inner class cardViewHolder(val binding: CardviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewHolder {
        val binding = CardviewBinding.inflate(LayoutInflater.from(parent.context), parent ,false)
        return cardViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return sehirler.size
    }

    override fun onBindViewHolder(holder: cardViewHolder, position: Int) {
        val sehir = sehirler[position]
        val binding = holder.binding
        binding.textViewName.text = sehir.name
    }
}