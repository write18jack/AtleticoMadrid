package com.example.atleticoplayers

import android.view.View
import android.widget.Adapter
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView

class SubRecyclerAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder> (){

    class ViewHolderItem(itemView: View) :RecyclerView.ViewHolder(itemView){
        val itemImageButton:ImageButton = itemView.findViewById(R.id.palayer)
    }



}