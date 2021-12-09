package com.katrin.examwork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

private const val LAST_MEAL_IMAGE = "image"

class ChooseMealFragment: Fragment() {

    lateinit var mealImageView: ImageView
    lateinit var chooseButton: Button

    private val mealImageList: List<Int> = listOf(
        R.drawable.american,
        R.drawable.asian,
        R.drawable.italian,
        R.drawable.mexican,
        R.drawable.russian
    )

    var lastChoosedImageRes = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_choose_meal, container, false)

        mealImageView = view.findViewById(R.id.meal_image_view)
        chooseButton = view.findViewById(R.id.choose_button)

        if (savedInstanceState != null)
            mealImageView.setImageResource(savedInstanceState.getInt(LAST_MEAL_IMAGE))


        chooseButton.setOnClickListener {
            lastChoosedImageRes = mealImageList.random()
            mealImageView.setImageResource(lastChoosedImageRes)
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(
            LAST_MEAL_IMAGE,
            lastChoosedImageRes
        )
    }

}