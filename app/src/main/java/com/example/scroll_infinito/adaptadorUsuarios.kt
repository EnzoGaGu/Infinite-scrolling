package com.example.scroll_infinito

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorUsuarios (
    val listaUsuarios: List<String>

): RecyclerView.Adapter<AdaptadorUsuarios.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_users, parent, false)
        return ViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return listaUsuarios.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvUsuario.setText(listaUsuarios.get(position))
    }


    class ViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val tvUsuario = itemView.findViewById<TextView>(R.id.tvUsuario)
    }
}