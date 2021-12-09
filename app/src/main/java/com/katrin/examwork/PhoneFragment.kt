package com.katrin.examwork

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PhoneFragment : Fragment() {

    lateinit var phoneRecyclerView: RecyclerView
    lateinit var moreButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_phone, container, false)

        val phoneNumberList: List<PhoneNumber> = listOf(
            PhoneNumber("American", +7555555555),
            PhoneNumber("Asian", +7666666666),
            PhoneNumber("Italian", +7888888888),
            PhoneNumber("Mexican", +7999999999),
            PhoneNumber("Russian", +7444444444)
        )

        moreButton = view.findViewById(R.id.more_button)

        phoneRecyclerView = view.findViewById(R.id.phone_recycler_view)
        phoneRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        phoneRecyclerView.adapter = PhoneAdapter(phoneNumberList)

        moreButton.setOnClickListener {
            val link = Uri.parse("https://google.com")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }


}