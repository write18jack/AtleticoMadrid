package com.example.atleticoplayers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val titleList: Array<String>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    //リスナを格納する変数を定義
    private lateinit var mlistener: onItemClickListener

    //create interface
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }
    //setリスナ
    fun setOnCellClickListener(listener: onItemClickListener){
        this.mlistener = listener
    }
    //recyclcerviewのビューホルダークラス
    class ViewHolder(ItemView:View, listener: onItemClickListener):RecyclerView.ViewHolder(ItemView){
        val textView:TextView = ItemView.findViewById(R.id.textview)
        init {
            itemView.setOnClickListener {
                listener.onItemClick(absoluteAdapterPosition)
            }
        }
    }

    //layout設定
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view, mlistener)
    }

    //view設定
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = titleList[position]
        holder.textView.text = itemsViewModel
        //holder.LinearColor?.setBackgroundColor()

    }

    //表示数設定
    override fun getItemCount(): Int {
        return titleList.size
    }


}

