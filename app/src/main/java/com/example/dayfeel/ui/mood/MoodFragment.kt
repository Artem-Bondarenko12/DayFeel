package com.example.dayfeel.ui.mood

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.dayfeel.R
import com.example.dayfeel.ui.success.SuccessFragment

class MoodFragment : Fragment(R.layout.fragment_mood) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        val btnSaveResult = view.findViewById<Button>(R.id.btnSaveResult)

        btnSaveResult.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SuccessFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}