package com.example.atleticoplayers

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.textview.MaterialTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf(
            "Order",
            "Players",
            "Result",
            "Calender",
            "A",
            "B"
        )
        val adapter:ArrayAdapter<String> = object :ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, list) {

            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

                val textView:MaterialTextView = super.getView(position, convertView, parent)
                as MaterialTextView

                textView.layoutParams.height = 130.toDp(context)
                return textView
            }
        }
        main_title.adapter = adapter

    }
}

fun Int.toDp(context: Context):Int =  TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,this.toFloat(),context.resources.displayMetrics
).toInt()