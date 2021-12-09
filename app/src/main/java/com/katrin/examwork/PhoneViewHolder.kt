package com.katrin.examwork

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nationalityTextView: TextView =
        itemView.findViewById(R.id.nationality_text_view)
    private val phoneTextView: TextView =
        itemView.findViewById(R.id.phone_text_view)

    fun bind(phoneNumber: PhoneNumber) {
        nationalityTextView.text = "Type of food - ${phoneNumber.nationality}"
        phoneTextView.text = "Restaurant phone number - ${phoneNumber.phoneNumber}"

    }

}