package com.katrin.examwork

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PhoneAdapter(private val phoneNumberList: List<PhoneNumber>) :

    RecyclerView.Adapter<PhoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.phone_list_item, parent, false)
        return PhoneViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val name = phoneNumberList[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return phoneNumberList.size
    }

}