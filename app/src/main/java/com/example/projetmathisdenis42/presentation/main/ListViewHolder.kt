package com.example.projetmathisdenis42.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetmathisdenis42.R
import com.example.projetmathisdenis42.presentation.model.PaysAmeriqueCentrale

class ListViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.row_layout, parent, false)) {
    private var name: TextView? = null
    private var cap: TextView? = null

    init {
        name= itemView.findViewById(R.id.text_view_1)
        cap= itemView.findViewById(R.id.text_view_2)
    }

    fun bind(pays: PaysAmeriqueCentrale) {
        name?.text = pays.name
        cap?.text = pays.cap
    }
}