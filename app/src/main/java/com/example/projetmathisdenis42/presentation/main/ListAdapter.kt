package com.example.projetmathisdenis42.presentation.main


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetmathisdenis42.R
import com.example.projetmathisdenis42.presentation.model.PaysAmeriqueCentrale
import kotlinx.android.synthetic.main.row_layout.view.*

class ListAdapter(private val users: List<PaysAmeriqueCentrale>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.row_layout,
            parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = users[position]
        holder.textView1.text = currentItem.name
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.text_view_1

    }
}