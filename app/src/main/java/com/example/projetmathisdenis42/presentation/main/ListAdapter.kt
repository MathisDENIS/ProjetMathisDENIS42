package com.example.projetmathisdenis42.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetmathisdenis42.presentation.model.PaysAmeriqueCentrale
import org.jetbrains.anko.toast

class ListAdapter (private val listeAC: List<PaysAmeriqueCentrale>)
        : RecyclerView.Adapter<ListViewHolder>() {

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val paysss: PaysAmeriqueCentrale = listeAC[position]
            holder.bind(paysss)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            val infHol = LayoutInflater.from(parent.context)
            return ListViewHolder(infHol, parent)
        }

        override fun getItemCount(): Int = listeAC.size
}
