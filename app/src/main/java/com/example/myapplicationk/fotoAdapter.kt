package com.example.myapplicationk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class fotoAdapter(private val fotoList:ArrayList<fotokls>)
    : RecyclerView.Adapter<fotoAdapter.klsViewHolder>(){

    var onItemClick : ((fotokls) -> Unit)? = null
    class klsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgadam : ImageView = itemView.findViewById(R.id.imgadam)
        val tvadam : TextView = itemView.findViewById(R.id.tvadam)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): klsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return klsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fotoList.size
    }

    override fun onBindViewHolder(holder: klsViewHolder, position: Int) {
        val foto = fotoList[position]
        holder.imgadam.setImageResource(foto.image)
        holder.tvadam.text = foto.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(foto)
        }
    }
}