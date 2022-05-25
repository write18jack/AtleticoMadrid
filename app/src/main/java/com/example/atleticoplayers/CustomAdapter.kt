package com.example.atleticoplayers

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.atleticoplayers.ItemsViewModel
import com.example.atleticoplayers.R
import com.example.atleticoplayers.R.drawable.gradient_2

class CustomAdapter(private val titleList: ArrayList<ItemsViewModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    //リスナを格納する変数を定義
    private lateinit var listener: onCellClickListener

    //create interface
    interface onCellClickListener{
        fun onItemClick(itemsViewModel: ItemsViewModel)
    }

    //setリスナ
    fun setOnCellClickListener(listener: onCellClickListener){
        this.listener = listener
    }

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val textView:TextView = itemView.findViewById(R.id.textview)
    }

    //layout設定
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    //view設定
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = titleList[position]
        holder.textView.text = itemsViewModel.text
        //holder.LinearColor?.setBackgroundColor()

        //セルがクリックイベントにリスナをセット
        holder.itemView.setOnClickListener(){
            listener.onItemClick(itemsViewModel)
        }
    }

    //表示数設定
    override fun getItemCount(): Int {
        return titleList.size
    }


}

