package com.example.laboratorio6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_library.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_library : Fragment(R.layout.fragment_library) {

    private lateinit var buttonCount: ImageButton
    private lateinit var contador: TextView
    private var count = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonCount = view.findViewById(R.id.button_incremento)
        contador = view.findViewById(R.id.text_view_cantidad)
        setListeners()
    }

    override fun onResume() {
        super.onResume()
        contador.text = count.toString()
    }

    private fun setListeners() {
        buttonCount.setOnClickListener {
            count++
            contador.text = count.toString()
        }
    }

}