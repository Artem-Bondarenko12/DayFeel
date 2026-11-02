package com.example.dayfeel.ui.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.dayfeel.R
import com.example.dayfeel.ui.mood.MoodFragment


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        val btnRateDay = view.findViewById<Button>(R.id.btnRateDay)
        val btnCalendar = view.findViewById<Button>(R.id.btnCalendar)

        btnRateDay.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MoodFragment())
                .addToBackStack(null)
                .commit()
        }

        btnCalendar.setOnClickListener{
            parentFragmentManager.beginTransaction()

        }
    }
}